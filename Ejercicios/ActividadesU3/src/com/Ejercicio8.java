package com;

import java.util.Scanner;

/*
 * Pedir un número y calcular su factorial. 
 * Por ejemplo, el factorial de 5 se denota 5! y es igual a 
 * 5 × 4 × 3 × 2 × 1 = 120.
 */

public class Ejercicio8 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		double numUsu, numUsuIter, multiRestult;
		
		//Pedir al usuario el número y guardar el original en numUsu
		System.out.println("Introduce un número para calcular el factorial");
		numUsu = sc.nextDouble();
		
		//Hacemos que las iteraciones sean iguales a numUsu
		//Definimos que el resultado sea 1 para que al multiplicarlo despues no cambie nada
		numUsuIter = Math.abs(numUsu);
		multiRestult = 1;
		
		//Siempre y cuando las iteraciones sean mayor a 1 lo multiplicamos 
		while(numUsuIter > 1) {
			
			multiRestult *= numUsuIter;
			
			//si es positivo le restamos 1 a las iteraciones decreciendo el
			//numero actual 5 * 5-1 * (5-1)-1 ...
			if (numUsuIter > 1) {
				numUsuIter--;
			}
		}
		
		if (numUsu <0) {
			multiRestult *= -1;
		}
		//le damos el resultado al usuario con el numero original y el resultado
		System.out.println(numUsu+"! = "+multiRestult);
		
	}
}
