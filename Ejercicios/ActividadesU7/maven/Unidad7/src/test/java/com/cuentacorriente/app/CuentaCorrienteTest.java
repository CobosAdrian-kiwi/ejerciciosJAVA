package com.cuentacorriente.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testIngresarSaldo() {
		CuentaCorriente cuenta = new CuentaCorriente("Adrian", "99999999A");
		double cantidad = 67;
		cuenta.IngresarDinero(cantidad);
		assertEquals(cuenta.getSaldo(), cantidad);
	}
	
	@Test
	void testSetLimit() {
		CuentaCorriente cuenta = new CuentaCorriente("Adrian", "99999999A");
		double cantidad = -67;
		double cantidadEsperada = cantidad;
		cuenta.setLimitDescub(cantidad);
		assertEquals(cuenta.getLimitDescub(),  cantidadEsperada);
	}
	
	@Test
	void testSacarDinero() {
		CuentaCorriente cuenta = new CuentaCorriente(100);
		double cantidadSacada =  43;
		double cantidadEsperada = cuenta.getSaldo() - cantidadSacada;
		cuenta.SacarDinero(cantidadSacada);
		assertEquals(cuenta.getSaldo(), cantidadEsperada);
	}

}
