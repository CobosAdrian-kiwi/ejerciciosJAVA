package com;
import java.util.Scanner;

public class Actividad10 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//Defino las variables
		int numero, unidad, decena, centena, millar;
		
		/**
		 *###############################################
		 *#                LITERALES                    #
		 *############################################### 
		 **/
		final String CAPICUA = "capicúa";
		final String NO_CAPICUA = "No es capicúa";
		
		System.out.println("Introduce un número 2-4 cifras");
		numero = sc.nextInt();
		
		if(numero < 10) {
			//X
			System.out.println(NO_CAPICUA);
		}else if(numero < 100) {
			//XY XX
			unidad = numero % 10;
			decena = numero / 10;
			
			if(unidad == decena) {
				System.out.println(CAPICUA);
			}else {
				System.out.println(NO_CAPICUA);
			}
			
		}else if( numero < 1000) {
			// XYX YXX desde 100 hasta 999
			unidad = numero % 10;
			centena = numero / 100;
			
			if(unidad == centena) {
				System.out.println(CAPICUA);
			}else {
				System.out.println(NO_CAPICUA);
			}
			
		}else if(numero < 10000){
			// desde 1000 hasta 9999    XYYX
			unidad = numero % 10;
			decena = (numero/10)%10;
			centena = (numero / 100)%10;
			millar = (numero / 1000 ) ;
			
			if(unidad == millar && decena == centena) {
				System.out.println(CAPICUA);
			}else {
				System.out.println(NO_CAPICUA);
			}
			
		}else {
			//Caso fuera de rango del dominio de la aplicación
			System.out.println("Número demasiado grande para este ejemplo");
		}

	}

}
