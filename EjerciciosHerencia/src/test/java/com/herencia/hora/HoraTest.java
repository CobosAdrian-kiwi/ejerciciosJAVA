package com.herencia.hora;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HoraTest {

	private Hora hora;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		hora = new Hora(10,5);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToString() {
		String horaEsperada = "10:05";
		String horaActual = hora.toString();
		assertEquals(horaEsperada, horaActual, "La hora tiene que ser adecuada con formato");
	}

	
/*	@Test
	void setHora_validaRango() {
		assertFalse(hora.setHora(-1));
		assertFalse(hora.setHora(24));
		assertTrue(hora.setHora(0));
		assertTrue(hora.setHora(23));
	}*/

	@Test
	void testIncrement() {
		String resultadoEsperado = "10:06";
			hora.inc();
		String resultadoActual = hora.toString();
		assertEquals(resultadoEsperado, resultadoActual);		
	}
	
	@Test
	void testVueltaEmpezar() {
		Hora hora = new Hora(23, 59);
		hora.inc();
		
		String resultadoEsperado = "00:00";
		String resultadoActual = hora.toString();
		
		assertEquals(resultadoEsperado, resultadoActual);
	}
	
	@Test
	void testSetterInc() {
		hora.setHora(23);
		hora.setMinutos(59);
		hora.inc();
		
		String resultadoEsperado = "00:00";
		String resultadoActual = hora.toString();
		
		assertEquals(resultadoEsperado, resultadoActual);
	}
}
