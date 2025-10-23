package com;

import java.util.Scanner;

public class Ejercicio3 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables
		int arraySize;
		
		System.out.println("De que tamaño va a se la tabla?");
		arraySize = sc.nextInt();
		
		//Hacemos la tabla
		int[] tabla;
		tabla = new int[arraySize];
		
		Ejercicio2.rellenarTabla(tabla);
		
		double media_positivos = mediaTabla(tabla, 1);
		System.out.println(media_positivos);
		
	}
	
	//FUNCIONES---------------
	//Funcion para hacer la media de los numeros de una tabla
	//signo = (1)Positivos / (2)Negativos
	public static double mediaTabla(int[] tabla, int signo) {
		double media = 0;
		int acumulador = 0;
		int contador = 0;
		
		for(int i = 0; i < tabla.length; i++) {
			
			if(signo == 1) {
				if(i > 0) {
					acumulador += tabla[i];
					contador++;
				}
			}else if (signo == 2) {
				if(i < 0) {
					acumulador += tabla[i];
					contador++;
				}
			}
			
		}
		
		media = acumulador / contador;
		
		return media;
	}
}
