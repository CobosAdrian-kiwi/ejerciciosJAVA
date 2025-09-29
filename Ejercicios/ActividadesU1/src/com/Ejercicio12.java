package com;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Defino las variables
		double num, numAbs;
		
		//Pregunto por el numero al usuario
		System.out.println("Introduce el número a mostrar su absoluto:");
		num = sc.nextDouble();
		
		//guardo el absoluto del introducido en otra variable
		numAbs = Math.abs(num);
		
		//Se escribe por pantalla el absoluto anteriormente guardado
		System.out.println("El absoluto del valor introducido es: " + numAbs);
	}

}
