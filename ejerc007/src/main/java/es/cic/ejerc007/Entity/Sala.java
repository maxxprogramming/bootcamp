package es.cic.ejerc007.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Sala {

	private long id;
	private int butacas;
	private List<Sesion> sesiones;
	
	private Sala() {
		sesiones = new ArrayList<Sesion>();
		Sesion s1 = new Sesion();
		s1.setHorario("17:00");
		s1.setPelicula("Pelicula 1");
		s1.setSala(this);
		sesiones.add(s1);
		Sesion s2 = new Sesion();
		s2.setHorario("20:00");
		s2.setPelicula("Pelicula 2");
		s2.setSala(this);
		sesiones.add(s2);
		Sesion s3 = new Sesion();
		s3.setHorario("22:30");
		s3.setPelicula("Pelicula 1");
		s3.setSala(this);
		sesiones.add(s3);
	}
	
	public Sala(int numeroButacas) {
		Sala sala = new Sala();
		sala.setButacas(numeroButacas);
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
