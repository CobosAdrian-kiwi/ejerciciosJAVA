package com;
import java.util.Scanner;
/*
 * Diseñar un programa que solicite al usuario una frase y una palabra. 
 * A continuación buscará cuántas veces aparece la palabra en la frase.
 */
public class Ejercicio7 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Cadena
		String frase;
		//Palabra
		String palabra;
		
		//Variables
		int acumulador = 0,index = 0;
		
		//Preguntar al usuario
		System.out.println("Dime una frase y a continuación la palabra a buscar");
		frase = sc.nextLine();
		palabra = sc.nextLine();
		
		while(index != -1) {
			index = frase.toLowerCase().indexOf(palabra, index);
			if (index != -1) {
				acumulador++;
				index += palabra.length() + 1;
			}
			
		}
		
		System.out.println(acumulador);
	}
	
	//FUNCIONES
	public static int VecesQueSeRepitePalabra(String cadena, String palabra) {
		int veces = 0;
		
		
		
		return veces;
	}
}
