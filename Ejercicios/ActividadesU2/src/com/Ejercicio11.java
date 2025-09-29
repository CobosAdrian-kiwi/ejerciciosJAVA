package com;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir variables
		int nota;
		
		//Pedir al usuario que introduzca el valor de nota
		System.out.println("Escribe tu nota");
		nota = sc.nextInt();
		
		//Calcular que es
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Tienes un insuficiente");
			break;
		case 5:
			System.out.println("Tienes un suficiente");
			break;
		case 6:
			System.out.println("Tienes un Bien");
			break;
		case 7:
			System.out.println("Tienes un Notable");
			break;
		case 8:
			System.out.println("Tienes un Notable");
			break;
		case 9:
			System.out.println("Tienes un Sobresaliente");
			break;
		case 10:
			System.out.println("Tienes un Sobresaliente");
			break;
		}

	}

}
