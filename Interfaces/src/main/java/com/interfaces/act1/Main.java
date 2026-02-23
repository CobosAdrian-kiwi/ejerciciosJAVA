package com.interfaces.act1;

public class Main {
	public static void main(String[] args) {
		Factura f = new Factura(0, "María", 2);
		Informe i = new Informe("Titulo", "Autor", 15);
		
		Imprimible[] imprimibles = {f,i};
		for (Imprimible imprimible : imprimibles) {
			System.out.println(imprimible.Imprimir());
		}
	}
}
