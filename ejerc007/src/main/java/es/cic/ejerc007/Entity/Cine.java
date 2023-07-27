package es.cic.ejerc007.Entity;

import jakarta.persistence.Entity;

@Entity
public class Cine {

	private Sala[] salas;

	public Cine() {
		super();
		salas=new Sala[3];
	}

	public Sala[] getSalas() {
		return salas;
	}
 
	public void setSalas(Sala[] salas) {
		this.salas = salas;
	}
	
	
	
}
