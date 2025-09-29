package com;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float KGmanzanas1, KGperas1, KGmanzanas2, KGperas2;
		double manzanasBeneficio, perasBeneficio, totalBeneficio;
		final double Precio_mananas = 2.35;
		final double Precio_peras = 1.95;
		//Pregunto los KG vendidos el 1er semestre
		System.out.println("Inserte los KG de manzanas vendidos el primer semestre:");
		KGmanzanas1 = sc.nextFloat();
		
		System.out.println("Inserte los KG de peras vendidos el primer semenstre:");
		KGperas1 = sc.nextFloat();
		
		//Pregunto los KG vendidos el 2do semestre
		System.out.println("Inserte los KG de manzanas vendidos el segundo semestre:");
		KGmanzanas2 = sc.nextFloat();
		
		System.out.println("Inserte los KG de peras vendidos el segundo semenstre:");
		KGperas2 = sc.nextFloat();
		
		//Calculo las ganancias de cada fruta en los 2 semestres
		manzanasBeneficio = (KGmanzanas1 * Precio_mananas) + (KGmanzanas2 * Precio_mananas);
		perasBeneficio = (KGperas1 * Precio_peras) + (KGperas2 * Precio_peras);
		
		//Sumo las ganancias de ambas frutas
		totalBeneficio = manzanasBeneficio + perasBeneficio;
		
		System.out.println("El total de ganancias ha sido: " + totalBeneficio + " €");

	}

}