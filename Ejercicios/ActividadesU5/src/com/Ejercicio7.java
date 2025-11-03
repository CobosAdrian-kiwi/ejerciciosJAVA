package com;

import java.util.Scanner;
import java.util.Arrays;

/*
 * Leer una serie de 6 enteros, guardarlos y mostrarlos ordenados. 
 * Repetir con otra serie de 6. A continuación, fusionar ambas 
 * tablas en una tercera de forma que los 12 números sigan 
 * ordenados, sin volver a ordenar.
 */

public class Ejercicio7 {
	
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declarar tablas
		int[] tabla1 = new int[6];
		int[] tabla2 = new int[6];
		int[] tabla_fusion = new int[tabla1.length + tabla2.length];
		
		//Rellenar tablas
		System.out.println("Rellenar tabla 1:");
		Ejercicio2.rellenarTabla(tabla1);
		Arrays.sort(tabla1);
		
		System.out.println("TABLA 1:");
		for(int i = 0; i < tabla1.length;i++) {
			System.out.print(tabla1[i]+ " | ");
		}
		
		System.out.println("\nRellenar tabla 2:");
		Ejercicio2.rellenarTabla(tabla2);
		Arrays.sort(tabla2);
		
		System.out.println("TABLA 2:");
		for(int i = 0; i < tabla2.length;i++) {
			System.out.print(tabla2[i]+ " | ");
		}
		
		tabla_fusion = fusionarOrdenar(tabla1, tabla2);
		System.out.println("TABLAS FUSIONADAS:");
		for(int i = 0; i < tabla_fusion.length;i++) {
			System.out.print(tabla_fusion[i]+ " | ");
		}
		
	}
	
	//FUNICONES
	//FUncion para comparar y ordenar una tabla en base a 2
	public static int[] fusionarOrdenar(int[] tablaA, int[] tablaB) {
		//Definimos la tabla en la que vamos a calcular
		int[] tablaC = new int[tablaA.length + tablaB.length];
		
		///Se crean 3 índices (i para tablaA, j para tablaB y k para tablaC)
		int i = 0, j = 0, k = 0;
		
		///Mientras que los índices sean menores a la longitud de sus tablas se ejecuta este bucle
		while (i < tablaA.length && j < tablaB.length) {
			///Si el contenido de la tablaA del índice acutal es menor o igual al de la B
			///guardamos en el índice de la C el contenido de la A y le sumamos 1 a su índice
			if (tablaA[i] <= tablaB [j]) {
				tablaC[k] = tablaA[i];
				i++;
			//Si no lo mismo poro con la B y su índice
			}else {
				tablaC[k] = tablaB[j];
				j++;
			}
			///Siempre aumentamos el indice de la k
			k++;
		}
		
		///Estos while es por si la tabla B o A ya han acabado y la otra sigue teniendo números
		///es para que se vayan metiendo el restante
		while (i < tablaA.length) {
			tablaC[k] = tablaA[i];
			i++;
			k++;
		}
		while (j < tablaB.length) {
			tablaC[k] = tablaB[j];
			j++;
			k++;
		}
		
		return tablaC; //Devolvemos la tabla con los resultados cambiaos
	}
}
