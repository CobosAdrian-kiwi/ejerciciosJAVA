package com;

import java.util.Scanner;

public class Ejercicio9 {
	
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos variables
		int num;
		
		//Le pedimos al usuario el numero a comprobar
		System.out.println("Introduce el numero a comprobar");
		num = sc.nextInt();
		
		divisores(num);
		
		sc.close();
	}
	
	//FUNCIONES
	//Funcion para saber si un numero es primo o no, devuelve un bool POR SI EJERCICIO 7 NO ESTÁ
/*	public static boolean primo(int numero) {
		//Declaro una variable booleana que va a ser la que devolvamos
		boolean es_primo = true;
		
		/* Hacemos un bucle en el que numero se divide por el divisor
		*  si el resto es 0 en alguno de los casos la division es redonda
		*  y numero no es primo por lo que le ponemos es_primo como false
		*  y rompemos el bucle
		*
		for(int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
			if ((numero % divisor) == 0) {
				es_primo = false;
				break;
			}
		}
		return es_primo;
	}
*/	
	//Funcion para saber todos los divisores de un numero y saber si son primos
	public static void divisores(int numero ) {
		
		/*
		* Hacemos un bucle en el que cada iteracion se divide con el numero
		* introducido, despues comprobamos que el resto sea 0 y se ejecuta la funcio
		* primo() con la iteracion actual, por ultimo se comprueba si es primo y se
		* imprime por pantalla
		*/
		for(int i = 1; i < numero; i++) {
			if (numero % i == 0 && i > 1) {
				boolean es_primo = Ejercicio7.primo(i);
				
				if (es_primo == true) {
					System.out.println(i);
				}
				
			}
		}
	}
}

