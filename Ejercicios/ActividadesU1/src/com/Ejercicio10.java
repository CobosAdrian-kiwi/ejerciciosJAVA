package com;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//defino las variables, str para las respuestas y las normales para definir booleanos
		String llueveStr, biblioStr, tareaStr;
		boolean lloviendo, biblioteca, tarea, puedeSalir;
		
		//pregunto si llueve
		System.out.println("¿Está lloviendo (si/no)?");
		llueveStr = sc.nextLine();
		//defino si es true o false en la otra variable
		lloviendo = llueveStr.equals("si");
		
		System.out.println("¿Tienes tarea (si/no)?");
		tareaStr = sc.nextLine();
		
		tarea = tareaStr.equals("si");
		
		System.out.println("¿Tienes que ir a la biblioteca (si/no)?");
		biblioStr = sc.nextLine();
		
		biblioteca = biblioStr.equals("si");
		
		//comprobacion para ver si puede salir es true o false
		puedeSalir = lloviendo == false && tarea == false || biblioteca == true;
		
		System.out.println("Puede salir? " + puedeSalir);
	}

}
