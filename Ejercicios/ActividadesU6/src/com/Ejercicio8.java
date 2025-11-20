package com;
import java.util.Scanner;

/*
 * Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, 
 * es decir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a 
 * izquierda, sin tener en cuenta los espacios. Un ejemplo de frase palíndroma es: 
 * Dábale arroz a la zorra el abad.


 */

public class Ejercicio8 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //Crear variables
		String frase_usu;
		String frase_usu_minus;
		String frase_invert;
		String frase_invert_minus;
		boolean son_iguales;
		
		//Le pedimos al usuario que escriba la frase 
		System.out.println("Escribe la frase para comprobar si es palíndroma (Igual al derecho y al revés)");
		frase_usu = sc.nextLine();
		
		//Se hace con un string builder la frase y se invierte
		StringBuilder invertida = new StringBuilder(frase_usu);
		invertida = invertida.reverse();
		
		//Se guarda la frase invertida en una variable string para poderla comparar
		frase_invert = invertida.toString();
		
		//Se convierten ambas frases tanto la normal como la invertida en minúsculas
		frase_usu_minus = frase_usu.toLowerCase();
		frase_invert_minus = frase_invert.toLowerCase();
		
		//Se ejecuta la función y si es true el resultado es palindroma, si no no
		son_iguales = SonCadenasIguales(frase_usu_minus, frase_invert_minus);
		
		if(son_iguales) {
			System.out.println("La cadena "+ frase_usu + " es palíndroma");
		}else {
			System.out.println("La cadena " + frase_usu + " NO es palíndroma");
		}
		
		
	}
	//Funciones
	//Funcion para comparar si 2 son iguales
	public static boolean SonCadenasIguales(String cadena1, String cadena2) {
		boolean iguales = false;
		String cadena1_no_espacios = cadena1.replace(" ", ""); //Se reemplazan los espacios por nada
		String cadena2_no_espacios = cadena2.replace(" ", "");
		
		//Se compara
		if(cadena1_no_espacios.equals(cadena2_no_espacios)) {
			iguales = true;
		}
		
		return iguales;
	}
}
