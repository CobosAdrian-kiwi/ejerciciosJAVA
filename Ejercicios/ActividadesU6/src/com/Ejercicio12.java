package com;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Un anagrama es un palabra, o frase, que resulta de la transposición de otra palabra o frase. 
 * Ejemplos de anagramas para la palabra roma son: amor, ramo o mora. Construir un programa 
 * que solicite al usuario dos palabras e indique si son anagramas una de otra.
 */

public class Ejercicio12 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		//Palabras a comprobar
		String palabra1, palabra2;
		
		//Palabras en minuscula
		String palabra1_m, palabra2_m;
		
		//Preguntar por las palabras
		System.out.println("Introduce la palabra 1");
		palabra1 = sc.nextLine();
		System.out.println("Introduce la palabra 2");
		palabra2 = sc.nextLine();
		
		//Convertir cada una en una tabla de chars
		char[] tabla_palabra1 = new char[palabra1.length()];
		char[] tabla_palabra2 = new char[palabra2.length()];	
		
		//Pasar ambas palabras a minusculas
		palabra1_m = palabra1.toLowerCase();
		palabra2_m = palabra2.toLowerCase();
		
		if (palabra1_m.length() == palabra2_m.length()) {		
			
			//Rellenar las tablas por los caracteres de las palabras
			for(int i = 0; i < palabra1.length();i++) {
				tabla_palabra1[i] = palabra1_m.charAt(i);
			}
			for(int i = 0; i < palabra2.length();i++) {
				tabla_palabra2[i] = palabra2_m.charAt(i);
			}
			
			//Ordenar las tablas
			Arrays.sort(tabla_palabra1);
			Arrays.sort(tabla_palabra2);
			
			//Comprobar
			if (Arrays.equals(tabla_palabra1, tabla_palabra2)) {
				System.out.println("Las palabras: "+palabra1 +" y "+ palabra2 + " son anagramas");
			}else {
				System.out.println("Las palabras: "+palabra1 +" y "+ palabra2 + " NO son anagramas");
			}
		}else {
			System.out.println("Las palabras: "+palabra1 +" y "+ palabra2 + " NO son anagramas (no tienen ni la misma lonigtud)");
		}
		
	}
	//FUNCIONES
	
}
