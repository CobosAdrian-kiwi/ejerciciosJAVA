package com;

import java.util.Scanner;

/*
 * Desarrollar el juego de la cámara secreta. 
 * El jugador elige la longitud de la combinación (dígitos del 1 al 5). 
 * La aplicación genera aleatoriamente la combinación y, en cada 
 * intento del usuario, muestra para cada dígito si es mayor, menor o 
 * igual que el correspondiente de la combinación secreta.
 */

public class Ejercicio5 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		///Definir la variable del numero de longitud de la tabla
		int largo;
		System.out.println("Dime como de largo va a ser la combinación correcta");
		largo = sc.nextInt();
		
		if(largo > 5 || largo < 1 ) {
			System.err.println("Entre 1 y 5 he dicho...");
		}else {
		
		///Hacer la tabla de soluciones
		int[] combinacion_correcta = new int[largo]; //Definir su longitud
		
		///Hacer un bucle para calcular los aleatorios de 1 a 5 en cada índice
		for (int i = 0; i < combinacion_correcta.length; i++) {
			combinacion_correcta[i] = (int)(Math.random() * 9 ) + 1; //Calculamos números entre 1 y 5
			
			//Imprimimos la solucion para las pruebas (Comentar cuando no se hagan pruebas)
			/*if (i == 0) {
				System.out.println("DEBUG (combinacion correcta):");
			}
			System.out.print(combinacion_correcta[i]+" ");
			*/
		}
		
		//Definir la tabla de soluciones del usuario
		int[] combiancion_usu = new int[largo];
		int acumulador = 0;
		
		///Bucle para ir comprobando
		do {
			System.out.println("\nIntroduce la combinación a comprobar numero a numero");
			for (int j = 0; j < combiancion_usu.length; j++) {
				System.out.println(j+"º numero:");
				combiancion_usu[j] = sc.nextInt();
			}
			
			for(int x = 0; x < combiancion_usu.length; x++) {
				int comprobacion = comprobaciones(combinacion_correcta, combiancion_usu, x);
				
				if(comprobacion == -1) {
					System.out.print("menor | ");
				}else if (comprobacion == 0) {
					System.out.print("correcto | ");
				}else {
					System.out.print("mayor | ");
				}
				
				
				if (comprobacion == 0) {
					acumulador++;
				}
			}
			
			
		}while(acumulador <= combinacion_correcta.length);
		System.out.println("\nHAS GANADO");
		}
	}
	
	//-----FUNCIONES-----
	//Funcion comprobar si los contenidos de cierto indice de 2 tablas es menor, igual o mayor
	public static int comprobaciones(int[] tablaA, int[] tablaB, int i) {
		/// -1 = menor | 0 = igual | 1 mayor
		
		if (tablaA[i] < tablaB[i]) {
			return -1;
		}else if (tablaA[i] == tablaB[i]) {
			return 0;
		}else {
			return 1;
		}
		
	}
}
