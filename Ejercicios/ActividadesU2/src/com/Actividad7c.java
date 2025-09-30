package com;

import java.util.Scanner;

/**
 * Actividad 7 Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
public class Actividad7c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Definimos las variables
		double num1, num2, num3;
		double mayor = -1, medio =-1, menor=-1;
	
		System.out.println("Dime un número");
		num1 = sc.nextDouble();
		System.out.println("Dime otro número");
		num2 = sc.nextDouble();
		System.out.println("Dime otro número");
		num3 = sc.nextDouble();
		
		
		if((num1 > num2) && (num2 > num3) && (num1 > num3)) {
			mayor = num1;
			medio = num2;   /// num1 >> num2 >> num3
			menor = num3;
			
		//	System.out.println("Sus números ordenados serían "+ mayor + ">" + medio + ">" + menor);
		}else if((num2 > num1) && (num2 > num3) && (num3 > num1)) {
			mayor = num2;
			medio = num3;   // num2 >> num3 >> num1
			menor = num1;
			//System.out.println("Sus números ordenados serían "+ mayor + ">" + medio + ">" + menor);
		}
		else if((num3 > num1) && (num3 > num2) && (num2 > num1)) {
			mayor = num3;
			medio = num2;   /// num3 >> num2 >> num1
			menor = num1;
			//System.out.println("Sus números ordenados serían "+ mayor + ">" + medio + ">" + menor);
		}else if((num3 > num1) && (num3 > num2) && (num1 > num2)) {
			mayor = num3;      // 10     6      3
			medio = num1;    // num3 >> num1 >> num2
			menor = num2;
			//System.out.println("Sus números ordenados serían "+ mayor + ">" + medio + ">" + menor);
		}else if((num1 > num3) && (num1 > num2) && (num3 > num2)) {
			mayor = num1;    //  10      5       1
			medio = num3;    // num1 >> num3 >> num2
			menor = num2;
			//System.out.println("Sus números ordenados serían "+ mayor + ">" + medio + ">" + menor);
		}else if((num2 > num1) && (num2 > num3) && (num1 > num3)) {
			mayor = num2;     //  5      2        1
			medio = num1;    // num2 >> num1 >> num3
			menor = num3;
			//System.out.println("Sus números ordenados serían "+ mayor + ">" + medio + ">" + menor);
		}else {
			System.out.println("otro");
		}
		
		System.out.println("Sus números ordenados serían "+ mayor + ">" + medio + ">" + menor);
	
	}
	
}
