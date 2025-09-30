package com;
import java.util.Scanner;
//Importamos StringBuilder para tener la utilidad de .reverse()
import java.lang.StringBuilder;

public class Ejercicio10SegundoIntento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables
		//un short para saber que el usuario pone un número
		//Strings para compararlos e invertirlos
		//Un booleano para comprobar si es capicua o no
		short numUsu;
		String numUsuStr, numUsuStrInvert;
		boolean capicua;
		
		//Le pedimos al usuario el número a comprobar y lo guardamos en numUsu
		System.out.println("Introduce el número a comprobar:");
		numUsu = sc.nextShort();
		
		//+Comprobamos que el número introducido sea válido como en el enunciado
		if (numUsu > 0 && numUsu < 9999) {
			
		//Guardamos una version de numUsu convertida a String en numUsuStr
		numUsuStr = Short.toString(numUsu);
		
		//Creamos el objeto StringBuilder
		StringBuilder sb = new StringBuilder(numUsuStr);
		
		//Invertimos el numUsuStr y lo guardamos en numUsuStrInvert
		StringBuilder Invert = sb.reverse();
		numUsuStrInvert = Invert.toString();
		
		//Comprobamos con .equals() si numUsuStr(El original) y numUsuStrInvert(al que 
		//le hemos dado la vuelta) y si es true entonces es capicua 
		capicua = numUsuStr.equals(numUsuStrInvert);
		
		//Hacemos la comprobación y comunicamos con el usuario
		if (capicua == true) {
			System.out.println("Tu número es capicua");
		} else {
			System.out.println("Tu número no es capicúa");
		}
		
		//+si el numero que el usuario no ha introducido ponemos esto
		} else {
			System.out.println("El número introducido no es válido");
		}

	}

}
