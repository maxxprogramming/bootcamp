package es.cic.ejerc007.ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.ejerc007.Entity.Cine;
import es.cic.ejerc007.Entity.Sala;
import es.cic.ejerc007.Entity.Sesion;
import es.cic.ejerc007.Entity.Ticket;
import es.cic.ejerc007.Repository.CineRepository;
import es.cic.ejerc007.Repository.SalaRepository;
import es.cic.ejerc007.Repository.SesionRepository;
import es.cic.ejerc007.Repository.TicketRepository;
import es.cic.ejerc007.Service.CineService;

@Service
public class CineServiceImpl implements CineService {

	@Autowired
	private CineRepository cineRepo;
	@Autowired
	private SalaRepository salaRepo;
	@Autowired
	private SesionRepository sesionRepo;
	@Autowired
	private TicketRepository ticketRepo;

	private static Cine cine;
	private static List<Ticket> tickets;

	@Override
	public void crearCine(Cine cine) {
		if (cine == null) {
			this.cine = cine;
			cineRepo.save(this.cine);
		}
	}

	@Override
	public void Comprar(Ticket ticket) throws Exception {

		Sala sala = ticket.getSesion().getSala();
		Sesion sesion = ticket.getSesion();
		int butacas = ticket.getButacas();

		if (sala.getButacas() - butacas >= 0) {
			sala.setButacas(sala.getButacas() - butacas);
			if (sala.getButacas() >= 5) {
				ticket.setPrecioTotal(ticket.getPrecioTotal() * 0.10);
			}
			tickets.add(ticket);
		} else {
			throw new Exception("no hay butacas en la sala");
		}

	}

	@Override
	public void Cambiar(Ticket t, Sesion sesion) {
		Ticket ticket = obtenerTicket(t);
		Sala sala = sesion.getSala();
		if (sala.getButacas() - ticket.getButacas() >= 0) {
			Sala salaEdit = ticket.getSesion().getSala();
			salaEdit.setButacas(salaEdit.getButacas() + ticket.getButacas());
			sala.setButacas(sala.getButacas() - ticket.getButacas());
			ticket.setSesion(sesion);
		}
	}

	

	@Override
	public void Cambiar(Ticket t, int butacas) {
		Ticket ticket = obtenerTicket(t);
		Sala sala = ticket.getSesion().getSala();
		sala.setButacas(sala.getButacas() + ticket.getButacas());
		if (sala.getButacas() - butacas >= 0) {
			ticket.setButacas(butacas);
		}
	}

	@Override
	public void Cancelar(Ticket ticket) throws Exception {
		Sala sala = ticket.getSesion().getSala();
		Sesion sesion = ticket.getSesion();
		int butacas = ticket.getButacas();

		sala.setButacas(sala.getButacas() + butacas);
		// ticketRepo.delete(ticket);
		tickets.remove(ticket);

	}

	@Override
	public Map<String,Integer> TotalesPorPrecio(double precio) {
		List<Ticket> ticketsnormal= new ArrayList<Ticket>();
		List<Ticket> ticketsDescuento= new ArrayList<Ticket>();
		for(Ticket t : tickets) {
			if(t.getButacas()>=5) {
				ticketsDescuento.add(t);
			}else {
				ticketsnormal.add(t);
			}
		}
		Map<String, Integer> tickets = new HashMap<String, Integer>();
		tickets.put("normal", ticketsnormal.size());
		tickets.put("descuento", ticketsDescuento.size());
		return tickets;
	}

	@Override
	public Map<Sala,Integer> TotalesPorSala() {
		// TODO Auto-generated method stub
		Map<Sala, Integer> tickets = new  HashMap<Sala, Integer>();
		 
		for(Sala sala : cine.getSalas()) {
			int numTickets= 0;
			for(Ticket t: this.tickets) {
				if(t.getSesion().getSala()== sala) {
					numTickets++;
				}
			}
			tickets.put(sala, numTickets);
		}
		return tickets;
	}

	@Override
	public Map<Sesion,Integer> TotalesPorSesion() {
		
		Map<Sesion, Integer> tickets = new  HashMap<Sesion, Integer>();
		 
		for(Sala sala: cine.getSalas()) {
			for (Sesion sesion : sala.getSesiones()) {
				int numTickets = 0;
				for(Ticket t : this.tickets) {
					if(t.getSesion() == sesion) {
						numTickets++;
					}	
				
				}
				tickets.put(sesion, numTickets);
				
			}
			
			
			
		}
		return tickets;
		
		
		
	}

	private Ticket obtenerTicket(Ticket ticket) {
		for(Ticket t : tickets) {
			if(t.getId()== ticket.getId()) {
			return t;
			}
		}
		return null;
	}
	
	public static Cine getCine() {
		return cine;
	}

	public static List<Ticket> getTickets() {
		return tickets;
	}

}
