package com;

import java.util.Scanner;

public class Ejercicio12 {

	//MAIN
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables que vamos a usar
		int numA, numB, opcion;
		final String mensaje = "Resultado de ";
		//Definimos variables para los resultados de cada operacion
		int suma_result, resta_result, multi_result, divi_result;
		
		
		//Le pedimos al usuario los numeros a introducir
		System.out.println("Introduce los 2 números");
		numA = sc.nextInt();
		numB = sc.nextInt();
		
		//Vamos a ejecutar la funcion con los numeros introducidos pero dependiendo
		//de lo que el usuario nos dé ahora haremos
		System.out.println("Introduce la operación a realizar:\n(1) SUMA\n(2) RESTA\n(3) MULTIPLICACIÓN\n(4) DIVISIÓN");
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			suma_result = suma(numA, numB);
			System.out.println(mensaje + numA + " + "+ numB + " = " + suma_result);
			break;
		case 2:
			resta_result = resta(numA, numB);
			System.out.println(mensaje + numA + " - "+ numB + " = "+ resta_result);
			break;
		case 3:
			multi_result = multi(numA, numB);
			System.out.println(mensaje+ numA + " * "+ numB + " = " + multi_result);
			break;
		case 4:
			divi_result = divi(numA, numB);
			System.out.println(mensaje+ numA + " / "+ numB + " = " + divi_result);
			break;
		default:
			System.err.println("Numero/s no válidos");
			break;
		}
	}
	
	//FUNCIONES----------------
	
	//SUMA
	public static int suma(int a, int b) {
		int resultado;
		resultado = a + b;
		return resultado;
	}
	
	//RESTA
	public static int resta(int a, int b) {
		int resultado;
		resultado = a - b;
		return resultado;
	}
	
	//MULTIPLICACION
	public static int multi(int a, int b) {
		int resultado;
		resultado = a * b;
		return resultado;
	}
	
	//DIVISION
	public static int divi(int a, int b) {
		int resultado;
		resultado = a / b;
		return resultado;
	}
}
