package com;
import java.util.Scanner;
public class Ejercicio3 {

	/*
	 * Solicitar 2 números distintos y mostrar cuál es el mayor.
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
		}/*else {
		*	System.out.println("No hay número mayor a otro");}
		*/
		
	}

}
