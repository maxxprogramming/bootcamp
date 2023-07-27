package es.cic.ejerc007.Entity;

import jakarta.persistence.Entity;

@Entity
public class Butaca {

	private Boolean comprada;
	private Sala sala;
	private Sesion sesion;
	private double precio;
	
	
	public Boolean getComprada() {
		return comprada;
	}
	public void setComprada(Boolean comprada) {
		this.comprada = comprada;
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
