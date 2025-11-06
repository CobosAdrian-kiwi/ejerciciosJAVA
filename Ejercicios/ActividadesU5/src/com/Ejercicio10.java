package com;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Leer y almacenar n números enteros en una tabla. Construir 
 * otras dos tablas con los elementos pares e impares de la primera, 
 * respectivamente.
 */

public class Ejercicio10 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Crear la tabla
		int[] tabla_og = new int[0];
		//Variable numero del usuario
		int numUsu  = 0;
		
		//Rellenar la tabla hasta que se diga -1
		do {
			System.out.println("Dime el numero a añadir (-1 para cancelar)");
			numUsu = sc.nextInt();
			
			if(numUsu != -1) {
				tabla_og = rellenarTablaIndefinido(tabla_og, numUsu);
			}
			
		}while(numUsu != -1);
		
		System.out.println(Arrays.toString(tabla_og));
		
		
		sc.close();
	}
	//FUNCIONES
	//Funcion para rellenar la tabla
	public static int[] rellenarTablaIndefinido(int[] t, int num) {
		int[] tabla_mod = Arrays.copyOf(t, t.length+1);
		tabla_mod[tabla_mod.length -1] = num;
		return tabla_mod;
	}
	
	//Funcion para contar los pares
	public static int cuentaPares(int[] t) {
		int acum = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] % 2 == 0) {
				acum++;
			}
		}
		return acum;
	}
}
