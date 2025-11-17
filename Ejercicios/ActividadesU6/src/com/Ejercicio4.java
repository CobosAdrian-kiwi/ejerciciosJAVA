package com;
import java.util.Scanner;

/*
 * Que el usuario escriba una frase y se cuenten los espacios en blanco
 */

public class Ejercicio4 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Crear acumulador de espacios
		int acum_espacios = 0;
		//Creamos el String que el usuario va a introducir
		String cadena_usu;
		//Hacemos que el usuario lo rellene
		System.out.println("Rellena la cadena con una frase");
		cadena_usu = sc.nextLine();
		
		//Ejecutams la funcion y guardamos el resultado en la variable de acumulacion
		acum_espacios = ContarEspaciosEnBlanco(cadena_usu);
		
		//Le decimos el resultado al usuario
		System.out.println("''"+cadena_usu + "'' tiene "+ acum_espacios + " espacios");
		
	}
	//FUNCIONES
	public static int ContarEspaciosEnBlanco(String cadena_a_contar) {
		int acumulador = 0; //Creamos un acumulador
		
		//Hacemos un bucle que recorra toda la longitud de la tabla
		for (int i = 0; i < cadena_a_contar.length();i++) { 
			if(cadena_a_contar.charAt(i) == ' ') { //Si el valor actual es un espacio en blanco le añadimos 1 al acumulador
				acumulador++;
			}
		}
		
		return acumulador;
	}
}
