package com.bombilla;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BombillaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	Bombilla b;
	
	@BeforeEach
	void setUp() throws Exception {
		b = new Bombilla();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testConstructor() {
		boolean estadoEsperado= false; //Apagado
		boolean estado = b.Estado();
		
		assertEquals(estadoEsperado, estado);
	}
	
	@Test
	void testFusible() {
		boolean estadoEsperado = false;
		boolean estado = b.EstadoFusibleGlobal();
		
		assertEquals(estadoEsperado, estado);
	}

}
