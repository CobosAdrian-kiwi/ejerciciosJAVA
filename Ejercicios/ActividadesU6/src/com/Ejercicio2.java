package com;
import java.util.Scanner;

/*
 * Diseñar el juego acierta la contraseña. La mecánica del juego es la siguiente: el primer jugador introduce la contraseña; a continuación, el segundo jugador debe teclear
palabras hasta que la acierte. Realizar dos versiones; en la primera las únicas pistas
que se proporcionan son el número de caracteres y cuáles son el primer y el último
carácter de la contraseña. En la segunda versión se facilita el juego indicando si la
palabra introducida es mayor o menor, alfabéticamente, que la contraseña
 */


public class Ejercicio2 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Contraseña
		String passw = "HolaCaracola";
		
		//Contraseña de usuario
		String usu;
		
		//Opción 1 / 2
		int opcion;
		
		System.out.println("Que opción quieres jugar??\n"
				+ "(1): Se dice la longitud, 1era y ultima letra de la contraseña\n"
				+ "(2): Se dice si es mayor o menor alfabéticamente"
		);
		opcion = sc.nextInt();
		
		switch (opcion) {
			case 1:
				
		}
	}
}
