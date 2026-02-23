package com.interfaces.act3;

public class main {
	public static void main(String[] args) {
		Wifi w = new Wifi();
		Bluetooth b = new Bluetooth();
		Cable c = new Cable();
		
		Conectable[] conectables = {w,b,c};
		
		for (Conectable conectable : conectables) {
			conectable.conectar();
			System.out.println("Conectado: "+conectable.estaConectado());
			conectable.desconectar();
			System.out.println("Conectado: "+conectable.estaConectado());
		}
	}
}
