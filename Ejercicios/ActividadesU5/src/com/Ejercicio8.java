package com;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Implementar la función int[] sinRepetidos(int t[]) que construye y devuelve 
 * una tabla con los elementos de t eliminando los repetidos. 
 * El tamaño del nuevo array debe ajustarse a los elementos únicos.
 */

public class Ejercicio8 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Crear tabla
		int[] tabla = new int[1];
		//Definir variables
		int numActual; //Numero actual
		boolean hayrepe = false;
		
		System.out.println("Escribe el primer número de la tabla");
		tabla[0] = sc.nextInt();
		
		
		do {
			System.out.println("Escibe un número para añadir a la tabla (-1 para salir)");
			numActual = sc.nextInt();
			
			if(numActual != -1) {
			tabla = comprobacionRepe(tabla, numActual);
			}
		}while(numActual != -1);
		
		System.out.println("Aquí está tu tabla completa:");
		System.out.println(Arrays.toString(tabla));
	}
	
	
	//-----FUNCIONES-----
	public static int[] comprobacionRepe(int[] t, int n) {
		for (int i = 0; i < t.length; i++) {
			if(t[i] == n) {
				return t;
			}
		}
		
		int[] tabla_mod = Arrays.copyOf(t, t.length +1);
		
		tabla_mod[tabla_mod.length -1] = n;
		
		return tabla_mod;
	}
}
