package com;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota, numAprob, numSusp, numCondic;
		
		numAprob = 0;
		numSusp = 0;
		numCondic = 0;
		
		for (int iteraciones = 0; iteraciones < 6; iteraciones++) {
			System.out.println("Dime la nota numero "+ (iteraciones +1));
			nota = sc.nextInt();
			
			if (nota > 4) {
				numAprob++;
			}else if (nota == 4) {
				numCondic++;
			}else if(nota < 4) {
				numSusp++;
			}else {
				System.err.println("El numero no es válido");
			}
		}
	}
}
