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
		
		//Le decimos al usuario que introduzca la frase y la guardamos
		System.out.println("Introduce la palabra / frase a hacer su anagrama");
		StringBuilder frase_og =new StringBuilder(sc.nextLine());
		int frase_og_long = frase_og.length(); //tambien guardamos su longitud para la aleatorización del anagrama
		
		String frase_copia = frase_og.toString(); //hacemos una copia de la palabra original para las comprobaiones
		
		int contador_intentos = 0; //Hacemos una variable para contar los intentos
		String frase; //Y una para hacer la frase que se vaya introduciendo (la que se comprueba al adivinar)
		
		StringBuilder frase_resolver = new StringBuilder(); //Hacemos un stringbuilder con el anagrama aleat.
		
		///Aleatorizamos el anagrama haciendo un bucle que recorra la palabra original hasta completar su longitud
		///la longitud random es el caracter que va a salir de la frase_og y se va a meter en la frase_resolver
		for(int i = 0; i < frase_og_long; i++) {
			int longitudRandom = LongitudAleatoria(frase_og.length());
			if (longitudRandom == frase_og.length()) { //hacemos que si es la longitud mayor posible no se rompa
				longitudRandom -= 1;
			}
			
			frase_resolver.append(frase_og.charAt(longitudRandom)); //Metemos el caracter en el anagrama aleat
			
			frase_og.deleteCharAt(longitudRandom); //Quitamos el de la frase original
		}
		
		//Hacer el bucle de juego en el que se tiene que adivinar la palabra
		
		do {
			System.out.println("Adivinar esta palabra (intento "+contador_intentos + "). Palabra: \n"+frase_resolver);
			System.out.println("Introduce la frase:");
			frase = sc.nextLine();
			
			if (!frase.equals(frase_copia)) {
				contador_intentos++;
				System.out.println("Ese no es el anagrama correcto!");
			}
			
		}while (!frase.equals(frase_copia));
		
		System.out.println("Correcto, la has adivinado! ^^");
	}
	//FUNCIONES
	public static int LongitudAleatoria(int longitud) {
		int aleat;
		aleat = (int) (Math.random() * longitud);
		return aleat;
	}
}
