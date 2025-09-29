package com;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir variables
		int dia, mes, anno;
		boolean diaValid, mesValid, annoValid;
		
		//Preguntar al usuario
		System.out.println("Dime el dia, mes y año a comprobar");
		dia = sc.nextInt();
		mes = sc.nextInt();
		anno = sc.nextInt();
		
		//comprobamos
		if (anno < 0) {
			System.out.println("No hay años negativos");
		} else {
			if (mes == 1) {
				if (dia <= 31 && dia > 0) {
					System.out.println("La fecha es válida");
				}
			}
		}
	}

}
