package com;

import java.util.Scanner;

/*
 * Repite el ejercicio anterior con una versión que 
 * calcule el máximo de 3 números.
 */

public class Ejercicio5 {
	
	private static int mayor;
	
	//MAIN
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//Declaramos las variables
			int num1, num2, num3;
			//Hacemos una constante que contenga el mensaje para usarlo en la salida
			final String mayor_mensaje = " es el mayor";
			
			//Le pedimos al usuario los numeros y los guardamos
			System.out.println("Introduce 3 números para saber el mayor");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
			
			//Guardamos el resultado de hacer la funcion maximo() con num1 y num2
			mayor = maximo(num1, num2, num3);
			//si num1 = mayor entonces es el mayor, si no si num2 = mayor y si no se lo comunicamos al usuario
			if (mayor == num1) {
				System.out.println(num1 + mayor_mensaje);
			}else if (mayor == num2) {
				System.out.println(num2 + mayor_mensaje);
			}else if(mayor == num3) {
				System.out.println(num3 + mayor_mensaje);
			}else if ((mayor != num1 || mayor != num2) && mayor == -999999999) {
				System.out.println("No hay un número que sea mayor");
			}
		}
		
		//FUNCIONES
		
		//FUNCION PARA CALCULAR EL MÁXIMO
		public static int maximo(int a, int b, int c) {
			if (a > b && a > c) {
				mayor = a;
				return mayor;
			}else if (b > a && b > c) {
				mayor = b;
				return mayor;
			}else if(c > a && c > b){
				mayor = c;
				return mayor;
			}else {
				mayor = -999999999;
				return mayor;
			}
		}
}
