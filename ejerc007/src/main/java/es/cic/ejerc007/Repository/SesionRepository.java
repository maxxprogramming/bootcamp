package es.cic.ejerc007.Repository;

import es.cic.ejerc007.Entity.Cine;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SesionRepository extends CrudRepository<Cine, Long> {
	
	
	 
}

