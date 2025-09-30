package com;
 import java.util.*;
 /**
  * Actividad 9
Escribir una aplicación que indique cuántas cifras tiene un número entero 
introducido por teclado, que estará comprendido entre 0 y 99.999.
  */
public class Actividad9 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, cifras;
		
		//Preguntamos el número al usuario
		System.out.println("Escribe un número entre 0 y 99.999");
		numero = sc.nextInt();
		
		if( numero < 0 && numero > 99999) {
			System.out.println("El número no se encuentra entre los valores 0 y 99.999");
		}else if(numero <=9) {
			cifras = 1;
			System.out.println("El número " + numero + " tiene " + cifras );
		}else if(numero <= 99) {
			cifras = 2;
			System.out.println("El número " + numero + " tiene " + cifras );
		}else if(numero <= 999) {
			cifras = 3;
			System.out.println("El número " + numero + " tiene " + cifras );
		}else if(numero <= 9999) {
			cifras = 4;
			System.out.println("El número " + numero + " tiene " + cifras );
		}else if(numero <= 99999) {
			cifras = 5;
			System.out.println("El número " + numero + " tiene " + cifras );
		}
	}
}
