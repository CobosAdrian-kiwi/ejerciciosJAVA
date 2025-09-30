package com;
import java.util.Scanner;
/**
 * Actividad 12 ➕➖
Escribir un programa que pida un número al usuario y muestre su valor absoluto.
 */
public class Actividad12 
{
	
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		// Definimos las variables
		int numero, valor_absoluto;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		valor_absoluto = Math.abs(numero);

		System.out.println(valor_absoluto);
		
	}
	
}
