package com;
import java.util.Scanner;

/*
 * JUEGO DE 3 En RAYA
 */

public class TresEnRaya {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Creamos 2 tablas
		int[][] tablero_logico = {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
		char[][] tablero_estetico = new char[3][3];
		//Se crea una tabla para ver los controles
		char[][] controles = {
				{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'}
		};
		
		//Se crea la variable de la opción del menú
		int opcion = 0;
		
		boolean turnoActual = true; //true (x), false(o)
		
		//Creamos la variable del nº del turno actual
		int acumTurno = 0;
		
		//Creamos la tabla con las coordenadas a jugar
		int pos;
		int[] coordenadas = new int[2];
		
		//Bucle del juego
		do {
			System.out.println("Elige la opcion que hacer:\n"
					+ "(1)Jugar\n"
					+ "(2)Ver Tablero\n"
					+ "(3)Ver Controles\n"
					+ "(4)Salir");
			opcion = sc.nextInt();
			
			//JUEGO-----------------------------------------------------
			switch (opcion) {
			case 1:
				System.out.println("Posición a rellenar: (1-9(si no es uno de esos valores se considerará 1))");
				pos = sc.nextInt();
				break;
			case 2:
				tablero_estetico = ActualizarTableroEst(tablero_logico);
				MostrarTableroChar(tablero_estetico);
				break;
			case 3:
				//Mensaje
				System.out.println("Cuando al jugar te pregunte por una celda, introduce estas instrucciones.");
				MostrarTableroChar(controles);
				break;
			case 4:
				break;
			default:
				break;
			}
			
			
		}while(opcion != 4);
		System.out.println("Saliendo...");
	}
	//FUNCIONES
	//Funcion para mostrar los controles almacenados en una tabla
	//se añade un mensaje aparte
	public static void MostrarTableroChar(char[][] matriz) {
		//Bucle para mostrar la tabla con los controles
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y< matriz[x].length; y++) {
			    System.out.print (matriz[x][y]);
			    if (y!=matriz[x].length-1) System.out.print("\t");
			  }
			  System.out.println();
			}
	}
	
	//Mostrar el tablero lógico de int[][] (principalmente para pruebas)
	public static void MostrarTablero(int[][] matriz) {
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y< matriz[x].length; y++) {
			    System.out.print (matriz[x][y]);
			    if (y!=matriz[x].length-1) System.out.print("\t");
			  }
			  System.out.println();
			}
	}
	
	//Calcular la posición 
	public static int[] RellenarPos(int pos) {
		int[] coordenadas = new int[2];
		
		switch (pos) {
		case 1:
			coordenadas[0] = 0;
			coordenadas[1] = 0;
			break;
		case 2:
			coordenadas[0] = 1;
			coordenadas[1] = 0;
			break;
		case 3:
			coordenadas[0] = 2;
			coordenadas[1] = 0;
			break;
		case 4:
			coordenadas[0] = 0;
			coordenadas[1] = 1;
			break;
		case 5:
			coordenadas[0] = 1;
			coordenadas[1] = 1;
			break;
		case 6:
			coordenadas[0] = 2;
			coordenadas[1] = 1;
			break;
		case 7:
			coordenadas[0] = 0;
			coordenadas[1] = 2;
			break;
		case 8:
			coordenadas[0] = 2;
			coordenadas[1] = 1;
			break;
		case 9:
			coordenadas[0] = 2;
			coordenadas[1] = 2;
			break;	
		default:
			coordenadas[0] = 0;
			coordenadas[1] = 0;
			break;	
		}
		
		return coordenadas;
	}
	
	public static void HayGanador() {
		
	}
	
	public static void TableroLleno() {
		
	}
	
 public static char[][] ActualizarTableroEst(int[][] tLogic){
	 char[][] tEstet = new char[3][3];
	 
	 for(int i = 0; i < tLogic.length; i++) {
		 for(int j = 0; j < tLogic[0].length; j++) {
			 if(tLogic[i][j] == 0) {
				 tEstet[i][j] = '-';
			 } else if(tLogic[i][j] == 1) {
				 tEstet[i][j] = 'x';
			 }else if (tLogic[i][j] == 2) {
				 tEstet[i][j] = 'o';
			 }
		 }
	 }
	 return tEstet;
 }
}
