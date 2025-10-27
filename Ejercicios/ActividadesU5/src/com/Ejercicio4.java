package com;

import java.util.Scanner;

/*
 * Implementar un programa que inicialice una tabla con tus números 
 * favoritos. Pedir al usuario el índice de un elemento que será eliminado. 
 * Continuar eliminando elementos hasta que el índice introducido sea 
 * negativo o no existan más elementos que borrar. 
 * Validar siempre que el índice es válido.
 */

public class Ejercicio4 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos la tabla
		int[] nums_fav = {6, 8, 16, 23, 64};
		
		//Definimos la variable del usuario
		int numUsu;
		
		//Definimos la variable de contar si se puede seguir borrando o no
		int contador;
		
		///Hacemos un bucle que se va ha ejecutar al menos 1 vez y hasta que
		///el numero introducido sea menor que 0, mayor a la longitud de la tabla
		///o ya no haya ningun número para borrar
		do {
			System.out.println("\nIntroduce el índice a borrar");
			numUsu = sc.nextInt();
			
			borradoIndices(nums_fav, numUsu);
			
			//Aqui se hace una impresion para ver los valores de la tabla tras
			//ejecutar la funcion de la línea 34
			System.out.println("Estado de tabla:");
			for(int i = 0; i < nums_fav.length; i++) {
				if (i < nums_fav.length -1) {
					System.out.print(nums_fav[i] + ", ");
				}else {
					System.out.print(nums_fav[i]);
				}
			}
			
			//Aquí se ejecuta cuantos 0 hay en la tabla tras hacer el cambio
			//se hace esto para comprobar si queda algo por borrar o no
			contador = Ejercicio3.contadorCeros(nums_fav);
			
		}while((numUsu >= 0 || numUsu < nums_fav.length ) && contador < nums_fav.length);
		
		
		sc.close();
	}
	
	//---------FUNCIONES---------
	//Funcion borrado: se guarda el contenido original que tenía ese índice
	// y se sustituye este por 0, también se le manda un mensaje al usuario para que 
	//sepa que ha cambiado por el que
	public static void borradoIndices(int[] tabla, int n) {
		int num_guardado = tabla[n];
		tabla[n] = 0;
		
		System.out.println("El índice "+ n+ " con contenido "+ num_guardado+ " ha sido borrado...");
		
	}
	
}
