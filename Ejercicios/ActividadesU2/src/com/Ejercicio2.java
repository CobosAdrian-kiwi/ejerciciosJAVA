package com;
import java.util.Scanner;
public class Ejercicio2 {

	/*
	 * Pedir dos números enteros y decir si son iguales o no.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables de ambos números que el usuario va a introducir
		int num1, num2;
		
		//Preguntamos al usuario
		System.out.println("Introduce el primer número");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número");
		num2 = sc.nextInt();
		
		//Comparamos los números
		if(num1 == num2) {
			//Si son iguales imprime esto
			System.out.println("Son iguales!!");
		} else {
			//Si son distintos imprime esto
			System.out.println("Son distintos!!");
		}
	}

}
