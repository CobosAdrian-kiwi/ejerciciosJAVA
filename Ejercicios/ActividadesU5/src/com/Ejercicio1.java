package com;

import java.util.Scanner;

public class Ejercicio1 {

	//MAIN
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables a usar
		int numUsu;
		
		//Hacemos el array donde vamos a guardar los numeros
		//OPCION 1 (Quitar los comentarios para que funcione)
		 int[] tabla;
		 tabla = new int[5];
		//OPCION 2 (Quitar los comentarios para que funcione)
		///int[] tabla = new int[5];
		
		//Bucle para meter los datos en el array 1 por 1
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce el numero "+(i+1));
			numUsu = sc.nextInt();
			tabla[i] = numUsu;
		}
		
		//Bucle para mostrar cada celda de la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i]);
		}
	}
}
