package es.cic.ejerc007.Repository;


import es.cic.ejerc007.Entity.Cine;
import es.cic.ejerc007.Entity.Sala;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CineRepository extends CrudRepository<Cine, Long> {

	void save(Sala sala);
	
	
	 
}







