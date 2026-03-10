package com.interfaces.act10;

public class Becario extends Persona implements Trabajador, Estudiante, Mostrable{
	
	public Becario(String nombre) {
		super(nombre);
	}
	
	
	@Override
	public String mostrar() {
		return nombre;
	}

	@Override
	public void estudiar() {
		System.out.println(nombre+" Está estudiando");
		
	}

	@Override
	public void trabajar() {
		System.out.println(nombre+" Está trabajando");
		
	}
	
}
