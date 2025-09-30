package com;
import java.util.Scanner;
/**
 * 🔞 Realizar una aplicación que solicite al usuario su edad y le indique 
 * si es mayor de edad (mediante un literal booleano: true o false).
 */
public class Actividad8 {
	
	
	public static void main(String[] args) {
	
		//Definimos las variables
		int edad; 
		boolean esMayor;
		Scanner sc = new Scanner(System.in);
		
		//Preguntamos la edad
		System.out.println("¿Qué edad tienes? ");
		edad = sc.nextInt();
		
		//Calculamos la edad
		esMayor = edad >= 18;
		
		//Mostramos al usuario
		System.out.println("¿Es Mayor? " + esMayor);
		
	}

}
