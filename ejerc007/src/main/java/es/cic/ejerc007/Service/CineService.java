package es.cic.ejerc007.Service;


import es.cic.ejerc007.Entity.Cine;
import es.cic.ejerc007.Entity.Sala;
import es.cic.ejerc007.Entity.Ticket;

public interface CineService {

	void crearCine(Cine cine);
	void crearSala(Sala sala);
	void Comprar(Ticket ticket);
	
	void Cambiar(Ticket ticket);
	
	void Cancelar(Ticket ticket);
	
	void TotalesPorPrecio();

	void TotalesPorSala();

	void TotalesPorSalaYSesion();



}
