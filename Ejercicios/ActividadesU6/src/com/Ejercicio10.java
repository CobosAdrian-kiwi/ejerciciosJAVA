package com;
import java.util.Scanner;

/*
 * Disponemos de la siguiente relación de letras:

	conjunto 1: e i k m p q r s t u v
	conjunto 2: p v i u m t e r k q s

	mediante la cual es posible codificar un texto, convirtiendo cada letra del conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre la codificación en minúsculas.

	Un ejemplo: la palabra «PaquiTo» se codifica como «matqvko».
 */

public class Ejercicio10 {
	
	//Codificaciones
	public static final String conjunto1 = "e i k m p q r s t u v"; //Conjunto a cambiar
	public static final String conjunto2 = "p v i u m t e r k q s"; //Conjunto por el que cambiar
	
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//PRUEBAS
		//Frase a cambiar
		String frase;
		System.out.println("Dime la frase a codificar:");
		frase = sc.nextLine();
		
		//Frae cambiada
		StringBuilder frase_cod = new StringBuilder();
		
		//Recorremos frase entera y por cada caracter ejecutamos la función
		for(int i = 0; i < frase.length(); i++) { 
			frase_cod = frase_cod.append(Codificar(conjunto1, conjunto2, frase.toLowerCase().charAt(i)));
		}
		
		System.out.println(frase_cod); //Imprimimos el resultado
		
	}
	//Funciones
	public static char Codificar(String conjunto1, String conjunto2, char c) {
		
		///Recorremos el conjunto 1 y comparamos con el caracter introducido por el usuario, si coincide lo cambiamos
		///por la misma posicion en el conjunto 2
		for(int i = 0; i < conjunto1.length(); i++) {
			if(c == conjunto1.charAt(i)) {
				c = conjunto2.charAt(i);
				break;
			}
		}
		return c;
	}
}
