package com;

public class Ejercicio13 {
	//MAIN
	public static void main(String [] args) {
		
		//Definimos la variable
		int numero = 5;
		
		//ejecuto la funcion con el numero y lo guardo en result
		int result = factorial(numero);
		
		//Imprimo la respuesta
		System.out.println(numero + "! = " +result);
		
	}
	
	//FUNIONES
	public static int factorial(int n) {
		
		//Si n = 0 devuelva 1 porque 0! = 1
		if (n == 0) {
			return 1;
		//si n no es 0 entonces se multiplica por la funcion con n otra vez pero se 
		//le resta 1
		}else {
			return n * factorial(n - 1);
		}
		
	}
}
