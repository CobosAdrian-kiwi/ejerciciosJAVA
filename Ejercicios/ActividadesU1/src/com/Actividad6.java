package com;
import java.util.Scanner;
/**
 * ➗ Crear una aplicación que calcule la media aritmética 
 * de dos notas enteras.
	Hay que tener en cuenta que la media puede contener decimales.
 */
public class Actividad6 {
	
	public static void main(String[] args) {
		//Especificamos las variables
		int nota1, nota2;
		double notaMedia;
		
		//Leemos los valores
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la primera nota: ");
		nota1 = sc.nextInt();
		System.out.println("Dime la segunda nota: ");
		nota2 = sc.nextInt();
		
		//calculamos la nota media
		notaMedia = (nota1 + nota2) / 2.0;
		
		//mostramos la nota media
		System.out.println("Su nota media: " + notaMedia);
		
		sc.close();
		 
	}

	
}
