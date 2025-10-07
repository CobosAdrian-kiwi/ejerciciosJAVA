package com;

import java.util.Scanner;

/*
 * Realizar el juego el número secreto, que consiste en acertar un 
 * número desconocido (generado aleatoriamente entre 1 y 100). 
 * Para ello se leen por teclado una serie de números, para los que se indica:
 *  «mayor» o «menor», según sea mayor o menor con respecto al número secreto
 *El proceso termina cuando el usuario acierta o cuando se rinde 
 *(introduciendo un –1).
 */

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables
		int numUsu, numSecretoInt;
		double numSecreto;
		
		final String pregunta = "Dime un número entre 1 y 100 y te dire si has acertado, o pon un número negativo para rendirte";
		
		//Se define cual va a ser el numero secreto y se multiplica por 100
		//para que el máximo (1.0) sea 100
		
		numSecreto = Math.random() * 100;
		
		//se pasa a int para cortar los decimales y si es menor que 1 se queda como 1
		numSecretoInt = (int) numSecreto;
		if (numSecretoInt < 1) {
			numSecretoInt = 1;
		}
		
		//Quitarlo el comentario para que diga los numeros
		//System.out.println(numSecretoInt);
		//System.out.println(numSecreto);
		
		//se pregunta al usuario
		System.out.println(pregunta);
		numUsu = sc.nextInt();
		
		//se comprueba si es mayor o menor y se le vuelve a pregunar al usuario
		while(numUsu != numSecretoInt && numUsu > 0) {
			if (numSecreto > numUsu) {
				System.out.println("Más que eso");
			}else if (numSecreto < numUsu) {
				System.out.println("Menos que eso");
			}
			System.out.println(pregunta);
			numUsu = sc.nextInt();
		}
		
		//si el numero es acertado o negativo para y te muestra el mensaje
		if (numUsu == numSecretoInt) {
			System.out.println("Ole has acertado");
		}else if (numUsu < 0) {
			System.out.println("Te has rendido...");
		}
		
	}
}
