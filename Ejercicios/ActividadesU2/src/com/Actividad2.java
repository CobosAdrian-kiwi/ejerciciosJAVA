package com;

import java.util.Scanner;

/**
 * Actividad 2 Pedir dos números enteros y decir si son iguales o no.
 */
public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Definimos las variables
		int num1, num2;

		System.out.println("Introduzca un número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro número");
		num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

	}

}
