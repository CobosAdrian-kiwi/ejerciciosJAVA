package com;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera nota: ");
		int primNota = sc.nextInt();
		
		System.out.println("Introduce la segunda nota: ");
		int segunNota = sc.nextInt();
		
		double media = (primNota + segunNota) / 2.0;
		System.out.println("La media de las notas es: " + media);
	}

}
