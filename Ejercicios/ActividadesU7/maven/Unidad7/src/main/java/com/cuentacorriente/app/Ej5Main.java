package com.cuentacorriente.app;

public class Ej5Main {
	public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente("Tralalero", "67676767T");
		CuentaCorriente cuenta2 = new CuentaCorriente("Cappucina", "76767676C");
		
		System.out.println("Banco de las cuentas: "+CuentaCorriente.banco+"\n");
		
		System.out.println("Banco cuenta1: "+cuenta1.banco);
		System.out.println("Banco cuenta2: "+cuenta2.banco);
		
		cuenta1.banco = "LaCaixa";
		System.out.println();
		
		System.out.println("Banco cuenta1: "+cuenta1.banco);
		System.out.println("Banco cuenta2: "+cuenta2.banco);
	}
}
