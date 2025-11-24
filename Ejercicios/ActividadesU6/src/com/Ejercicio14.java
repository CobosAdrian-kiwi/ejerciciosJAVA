package com;
import java.util.Scanner;

/*
 * Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra o 
 * frase, y la aplicación muestra un anagrama (transposición de los caracteres) del texto
 * introducido generado al azar. A continuación otro jugador tiene que acertar cuál es el texto 
 * original. La aplicación no debe permitir que el texto introducido por el jugador 1 sea la cadena 
 * vacía. Por ejemplo, si el jugador 1 escribe “teclado”, la aplicación muestra como pista un 
 * anagrama al azar: “etcloda”.
 */

public class Ejercicio14 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder frase_og =new StringBuilder("Caracola");
		System.out.println(frase_og.length());
		
		StringBuilder frase_resolver = new StringBuilder();
		
		for(int i = 0; i < frase_og.length(); i++) {
			int longitudRandom = (int) (Math.random() * frase_og.length());
			if (longitudRandom == frase_og.length()) {
				longitudRandom -= 1;
			}
			
			System.out.println(longitudRandom);
			frase_resolver.append(frase_og.charAt(longitudRandom));
			
			frase_og.deleteCharAt(longitudRandom);
			System.out.println(frase_og);
		}
		
		System.out.print(frase_resolver);		
		
		//Estás usando frase_og.length() en el for como límite. Pero cada vez que borras un carácter, frase_og.length() disminuye. Esto significa que tu bucle no recorre todos los caracteres, porque frase_og.length() cambia dinámicamente.
		
	}
}
