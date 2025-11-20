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
		String frase_final; //La frase a comparar
		//Palabra
		String palabra;
		
		//tabla de caracteres a comprobar
		char[] caracteres = {'.',',','-','_',')','"','/','?','¿','!','¡','[',']','º','ª','>','<',};
		
		//Variables
		int acumulador = 0;
		
		//Preguntar al usuario
		System.out.println("Dime una frase y a continuación la palabra a buscar");
		frase = sc.nextLine();
		StringBuilder frase_mod = new StringBuilder(frase); //Se hace un string builder para añadir un espacio al final de la frase
		
		//Se comprueba si termina en alguno de los caracteres de la tabla de caracteres
		for(int caracter = 0; caracter < caracteres.length; caracter++) {
			if (frase_mod.charAt(frase_mod.length()-1) == caracteres[caracter]) {
				frase_mod.insert(frase_mod.length()-1,' ');
				break;
			}
			if (caracter == caracteres.length-1) {
				frase_mod = frase_mod.append(" ");
			}
		}
			
		frase_final = frase_mod.toString();
		palabra = sc.nextLine() + " "; //Se añade un espacio al final de la palabra para 
		
		acumulador = VecesQueSeRepitePalabra(frase_final, palabra);
		
		System.out.println(acumulador);
	}
	
	//FUNCIONES
	public static int VecesQueSeRepitePalabra(String cadena, String palabra) {
		int veces = 0, index = 0;
		
		while(index != -1) {
			index = cadena.toLowerCase().indexOf(palabra.toLowerCase(), index);
			if (index != -1) {
				veces++;
				index += palabra.length();
			}
			
		}
		
		return veces;
	}
}
