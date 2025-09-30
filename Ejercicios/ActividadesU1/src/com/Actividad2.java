package com;
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Dime un número");
		String numero = lector.nextLine();
		
		System.out.println("El número es: "+ numero);
		
		/**
		double numero = lector.nextDouble();
		numero = numero + 1;
		System.out.println("El número es: "+ numero);
		*/
	}

}
