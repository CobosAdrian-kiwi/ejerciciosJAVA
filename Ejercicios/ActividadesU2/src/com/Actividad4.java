package com;
import java.util.Scanner;
/**
 * Actividad 4
Realizar de nuevo el ejercicio anterior considerando 
el caso de que los números introducidos sean iguales.
 */
public class Actividad4 {
	public static void main(String [] args) {
		// Definimos las variables
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		//Solicitamos algún número
		System.out.println("Introduce un número: ");
		numero1 = sc.nextInt();
		//Solicitamos un número diferente
		System.out.println("Introduce otro número diferente: ");
		numero2 = sc.nextInt();
		
		if(numero1 == numero2) {
			System.out.println(numero1 + " y " + numero2 + " son el mismo número");
		}else if(numero1 > numero2) {
			System.out.println(numero1 + " es mayor que " + numero2);
		}else {
			System.out.println(numero2 + " es mayor que " + numero1);
		}
		
	}

}
