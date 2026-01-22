package com.fm;

public class SintoniDigiFM {
	private double frecuencia;
	private final double MAX_FRECUENCIA = 108.0;
	private  final double MIN_FRECUENCIA = 80.0;
	
	//Constructores
	public SintoniDigiFM() {
		this.frecuencia = 80.0;
	}
	
	//Métodos
	public void FrecuenUP() {
		if (frecuencia < MAX_FRECUENCIA) {
			frecuencia += 0.5;
		}else if(frecuencia == MAX_FRECUENCIA) {
			frecuencia = MIN_FRECUENCIA;
		}
	}
	
	public void FrecuenDOWN() {
		if (frecuencia > MIN_FRECUENCIA) {
			frecuencia -= 0.5;
		}else if (frecuencia == MIN_FRECUENCIA) {
			frecuencia = MAX_FRECUENCIA;
		}
	}
	
	public void Display() {
		System.out.println("Frecuencia actual: "+ frecuencia + " MHz");
	}
	
	public double getFrecuencia() {
		return frecuencia;
	}
}
