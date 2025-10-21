package com;
import java.util.Scanner;

/*
 * Escribir una función que decida si dos enteros positivos son amigos. 
 * Dos números son amigos si la suma de sus divisores propios (distintos de ellos mismos) 
 * es igual.
 */

public class Ejercicio10 {

	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, suma_divi1, suma_divi2; //Datos del usuario
		final String mensaje = "La suma de los divisores de ";
		
		//que el usuario de los datos
		System.out.println("Dime 2 numero para saber si son amigos o no");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//calculo la suma de los divisores de cada numero usando la funcion
		suma_divi1 = divisores(num1);
		System.out.println(mensaje + num1 + " es: " + suma_divi1);
		suma_divi2 = divisores(num2);
		System.out.println(mensaje + num2 + " es: " + suma_divi2);
		
		//si la suma de los divisores del num1 es igual al num2 y viceversa entonces son amigos
		if(suma_divi1 == num2 && suma_divi2 == num1) {
			System.out.println("Son amigos");
		}else {
			System.out.println("No son amigos");
		}
		
		sc.close();
	}
	
	//FUNCIONES---------------------
	//Funcion para saber todos los divisores de un numero
	public static int divisores(int x) {
		int acum_divisores = 0; //acumulador
		
		for(int iteracion = 1; iteracion < x; iteracion++) {
			
			//cada iteracion comprueba si dicha iteracion es divisor de x y si 
			//lo es lo añade al acumulador
			if (x % iteracion == 0) {
				acum_divisores += iteracion;
			}
		}
		return acum_divisores;
	}
}
