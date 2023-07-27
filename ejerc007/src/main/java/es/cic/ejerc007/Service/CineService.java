package es.cic.ejerc007.Service;


import es.cic.ejerc007.Entity.Cine;
import es.cic.ejerc007.Entity.Ticket;

public interface CineService {


public void crearCine(Cine cine);

	void TotalesPorPrecio();

	void TotalesPorSala();

	void TotalesPorSalaYSesion();

	void Comprar(Ticket ticket);

	void Cambiar(Ticket ticket);

	void Cancelar(Ticket ticket);

}
