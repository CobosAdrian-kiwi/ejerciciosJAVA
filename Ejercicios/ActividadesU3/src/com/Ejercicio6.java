package com;

public class Ejercicio6 {
	public static void main(String[]args) {
		
		System.out.println("Multiplos de 7 menores que 100:");

		//i=7 porque el menor multiplo de un numero es uno mismo; solo los menores que 100 y avanzamos de 7 en 7 para que todos sean multiplos
		for(int i = 7; i <=100; i += 7) {
			System.out.println(i);
		}
	}
}
