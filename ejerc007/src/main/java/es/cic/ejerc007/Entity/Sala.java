package es.cic.ejerc007.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Sala {

	private long id;
	private int butacas;
	private List<Sesion> sesiones;
	
	public Sala() {
		sesiones = new ArrayList<Sesion>();
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Sesion> getSesiones() {
		return sesiones;
	}

	public void setSesiones(List<Sesion> sesiones) {
		this.sesiones = sesiones;
	}

	public int getButacas() {
		return butacas;
	}

	public void setButacas(int butacas) {
		this.butacas = butacas;
	}

}
