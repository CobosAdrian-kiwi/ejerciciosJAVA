package com;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//definimos las variables
		boolean mayor;
		int edad;
		
		//preguntamos la edad y la metemos en la variable "edad"
		System.out.println("¿Cuál es tu edad?");
		edad = sc.nextInt();
		
		//comprobamos si la edad es mayor a 18
		if (edad >= 18) {
			mayor = true;
		} else {
			mayor = false;
		}
		
		//Le damos el  resultado al usuario
		System.out.println("Eres mayor? " + mayor);
		
	}

}
