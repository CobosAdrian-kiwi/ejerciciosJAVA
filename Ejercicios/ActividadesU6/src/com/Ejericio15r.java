package com;
import java.util.Scanner;

/*
 * Modificar el ejercicio anterior para que el programa indique al jugador 2, en cada intento, cuántas letras 
 * coinciden con el texto original.
 */

public class Ejericio15r {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la palabra / frase a hacer su anagrama");
		
		StringBuilder frase_og =new StringBuilder(sc.nextLine());		
		int frase_og_long = frase_og.length();
		
		String frase_copia = frase_og.toString();
		
		int contador_intentos = 0;
		int contador_coincidencias = 0;
		String frase;
		
		StringBuilder frase_resolver = new StringBuilder();
		
		for(int i = 0; i < frase_og_long; i++) {
			int longitudRandom = (int) (Math.random() * frase_og.length());
			if (longitudRandom == frase_og.length()) {
				longitudRandom -= 1;
			}
			
			frase_resolver.append(frase_og.charAt(longitudRandom));
			
			frase_og.deleteCharAt(longitudRandom);
		}
		
		//Hacer el bucle de juego en el que se tiene que adivinar la palabra
		
		do {
			contador_coincidencias = 0;
			System.out.println("Adivinar esta palabra (intento "+contador_intentos + "). Palabra: \n"+frase_resolver);
			System.out.println("Introduce la frase:\n...");
			frase = sc.nextLine();
			
			if (!frase.equals(frase_copia)) {
				contador_intentos++;
				System.out.println("Ese no es el anagrama correcto!");
				for(int j = 0; j < frase_copia.length()-1; j++) { //Se hace lo mismo que en el ejercicio anterior solo que se hace
																								 ///un bucle mas que recorre en la frase en busca de coincidencuias 
					if(frase.charAt(j) == frase_copia.charAt(j)) {
						contador_coincidencias++;
					}
				}
				System.out.println("Hay "+ contador_coincidencias+" coincidencias.");
			}
			
		}while (!frase.equals(frase_copia));
		
		System.out.println("Correcto, la has adivinado! ^^");
	}
}
