package com.cuentaCorriente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ctrlCuentaCorrienteTest {
	
	ctrlCuentaCorriente cuenta;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Inicio Pruebas");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Fin de pruebas exitoso");
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new ctrlCuentaCorriente(50, -50, "nombre", "12345678A");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("1. CreacionCuenta")
	void test1_1_CreacionCuenta() {
		ctrlCuentaCorriente cuenta1 = new ctrlCuentaCorriente("nombre","12345678A");
		
		int limiteEsperado = -50;
		
		assertEquals(limiteEsperado, cuenta1.getLimite(), "El limite tiene que ser -50");
	}
	
	@Test
	@DisplayName("1. SacarDinero")
	void test1_21_SacarDinero() {
		int cantidad = 20;
		int resultado_esperado = 30;
		cuenta.SacarDinero(cantidad);
		int resultado = cuenta.getSaldo();
		
		assertEquals(resultado, resultado_esperado, "El resultado debe ser 30");
	}
	
	@Test
	@DisplayName("1. SacarDinero - Operacion posible")
	void test1_22_SacarDinero() {
		int cantidad = 10;
		boolean resultado_esperado = true;

		boolean resultado = cuenta.SacarDinero(cantidad);
		
		assertEquals(resultado, resultado_esperado, "El resultado debe ser 30");
	}
	
	@Test
	@DisplayName("1. Ingresar Dinero")
	void test1_3_IngresarDinero() {
		int cantidad = 20;
		int resultado_esperado = 70;
		int resultado = cuenta.IngresarDinero(cantidad);
		
		assertEquals(resultado, resultado_esperado, "El resultado debe ser 70");
	}
	
	//Ejercicio 2 TESTS
	
	@Test
	@DisplayName("2. Creación Solo con saldo inicial")
	void test2_1_CreacionSoloSaldoIni() {
		ctrlCuentaCorriente cuenta2_1 = new ctrlCuentaCorriente(50);
		
		int limiteEsperado = 0;
		
		assertEquals(limiteEsperado, cuenta2_1.getLimite(), "El limite tiene que ser 0");
	}
	
	@Test
	@DisplayName("2. Creación con todos los datos")
	void test2_2_CreacionTodoLosDatos() {
		ctrlCuentaCorriente cuenta2_2 = new ctrlCuentaCorriente(50,-50,"nombre","12345678A");
		int limiteEsperado = -50;
		int saldoEsperado = 50;
		String nombreEsperado = "nombre";
		String DNIEsperado = "12345678A";
		
		assertEquals(limiteEsperado, cuenta2_2.getLimite(), "El limite tiene que ser -50");
		assertEquals(saldoEsperado, cuenta2_2.getSaldo(), "El saldo tiene que ser 50");
		assertEquals(nombreEsperado, cuenta2_2.getNombre(), "El nombre tiene que ser 'nombre'");
		assertEquals(DNIEsperado, cuenta2_2.getDni(), "El DNI tiene que ser '12345678A'");
	}
	
	@Test
	@DisplayName("5. Cambiar Banco")
	@Disabled
	void test5_1_CambiarBanco() {
		String nuevoNombre = "BBVZ";
		String nombreEsperado = "BBVZ";
		//cuenta.CambiarBanco(nuevoNombre);
		//String nombre = cuenta.getBanco();
		
		//assertEquals(nombre, nombreEsperado, "El nombre tiene que ser 'BBVZ");
	}

}
