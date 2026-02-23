package com.interfaces.act2;

public class Enemigo implements Danable{
	private int vida;
	private String tipo;
	
	public Enemigo(int vida, String tipo) {
		this.vida = vida;
		this.tipo = tipo;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void KO() {
		System.out.println(tipo + ": KO");
	}
	
	@Override
	public void recibirDanio(int puntos) {
	if(vida != 0) {
			if (vida - puntos <= 0) {
				vida = 0;
				KO();
			}else {
				vida -= puntos;
			}
			System.out.println("-"+puntos+" == "+getVida());
		}

	}
}
