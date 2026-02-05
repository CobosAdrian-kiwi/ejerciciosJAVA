package com.herencia.hora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Hora12Test {

	Hora12 hora12;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		hora12 = new Hora12 (1, 1, periodo.AM);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testConstructor() {
		String resultadoEsperado = "01:01 AM";
		String resultadoActual = hora12.toString();
		
		assertEquals(resultadoEsperado, resultadoActual);
	}
	
	@Test
	void testInc() {
		hora12.inc();
		String resultEsperado = "01:02 AM";
		String resultActual = hora12.toString();
		
		assertEquals(resultEsperado, resultActual);
	}

	@Test
	void testSetter() {
		hora12.setHora(22);
		
		String resultEsperado = "10:01 PM";
		String resultActual = hora12.toString();
		
		assertEquals(resultEsperado, resultActual);
	}
}
