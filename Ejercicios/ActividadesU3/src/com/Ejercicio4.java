package com;

import java.util.Scanner;

/*
 * Escribir una aplicación para aprender a contar, 
 * que pedirá un número n y mostrará todos los números del 1 a n.
 */

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//definimos la variable
		int numUsu;
		
		//le preguntamos al usuario
		System.out.println("Dime el número");
		numUsu = sc.nextInt();
		
		//Hacemos el bucle que mientras iteraciones sea menor que el numero
		//se imprima y le sume 1
		for(int iteraciones = 1; iteraciones<=numUsu; iteraciones++) {
			System.out.println(iteraciones);
		}
	}
}
