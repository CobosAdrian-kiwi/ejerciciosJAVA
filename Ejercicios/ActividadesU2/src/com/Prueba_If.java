package com;

public class Prueba_If {
	
	public static void main(String [] args) {
		
		int nota = 100;
		
		if (nota >= 90) {

			System.out.println("Sobresaliente");
			
		}else if(nota >=70) {
			
			System.out.println("Notable");
			
		}else if(nota >= 50) {
			
			System.out.println("Aprobado");
		}else {
			
			System.out.println("Suspenso");
		}
		
	}
}
