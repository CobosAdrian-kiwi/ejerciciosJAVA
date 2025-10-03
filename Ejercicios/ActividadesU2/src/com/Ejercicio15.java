package com;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//definimos la variable
		int diaSem;
		
		System.out.println("Introduce un número entre el 1 y el 7");
		diaSem = sc.nextInt();
		
		if (diaSem < 1 || diaSem > 7) {
			System.out.println("Ese número no está en el rango");
		}else {
			switch (diaSem) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Dia no válido");
			}
		}
	}

}
