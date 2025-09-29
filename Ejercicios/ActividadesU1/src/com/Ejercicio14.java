package com;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir variable número que introduce el usuario y el numero ya redondeado
		double numDec, numRedondeado;
		
		//Preguntar al usuario por el numero decimal que quiere redondear
		System.out.println("Introduce un número decimal:");
		numDec = sc.nextDouble();
		
		//redondearlo con Math.round()
		numRedondeado = Math.round(numDec);
		
		//Mostrar los resultados al usuario
		System.out.println("El número introducido redondeado es: " + numRedondeado);
	}

}
