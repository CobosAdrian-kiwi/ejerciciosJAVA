package com;

import java.util.Scanner;

/*
 * Diseñar una función que reciba como 
 * parámetros dos números enteros y que devuelva el mayor de los dos.
 */

public class Ejercicio4 {
	
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaramos las variables
		int num1, num2, mayor;
		//Hacemos una constante que contenga el mensaje para usarlo en la salida
		final String mayor_mensaje = " es el mayor";
		
		//Le pedimos al usuario los numeros y los guardamos
		System.out.println("Introduce 2 números para saber el mayor");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//Guardamos el resultado de hacer la funcion maximo() con num1 y num2
		mayor = maximo(num1, num2);
		//si num1 = mayor entonces es el mayor, si no si num2 = mayor y si no se lo comunicamos al usuario
		if (mayor == num1) {
			System.out.println(num1 + mayor_mensaje);
		}else if (mayor == num2) {
			System.out.println(num2 + mayor_mensaje);
		}else if ((mayor != num1 || mayor != num2) && mayor == -999999999) {
			System.out.println("No hay un número que sea mayor");
		}
	}
	
	//FUNCIONES
	
	//FUNCION PARA CALCULAR EL MÁXIMO
	public static int maximo(int a, int b) {
		if (a > b) {
			int mayor = a;
			return mayor;
		}else if (b > a) {
			int mayor = b;
			return mayor;
		}else {
			int mayor = -999999999;
			return mayor;
		}
	}
}
