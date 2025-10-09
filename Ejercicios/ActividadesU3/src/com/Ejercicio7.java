package com;

public class Ejercicio7 {
	public static void main(String[] args) {
		//Definir una variable para comprobar si el numero es divisible entre 2
		boolean bool_i;
		//acumulador de multiplicaciones
		int multi_i;
		
		//Enunciado
		System.out.println("Numeros impares menores al 10");
		
		//le ponemos de valor inicial 1 porque al multiplicar no afecta el resultado
		multi_i = 1;
		
		for (int i = 0; i <= 20; i++) {

			bool_i = (i % 2) != 0;

			if (bool_i == true) {
				System.out.println(i); //si no queremos que los impares salgan comentar este System.out.println()
				//multi_i *= i;
				multi_i = multi_i * i;
			}
		}
		//cada ciclo va a comprobar que el numeo sea impar y si lo es lo va a
		//multiplicar por el acumulador
		
		//Imprimimos el resultado
		System.out.println(multi_i);
	}
}
