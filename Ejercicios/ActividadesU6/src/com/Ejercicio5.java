package com;
import java.util.Scanner;

/*
 * Pedir el nombre completo y devolverlo sin vocales
 */

public class Ejercicio5 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creamos el String que el usuario va a introducir
		String nombre_completo;
		//Hacemos que el usuario lo rellene
		System.out.println("Dime tu nombre completo");
	    nombre_completo = sc.nextLine();
		
		//Hacemos el string builder
	    StringBuilder nombre_no_vocales = new StringBuilder();
	    //Tabla de las vocales
	    char[] vocales = {'a','e','i','o','u','á','é','í','ó','ú'};
		
	}
	//FUNCIONES
	public static String ContarEspaciosEnBlanco(String cadena, String cadena_no_vocales) {
			
		//Hacemos un bucle que recorra toda la longitud de la tabla
		for (int i = 0; i < cadena.length();i++) { 
			
		}
		
		return cadena_no_vocales;
	}
}
