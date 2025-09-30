package com;
import java.util.Scanner;
public class Actividad10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean lluvia, tarea, biblioteca, salir;
		
		System.out.println("Todas las respuestas tienen que ser respondida con true/false");
	// Preguntar si esta lloviendo
	   System.out.println("¿Está lloviendo?");
	   lluvia = sc.nextBoolean();
	
	// Preguntar si ha terminado la tarea
	   System.out.println("¿Has terminado la tarea?");
	   tarea = sc.nextBoolean();
	   
	// Preguntar si va a la biblioteca
	   System.out.println("¿Vas a la Biblioteca?");
	   biblioteca = sc.nextBoolean();
	// Respuesta
	   salir = (!lluvia && tarea) || (biblioteca);
	   System.out.println("¿Podrá salir? " + salir);
	   
	   
	}
}
