package com.interfaces.act6;

import java.lang.reflect.Array;

public class Main {

	public static void main(String[] args) {
		Valorable[] valorable = new Valorable[4];
		
		Valorable p1 = new Producto("A", "Monitor", 100.0);
		Valorable p2 = new Producto("B", "PC", 500.0);
		Valorable p3 = new Producto("C", "Raton", 40.0);
		Valorable p4 = new Producto("D", "Alfombrilla", 100.0);
		
		valorable[0] = p1;
		valorable[1] = p2;
		valorable[2] = p3;
		valorable[3] = p4;
		
		Producto.ordenarPorPreciosAscYNombre(valorable);
		for (Valorable val : valorable) {
			System.out.println("Nombre: "+val.getNombre() + " | Precio: " +val.getPrecio());
		}
		
//		for (int i = 0; i < valorable.length-1; i++) {
//			for (int j = 0; j < valorable.length -1; j++) {
//				if (valorable[j].getPrecio() > valorable[j+1].getPrecio()) {
//					Valorable aux = valorable[j+1];
//					valorable[j+1] = valorable[j];
//					valorable[j] = aux;
//				} else if(valorable[j].getPrecio() == valorable[j+1].getPrecio()) {
//					if (valorable[j].getNombre().compareTo(valorable[j+1].getNombre()) > 0) {
//						Valorable aux = valorable[j+1];
//						valorable[j+1] = valorable[j];
//						valorable[j] = aux;
//					}
//				}
//				
//			}
//		}
	}

}
