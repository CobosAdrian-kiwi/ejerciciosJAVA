package com;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//definimos los coeficientes
		double coefA, coefB, coefC, ResultadoX1, ResultadoX2, Delta, DeltaRaiz;
		
		//Pedimos los coeficientes
		System.out.println("Dime cuanto vale a, b y c");
		coefA = sc.nextDouble();
		coefB = sc.nextDouble();
		coefC = sc.nextDouble();
		//System.out.println(coefA +" , "+ coefB +" , "+ coefC);
		
		Delta = (coefB * coefB) - 4 * coefA * coefC;
		
		//System.out.println(DeltaRaiz);
		
		if (coefA == 0) {
			
			if (coefB != 0) {
				ResultadoX1 = -coefC / coefB;
				System.out.println("Esto es una ecuacion de primer grado... x = " + ResultadoX1);
			} else {
				if (coefC == 0) {
					System.out.println("La ecuación tiene infinitas soluciones (0=0).");
				} else {
					System.out.println("La ecuación no tiene solcucion (inconsistente)");
				}
			}
		
		} else {
			if (Delta > 0) {
			
			DeltaRaiz = Math.sqrt(Delta);
			
			//solucion1
			ResultadoX1 = ((-1 * coefB) + DeltaRaiz) / (2 * coefA);
			//solucion2
			ResultadoX2 = ((-1 * coefB) - DeltaRaiz) / (2* coefA);
			
			System.out.println("Dado los cocientes hay 2 resultados Reales: " + ResultadoX1 + " y "+ ResultadoX2);
					
			}else if (Delta == 0) {
			
			ResultadoX1 = (-1 * coefB) / (2 * coefA);
			
			System.out.println("Dado los cocientes hay 1 resultado Real: " + ResultadoX1);
			
		}else{
			
			System.out.println("Dado los cocientes hay 0 soluciones reales...");
			
		}
	}
		sc.close();
	}

}
