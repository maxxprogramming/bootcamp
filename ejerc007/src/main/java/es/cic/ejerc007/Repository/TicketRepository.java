package es.cic.ejerc007.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.cic.ejerc007.Entity.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
		 
}

