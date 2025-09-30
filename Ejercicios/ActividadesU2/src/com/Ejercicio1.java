package com;
import java.util.Scanner;
public class Ejercicio1 {

	/*
	 * Diseñar una app que solicite al usuario un número 
	 * e indique si es par o impar.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos la variable del numero que el usuario va a introducir
		int numUsu, numResto;
		
		//Preguntamos al usuario que numero quiere comprobar
		System.out.println("Escribe el número a comprobar:");
		numUsu = sc.nextInt();
		
		//Calculamos el resto del numero introducido
		numResto = numUsu % 2;
		
		//Comprobamos si es par o impar comprobando si numResto = 0 o 1
		if (numResto == 0) {
			//Si es igual a 0 entonces es par
			System.out.println("Tu número es PAR");
		} else {
			//Si numResto no es 0 entonces es impar
			System.out.println("Tu número es IMPAR");
		}
	}

}
