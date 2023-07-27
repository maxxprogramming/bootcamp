package es.cic.ejerc007Repository;


import es.cic.ejerc007.Entity.Cine;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CineRepository extends CrudRepository<Cine, Long> {
	
	
	
}


