package com;

import java.util.Scanner;

/*
 * Crear una función que, mediante un booleano, indique si el carácter pasado 
 * como parámetro corresponde a una vocal.
 */

public class Ejercicio6 {
	
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables
		char letra;
		boolean vocalbool;
		
		//Le pedimos al usuario por 1 caracter y lo guardamos en la variable letra
		System.out.println("Escriba 1 caracter para saber si es una vocal o no"
				+ "\nIMPORTANTE: solo se tendrá en cuena el primer caracter introducido");
		letra = sc.next().charAt(0);
		
		//metemos el resultado de vocal() hecho con la letra introducida por el usuario
		//dentro de vocalbool
		vocalbool = vocal(letra);
		
		//Si el return de la funcion es true es una vocal si no pos no
		if(vocalbool == true) {
			System.out.println("El caracter introducido es una vocal");
		}else {
			System.out.println("El caracter introducido NO es una vocal");
		}
	}
	
	//FUNCIONES
	public static boolean vocal(char caracter) {
		//Declaramos una variable booleana como false
		boolean es_vocal = false;
		//Si el caracter introducido en minusculas es igual a A,E,I,O o U
		//ponemos la variable es_vocal como true+
		if (Character.toLowerCase(caracter) == 'a' 
			|| Character.toLowerCase(caracter) == 'e' 
			|| Character.toLowerCase(caracter) == 'i'
			|| Character.toLowerCase(caracter) == 'o'
			|| Character.toLowerCase(caracter) == 'u') {
			
			es_vocal = true;
		//+Si no la ponemos como false
		}else {
			es_vocal = false;
		}
		//Devolvemos la variable para ser usada en la comprobacion del if dentro de //MAIN
		return es_vocal;
	}
}
