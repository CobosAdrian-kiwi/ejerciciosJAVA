package com.herencia.caja;

public class MAIN {

	public static void main(String[] args) {
		Caja caja = new Caja(10, 10, 10, Unidades.m);
		
		caja.getVolumen();
		
		System.out.println(caja.toString());

	}

}
