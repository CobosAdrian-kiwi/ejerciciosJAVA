package com;

import java.util.Scanner;

public class Ejercicio2 {
	
	//Declaramos el scanner aqui porque lo va a usar una funcion
	public static Scanner sc = new Scanner(System.in);
	
	//MAIN
	public static void main(String [] args) {
		
		//Definir variable arraySize & numUsu
		int arraySize;
		
		//Le preguntamos al usuario por la longitud de la tabla
		System.out.println("De cuantos numeros va a ser la tabla???");
		arraySize = sc.nextInt();
		
		//Declaramos la tabla con la longitud introducida
		int[] tabla;
		tabla = new int[arraySize];
		
		//Ejecutamos las funciones con la tabla establecida
		rellenarTabla(tabla);
		
		leerTablaInvert(tabla);
		
	}
	
	//FUNCIONES---------------
	
	 //Rellenar tabla:
	 ///Se van introduciendo numeros que van rellenando el hueco
	 ///de la tabla que corresponda a la iteracion actual del bucle
	public static void rellenarTabla(int[] tabla) {
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce el numero "+ (i+1));
			tabla[i] = sc.nextInt();
		}
	}
	
	//Leer tabla invertida:
	///Imprimimos tabla invertuda y hacemos un bucle que vaya
	///escribiendo la iteracion en la var actual y se escribe
	///ese indice de la tabla, cada iteracion el bucle le restamos
	///1 a i que en su primera iteracion es definido como 
	///la longitud de la tabla (previamente establecida) -1 para que
	///sea un valor válido porque el ultimo valor valido es -1
	public static void leerTablaInvert(int[] tabla) {
		int actual = 0;
		System.out.println("TABLA INVERTIDA:");
		
		for (int i = tabla.length -1; i >= 0; i--) {
			actual = i;
			
			System.out.println(tabla[actual]);
		}
		
	}
}
