package com;
import java.util.Scanner;

/*
 * Diseñar el juego acierta la contraseña. La mecánica del juego es la siguiente: el primer jugador introduce la contraseña; a continuación, el segundo jugador debe teclear
palabras hasta que la acierte. Realizar dos versiones; en la primera las únicas pistas
que se proporcionan son el número de caracteres y cuáles son el primer y el último
carácter de la contraseña. En la segunda versión se facilita el juego indicando si la
palabra introducida es mayor o menor, alfabéticamente, que la contraseña
 */


public class Ejercicio2 {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Contraseña
		String passw;
		System.out.println("TURNO DEL JUGADOR 1: INSERTA LA CONTRASEÑA"); //Se le pregunta al primer jugador
	    passw = sc.nextLine(); //Se rellena
		
		//Contraseña de usuario (se rellena despues)
		String usu;
		
		//Opción 1 / 2
		int opcion;
		boolean repetir_opciones = false;
		boolean salir_bucle = false;
		//Constante para el enunciado del ejercicio2
		final String enun_op2 = "Introduce una cadena y se comparará...";
		int result_op2;
		
		//Se hace un bucle que el jugador 2 pueda elegir que opcion quiere jugar, si no le da a nada vuelve a ejecutarse para que no se rompa el programa
		System.out.println("TURNO DEL JUGADOR 2: Que opción quieres jugar??\n"
				+ "(1): Se dice la longitud, 1era y ultima letra de la contraseña\n"
				+ "(2): Se dice si es mayor o menor alfabéticamente"
		);
		opcion = sc.nextInt();
		sc.nextLine();
		
		do {
			switch (opcion) {
				case 1:
					MostrarOpcion1(passw);
					break;
				case 2:
					System.out.println(enun_op2);
					break;
				default:
					System.err.println("Introduce 1 o 2");
					repetir_opciones = true;
					break;
			}
		}while(repetir_opciones == true);

		//Se hace otro bulce (el de juego) este termina cuando la contraseña del jugador2 es igual a la contraseña del jugador1
		do {
						
			System.out.println("Introduce la contraseña a comprobar"); //Se le pregunta al j2 y se rellena
			usu = sc.nextLine();
			
			if(!usu.equals(passw)) { //Se comprueba si es o no igual para decir si es incorrecta o no
				System.err.println("Contraseña Incorrecta");
			    if(opcion == 2 && !usu.equals(passw) ) { //Si se ha marcado la opcion 2 se comprueba si es mayor, menor o igual alfabeticamente
			    	String mensaje_comprobacion = ComprobarMayorAlfabeticamente(usu, passw);
			    	System.out.println(mensaje_comprobacion);
			    }
			}
		}while(!usu.equals(passw));
		
		System.out.println("EL JUGADOR 2 HA ACERTADO LA CONTRASEÑA"); //Si acierta gana el jugador 2
		}
	//FUNCIONES
	public static void MostrarOpcion1(String passw) {
		System.out.println("Longitud de la contraseña: "+ passw.length()+"\nPrimer dígito: "+ passw.charAt(0)+" | Último dígito: "+ passw.charAt(passw.length()-1));
	}	
	public static String ComprobarMayorAlfabeticamente(String usu, String passw) {
			int result_op2 = usu.compareToIgnoreCase(passw);
			if(result_op2 <= 0) {
				return "La contraseña introducida es menor alfabéticamente.";
			}else if(result_op2 == 0) {
				return "La contraseña es del mismo nivel";
			} else {
				return "La contraseña introducida es mayor alfabéticamente";
			}
		}
	}

	

