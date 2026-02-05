package com.herencia.hora;

public class Hora12 extends Hora {
	protected periodo periodo; //am o pm
	
	//Constructor
	
	public Hora12(int hora, int minuto, periodo periodo) {
		super(hora > 12 ? hora -12 : hora,minuto);
		this.periodo = periodo;
		
	}
	
	//metodos
	@Override
	public String toString() {
		return String.format("%02d:%02d "+periodo, hora, minuto);
	}
	
	@Override
	public void inc() {
		if (super.minuto >= 59) {
			super.minuto = 0;
			if(super.hora >= 12) {
				if(periodo == periodo.AM) {
					periodo = periodo.PM;
				}else {
					periodo = periodo.AM;
				}
				
				super.hora = 0;
			}else {
				super.hora++;
			}
		}else {
			super.minuto++;
		}
	}
	
	@Override
	public void setHora(int valor) {
		if (valor > 23 || valor <=  0) super.hora = 0;
		if (valor > 12) {
			
			if (periodo == periodo.AM) {
				periodo = periodo.PM;
			}else {
				periodo = periodo.AM;
			}
			
			super.hora = valor -12;
			
		}else {
			super.hora = valor;
			
		}
	}
}
