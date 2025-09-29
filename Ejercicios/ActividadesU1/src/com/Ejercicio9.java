package com;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definimos las variables del numero que el usuario va a comprobar y el resto
		int numUsuario, numComprobado;
		boolean impar;
		
		//Le pedimos que nos diga el número a comprobar
		System.out.println("Dime que número quieres comprobar...");
		numUsuario = sc.nextInt();
		
		//Calculamos el resto del numero del usuario y lo metemos en NumComprobado
		numComprobado = numUsuario % 2;
		
		//Si el resto es 1 entonces es impar y si no (es 0) el numero es par
		if (numComprobado == 1) {
			impar = true;
		} else {
			impar = false;
		}
		System.out.println("Tu número es IMPAR? = " + impar);
	}

}
