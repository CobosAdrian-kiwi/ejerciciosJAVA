package com;
import java.util.Scanner;

/*
 * Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras 
 * introducidas con espacios en blanco. Terminar de leer la frase cuando alguna de las palabras introducidas 
 * sea la cadena «fin» escrita con cualquier combinación de mayúsculas/minúsculas. La cadena «fin» no 
 * aparecerá en la frase final.
 */

public class Ejercicio3 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creamos el String actual que se va a ir acutalizando
		String cadena_actual;
		
		//Creamos el acumulador
		StringBuilder acum = new StringBuilder();
		
		//Bulce para preguntar al usuario hasta que se escriba fin
		do {
			System.out.println("Escribe la palabra a añadir (escribe fin para terminar)");
			cadena_actual = sc.nextLine();
			
			if(!cadena_actual.equalsIgnoreCase("fin")) {
				acum.append(cadena_actual.trim()+" ");
			}
			
		}while(!cadena_actual.equalsIgnoreCase("fin"));
		
		System.out.println("Esta es la frase final completa:");
		System.out.println(acum);
	}
}
