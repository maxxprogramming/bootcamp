package es.cic.ejerc007.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.cic.ejerc007.Entity.Butaca;

@Repository
public interface ButacaRepository extends CrudRepository<Butaca, Long> {
	
	
	 
}

