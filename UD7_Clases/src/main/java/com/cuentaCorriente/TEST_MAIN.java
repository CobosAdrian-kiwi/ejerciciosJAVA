package com.cuentaCorriente;

public class TEST_MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctrlCuentaCorriente cuentaTest = new ctrlCuentaCorriente(50,-50,"Adrian","12345678Z");
		
		cuentaTest.MostrarInfo();
		boolean test = cuentaTest.SacarDinero(100);
		System.out.println("############");
		cuentaTest.MostrarInfo();
		System.out.println(test);
	}

}
