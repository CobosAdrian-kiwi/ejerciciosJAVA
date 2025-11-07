package com;
import java.util.Scanner;

/*
 * +ENUNCIADOO-----------------------------------------------------------+
 * |Solicitar los elementos de una matriz de tamaño 4×4. 				 |
 * |Determinar si es una matriz mágica: la suma de cada fila y de  |
 * |cada columna es la misma).														 |
 * +---------------------------------------------------------------------------+
 */


public class Ejercicio11 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Crear la matriz
		int[][] matriz = new int[4][4];
		
		//LA VARIABLE
		int el_numero;
		boolean es_igual_filas = false;
		boolean es_igual_colum = false;
		boolean es_igual_diagonales = false;
		
		//Rellenar la matriz
		for(int colum = 0; colum < matriz[0].length; colum++) {
			for(int fila = 0; fila < matriz.length; fila++) {
				System.out.println("Columna: "+(colum+1)+" , Fila: "+(fila+1));
				matriz[colum][fila] = sc.nextInt();
			}
		}
		
		//Mostrar la tabla de prueba
		Ejercicio9.imprimirMatriz(matriz);
		
		//Calcular el primer numero para comprobar
		el_numero = sumaFila(matriz, 0);
		System.out.println(el_numero);
		
		//Comprobamos las filas
		for (int n = 1; n < matriz[0].length; n++) {
			if(sumaFila(matriz,n) == el_numero) {
				es_igual_filas = true;
			}else {
				es_igual_filas = false;
				break;
			}
		}
		
		System.out.println(es_igual_filas); //Se imprime por pruebas
		
		//Comprobamos columnas
		if (es_igual_filas == true) {
			for (int m = 0; m < matriz.length;m++) {
				if(sumaColumna(matriz, m) == el_numero) {
					es_igual_colum = true;
				}else {
					es_igual_colum = false;
					break;
				}
			}
		}		
		
		System.out.println(es_igual_colum); //Se imprime por pruebas
	}
	
	//FUNCIONES
	public static int sumaFila(int[][] m, int fila) {
		int result = 0;
		
		for(int i = 0; i < m[0].length;i++) {
			result += m[fila][i];
		}
		
		return result;
	}
	
	public static int sumaColumna(int[][] m, int columna) {
		int result = 0;
		
		for(int i = 0; i < m.length;i++) {
			result += m[columna][i];
		}
		
		return result;
	}
}
