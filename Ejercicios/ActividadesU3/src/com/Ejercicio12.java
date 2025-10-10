package com;

import java.util.Scanner;

/*
 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */

public class Ejercicio12 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables
		int calificActual, numSuspensos;
		
		//Declaramos el numero de suspensos iniciales a 0
		numSuspensos = 0;
		
		//por cada iteracion vamos a preguntar la nota a introducir
		for(int iteraciones = 0; iteraciones <5; iteraciones++) {
			System.out.println("Introduce la nota número "+(iteraciones + 1));
			calificActual = sc.nextInt();
			
			//si la nota introducida es menos a 5 entonces a
			if(calificActual < 5) {
				numSuspensos++;
			}
		}
		
		//si el numero de suspensos es mayor a 0 lo decimos y decimos la cantidad
		if(numSuspensos > 0) {
			System.out.println("Hay suspensos ("+numSuspensos+")");
		//si no hay suspensos se lo decimos al usuario
		}else {
			System.out.println("No hay suspensos");
		}
		
	}
}
