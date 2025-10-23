package com;

/*
 * Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci:
 * f(0) = 1, f(1) = 1 y f(n) = f(n-1) + f(n-2) para n ≥ 2.
 */

public class Ejercicio14CORREGIDO {
	//MAIN
	public static void main(String [] args) {
		//Definir n
		int n = 7;
		
		//Ejecuto la funcion con el valor n
		int fibonacci = fibonacci(n);
		System.out.println("El "+ n +"º número de la secuencia de fibonacci es: "+fibonacci);
	}
	
	//FUNCION FIBONACCI
	public static int fibonacci(int x) {
		
		if (x == 0) {
			return 0;
		}else if(x == 1) {
			return 1;
		}else {
			return fibonacci(x-1)+ fibonacci (x-2);
		}
		
	}
}
