package com;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir variables
		int dia, mes, anno;
		final String fechaValid = "La fecha es válida";
		final String fechaNoValid = "La fecha no es válida";
		
		
		//Preguntar al usuario
		System.out.println("Dime el dia, mes y año a comprobar");
		dia = sc.nextInt();
		mes = sc.nextInt();
		anno = sc.nextInt();
		
		//comprobamos si el año es menor que 0
		if (anno < 0) {
			System.out.println(fechaNoValid);
		} else {
			// si no comprobamos que el mes es alguno de los que tiene 31 dias
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				
				//si es uno de los meses que tiene 31 dias comprobamos que dias esté entre 1 y 31
				if (dia <= 31 && dia > 0) {
					System.out.println(fechaValid);
				}else {
					System.out.println(fechaNoValid);
				}
				
			//comprobamos que los meses sean los que tienen 30 dias
			}else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				
				//si dia está entre 1 y 30 es valida
				if (dia <= 30 && dia > 0) {
					System.out.println(fechaValid);
				}else {
					System.out.println(fechaNoValid);
				}
			
			//comprobamos que el mes sea febrero
			}else if (mes == 2) {
				
				//si el dia está entre 1 y 28 es valida
				if(dia <=28 && dia >0) {
					System.out.println(fechaValid);
				}else {
					System.out.println(fechaNoValid);
				}
			}else {
				//si no el mes no es válido
				System.out.println(fechaNoValid);
			}
		}
	}

}
