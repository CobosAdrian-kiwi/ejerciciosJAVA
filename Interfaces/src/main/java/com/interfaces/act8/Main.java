package com.interfaces.act8;

public class Main {

	public static void main(String[] args) {
		Validable[] validables = new Validable[5];
		
		Validable v1 = new Usuario("kiwi@gmail.com", "12345678");
		Validable v2 = new Usuario("kiwiNoArroba", "12345678");
		Validable v3 = new Usuario("kiwi2@gmail.com", "123456");
		Validable v4 = new Reserva("mañana", 10);
		Validable v5 = new Reserva("pasado", 0);
		
		validables[0] = v1;
		validables[1] = v2;
		validables[2] = v3;
		validables[3] = v4;
		validables[4] = v5;
		
		for (Validable validable : validables) {
			try {
				validable.validar();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
