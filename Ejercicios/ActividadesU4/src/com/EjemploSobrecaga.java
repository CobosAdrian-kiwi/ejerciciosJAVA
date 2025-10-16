package com;

/*
 * Crea una clase llamada EjemploSobrecarga
 * Define 3 métodos 'mostrar()' con diferentes parámetros:
 *  - mostrar(String mensaje)
 *  - mostrar(int numero)
 *  - mostrar(String texto, int veces)
 *  
 *  Llama a todos desde main() y observa cual se ejecuta
 */

public class EjemploSobrecaga {
	public static void main(String[] args) {
		
		mostrar("Hola caracola");
		mostrar(16);
		mostrar("Hola caracola", 6);
		
		System.out.println("+----------------RECURSIVIDAD----------------+");
		int fact_result = factorial(5);
		System.out.println(fact_result);
	}
	
	public static void mostrar(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void mostrar(int numero) {
		System.out.print("El número: "+numero);
		if((numero % 2) == 0) {
			System.out.print(" es par\n");
		}else {
			System.out.print(" es impar\n");
		}
	}
	
	public static void mostrar(String texto, int veces) {
		while(veces > 0) {
			System.out.println(texto);
			veces--;
		}
	}
	
	
	//RECURSIVIDAD DE LAS FUNCIONES
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1 ;
		}else {
			//la funcion se llama a si misma dando un bucle
			return n * factorial (n - 1);
		}
	}
}
