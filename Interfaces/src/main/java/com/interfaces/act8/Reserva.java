package com.interfaces.act8;

public class Reserva implements Validable, Mostrable{
	private String fecha;
	private int numPersonas;
	
	public Reserva(String fecha, int numPersonas) {
		this.fecha = fecha;
		this.numPersonas = numPersonas;
	}

	@Override
	public void validar() throws IllegalArgumentException {
		if (numPersonas == 0) throw new IllegalArgumentException("El numero de personas no puede ser 0");
	}

	@Override
	public String mostrar() {
		return "Fecha: "+fecha+" | Numero de Personas: "+numPersonas;
	}
	
	
}
