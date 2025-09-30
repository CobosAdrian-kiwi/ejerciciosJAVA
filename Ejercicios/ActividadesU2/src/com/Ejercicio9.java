package com;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables
		long numUsu;
		int numUsuContado;
		
		//Pedir al usuario que defina el valor de numUsu
		System.out.println("Escribe el numero a comprobar su longitud...");
		numUsu = sc.nextLong();
		
		//Comprobamos si no es negativo, si es negativo le hacemos el absoluto
		if (numUsu < 0) {
			Math.abs(numUsu);
		}
		
		//Convertir numUsu a un String para contar sus cifras, que serían
		//Carácteres al convertirse a String
		
		numUsuContado = Long.toString(numUsu).length();
		
		//Le decimos al usuario la cantidad de caracteres de su número
		System.out.println("Tu número es: " + numUsuContado + " cifras de largo.");
	}

}
