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
		
		//Crear las otras tablas
		int[] tabla_pares;
		int[] tabla_impares;
		//Variable numero del usuario
		int numUsu  = 0, pares;
		
		//Rellenar la tabla hasta que se diga -1
		do {
			System.out.println("Dime el numero a añadir (-1 para cancelar)");
			numUsu = sc.nextInt();
			
			if(numUsu != -1) {
				tabla_og = rellenarTablaIndefinido(tabla_og, numUsu);
			}
			
		}while(numUsu != -1);
		
		//Mostrar por pantalla la tabla rellena
		System.out.println(Arrays.toString(tabla_og));
		
		//Guardar el número de pares e imprimirlos por pantalla
		pares = cuentaPares(tabla_og);
		System.out.println(pares);
		
		//Darle longitud a las tablas pares e impares
		tabla_pares = new int[pares];
		tabla_impares = new int[tabla_og.length - pares];
		
		//DEBUG: mostrar las tablas vacias para comprobar las longitudes: comentar si se ha terminado
		System.out.println("Pares.length: "+Arrays.toString(tabla_pares));
		System.out.println("Impares.length: "+Arrays.toString(tabla_impares));
		
		//Declaramos índices para ir metiendo impares y pares
		int i1 = 0, i2 = 0, i3 = 0;
		
		///Hacemos un bucle que mientras i1 (el que va a recorer la tabla_og) sea menor que 
		///la longitud de la tabla_og compruebe cada índice dividiendolo entre 2 y viendo su
		///resto, para saber si es par o impar, si es par, se copia el valor de la tabla_og del 
		///índice actual al índice de la tabla par y lo mismo si es impar con la tabla_impar
		///al final siempre incrementa i1.
		while(i1 < tabla_og.length) {
			if (tabla_og[i1] % 2 == 0) {
				tabla_pares[i2] = tabla_og[i1];
				i2++;
			} else {
				tabla_impares[i3] = tabla_og[i1];
				i3++;
			}
			i1++;
		}
		
		//Se imprime el resultado
		System.out.println("Tabla con los pares: "+Arrays.toString(tabla_pares));
		System.out.println("Tabla con los impares: "+Arrays.toString(tabla_impares));
		
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
