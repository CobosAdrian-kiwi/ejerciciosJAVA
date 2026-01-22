package com.fm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SintoniDigiFMTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	SintoniDigiFM sintonizador;

	@BeforeEach
	void setUp() throws Exception {
		sintonizador = new SintoniDigiFM();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_Constructor() {
		double valorEsperado = 80.0;
		double valor = sintonizador.getFrecuencia();
		
		assertEquals(valorEsperado, valor, "El valor tras inicializar deberia ser 80.0");
	}
	
	

}
