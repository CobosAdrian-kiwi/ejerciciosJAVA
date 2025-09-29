package com;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el año actual:");
		int anoActual = sc.nextInt();
		
		System.out.println("Escribe tu año de nacimiento:");
		int anoNacim = sc.nextInt();
		
		int edad = anoActual - anoNacim;
		System.out.println("Tu edad es: " + edad);
	}

}
