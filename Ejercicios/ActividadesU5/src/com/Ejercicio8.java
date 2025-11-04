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
		int[]tabla_extendida = tabla;
		//Definir variables
		int numActual; //Numero actual
		boolean hayrepe = false;
		
		System.out.println("Escribe el primer número de la tabla");
		tabla[0] = sc.nextInt();
		
		
		do {
			System.out.println("Escibe un número para añadir a la tabla (-1 para salir)");
			numActual = sc.nextInt();
			
			for(int i = 0; i < tabla.length; i++) {
				if (numActual == tabla[i] && numActual != -1) {
					hayrepe = false;
				}else {
					hayrepe = true;
				}
			}
			
			if(hayrepe == true && numActual != -1) {
				tabla_extendida = anyadirDistintoATabla(tabla, numActual);
				tabla = tabla_extendida;
			}
			
			
		}while(numActual != -1);
		
		System.out.println("Aquí está tu tabla completa:");
		System.out.println(Arrays.toString(tabla));
	}
	
	
	//-----FUNCIONES-----
	public static int[] anyadirDistintoATabla(int[] t, int n) {
		int[] tabla_mod = Arrays.copyOf(t, t.length +1);
		
		tabla_mod[tabla_mod.length -1] = n;
		
		return tabla_mod;
	}
}
