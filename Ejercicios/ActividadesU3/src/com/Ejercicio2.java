package com;

import java.util.Scanner;

/*
 * Un centro educativo nos ha pedido que diseñemos una aplicación para 
 * calcular algunos datos estadísticos de las edades de los alumnos. 
 * Se introducirán datos hasta que uno de ellas sea negativo. 
 * La aplicación mostrará la suma de todas las edades,
 * la media, de cuántos alumnos hemos introducido las 
 * edades y cuántos alumnos son mayores de edad. Implementar la 
 * aplicación requerida.
 */

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables que vamos a usar
		int edadAlum, numEdades, sumaEdades, media, mayoresEdad;
		
		//Declaramos temporalmente que estas valen 0
		sumaEdades = 0;
		numEdades = 0;
		mayoresEdad = 0;
		
		//Pregunatmos al usuario y lo guardamos
		do {
			System.out.println("Introduce la edad del alumno");
			edadAlum = sc.nextInt();
			
			//si la edad es mayor que 0 ejecutamos esto
			if (edadAlum >= 0) {
				//el numero de edades aumenta en 1
				numEdades++;
				
				//la suma sea a la edad introducida más lo que mas llevamos
				sumaEdades = sumaEdades + edadAlum;

				//si es igual o mayor de 18 le sumamos 1 a mayores de edad
				if (edadAlum >= 18) {
					mayoresEdad++;
				}
			}
			
		//si no y el numero es menor que 0 paramos de preguntar
		}while(edadAlum > 0);
		
		//calculamos la media
		media = sumaEdades / numEdades;		

		//le decimos al usuario los datos
		System.out.println("Número de alumnos: "+ numEdades);
		System.out.println("Suma de edades total: "+ sumaEdades);
		System.out.println("Media de las edades: "+ media);
		System.out.println("Mayores de edad: "+ mayoresEdad);
	}
}
