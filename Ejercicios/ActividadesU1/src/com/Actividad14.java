package com;
import java.util.Scanner;
/**
 * Actividad 14 🔢
Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al entero más próximo.
 */
public class Actividad14 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double numeroD, numeroRe, numeroRe2;		
		
		// Solicitamos al usuario que ingrese un número
		System.out.println("Escribeme un número decimal: ");
		numeroD = sc.nextDouble();
		
		numeroRe = Math.round(numeroD);
		numeroRe2 = (int)( numeroRe + 0.5);
		
		
		// Mostramos
		System.out.println("El número más próximo es " + numeroRe);
		System.out.println("El número más próximo es " + numeroRe2);
	}

}
