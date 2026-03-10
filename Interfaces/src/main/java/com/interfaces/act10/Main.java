package com.interfaces.act10;

public class Main {
	public static void main(String[] args) {
		Becario bec = new Becario("Adri");
		
		Mostrable m = bec;
		System.out.println(m.mostrar());
		
		Estudiante e = bec;
		e.estudiar();
		
		Trabajador t = bec;
		t.trabajar();
	}
}
