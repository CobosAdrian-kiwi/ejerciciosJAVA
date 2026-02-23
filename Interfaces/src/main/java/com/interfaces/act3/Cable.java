package com.interfaces.act3;

public class Cable implements Conectable{
	private boolean conectado;
	
	public Cable() {
		this.conectado = false;
	}
	
	@Override
	public void conectar() {
		if (!conectado) {
			conectado = true;
			System.out.println("Cable conectado");
		}
	}

	@Override
	public void desconectar() {
		if (conectado) {
			conectado = false;
			System.out.println("Cable desconectado");
		}
	}

	@Override
	public boolean estaConectado() {
		return conectado;
	}
}
