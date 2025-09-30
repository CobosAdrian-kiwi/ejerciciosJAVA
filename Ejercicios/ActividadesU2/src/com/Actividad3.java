package com;
import java.util.Scanner;
/**
 * Solicitar dos números distintos
 *  y mostrar cuál es el mayor.

 */
public class Actividad3 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
	
		System.out.println("Mete dos números distintos y te dire el mayor, \ndime \tel primero ");
		num1 = sc.nextInt();
		
		System.out.println("Ahora el segundo: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("El número "+ num1 + " es mayor");
		}else {
			System.out.println("El número " + num2 + " es mayor");
		}
		
		
	}
}
