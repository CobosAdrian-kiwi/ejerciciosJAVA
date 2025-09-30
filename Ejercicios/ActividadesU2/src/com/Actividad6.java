package com;
import java.util.Scanner;
/**
 * Actividad 6
Pedir dos números y mostrarlos ordenados de forma decreciente.
 */
public class Actividad6 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//Defino dos variables
		int num1, num2;
	
		//Leer los números
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			// TRUE  --> num1 > num2
			System.out.println(num1 + " es mayor que " + num2);
		}else {
			// FALSE --> num2 > num1
			System.out.println(num2 + " es mayor que " + num1);
		}
		
	}
	
	
	
	
}
