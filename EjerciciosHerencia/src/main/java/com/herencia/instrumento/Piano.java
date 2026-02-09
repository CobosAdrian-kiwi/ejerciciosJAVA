package com.herencia.instrumento;

public class Piano extends Instrumento{
	
	public Piano() {
		
	}
	
	public void interpretar() {
		System.out.println("Esto es el piano");
		for (int i = 0; i <= super.numNotas-1; i++) {
			System.out.println(super.melodia[i]);
		}
		System.out.println("Fin del piano");
	}
}
