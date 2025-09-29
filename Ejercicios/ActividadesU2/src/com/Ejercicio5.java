package com;
import java.util.Scanner;
public class Ejercicio5 {

	/*
	 * Implementar un programa que pida por teclado un numero decimal e indique si
	 * es un numero casi-cero, que son aquellos, positivos o negativos, que se acercan
	 * a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera un número
	 * casi-cero.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir variables
		float numUsu;
		
		//Preguntar al usuario por el numero a comprobar
		System.out.println("Introduce el numero para comprobar si es casi-cero o no");
		numUsu = sc.nextFloat();
		
		//Hacer la comprobacion de si es casi-cero
		
		if (numUsu == 0 ) {
			//Si es igual a 0 no es un casi-cero
			System.out.println("Tu numero NO es casi-cero");
		} else if (numUsu < 1 && numUsu > -1) {
			//Si esta en el rango de decimales si es un casi cero
			System.out.println("Tu numero SI es casi-cero");
		} else {
			//Si es cualquier otro numero no es un casi cero
			System.out.println("Tu número NO es un casi-cero");
		}
	}

}
