package com.interfaces.act9;

public class Cancion implements Reproducible, Mostrable{

	private String nombre;
	private String autor;
	private int duracion;
	private Estado estado;

	public Cancion(String nombre, String autor, int duracion) {
		this.nombre = nombre;
		this.autor = autor;
		this.duracion = duracion;
		this.estado = Estado.Stopped;
	}
	
	@Override
	public String mostrar() {
		return nombre+" | Autor: "+autor+ " | "+duracion+" ("+estado+")";
	}

	@Override
	public void play() {
		estado = Estado.Playing;
	}

	@Override
	public void pause() {
		estado = Estado.Paused;
	}

	@Override
	public void stop() {
		estado = Estado.Stopped;
	}
	
}
