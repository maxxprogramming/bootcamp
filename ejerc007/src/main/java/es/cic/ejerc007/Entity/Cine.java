package es.cic.ejerc007.Entity;

import jakarta.persistence.Entity;

@Entity
public class Cine {

	private long id;
	private Sala[] salas;

	public Cine() {
		salas=new Sala[3];
		Sala s1= new Sala(100);
		Sala s2= new Sala(50);
		Sala s3= new Sala(20);
		salas[0]= s1;
		salas[1]= s2;
		salas[2]= s3;
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
