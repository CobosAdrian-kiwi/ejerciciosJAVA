package com;

import java.util.Scanner;

/*
 * Diseñar una función que determine si un número es primo.
 */

public class Ejercicio7 {
	
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaramos las variables que vamos a usar
		int num;
		boolean primo_bool;
		
		//Le pedimos al usuario un numero
		System.out.println("Introduce 1 numero para saber si es primo o no");
		num = sc.nextInt();
		
		//Guardamos el resultado de la funcion tras ejecutarla con num
		primo_bool = primo(num);
		
		//Si el return de la funcion es un true es primo si no no
		if (primo_bool == true) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero NO es primo");
		}
		
	}
	
	//FUNCIONES
	public static boolean primo(int numero) {
		//Declaro una variable booleana que va a ser la que devolvamos
		boolean es_primo = true;
		
		/* Hacemos un bucle en el que numero se divide por el divisor
		*  si el resto es 0 en alguno de los casos la division es redonda
		*  y numero no es primo por lo que le ponemos es_primo como false
		*  y rompemos el bucle
		*/
		for(int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
			if ((numero % divisor) == 0) {
				es_primo = false;
				break;
			}
		}
		return es_primo;
	}
}
