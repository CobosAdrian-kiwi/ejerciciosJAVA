package com.herencia.hora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HoraExactaTest {

	private HoraExacta HoraExacta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		HoraExacta = new HoraExacta(16, 57, 20);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testConstructor() {
		String resultadoEsperado = "16:57:20";
		String result = HoraExacta.toString();
		
		assertEquals(resultadoEsperado, result);
	}

	@Test
	void testConstrucParametrosInvalidos() {
		
		String mensajeHorEsperado = "La hora debe ser válida";
		String mensajeMinEsperado ="Los minutos deben ser válidos";
		String mensajeSecEsperado = "Fromato de segundos invalidos";
		IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> {
			HoraExacta = new HoraExacta(24, 57, 20);
		});
		
		String mensajesec = exception1.getMessage().toString();
		
		assertTrue(
			    mensajesec.equals(mensajeSecEsperado) ||
			    mensajesec.equals(mensajeMinEsperado) ||
			    mensajesec.equals(mensajeHorEsperado)
			);
		
	}
	
	@Test
	void testSetSec() {
		String resultEsp = "16:57:21";
		HoraExacta.setSegundo(21);
		String result = HoraExacta.toString();
		
		assertEquals(resultEsp, result);
	}
	
	void testSetSecFueraLimites() {
		String mensajeEsperado = "Formato de segundos invalidos";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			HoraExacta= new HoraExacta(12, 12, 70);
		});
		
		String mensaje = exception.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
	}
	
	
	@Test
	void testInc() {
		String resultEsp = "16:57:21";
		HoraExacta.inc();
		String result = HoraExacta.toString();
		
		assertEquals(resultEsp, result);
	}
	
	@Test
	void testInc59() {
		HoraExacta hora = new HoraExacta(15, 59, 59);
		
		String resultEsp = "16:00:00";
		hora.inc();
		String result = hora.toString();
		
		assertEquals(resultEsp, result);
	}
	
	@Test
	void testComprobarHora() {
		HoraExacta hora2 = new HoraExacta(16, 57, 20);
		boolean resultEsperado = true;
		
		boolean result = HoraExacta.CompararHora(hora2);
		
		assertEquals(resultEsperado, result);
		
		HoraExacta hora3 = new HoraExacta(16, 56, 20);
		boolean resultEsperado2 = false;
		boolean result2 = HoraExacta.CompararHora(hora3);
		
		assertEquals(resultEsperado2, result2);
	}
}
