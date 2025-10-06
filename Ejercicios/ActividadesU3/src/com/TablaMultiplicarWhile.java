package com;

import java.util.Scanner;

public class TablaMultiplicarWhile {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables
		int numUsu, result;
		int coef = 1;
		
		System.out.println("Introduce el número");
		numUsu = sc.nextInt();
		
		while(coef <=10) {
			result = numUsu * coef;
			
			System.out.println(numUsu + " * " + coef + " = " + result);
			
			coef++;
		}
	}
}
