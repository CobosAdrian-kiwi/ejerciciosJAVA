package com;
import java.util.Scanner;
/**
 * Actividad 7
Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
public class Actividad7 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//Definimos las variables
		int num1, num2, num3;
		
		//Leemos
		System.out.println("Dime un número");
		num1 = sc.nextInt();
		System.out.println("Dime otro número");
		num2 = sc.nextInt();
		System.out.println("Dime otro número");
		num3 = sc.nextInt();
		
		//Comprobamos
		if((num1 > num2) && (num1 > num3) && (num2 > num3)) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}else if((num1 > num2) && (num1 > num3) && (num3 > num2)) {
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
		}else if((num2 > num1) && (num2 > num3) && (num1 > num3)) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		}else if((num2 > num1) && (num2 > num3) && (num3 > num1)) {
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
		}else if((num3 > num1) && (num3 > num2) && (num1 > num2)) {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
		}else if((num3 > num1) && (num3 > num2) && (num2 > num1)) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}
		
		
	}
}
