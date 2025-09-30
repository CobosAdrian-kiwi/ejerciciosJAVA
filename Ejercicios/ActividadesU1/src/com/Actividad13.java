package com;
import java.util.Scanner;
/**
 * Actividad 13 📊
Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (enteras).
El programa debe mostrar la nota media del curso de dos formas:

📋 Como en el boletín de calificaciones (solo la parte entera).
📚 Como en el expediente académico (con decimales).
 */
public class Actividad13 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			// Notas trimestrales
			int pri, seg, ter;
			float notaFinal; 
			
			/**
			 * Leemos las notas
			 * */
			System.out.println("Introduzca la nota del primer trimestre");
			pri = sc.nextInt();
			
			System.out.println("Introduzca la nota del segundo trimestre");
			seg = sc.nextInt();
			
			System.out.println("Introduzca la nota del tercer trimestre");
			ter = sc.nextInt();
			
			
			notaFinal = (float) ((pri + seg + ter) / 3.0);
			
			// Mostramos las notas
			
			System.out.println("La nota del boletin: " +  (int) notaFinal);
			System.out.println("La nota del expediente académico: " +  notaFinal);
	}
	
}
