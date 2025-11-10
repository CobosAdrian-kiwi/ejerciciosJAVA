package com;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Escribir la función rellenaPares() a la que se le pasa una 
 * tabla que debe rellenarse leyendo por teclado números hasta 
 * que esté llena, guardando solo los pares e ignorando los impares. 
 * La función devolverá la cantidad de impares desechados.
 */
public class Ejercicio15 {
	//MAIN
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//Crear tabla
			int[] tabla = new int[0];
			int[] tablaMod;
			//Definir variables
			int numActual; //Numero actual
			
			//hacemos un bucle que vaya preguntando numeros hasta que
			///se introduzca -1 y vaya ejecutando la funcion
			do {
				System.out.println("Dime el numero a introducir");
				numActual = sc.nextInt();
				
				if(numActual != -1) {
					tablaMod = rellenaPares(tabla, numActual);
					
					//Se hace que la tabla original sea la tablaMod
					//si la funcion ha devuelto una tabla más grande
					///la tabla original ahora será esa más grande
					///si no devolverá la normal pero no cambiará nada
					tabla = tablaMod;
					
					//para probar si se va añadiendo bien
					//System.out.println(Arrays.toString(tabla));
				}
				
			}while(numActual != -1);
			
			//Imprimimos la tabla
			System.out.println("Tabla Final:"+Arrays.toString(tabla));
			
		}
		//FUNCIONES
		public static int[] rellenaPares(int[] tabla, int num) {
			//Hacemos una tabla con 1 más de longitud
			int[] tablaMod = Arrays.copyOf(tabla, tabla.length + 1);
			
			//Si el num (numActual) tiene resto 0 al dividirse entre 2
			/// se mete en el último hueco de tablamod (la que tiene 1 más de longitud)
			if(num % 2 == 0) {
				tablaMod[tablaMod.length - 1] = num;
				return tablaMod;
			}else {
				///si no devuelve la tabla original
				return tabla;
			}
		}
}
