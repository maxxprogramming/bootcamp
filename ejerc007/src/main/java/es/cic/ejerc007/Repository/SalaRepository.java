package es.cic.ejerc007.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.cic.ejerc007.Entity.Sala;

@Repository
public interface SalaRepository extends CrudRepository<Sala, Long> {
	
	
	 
}

