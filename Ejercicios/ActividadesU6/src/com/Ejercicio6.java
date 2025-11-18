package com;
import java.util.Scanner;

/*
 * Diseñar una función a la que se le pase una cadena de caracteres y 
 * la devuelva invertida. Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”
 */
public class Ejercicio6 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Cadena nomrl
		String cadena;
		//Rellenar cadena
		System.out.println("Escribe la cadena");
		cadena = sc.nextLine();
		//Cadena al reves
		StringBuilder anedaC = new StringBuilder(cadena);
		String CadenaReves = anedaC.reverse().toString();
		
		System.out.println("La cadena invertida es: "+ CadenaReves );	
	}
}
