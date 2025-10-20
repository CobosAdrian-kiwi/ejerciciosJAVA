package com;

public class Ejercicio11 {
	
	//MAIN
	public static void main(String[] args) {
		//Definimos los parametros que vamos a usar
		int a = 3;
		int n = 5;
		
		//ejecutamos la funcion iterativa (con bucle) con a y n como parametros
		int resultado_iterativ = iterativa(a, n);
		System.out.println("Iterativa = "+resultado_iterativ);
		
		//ejecutamos la funcion recursiva (una funcion que llama a otra funcion)
		int resutlado_recursiv = recursiva(a,n);
		System.out.println("Recursiva = "+ resutlado_recursiv);
	}
	
	//FUNCIONES-------------
	
	//ITERATIVA
	public static int iterativa(int a, int n) {
		int result = a; //acumulador
		n--; //le quitamos 1 a n como para hacer el primer a * a
		
		//en el bucle le damos al acumulador hasta que n sea 0
		while(n > 0) {
			result *= a;
			n--;
		}
		return result;
	}
	
	//RECURSIVA
	public static int recursiva(int a, int n) {
		
		if (n == 0) {
			return 1;
		}else {
			//se ejecuta la misma funcion con n sea n -1
			return a * recursiva(a, n -1);
		}
	}
}
