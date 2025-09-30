package com;
import java.util.Scanner;

	/*
	 * Pedir 2 numeros y mosrtarlos ordenados de forma decreciente
	 */

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//definimos las variables de los 2 numeros
		int num1, num2;
		
		//Pedimos al usuario los numeros
		System.out.println("Introduce el primer numero");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero");
		num2 = sc.nextInt();
		
		//comparamos los numeros para mostrarlos ordenados
		if (num1 > num2) {
			System.out.println("De mayor a menor: " + num1 + " , " + num2);
		} else if (num2 > num1) {
			System.out.println("De mayor a menor: " + num2 + " , " + num1);
		}else {
			System.out.println("De mayor a menor: " + num1 + " , " + num2);
		}
	}

}
