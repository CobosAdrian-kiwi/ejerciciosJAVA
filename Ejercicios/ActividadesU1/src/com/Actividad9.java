package com;
import java.util.Scanner;
/**
 * 🔢 Escribir un programa que pida un número al usuario e indique mediante un literal booleano (true o false) si el número es par
 */
public class Actividad9 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime el número: ");
		
		int num = scanner.nextInt();
		
		boolean par = num % 2 == 0;
		
		System.out.println("¿Es par? " + par);
	}
}
