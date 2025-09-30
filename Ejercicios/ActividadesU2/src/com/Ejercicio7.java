package com;
import java.util.Scanner;

/*
 * Pedir tres numeros y ordenarlos de mayor a menor
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir las variables
		int num1, num2, num3;
		
		//Preguntar al usuario
		System.out.println("Inserte el primer numero:");
		num1 = sc.nextInt();
		
		System.out.println("Inserte el segundo numero:");
		num2 = sc.nextInt();
		
		System.out.println("Inserte el tercer numero:");
		num3 = sc.nextInt();
		
		//Comprobamos y ordenamos
		
		/*
		 * Vamos a hacer las comprobaciones de la siguiente manera, comprobamos si
		 * num1 es mayor que num2 y num3, si es asi vamos a comprobar cual de los 
		 * otros 2 es mayor. Despues hacemos lo mismo si num2 es mayor que num1 y num3
		 * y comparamos estos 2 dentro para ver cual es mayor de esos 2
		 */
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println("De mayor a menor: " + num1 +" , "+ num2 +" , "+ num3);
			} else{
				System.out.println("De mayor a menor: " + num1 +" , "+ num3 +" , "+ num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println("De mayor a menor: " + num2 +" , "+ num1 +" , "+ num3);
			} else {
				System.out.println("De mayor a menor: " + num2 +" , "+ num3 +" , "+ num1);
			}
		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
				System.out.println("De mayor a menor: " + num3 +" , "+ num1 +" , "+ num2);
			} else {
				System.out.println("De mayor a menor: " + num3 +" , "+ num2 +" , "+ num1);
			}
		}

	}

}
