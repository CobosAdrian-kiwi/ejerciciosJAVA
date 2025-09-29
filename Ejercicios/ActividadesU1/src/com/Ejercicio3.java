package com;
import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad:");
		int edad = sc.nextInt();
		
		int edadSiguiente = edad + 1;
		System.out.println("Tu edad el año que viene será: " + edadSiguiente);

	}

}
