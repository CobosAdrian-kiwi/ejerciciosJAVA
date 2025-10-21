package com;

/*
 * Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci:
 * f(0) = 1, f(1) = 1 y f(n) = f(n-1) + f(n-2) para n ≥ 2.
 */

public class Ejercicio14 {
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
		
		//Declaro el primer numero que es 0 y el segundo que es 1
		int num1 = 0;
		int num2 = 1;
		//Le doy un valor temporal a fibo
		int fibo = 0;
		
		//Hago un bucle que se ejecute tantas veces hasta que las iteraciones son = al
		//numero introducido al ejecutar la funcion.
		//Basicamente que si ponemos el septimo numero de la serie se ejecute 7 veces
		for(int i = 1; i < x; i++) {
			
			//Digo que fibo va a ser num1 + num2
			fibo = num1 + num2;
			
			//cambio los valores para que la serie de fibonacci siga adelante
			num1 = num2;
			num2 = fibo;
		}
		
		return fibo;
		
	}
}
