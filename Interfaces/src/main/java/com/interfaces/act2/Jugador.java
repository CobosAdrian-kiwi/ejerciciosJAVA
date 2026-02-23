package com.interfaces.act2;

public class Jugador implements Danable{
	private int vida;
	private String nombre;
	
	public Jugador(int vida, String nombre) {
		this.vida = vida;
		this.nombre = nombre;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void KO() {
		System.out.println(nombre + ": KO");
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
