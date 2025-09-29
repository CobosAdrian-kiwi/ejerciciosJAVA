package com;
import java.util.Scanner;

public class Ejercicio9NoCondicionales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numUsuario, numComprobado;
		boolean impar;
		
		//Le pedimos que nos diga el número a comprobar
		System.out.println("Dime que número quieres comprobar...");
		numUsuario = sc.nextInt();
		
		//Calculamos el resto del numero del usuario y lo metemos en NumComprobado
		numComprobado = numUsuario % 2;
		
		impar = numComprobado == 1;
		
		System.out.println("Tu número es IMPAR? = " + impar);
	}

}
