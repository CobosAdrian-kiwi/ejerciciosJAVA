package com.interfaces.act3;

public class Wifi implements Conectable{
	boolean conectado;
	
	public Wifi() {
		this.conectado = false;
	}

	@Override
	public void conectar() {
		if (!conectado) {
			conectado = true;
			System.out.println("Wifi conectado");
		}
	}

	@Override
	public void desconectar() {
		if (conectado) {
			conectado = false;
			System.out.println("Wifi desconectado");

		}
	}

	@Override
	public boolean estaConectado() {
		return conectado;
	}
}
