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
	
	//Declaramos una constante de PI que vamos a usar en las funciones
	//no lo declaramos en //MAIN porque las funciones se encuentran fuera
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
		//Le preguntamos que opción quiere hacer
		System.out.println("Elige una opción \n(1) Área \n(2) Volumen");
		opcion = sc.nextInt();
		
		//Hacemos un switch por las 3 opciones posibles: 1, 2 o Cualquier otra cosa
		switch (opcion) {
		case 1: //Si la opcion es 1 guardamos el resultado de la funcion de area
				//en una variable y la imprimimos por pantalla
			double area = areaFunc(radio, altura);
			System.out.println(area);
			break;
		case 2: //Si la opcion es 2 guardamos el resultado de la func de volumen
				//en una variable y la imprimimos por pantalla
			double volumen = volumFunc(radio, altura);
			System.out.println(volumen);
			break;
		default: //Si es cualquier otra cosa sacamos un mensaje de error
			System.err.println("Valor no valido (1 o 2)");
			break;
		}
	}
	
	//--------------------FUNCIONES--------------------
	//FUNCION ÁREA
	public static double areaFunc(double r, double h) {
		double area = 2 * PI * r * (h+r);
		return area;
	}
	//FUNCIÓN VOLUMEN
	public static double volumFunc(double r, double h) {
		double vol = PI * (r*r) * h;
		return vol;
	}
}
