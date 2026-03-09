package com.interfaces.act5;

public class Main {

	public static void main(String[] args) {
		Descuentable[] descuentable = new Descuentable[2];
		
		Producto p = new Producto("PC", 100);
		Servicio s = new Servicio("Suscripcion", 10);

		descuentable[0] = p;
		descuentable[1] = s;
		
		for (Descuentable des : descuentable) {
			System.out.println("Precio base: "+des.precioBase());
			System.out.println("Precio con descuento (10%): "+des.precioFinal(10));
		}
	}

}
