package com;
import java.util.Scanner;

/*
 * Realizar un programa descodificador. La solución es tan sencilla como utilizar la función diseñada 
 * en el ejercicio anterior intercambiando los conjuntos entre sí.
 */

public class Ejercicio11 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Frase del usuario
		String frase;
		System.out.println("Introduce la frase a descodificar");
		frase = sc.nextLine();
		
		//Frae cambiada
				StringBuilder frase_cod = new StringBuilder();
				
				//Recorremos frase entera y por cada caracter ejecutamos la función
				for(int i = 0; i < frase.length(); i++) { 
					frase_cod = frase_cod.append(Ejercicio10.Codificar(Ejercicio10.conjunto2, Ejercicio10.conjunto1, frase.toLowerCase().charAt(i)));
				}
				
				System.out.println(frase_cod); //Imprimimos el resultado
	}
}
