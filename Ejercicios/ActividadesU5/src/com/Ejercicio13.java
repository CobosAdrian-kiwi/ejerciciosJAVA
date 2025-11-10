package com;
import java.util.Scanner;

/*
 * Sobrecargar la función maximo() para que calcule el máximo de una tabla de enteros.
 */

public class Ejercicio13 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creamos la tabla
		int[] tabla = {1,15,4,2,8,6 ,9};
		int maximo; //Variable del maximo
		
		//ejecutamos la funcion maximoTabla con la tabla tabla
		maximo = maximoTabla(tabla);
		//Mostramos el máximo por pantalla
		
		System.out.println("El máximo es: "+maximo);
	}
	//FUNCION que calcula el maximo de una tabla
	public static int maximoTabla(int[] t) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < t.length;i++) {
			if(t[i] > max) {
				max = t[i];
			}
		}
		return max;
	}
}
