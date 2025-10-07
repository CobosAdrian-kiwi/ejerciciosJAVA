package com;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numUsu;
		boolean par, positiv;
		float cuadrado;
		
		do {
			System.out.println("Dime un número");
			numUsu = sc.nextInt();
			
			par = (numUsu % 2) == 1;
			positiv = numUsu > 0;
			cuadrado = numUsu * numUsu;
			
			if(par = true) {
				System.out.println("El número es par");
			}else {
				System.out.println("El número es impar");
				
			}
			
			if(positiv = true) {
				System.out.println("El número es positivo");
			}else {
				System.out.println("El número es negativo");
			}
			
			System.out.println("Cuadrado: "+ cuadrado);
			
		}while (numUsu != 0);
		
		System.out.println("Parando....");

	}

}
