package com;
import java.util.Scanner;

/*
 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan 
 * sus frases con “Javalín, javalón”, para después hacer una pausa más o menos larga 
 * (la pausa se representa mediante espacios en blanco o tabuladores) y a continuación expresan el mensaje. 
 * Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con 
 * un silencio, más o menos prolongado y la coletilla “javalén, len, len”. Se pide diseñar un traductor que, 
 * en primer lugar, nos diga si la frase introducida está escrita en el idioma de Javalandia (en cualquiera de 
 * sus dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
 */

public class Ejercicio9 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//muletillas:
		String muletilla_ciudad = "Javalín, javalón";
		String muletilla_pueblo = "javalén, len, len";
		
		//Existencia de las muletillas en la frase
		boolean existe_muletilla_ciudad;  
		boolean existe_muletilla_pueblo;
		
		//Frase a traducir
		String frase;
		String frase_final;
		
		//Pedir la frase
		System.out.println("Introduce la frase a traducir:");
		frase = sc.nextLine();
		
		//Comprobar si existe
		existe_muletilla_ciudad = EstaEnJavalandesCiudad(frase, muletilla_ciudad);
		existe_muletilla_pueblo= EstaEnJavalandesPueblo(frase, muletilla_pueblo);
		
		//Eliminar las muletilla
		frase_final = frase; //hacemos una frase final que nos permita tenerla para el resultado
		
		if (existe_muletilla_ciudad == true) { //Se comprueba si la muletilla existe en la frase
			System.out.println("La frase está en javalandés de ciudad (muletilla inicial)");
			frase_final = frase.substring(muletilla_ciudad.length()).trim(); //si es así frase final será frase menos la muletilla y con un trim()
			System.out.println(frase_final);
			
		}else if (existe_muletilla_pueblo == true) {  //lo mismo pero con la muletilla final
			System.out.println("La frase está en javalandés de pueblo (muletilla final)");
			frase_final = frase.substring(0, frase.lastIndexOf(muletilla_pueblo)).trim();
			System.out.println(frase_final);
			
		}else {//Si ninguna condición se cumple la frase no está en javalandés
			System.out.println("La frase no está en javalandés");
		}
		
	}
	//FUNCIONES
	//Funciones para comprobar si esta en javalandés
	public static boolean EstaEnJavalandesCiudad(String frase, String muletilla_ini) {
		boolean esta = false;
		boolean existe_muletilla_ini;
		
		//Se comprueban si existen o no, si empieza por la muletilla
		existe_muletilla_ini = frase.startsWith(muletilla_ini);
		
		if(existe_muletilla_ini) {
			esta = true;
		}
		
		return esta;
	}
	public static boolean EstaEnJavalandesPueblo(String frase, String muletilla_fin) {
		boolean esta = false;
		boolean existe_muletilla_fin;
		
		//Se comprueban si existen o no, si termina por la muletilla
		existe_muletilla_fin = frase.endsWith(muletilla_fin);
		
		if(existe_muletilla_fin) {
			esta = true;
		}
		
		return esta;
	}
}
