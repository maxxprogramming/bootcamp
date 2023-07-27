package es.cic.ejerc007.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.cic.ejerc007.Entity.Cine;
import es.cic.ejerc007.Entity.Ticket;

@Repository
public interface CineRepository extends CrudRepository<Cine, Long> {

}







