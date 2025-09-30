package com;
import java.util.Scanner;
/**
 * 📅 Escribir una aplicación que pida el año 
 *    actual y el de nacimiento del usuario.
 *    Debe calcular su edad, suponiendo que en el año 
 *    en curso el usuario ya ha cumplido años.
 */
public class Actividad4 {

	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca su año de nacimiento: ");
		//El año de nacimiento del usuario
		int anno = scanner.nextInt(); 
		System.out.println("Introduzca el año actual: ");
		int annoActual = scanner.nextInt();
		//calcular la edad
		int edadUsuario = annoActual - anno; 
		//mostrar la edad
		System.out.println("Usted tiene " + edadUsuario + " años");
		
	}
}
