package com.herencia.instrumento;

public abstract class Instrumento {
	private int MAX = 100;
	protected Nota[] melodia = new Nota[MAX];
	protected int numNotas = 0;
	
	//Constructor
//	public Intrumento() {
//		this.melodia = new Nota[MAX];
//		this.numNotas = 0;
//	}
	
	//Metodos
	public boolean add (Nota nota) {
		if (numNotas+1 == MAX) {
			return false;
		}else {
			melodia[numNotas] = nota;
			numNotas++;
			return true;
		}
	}
	
	public abstract void interpretar();
}
