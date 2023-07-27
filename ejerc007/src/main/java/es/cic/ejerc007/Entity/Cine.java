package es.cic.ejerc007.Entity;

import jakarta.persistence.Entity;

@Entity
public class Cine {

	private long id;
	private Sala[] salas;

	public Cine() {
		super();
		salas=new Sala[3];
	}
	
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public Sala[] getSalas() {
		return salas;
	}
 
	public void setSalas(Sala[] salas) {
		this.salas = salas;
	}
	
	
	
}
