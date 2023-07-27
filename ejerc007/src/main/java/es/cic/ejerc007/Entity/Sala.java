package es.cic.ejerc007.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Sala {

	private List<Butaca> butacas;
	private List<Sesion> sesiones;
	
	public Sala() {
		butacas = new ArrayList<Butaca>();
		sesiones = new ArrayList<Sesion>();
	}
	
	public List<Sesion> getSesiones() {
		return sesiones;
	}

	public void setSesiones(List<Sesion> sesiones) {
		this.sesiones = sesiones;
	}

	public List<Butaca> getButacas() {
		return butacas;
	}

	public void setButacas(List<Butaca> butacas) {
		this.butacas = butacas;
	}

}
