package com.Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BancoTest {

	Banco banco;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Inicio de pruebas com.Banco");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Fin de pruebas exitoso");
	}

	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco("BBVA", 100, "C/Hola", 100);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test check ✅");
	}

	@Test
	@DisplayName("7. Comprobacion Constructor #1")
	void test_7_1() {
		Banco banco7_1 = new Banco("BBVB");
		int cap_def_esperado = 5200000;
		int cap_def = banco7_1.getCapital_Def();
		
		assertEquals(cap_def, cap_def_esperado, "El capital para este constructor debe ser 5200000");
	}
	
	@Test
	@DisplayName("7. Comprobación constructor #2")
	void test_7_2() {
		Banco banco7_2 = new Banco("BBVB", 100);
		int cap_def_esperado = 5200000;
		int cap_def = banco7_2.getCapital_Def();
		int capital_esperado = 100;
		int capital = banco7_2.getCapital();
		
		assertEquals(cap_def, cap_def_esperado, "El capital para este constructor debe ser 5200000");
		assertEquals(capital, capital_esperado, "El capital debe ser 100");
	}
	
	@Test
	@DisplayName("7. Comprobacion constructor #3")
	void test_7_3() {
		
	}

}
