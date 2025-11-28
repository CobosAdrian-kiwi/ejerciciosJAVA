package com;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Diseñar un algoritmo que lea del teclado una frase e indique, para la letras que aparecen 
 * en la frase, cuántas veces se repite cada una. Se consideran iguales las letras mayúsculas 
 * y las minúsculas para realizar la cuenta. Un ejemplo sería:
 */

public class Ejercicio13 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Contadores
		char[] tabla_caracteres = new char[1];
		int[] tabla_veces = new int[1];
		
		//Frase a analizar
		System.out.println("Inserte la frase a analizar");
		String frase = sc.nextLine();
		//Pasamos la frase a minuscula
		frase = frase.toLowerCase();
		
		//Bucle para analizar las letras
		boolean hay_caracter = false;
		
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			
			if (c == ' ') {
				continue;
			}
			
			hay_caracter = false;
			
			for(int j = 0; j < tabla_caracteres.length;j++) {
				if (tabla_caracteres[j] == c) {
					tabla_veces[j]++;
					hay_caracter = true;
					break;
				}
			}
			if(hay_caracter == false) {
				tabla_caracteres = IncrementarLongTabla(tabla_caracteres);
				tabla_caracteres[tabla_caracteres.length - 1] = c;
				
				tabla_veces = IncrementarLongTabla(tabla_veces);
				tabla_veces[tabla_veces.length - 1] = 1;
			}
			
		}
		
		for (int i = 0; i < tabla_caracteres.length; i++) {
            System.out.println(tabla_caracteres[i] + " → " + tabla_veces[i]);
        }
		
	}
	//FUNCIONES
	public static char[] IncrementarLongTabla(char[] tabla) {
		tabla = Arrays.copyOf(tabla, tabla.length+1);
		return tabla;
	}
	public static int[] IncrementarLongTabla(int[] tabla) {
		tabla = Arrays.copyOf(tabla, tabla.length+1);
		return tabla;
	}
}
