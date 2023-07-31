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
		if(cine == null) {
			this.cine=cine;
			cineRepo.save(this.cine);
		}
	}

	@Override
	public void Comprar(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Cambiar(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Cancelar(Ticket ticket) {
		// TODO Auto-generated method stub
		
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

	

}
