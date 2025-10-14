package com;

import java.util.Scanner;

/*
 * Pedir por consola un número n y dibujar un triángulo 
 * rectángulo de n elementos de lado, utilizando para ello
 *  asteriscos (*). Por ejemplo, para n = 4:
 		* * * *
		* * *
		* *
		*
 */

public class Ejercicio14 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos la variable del numero que va a introducir el usuario
		int num;
		
		//le preguntamos al usuario el número de alto del triangulo
		System.out.println("Dime el número de largo del triángulo");
		//lo guardamos en la variable
		num = sc.nextInt();
		
		//un bucle que sean las iteraciones que escriba los asteriscos y cambie de línea
		for(int iteraciones = num; iteraciones >0; iteraciones--) {
			
			for(int asteriscos = iteraciones; asteriscos >0; asteriscos--) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}
	}
}
