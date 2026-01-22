package com.bombilla;

public class Bombilla {
	private boolean estado;
	private static boolean estado_global = true;
	
	//Constructores
	
	public Bombilla() {
		this.estado = false;
	}
	
	//Métodos
	
	//Metodo devuelve el estado
	public boolean Estado() {
		if (!estado_global) {
			return false;
		}else {
			return estado;
		}
	}
	
	public boolean EstadoFusibleGlobal() {
		return estado_global;
	}
	
	//Metodo cambia el estado del objeto
	public void Interruptor() {
		if (estado) {
			estado = false;
		}else {
			estado = true;
		}
	}
	
	//Incorporar interruptor global
	public void INTERRUPTOR_GLOBAL() {
		if (estado_global) {
			estado_global = false;
		}else {
			estado_global = true;
		}
	}
	
	
}
