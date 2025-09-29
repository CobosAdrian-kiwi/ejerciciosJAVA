package com;
import java.util.Scanner;

public class Ejercicio8Corregido {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		//definimos las variables
		boolean mayor;
		int edad;
		
		//preguntamos la edad y la metemos en la variable "edad"
		System.out.println("¿Cuál es tu edad?");
		edad = sc.nextInt();
		
		mayor = edad >= 18;
		
		System.out.println("Mayor?? " + mayor);
	}

}
