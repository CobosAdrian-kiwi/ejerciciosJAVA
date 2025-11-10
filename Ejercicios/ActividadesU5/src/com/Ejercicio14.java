package com;

/*
 * Definir una función que reciba dos tablas: la primera con los 6 números de una 
 * apuesta de la primitiva y la segunda con los 6 números de la combinación ganadora. 
 * La función devolverá el número de aciertos.
 */

public class Ejercicio14 {
	//MAIN
	public static void main(String[] args) {
		//Creamos las 2 tablas
		int[] ganadora = {1, 2, 3, 4, 5, 6};
		
		int[] jugadora = {1, 2, 5, 8, 10, 3330};
		
		//Ejecutamos la variable
		int aciertos = numAciertos(ganadora, jugadora); 
		
		//Imprimimos el resultado
		System.out.println("El numero de aciertos es: " + aciertos);
	}
	
	//FUNCIONES
	public static int numAciertos(int[] t1, int[] t2) {
	int aciertos = 0;
	for(int i = 0; i < t2.length;i++) {
		for(int j = 0; j < t1.length; j++) {
			if(t2[i] == t1[j]) {
				aciertos++;
			}
		}
	}
	return aciertos;
	}
}
