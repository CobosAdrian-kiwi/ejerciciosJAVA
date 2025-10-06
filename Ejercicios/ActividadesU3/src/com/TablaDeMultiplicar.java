package com;
import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definir la variable del numero que el usuario va a introducir
		int numUsu;
		int result;
		
		System.out.println("Introduce el numero y te digo la tabla");
		numUsu = sc.nextInt();
		
		for(int coef = 1; coef <=10 ; coef++) {
			result = numUsu * coef;
			
			System.out.println(""+numUsu + " * "+ coef +" = "+ result);
		}
		
	}

}
