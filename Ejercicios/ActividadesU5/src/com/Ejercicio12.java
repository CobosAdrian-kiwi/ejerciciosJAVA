package com;
import java.util.Scanner;

/*
 * Crear una tabla bidimensional de tamaño 5×5 y rellenarla de 
 * manera que la posición [n, m]
 *  contenga n + m. Mostrar su contenido.
 */

public class Ejercicio12 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Crear la matriz
		int[][] matriz = new int[5][5];
		//Crear las variables
		int n, m;
		
		//Rellenar la matriz con los bucles
		for(n = 0; n < matriz.length; n++) {
			for (m = 0; m < matriz[0].length; m++) {
				matriz[n][m] = n + m;
			}
		}
		
		//Mostrar la tabla
		Ejercicio9.imprimirMatriz(matriz);
	}
}
