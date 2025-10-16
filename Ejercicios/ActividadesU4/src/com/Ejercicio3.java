package com;

import java.util.Scanner;

/*
 * 	Realizar una función que calcule y muestre el área o 
 *  el volumen de un cilindro, según se especifique.
 *	Opción 1: área. Opción 2: volumen. Además se pasa 
 *  el radio de la base y la altura.
 *  -----------------------------------------------------
 *	Fórmulas:
 *	área = 2 · π · r · (h + r)
 *	volumen = π · r² · h
 */

public class Ejercicio3 {
	
	private static final double PI = 3.1415;

	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables
		int opcion;
		double radio, altura;
		
		//Le preguntamos al usuario/a
		System.out.println("Dime el radio");
		radio = sc.nextDouble();
		System.out.println("Dime la altura");
		altura = sc.nextDouble();
		System.out.println("Elige una opción \n(1) Área \n(2) Volumen");
		opcion = sc.nextInt();
		
		
		
		
	}
	
	//FUNCIONES
	public static double areaFunc(double r, double h) {
		double area = 2 * PI * r * (h+r);
		return area;
	}
}
