package com;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Leer las notas (enteros) del 1.º, 2.º y 3.º trimestre de un grupo de 5 alumnos. 
 * Mostrar la nota media del grupo en cada trimestre y la media del alumno 
 * que está en la posición pos (leída por teclado).
 */
public class Ejercicio9 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Se crea la tabla de los 3 trimestres y los 5 alumnos
		int[][] notas = new int[5][3];
		
		//Medias
		double media1, media2, media3;
		double mediaAlumno;
		
		//Alumno a comprobar
		int num_alumno;
		
		//Intento 1 rellenar la tabla
		for(int colum = 0; colum < notas[0].length; colum++) {
			for(int filas = 0; filas < notas.length; filas++) {
				System.out.println("Escribe la nota del trimestre "+(colum+1)+" y del alumno "+(filas+1));
				notas[filas][colum] = sc.nextInt();
			}
		}
		
		imprimirMatriz(notas);
		
		media1 = mediaColumnaMatriz(notas, 0);
		System.out.println("Media primer trimestre: "+media1);
		media2 = mediaColumnaMatriz(notas, 1);
		System.out.println("Media primer trimestre: "+media2);
		media3 = mediaColumnaMatriz(notas, 2);
		System.out.println("Media primer trimestre: "+media3);
		
		
		do {
			System.out.println("Dime el alumno a comprobar su media (1-5) (-1 para salir)");
			num_alumno = sc.nextInt();
			
			if(num_alumno >=1 && num_alumno <=5) {
				mediaAlumno = mediaFilaMatriz(notas, num_alumno -1);
				System.out.println("La media del alumno introducido es: "+mediaAlumno);
				}else if (num_alumno <1 && num_alumno >5 && num_alumno != -1) {
					System.err.println("Ese no es un valor válido");
				}
		}while(num_alumno != -1);
		System.out.println("Saliendo...");
	}
	//FUNCIONES
	//Imprimir una matriz asi bien chulo
	public static void imprimirMatriz(int[][] matriz) {
		//Imprimir la matriz
				for (int x=0; x < matriz.length; x++) {
					  for (int y=0; y< matriz[x].length; y++) {
					    System.out.print (matriz[x][y]);
					    if (y!=matriz[x].length-1) System.out.print("\t");
					  }
					  System.out.println();
					}
	}
	
	//Media de cada trimestre
	public static double mediaColumnaMatriz(int[][] m, int columna) {
		double acum = 0, media = 0;
		for(int i = 0; i < m.length;i++) {
			acum += m[i][columna];
		}
		
		media = acum / m.length;
		return media;
	}
	
	//Media de cada alumno
	public static double mediaFilaMatriz(int[][] m, int fila) {
		double acum = 0, media = 0;
		for(int i = 0; i < m[0].length;i++) {
			acum += m[fila][i];
		}
		
		media = acum / m[0].length;
		return media;
	}
}
