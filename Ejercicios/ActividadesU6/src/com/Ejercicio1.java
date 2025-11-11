package com;
import java.util.Scanner;

/*
 * Introducir por teclado dos palabras e indicar cuál de ellas es la más corta, es decir, la
 * que contiene menos caracteres.
 */
public class Ejercicio1 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creamos las 2 variables
		String cadenaA, cadenaB;
		
		//Crear variables para la longitud de las cadenas
		int longA, longB;
		
		//Preguntar al usuario por las palabras
		System.out.println("Introduzca 2 palabras para compararse \n1º palabra:");
		cadenaA = sc.nextLine();
		System.out.println("2º palabra:");
		cadenaB = sc.nextLine();
		
		//Determinar que la longitud de las cadenas es longX.length()
		longA = cadenaA.length();
		longB = cadenaB.length();
		
		//Comparar cual es ás pequeña y mostrar el resultado
		if(longA < longB) {
			System.out.println(cadenaA + " es más pequeña que "+ cadenaB);
		} else if(longA == longB) {
			System.out.println(cadenaA +" y " +cadenaB+ " son igual de largas");
		}else {
			System.out.println(cadenaB + " es más pequeña que "+ cadenaA);
		}
		
	}
}
