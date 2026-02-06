package com.herencia.instrumento;

public class Campana  extends Instrumento{

	public void interpretar() {
		System.out.println("En campana");
		for (int i = 0; i <= super.numNotas; i++) {
			System.out.println(super.melodia[i]);
		}
		System.out.println("fin de campana");
	}
}
