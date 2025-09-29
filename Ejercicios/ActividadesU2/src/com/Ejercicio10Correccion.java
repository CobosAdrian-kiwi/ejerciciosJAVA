package com;
import java.util.Scanner;

public class Ejercicio10Correccion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//definimos las variables
		int numUsu, uds, decenas, centenas, miles;
		final String capicua = "El numero es capicua";
		final String nocapicua = "El numero no es capicua";
		
		//pedir al usuario el número
		System.out.println("Dime el número a comprobar");
		numUsu = sc.nextInt();
		
		//Comparar si esta entre 0 y 9999
		if (numUsu >= 0 && numUsu <= 9999) {
			
			//Si es menor que 10 solo tiene 1 caracter (no es capicua)
			if (numUsu <10) {
				
				System.out.println(nocapicua);
			
			//Comprobamos si es menor que 100
			}else if(numUsu <100){
				
				//Calculamos cuanto valen las unidades y las decenas
				uds = numUsu % 10;
				decenas = numUsu / 10;
				
				//Si las unidades y las decenas son iguales Ej(11) es capicua
				if (uds == decenas) {
					System.out.println("Es capicua");
				}else {
					System.out.println("No es capicúa");
				}
				
			//Comprobamos si vale menos que 1000 (100-999)
			}else if (numUsu <1000) {
				
				//Calculamos cuanto valen las unidades y las centenas
				uds = numUsu % 10;
				centenas = numUsu / 100;
				
				//Si las uds y las centenas son iguales Ej(101) es capicua
				if (uds == centenas) {
					System.out.println(capicua);
				}else {
					System.out.println(nocapicua);
				}
			
			//Comprobamos si el numero es de miles
			}else if (numUsu <10000) {
				
				//Calculamos las unidades, las decenas, las centenas y los millares
				uds = numUsu % 10;
				decenas = (numUsu /10) % 10;
				centenas = (numUsu / 100) % 10;
				miles = numUsu / 1000;
				
				/*
				 * Si las uds son iguales a los millares y las decenas son iguales
				*a las centenas Ej(1221) es capicua
				*/
				if(uds == miles && decenas == centenas) {
					System.out.println(capicua);
				} else {
					System.out.println(nocapicua);
				}
			}
			
		} else {
			//Comunicar al usuario que los datos introducidos no estan en el rango
			System.out.println("Ese número no está en el rango seleccionado");
		}
	}

}
