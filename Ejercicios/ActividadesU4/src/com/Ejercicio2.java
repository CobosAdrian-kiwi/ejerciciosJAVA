package com;

import java.util.Scanner;

/*
 * Escribir una función a la que se le pasen dos 
 * enteros y muestre todos los números comprendidos 
 * entre ellos.
 */

public class Ejercicio2 {
	
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2; //Definimos las variables de los numeros que va a introducir el usuario
		
		//Le pregunatmos al usuario que números
		System.out.println("Dime 2 números...");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("Los numeros incomprendidos entre esos son:");
		
		//Depende de cual sea el mayor los ejecutamos al reves o
		//al derecho para que la función no se raye
		if(num1 > num2) {
			numsEntre(num2, num1);
		}else {
			numsEntre(num1, num2);
		}
		
		
	}
	
	//FUNCIONES
	public static void numsEntre(int num_inicio, int num_final) {
		//Mientras que el num mas grande sea mayor al mas pequeño
		//lo imprimimos y le restamos 1
		while(num_final >= num_inicio) {
		  System.out.println(num_final);
		  num_final--;
	  }
	}
}
