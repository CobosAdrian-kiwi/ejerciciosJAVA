package com;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definimos las variables
		double radioUsuario, longitud, area;
		final double PI = Math.PI;
		
		//preguntamos por el radio deseado
		System.out.println("CALCULADORA DE CIRCUNFERENCIAS: \n Introduce el radio: ");
		radioUsuario = sc.nextDouble();
		
		//calculamos la longitud y el area
		longitud = 2 * PI * radioUsuario;
		area = PI * (radioUsuario * 2);
		
		//decimos el resultado
		System.out.println("La longitud y el área de tu circunferencia son: \n Longitud: " + longitud + "\n Área: " + area);
	}

}
