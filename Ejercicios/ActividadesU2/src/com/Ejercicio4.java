package com;
import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Realizar de nuevo el ejercicio anterior considerando el caso que los números
	 * introducidos sean iguales
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir variables numeros a rellenar por el usuario
		int num1, num2;
		
		//Preguntar al usuario los números
		System.out.println("Di el primer número");
		num1 = sc.nextInt();
		
		System.out.println("Di el segundo número");
		num2 = sc.nextInt();
		
		//Comparar los números
		if (num1 > num2) {
			System.out.println("El número 1 (" + num1 + ") es mayor que el número 2 (" + num2 + ").");		
		}else if(num2 > num1) {
			System.out.println("El número 2 (" + num2 + ") es mayor que el número 1 (" + num1 + ").");
		}else if (num1 == num2) {
			System.out.println("Los números son iguales");
		}
		
	}

}
