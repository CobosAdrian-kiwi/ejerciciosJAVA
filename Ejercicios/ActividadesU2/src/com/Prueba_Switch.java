package com;

public class Prueba_Switch {
	public static void main(String[] args) {
		
		int dia =2 ;
		
		switch (dia) {
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
		case 6:
			System.out.println("Sábado");
		case 7:
			System.out.println("Domingo");
		default:
			System.out.println("No existe");
			break;
		}
	}

}
