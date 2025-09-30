package com;
import java.util.Scanner;

/**
 * 📐 Diseñar una aplicación que calcule la longitud 
 * y el área de una circunferencia.
Para ello, el usuario debe introducir 
el radio (que puede contener decimales).

 Longitud = 2 x PI x radio
 Área = PI x radio x radio

 */
public class Actividad7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definimos las variables
		double radio, longitud, area;
		//Constante PI
		final double PI = Math.PI;
		
		System.out.println("Dime el radio: ");
		radio = sc.nextFloat();
		
		//Calculamos ->  Longitud = 2 x PI x radio
		longitud = 2 * PI * radio;
		//Calculamos --> Área = PI x radio x radio
	    area  = PI * radio * radio;
		//area = PI * Math.pow(radio, 2);
		
		/**
		 *Mostramos*/
	    System.out.println("La longitud de radio "+ radio + " es " + longitud);
	    System.out.println("El área de radio "+ radio + " es " + area);

		
	}

}
