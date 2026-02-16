package com.herencia.geometriaYcalendario;

public class CalendarioExacto extends Calendario{
	private int hora;
	private int minuto;
	
	public CalendarioExacto(int anno, int mes, int dia, int hora, int minuto) {
		super(anno, mes, dia);
		
		if (hora > 23 || hora < 0) {
			throw new IllegalArgumentException("La hora tiene que estar en el formato correcto");
		}
		if (minuto > 59 || minuto < 0) {
			throw new IllegalArgumentException("Los minutos tienen que estar en el formato correcto");
		}
		
		this.hora = hora;
		this.minuto = minuto;
	}
	
	public void incrementarMinuto(int cantidad) {
		for (int i = 0 ; i < cantidad ; i++) {
			if(this.minuto == 59) {
				incrementarHora(1);
				minuto = 0;
			}else {
				minuto++;
			}
		}
	}
	
	public void incrementarHora(int cantidad) {
		for (int i = 0; i < cantidad ; i++) {
			if (this.hora == 23) {
				incrementarDia(1);
				hora = 0;
			}else {
				hora++;
			}
		}
	}
	
	public String toString() {
		return "Calendario: "+dia+"/"+mes+"/"+anno+" | "+String.format("%02d:%02d", hora, minuto);
	}
	
	@Override
	public void mostrar() {
		System.out.println("Calendario: "+dia+"/"+mes+"/"+anno+" | "+String.format("%02d:%02d", hora, minuto));
	}
	
	
	public boolean equals(CalendarioExacto otro) {
		if(this.minuto == otro.minuto) {
			
			if (this.hora == otro.hora) {
				
				if (this.dia == otro.dia) {
					
					if (this.mes == otro.mes) {
						
						if (this.anno == otro.anno) {
							
							return true;
							
						}else {
							return false;
						}
						
					}else {
						return false;
					}
					
				}else {
					return false;
				}
				
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}
}
