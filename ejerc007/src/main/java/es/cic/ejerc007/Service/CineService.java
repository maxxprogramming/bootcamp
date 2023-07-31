package es.cic.ejerc007.Service;


import es.cic.ejerc007.Entity.Cine;
import es.cic.ejerc007.Entity.Sala;
import es.cic.ejerc007.Entity.Sesion;
import es.cic.ejerc007.Entity.Ticket;

public interface CineService {

	void crearCine(Cine cine);

	void Comprar(Ticket ticket) throws Exception;
	
	void Cambiar(Ticket ticket , Sesion sesion );
	
	void Cambiar(Ticket ticket, int butacas);
	
	void Cancelar(Ticket ticket) throws Exception;
	
	void TotalesPorPrecio();

	void TotalesPorSala();

	void TotalesPorSalaYSesion();



}
