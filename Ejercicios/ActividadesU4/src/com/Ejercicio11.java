package com;

public class Ejercicio11 {
	
	//MAIN
	public static void main(String[] args) {
		//Definimos los parametros que vamos a usar
		double a = 3;
		int n = 5;
		
		//ejecutamos la funcion iterativa (con bucle) con a y n como parametros
		double resultado_iterativ = iterativa(a, n);
		System.out.println("Iterativa = "+resultado_iterativ);
		
		//ejecutamos la funcion recursiva (una funcion que llama a otra funcion)
		double resutlado_recursiv = recursiva(a,n);
		System.out.println("Recursiva = "+ resutlado_recursiv);
	}
	
	//FUNCIONES-------------
	
	//ITERATIVA
	public static double iterativa(double a, int n) {
		double result = a; //acumulador
		n--; //le quitamos 1 a n como para hacer el primer a * a
		
		//en el bucle le damos al acumulador hasta que n sea 0
		while(n > 0) {
			result *= a;
			n--;
		}
		return result;
	}
	
	//RECURSIVA
	public static double recursiva(double a, int n) {
		
		if (n == 0) {
			return 1;
		}else {
			//se ejecuta la misma funcion con n sea n -1
			return a * recursiva(a, n -1);
		}
	}
}
