package com;

import java.util.Scanner;

/**
 * Actividad 7 Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
public class Actividad7b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Definimos las variables
		int num1, num2, num3;
		int mayor, medio, menor;

		// Leemos
		System.out.println("Dime un número");
		num1 = sc.nextInt();
		System.out.println("Dime otro número");
		num2 = sc.nextInt();
		System.out.println("Dime otro número");
		num3 = sc.nextInt();

		if ((num1 >= num2) && (num1 >= num3)) {
			mayor = num1;

			if (num2 >= num3) {
				medio = num2;
				menor = num3;
			} else {
				medio = num3;
				menor = num2;
			}
		} else if ((num2 >= num1) && (num2 >= num3)) {
			mayor = num2;
			if (num1 >= num3) {
				medio = num1;
				menor = num3;
			} else {
				medio = num3;
				menor = num1;
			}
		} else {
			mayor = num3;
			if (num1 >= num2) {
				medio = num1;
				menor = num2;
			} else {
				medio = num2;
				menor = num1;
			}
		}
		
		System.out.println(mayor + ", " + medio + ", " + menor);

	}
	
}
