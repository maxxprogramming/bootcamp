package es.cic.ejerc007.Entity;

import jakarta.persistence.Entity;

@Entity
public class Ticket {

	private long id;
	private int butacas;
	private Sala sala;
	private Sesion sesion;
	private static double precioTotal= 5;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getButacas() {
		return butacas;
	}

	public void setButacas(int butacas) {
		this.butacas = butacas;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
	
}
