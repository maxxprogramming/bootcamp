package es.cic.ejerc007.ServiceImpl;

import java.util.List;

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

	@Override
	public void crearCine(Cine cine) {
		cineRepo.save(cine);
		if(cine == null) {
			this.cine=cine;
		}
	}

	

	@Override
	public void Comprar(Ticket ticket) throws Exception {
			
		 Sala sala = ticket.getSala();
		 Sesion sesion = ticket.getSesion();
		 int butacas = ticket.getButacas();
		 
		 
		 if(sala.getButacas() - butacas >= 0 ) {
			 sala.setButacas(sala.getButacas() - butacas );
		
			 if(sala.getButacas() >= 5) {
				 ticket.setPrecioTotal(ticket.getPrecioTotal() *  0.10);
				 
			 }
			 ticketRepo.save(ticket);
			 
		 } else {
			 throw new Exception("no hay butacas en la sala");
		 }
		
		
	} 



	@Override
	public void Cancelar(Ticket ticket) throws Exception {
		 Sala sala = ticket.getSala();
		 Sesion sesion = ticket.getSesion();
		 int butacas = ticket.getButacas();
		 
		 sala.setButacas(sala.getButacas() + butacas);
		 ticketRepo.delete(ticket);
		
		
	}

	@Override
	public void TotalesPorPrecio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TotalesPorSala() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TotalesPorSalaYSesion() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void Cambiar(Ticket ticket, Sesion sesion) {
		
			Sala sala = sesion.getSala();
			if (sala.getButacas() - ticket.getButacas() >= 0) {
				Sala salaEdit = ticket.getSesion().getSala();
				salaEdit.setButacas(salaEdit.getButacas() + ticket.getButacas());
				ticket.setSala(sesion.getSala());
				ticket.setSesion(sesion);
				ticketRepo.save(ticket);
				
			} 

	}



	@Override
	public void Cambiar(Ticket ticket, int butacas) {
		
		
		Sala sala = ticket.getSesion().getSala();
		
		sala.setButacas(sala.getButacas() + ticket.getButacas());
		
		
			if (sala.getButacas() - butacas >= 0) {
				ticket.setButacas(butacas);
				ticketRepo.save(ticket);
			}
		
	}

	

}
