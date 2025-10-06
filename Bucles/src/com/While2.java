package com;
import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palabra;
		final String PREGUNTA = "Quieres que te cuente el juego de la buena pipa";
		
		System.out.println(PREGUNTA);
		palabra = sc.nextLine();
		
		/*
		* while (!palabra.equals("fin")) {
		*
		*	System.out.println("pos ok... " + PREGUNTA);
		*	palabra = sc.nextLine();
		* }
		* System.out.println("Vale ya paramos...");
		*/
		
		do {
			System.out.println(PREGUNTA);
			palabra = sc.nextLine();
		} while (!palabra.equals("fin"));
		
		System.out.println("...ya paramos entonces");
	}

}
