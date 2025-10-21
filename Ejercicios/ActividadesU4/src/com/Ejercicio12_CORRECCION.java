package com;

import java.util.Scanner;

public class Ejercicio12_CORRECCION {

	//MAIN
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables que vamos a usar
		int numA, numB, opcion;
		//Definimos variables para los resultados de cada operacion
		int op_result;
		
		//Le pedimos al usuario los numeros a introducir
		System.out.println("Introduce los 2 números");
		numA = sc.nextInt();
		numB = sc.nextInt();
		
		//Vamos a ejecutar la funcion con los numeros introducidos pero dependiendo
		//de lo que el usuario nos dé ahora haremos
		System.out.println("Introduce la operación a realizar:\n(1) SUMA\n(2) RESTA\n(3) MULTIPLICACIÓN\n(4) DIVISIÓN");
		opcion = sc.nextInt();
		
		op_result = operaciones(numA, numB, opcion);
		
		//Cambio la impresion para que salga el simbolo de la operacion seleccionada
		if (opcion == 1) {
			System.out.println("El resultado de "+ numA + " + " + numB + " = " + op_result);
		}else if (opcion == 2) {
			System.out.println("El resultado de "+ numA + " - " + numB + " = " + op_result);
		}else if (opcion == 3) {
			System.out.println("El resultado de "+ numA + " * " + numB + " = " + op_result);
		}else if (opcion == 4) {
			System.out.println("El resultado de "+ numA + " / " + numB + " = " + op_result);
		}
	}
	
	//FUNCIONES----------------
	
	//OPERACION
	//Depende de la opcion introducida se ejecuta una suma, resta, multi o divi.
	public static int operaciones(int a, int b, int opcion) {
		int resultado;
		switch (opcion) {
		case 1:
			resultado = a + b;
			break;
		case 2:
			resultado = a - b;
			break;
		case 3:
			resultado = a * b;
			break;
		case 4:
			resultado = a / b;
			break;
		default:
			System.err.println("Numero/s no válidos");
			resultado = 0;
			break;
		}
		return resultado;
	}
}
