package com;
import java.util.Locale;
import java.util.Scanner;
/**
 * Implementar un programa que pida por teclado un número decimal e indique 
 * si es un número casi-cero, que son aquellos, positivos o negativos, 
 * que se acercan a 0 por menos de 1 unidad, 
 * aunque curiosamente el 0 no se considera un número casi-cero.
 *  Ejemplos: 0.3, –0.99 o 0.123.
 *   Y números que no se consideran casi-ceros son: 12.3, 0 o –1.
 */
public class Actividad5b {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		
		Double n;
		
		System.out.println("Introduce el número decimal: ");
		n = sc.nextDouble();
		
		
		if(n!=0 && n<1 && n>-1) {
			System.out.println("El número es casi-cero");
		}else {
			System.out.println("El número no es casi-cero");
		}
	
	}
}
