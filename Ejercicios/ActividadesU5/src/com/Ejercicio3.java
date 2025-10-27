package com;

import java.util.Scanner;

public class Ejercicio3 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables
		int arraySize;
		
		System.out.println("De que tamaño va a se la tabla?");
		arraySize = sc.nextInt();
		
		//Hacemos la tabla
		int[] tabla;
		tabla = new int[arraySize];
		
		Ejercicio2.rellenarTabla(tabla);
		
		double media_positivos = mediaTabla(tabla, 1);
		System.out.println("Media de los números positivos introducidos: "+media_positivos);
		double media_negativos = mediaTabla(tabla, 2);
		System.out.println("Media de los números negativos introducidos: "+media_negativos);
		
		int contador_ceros = contadorCeros(tabla);
		System.out.println("Cantidad de 0 introducidos: "+ contador_ceros);
		
		
	}
	
	//FUNCIONES---------------
	//Funcion para hacer la media de los numeros de una tabla
	//signo = (1)Positivos / (2)Negativos
	public static double mediaTabla(int[] tabla, int signo) {
		double media = 0;
		int acumulador = 0;
		int contador = 0;
		
		for(int i = 0; i < tabla.length; i++) {
			
			///Por cada iteracion que esté vamos a comparar su equivalente
			///en la tabla y depende del signo introducido, 1 para positivos
			///y 2 para negativos asi en el //MAIN ejecutamos esta función
			///2 veces una para los positivos y otra para los negativos
			if(signo == 1 && tabla[i] > 0) {
					acumulador += tabla[i];
					contador++;
			}else if (signo == 2 && tabla[i] < 0) {
					acumulador += tabla[i];
					contador++;
			}
			
		}
		
		//Aquí hacemos la media
		media = acumulador / contador;
		
		return media;
	}
	
	//FUNCION para contar los 0
	public static int contadorCeros(int[] tabla) {
		int contador0 = 0;
		
		//Recorremos la tabla y si el numero de iteraciones actual
		//es igual a 0 le añadimos 1 al contador y después devolvemos el contacor 
		for(int i = 0; i < tabla.length; i++) {
			if (tabla[i] == 0) {
				contador0++;
			}
		}
		return contador0;
	}
}
