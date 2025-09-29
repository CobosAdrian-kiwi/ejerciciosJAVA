package com;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir variables que va a introducir el usuario
		int notaPrimero, notaSegundo, notaTercero;
		
		//Definir variables nota boletin
		int mediaBoletin;
		
		//Definir variables expediente académico
		double mediaExp;
		
		//Preguntar al usuario las notas y guardarlas en el primer conjunto de variables
		System.out.println("Introduce la nota del primer trimestre:");
		notaPrimero = sc.nextInt();
		
		System.out.println("Introduce la nota del segundo trimestre:");
		notaSegundo = sc.nextInt();
		
		System.out.println("Introduce la nota del tercer trimestre:");
		notaTercero = sc.nextInt();
		
		//Calcular la media de boletin
		mediaBoletin = (notaPrimero + notaSegundo + notaTercero) / 3;
		//Calcular la media del expediente (con decimales)
		mediaExp = (notaPrimero + notaSegundo + notaTercero) / 3.0;
		
		//Mostramos al usuario
		System.out.println("La nota media del boletin es: " + mediaBoletin);
		
		System.out.println("La nota media del expediente académico es: " + mediaExp);
	}

}
