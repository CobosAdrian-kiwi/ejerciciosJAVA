package com;
import java.util.Scanner;

/*
 * Se desea implementar una aplicación que pida al usuario que introduzca 
 * un número comprendido entre 1 y 10. Debemos mostrar la tabla de multiplicar 
 * de dicho número. El código tendrá que asegurarse de que el número 
 * introducido se encuentra entre el 1 y el 10.
 */

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definir las variables
		int numUsu; //el numero que el usuario va a introducir
		int result; //el resultado de cada multiplicacion de la tabla
		
		//le pedimos al usuario el numero
		System.out.println("Introduce el numero entre 1 y 10 para saber su tabla");
		numUsu = sc.nextInt();
		
		//comprobamos que está en el rango de 1 a 10
		if (numUsu >= 1 && numUsu <= 10) {
			
			//por cada iteracion se va a multiplicar el numero por el numero de iteracion y se suma al final 1 a la iteracion
			for (int coef = 1; coef <= 10; coef++) {
				result = numUsu * coef;
				
				//se le muestra al usuario
				System.out.println("" + numUsu + " * " + coef + " = " + result);
			}
		//si no está en el rango se lo decimos	
		}else {
			System.err.println("El numero tiene que estar entre el 1 y el 10");
		}
		
	}

}

