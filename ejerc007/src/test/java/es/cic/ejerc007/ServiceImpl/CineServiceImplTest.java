package es.cic.ejerc007.ServiceImpl;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.cic.ejerc007.Entity.Cine;
import es.cic.ejerc007.Entity.Sala;
import es.cic.ejerc007.Entity.Sesion;
import es.cic.ejerc007.Entity.Ticket;

class CineServiceImplTest {
	
	private static Cine cine;
	private CineServiceImpl implementacion;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testCrearCine() {
		Cine cine = new Cine();
		assertTrue(cine.getSalas().length ==3);
		this.cine= cine;
	}

	@Test
	void testComprar() {
		Ticket ticket = new Ticket();
		ticket.
		setButacas(3);
		Sala sala = cine.getSalas()[0];
		ticket.setSala(sala);
		Sesion sesion = sala.getSesiones().get(0);
		ticket.setSesion(sesion);
		
		assertDoesNotThrow(implementacion.Comprar(ticket), Exception.class);
	}
	
	@Test
	void testComprarTicketDescuento() {
		
	}

	@Test
	void testCambiar() {
		fail("Not yet implemented");
	}

	@Test
	void testCancelar() {
		fail("Not yet implemented");
	}

	@Test
	void testTotalesPorPrecio() {
		fail("Not yet implemented");
	}

	@Test
	void testTotalesPorSala() {
		fail("Not yet implemented");
	}

	@Test
	void testTotalesPorSalaYSesion() {
		fail("Not yet implemented");
	}

}
