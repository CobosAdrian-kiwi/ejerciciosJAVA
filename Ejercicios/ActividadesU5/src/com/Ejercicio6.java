package com;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Diseñar una aplicación que lea las puntuaciones (enteros) de 5 
 * programadores y las muestre ordenadas. Después pueden añadirse 
 * hasta 3 programadores de exhibición; su puntuación se introduce 
 * igual, usando -1 para indicar que no hay más. Mostrar finalmente 
 * todos los puntos ordenados.
 */

public class Ejercicio6 {
	//Para que Scanner lo usen funciones
	public static Scanner sc = new Scanner(System.in);
	
	//MAIN
	public static void main(String[] args) {
		
		//Crear tabla y definir la variable del numero del usuario
		int[] puntuaciones = new int[5];
		int[] puntuaciones_nueva = {0};
		int punt_actual;
		int extras_restantes = 3;
		
		//Rellenamos la tabla (no uso Ejercicio2.rellenarTabla() porque pone numeros y no puntuaciones)
		
		rellenarPuntuaciones(puntuaciones);
		
		//Ordenamos la tabla y la mostramos
		Arrays.sort(puntuaciones);
		
		for (int s = 0; s < puntuaciones.length; s++) {
			System.out.print(puntuaciones[s] + " | ");
		}
		
		///Hago un bucle que pregunte por la puntuación extra a añadir
		///el bucle se hace hasta que le escriba -1 o ya se haya
		///agotado los 3 extras
		do {
			System.out.println("\nDime una puntuación si quieres añadir \n(Restantes:"+extras_restantes +") | (-1 para salir)");
			punt_actual = sc.nextInt();
			
			if(punt_actual != -1 && extras_restantes > 0) {
				//Se ejecuta la funcion si se ha puesto algun numero que 
				//no sea -1 y queden extras
				puntuaciones_nueva = meterNums(puntuaciones, punt_actual);
				extras_restantes -= 1;
				
				//Tras hacer la funcion cambio el array por el array
				//de la funcion
				puntuaciones = puntuaciones_nueva;
				
				Arrays.sort(puntuaciones); //Se ordena
			}
			
			//Se muestra a no ser que sea el ultimo para que despues
			//fuera del bucle tambien salga la tabla ordenada
			if (extras_restantes > 0) {
				for (int i = 0; i < puntuaciones.length; i++) {
					System.out.print(puntuaciones[i] + " | ");
				}
			}
			
		}while(punt_actual != -1 && extras_restantes > 0);
		
		//Se le dice al usuario al final la tabla
		System.out.println("////TABLA ORDENADA FINAL:////");
		for (int j = 0; j < puntuaciones.length; j++) {
			System.out.print(puntuaciones[j] + " | ");
		}
	}
	
	//---------FUNCIONES---------
	//Funcion para rellenar la tabla de puntuaciones
	public static void rellenarPuntuaciones(int[] tabla) {
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce la puntuación del "+ (i+1)+"º programador");
			tabla[i] = sc.nextInt();
		}
	}
	
	//Funcion para hacer un extra
	public static int[] meterNums(int[] tabla, int n) {
		//se hace una nueva tabla con uno más de longitud
		int[] tabla_mod = Arrays.copyOf(tabla, tabla.length+1);
		
		//se cambia el utlimo numero por el introducido en la funcion (n)
		tabla_mod[tabla_mod.length -1] = n;
		
		return tabla_mod; //se devuelve la tablas
	}
}
