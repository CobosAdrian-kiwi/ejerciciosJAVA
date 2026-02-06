package com.herencia.hora;

public class HoraExacta extends Hora{

	private int sec;
	
	public HoraExacta(int hora, int minuto, int sec) {
		super(hora, minuto);
		
		if (sec > 59 || sec < 0) {
			throw new IllegalArgumentException("Fromato de segundos invalidos");
		}
		this.sec = sec;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hora, minuto, this.sec);
	}
	
	public boolean setSegundo(int valor) {
		if (valor > 59 || valor < 0) {
			throw new IllegalArgumentException("Formato de segundos invalidos");			
		}else {
			sec = valor;
			return true;
		}
	}
	
	@Override
	public void inc() {
		if (sec == 59) {
			sec = 0;
			super.inc();
		}else {
			sec++;
		}
	}
	
	public boolean CompararHora (HoraExacta hora2) {
		if (this.hora == hora2.hora) {
			
			if(this.minuto == hora2.minuto) {
				
				if (this.sec == hora2.sec) {
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
	}
	
}
