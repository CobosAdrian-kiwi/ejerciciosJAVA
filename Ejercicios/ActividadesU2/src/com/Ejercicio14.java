package com;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables
		int dia,mes,anno;
		
		//Pedimos al usuario que introduzca los dias, meses y años
		System.out.println("Introduce el año");
		anno = sc.nextInt();
		
		System.out.println("Introduce el mes");
		mes = sc.nextInt();
		
		System.out.println("Introduce el dia");
		dia = sc.nextInt();
		
		//Comprobamos que las fechas introducidas son permitidas
		if (anno < 0 || mes <1 || mes >12 || dia < 1 || dia > 31) {
			System.out.println("La fecha introducida no está permitida");
			
		}else if (mes == 2 && dia > 28) {
			System.out.println("Febrero no tiene más de 28 dias");
		}else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)&& dia > 30) {
			System.out.println("El mes introducido no tiene más de 30 dias");
		}else {
			
			if (dia == 28 && mes == 2) {
				dia = 1;
				if (mes == 12) {
					mes = 1;
					anno++;
				}else {
					mes++;
				}
			}else if (dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
				dia = 1;
				if (mes == 12) {
					mes = 1;
					anno++;
				}else {
					mes++;
				}
			}else if (dia == 31 && (mes == 1 || mes == 3 || mes == 5 | mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
				dia = 1;
				if (mes == 12) {
					mes = 1;
					anno++;
				}else {
					mes++;
				}
			}else {
				dia++;
			}
			
			System.out.println("El siguiente dia a la fecha introducida es:");
			System.out.println(dia+"/"+mes+"/"+anno);
			
		}
		
		
	}

}
