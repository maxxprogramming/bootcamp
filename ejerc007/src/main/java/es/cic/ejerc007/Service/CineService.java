package es.cic.ejerc007.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.ejerc007.Entity.Cine;
import es.cic.ejerc007.Entity.Sala;
import es.cic.ejerc007.Entity.Ticket;
import es.cic.ejerc007.Repository.ButacaRepository;
import es.cic.ejerc007.Repository.CineRepository;
import es.cic.ejerc007.Repository.SalaRepository;
import es.cic.ejerc007.Repository.SesionRepository;
import es.cic.ejerc007.Repository.TicketRepository;


@Service
public class CineService {

	
@Autowired
CineRepository repoCine;


@Autowired
ButacaRepository repoButaca;

@Autowired
SalaRepository repoSala;

@Autowired
SesionRepository repoSesion;

@Autowired
TicketRepository repoTicket;



public void crearCine(Cine cine) {
	repoCine.save(cine);
}





}


