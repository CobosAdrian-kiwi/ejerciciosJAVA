package com;

import java.util.Scanner;

/*
 * Un centro de investigación de la flora urbana necesita una aplicación 
 * que muestre cuál es el árbol más alto. Para ello se introducirá por 
 * teclado la altura (en centímetros) de cada árbol (terminando cuando 
 * se utilice –1 como altura). Los árboles se identifican mediante etiquetas 
 * con números únicos correlativos, comenzando en 0. Se pide diseñar una 
 * aplicación que resuelva el problema planteado.
 */

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//definimos variables int para las etiquetas: 0, 1, 2...
		//float para las alturas porque es en centímetros
		int etiqueta, etiqueta_mas_alto;
		float altura, altura_mas_alto;
		
		//instanciamos las variables para que no nos salte el error
		altura = 0;
		etiqueta = 0; //la etiqueta ponemos 0 poruqe es la primera (como nos indica el enunciado)
		etiqueta_mas_alto = 0;
		altura_mas_alto = 0;
		
		do {
			//le decimos al usuario que introduzca una altura del árbol 0
			System.out.println("Escribe la altura del árbol (cm) "+ etiqueta + "\n"
					+ "Escribe -1 para salir");
			//guardamos eso en altura
			altura = sc.nextInt();
			
			//si altura es mayor a la anterior guardamos su altura en altura mas alta y su etiqueta
			if(altura > altura_mas_alto) {
				altura_mas_alto = altura;
				etiqueta_mas_alto = etiqueta;
			}
			
			//hacemos que la etiqueta de la siguiente iteracion del bucle aumente
			etiqueta++;
			
		}while(altura != -1); //si la altura es -1 salimos del programa
		
		//le comunicamos al usuario que ya no tiene que introducir más números
		System.out.println("Saliendo...");
		//le comunicamos al usuario el árbol más alto de los que ha introducido
		System.out.println("El arból " + etiqueta_mas_alto + " es el mas alto con "+ altura_mas_alto + "cm" );
	}
}
