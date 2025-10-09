package com;

import java.util.Scanner;

/*
 * Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
 * A continuación solicitará por teclado un número que debe estar 
 * dentro del rango. Si el valor introducido no pertenence al rango, 
 * la aplicación volverá a pedir otro valor, y así repetidas veces, 
 * hasta que el valor se encuentre dentro del rango.
 */

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables
		int maxRang, minRang, numUsu;

		// preguntamos al usuario por los valores
		System.out.println("Dime el mínimo del rango");
		minRang = sc.nextInt();

		System.out.println("Dime el máximo del rango");
		maxRang = sc.nextInt();

		if (minRang <= maxRang) {
			System.out.println("Dime el número");
			numUsu = sc.nextInt();

			// mientras que el valor sea menor que el minimo o mayor que
			while (numUsu < minRang || numUsu > maxRang) {
				System.out.println("Ese numero no esta en el rango");
				System.out.println("Dime el numero");
				numUsu = sc.nextInt();
			}
			System.out.println("El numero está en el rango");
		} else {
			System.out.println("El valor minimo no puede ser mayor al máximo");
		}
	}
}
