package com;

/*
 * Diseñar la función eco() a la que se le pasa como 
 * parámetro un número n y muestra por pantalla n veces el 
 * mensaje “Eco ...”.
 */

public class Ejercicio1 {
	
	//MAIN 
	public static void main(String[] args) {
		eco(3);

	}
	
	//FUNCIONES
	public static void eco(int veces) {
		while(veces > 0) {
			System.out.println("eco...");
			veces--;
		}
	}
}
