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
public class Actividad5 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		
		Float numero;
		
		System.out.println("Dime un número decimal que se acerque a cero: ");
		numero = sc.nextFloat();
		
		if(-1 < numero ) {
			if( numero < 1 && numero !=0)  {
				System.out.println("El número es casi-cero");
			}else {
				System.out.println("No es casi-cero");
			}
		}else {
			System.out.println("No es casi-cero");
		}
		
	}
}
