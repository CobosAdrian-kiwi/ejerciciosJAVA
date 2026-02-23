package com.interfaces.act3;

public class Bluetooth implements Conectable{
	private boolean conectado;
	
	public Bluetooth(){
		this.conectado = false;
	}
	
	@Override
	public void conectar() {
		if (!conectado) {
			conectado = true;
			System.out.println("Bluetooth conectado");
		}
	}

	@Override
	public void desconectar() {
		if (conectado) {
			conectado = false;
			System.out.println("Bluetooth desconectado");

		}
	}

	@Override
	public boolean estaConectado() {
		return conectado;
	}
}
