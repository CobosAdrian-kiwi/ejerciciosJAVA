package com.interfaces.act2;

public class main {

	public static void main(String[] args) {
		
		Jugador j = new Jugador(10, "Jugador");
		Enemigo e = new Enemigo(1, "volador");
		
		Danable[] danables = {j,e};
		
		for (Danable danable: danables) {
			danable.recibirDanio(1);
			danable.recibirDanio(20);
		}

	}

}
