package com.interfaces.act4;

public class Main {

	public static void main(String[] args) {
		Tarjeta t = new Tarjeta(10, 20);
		Bizum b = new Bizum(20, 12345678);
		Efectivo e = new Efectivo(20);
		
		Caja caja = new Caja();
		
		MetodoPago[] mp = {t,b,e};
		
		for (MetodoPago metodo : mp) {
			caja.cobrar(metodo, 20);
			caja.cobrar(metodo, 10);
		}
	}

}
