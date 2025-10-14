package com;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//definimos la variable del numero que el usuairo va a introducir
		int numUsu;
		boolean primo;
		
		//Le preguntamos al usuario por su número
		System.out.println("Dime el número a compronbar sus primos, desde 2 hasta...");
		numUsu = sc.nextInt();
		
		//i = los numeros hasta el original, le vamos aumentando 1 hasta que sea igual al original
		for(int i = 2; i <= numUsu; i++) {
			//declaramos que primo = true
			primo = true;
			
			//hacemos un bucle y dividimos i entre el divisor que va a ir
			//aumentando hasta llegar a la raiz de i porque no hay divisores
			//mayores que la raiz de un numero, si alguna division es correcta
			//declaramos que no es primo porque primos son solo los que se dividen
			//entre 1 y si mismos y hacemos un break para que no siga comprobando
			for(int div = 2; div <= Math.sqrt(i); div++) {
				if(i % div == 0) {
					primo = false;
					break;
				}
			}
			
			//sacamos por pantalla i + si es primo o no y repetimos el bucle
			if(primo) {
				System.out.println(i +" -> primo");
			}else {
				System.out.println(i + " -> no primo");
			}
		}
		
		sc.close();
	}
}
