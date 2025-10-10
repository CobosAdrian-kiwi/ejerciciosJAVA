package com;

/*
 * Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
 */

public class Ejercicio11 {
	public static void main(String[]args){
		//Definimos una variable para el resultado de cada multiplicacion
		int result;
		
		//Hacemos un bucle que sea el numero de tabla y al terminar se le sume 1 hasta 10
		for (int num = 1; num <=10; num++) {
			//le ponemos un enunciado al usuario para separar las tablas entre si
			System.out.println("////TABLA DEL "+num+"////");
			//calculamos cada tabla multiplicando un coeficiente por el numero de tabla
			for (int coef = 1; coef <= 10; coef++) {
				result = num * coef;
				
				//se lo comunicamos al usuario
				System.out.println("" + num + " * " + coef + " = " + result);
			}
		}

	}
}
