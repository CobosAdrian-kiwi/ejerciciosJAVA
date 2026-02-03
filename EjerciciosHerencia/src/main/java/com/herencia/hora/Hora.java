package com.herencia.hora;

public class Hora {
	protected int hora;
	protected int minuto;
	
	public Hora (int hora, int minuto) throws IllegalArgumentException {
		if(hora > 23 || hora < 0) throw new IllegalArgumentException("La hora debe ser válida");
		if (minuto > 59 || minuto < 0)  throw new IllegalArgumentException("Los minutos deben ser válidos");
		
		this.hora = hora;
		this.minuto = minuto;
	}
	
	//Metodos
	public void inc() {
		if (minuto == 59) {
			if (hora == 23) {
				hora=0;
				minuto=0;
			}else {
				minuto = 0;
				hora++;
			}
		}else {
			minuto++;
		}
	}
	
	public void setMinutos (int mins) {
		minuto = mins;
	}
	
	public void setHora(int hrs) {
		hora = hrs;
	}
	
	public String toString() {
		return String.format("%02d:%02d", hora, minuto);
	}
}
