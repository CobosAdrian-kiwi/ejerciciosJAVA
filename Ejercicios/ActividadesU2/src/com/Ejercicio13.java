package com;
import java.util.Scanner;

class Ejercicio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Definimos las variables para las horas, los minutos y los segundos
		int horas, mins, secs;
		final String secannadido = "+1 sec ";
		
		//le contamos al usuario de que va el programita
		System.out.println("INSERTE UN TIEMPO 00:00:00 Y TE DOY 1 SEGUNDO MAS TARDE");
		
		//Preguntamos al usuario la hora
		System.out.println("Dime la hora de 00 a 23");
		horas = scanner.nextInt();
		
		//Preguntamos al usuario los minutos
		System.out.println("Dime los minutos de 00 a 59");
		mins = scanner.nextInt();
		
		//Preguntamos al usuario los segundos
		System.out.println("Dime los segundos de 00 a 59");
		secs = scanner.nextInt();
		
		//le sumamos 1 segundo
		if (secs == 59) {
			secs = 00;
			mins++;
			//comprobamos que los minutos sean 60 para añadir 1 hora
			if(mins == 60) {
				mins = 0;
				horas++;
				//si la hora es 24 tras haber sumado entonces la ponemos en 0 
				if(horas == 24) {
					horas = 0;
				}
			}
		}else {
			secs++;
		}

		//comprobamos que el formato es válido
		if (horas < 0 || horas > 23 || mins <0 || mins > 59 || secs <0 || secs > 59) {
			System.out.println("El formato dado no es válido");
		}else {
			//horas09, mins09, secs09
			if (horas >=0 && horas <=9 && mins >=0 && mins <=9 && secs >=0 && secs <=9) {
				System.out.println(secannadido+" [0"+horas+":0"+mins+":0"+secs+"]");
			//horas09, mins09, secs>9	
			}else if (horas >=0 && horas <=9 && mins >=0 && mins <=9 && secs >9) {
				System.out.println(secannadido+" [0"+horas+":0"+mins+":"+secs+"]");
			//horas09, mins>9, secs09	
			}else if (horas >=0 && horas <=9 && mins >9 && secs >=0 && secs <=9) {
				System.out.println(secannadido+" [0"+horas+":"+mins+":0"+secs+"]");
			//horas09, mins>9, secs>9	
			}else if (horas >=0 && horas <=9 && mins >9 && secs >9) {
				System.out.println(secannadido+" [0"+horas+":"+mins+":"+secs+"]");
			//horas>9, mins09, secs09	
			}else if (horas >9 && mins >=0 && mins <=9 && secs >=0 && secs <=9) {
				System.out.println(secannadido+" ["+horas+":0"+mins+":0"+secs+"]");
			//horas>9, mins09, secs>9	
			}else if (horas >9 && mins >=0 && mins <=9 && secs >9) {
				System.out.println(secannadido+" ["+horas+":0"+mins+":"+secs+"]");
			//horas >9, mins>9, secs09	
			}else if (horas >9 && mins >9 && secs >=0 && secs <=9) {
				System.out.println(secannadido+" ["+horas+":"+mins+":0"+secs+"]");
			//horas >9, mins>9, secs>9	
			}else if (horas >9 && mins >9 && secs >9) {
				System.out.println(secannadido+" ["+horas+":"+mins+":"+secs+"]");
			}
			
		}

	}

}
