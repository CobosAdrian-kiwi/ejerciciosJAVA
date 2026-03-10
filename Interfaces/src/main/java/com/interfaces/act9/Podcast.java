package com.interfaces.act9;

public class Podcast implements Reproducible, Mostrable{

	private String nombre;
	private String autor;
	private int duracion;
	private String tema;
	private Estado estado;

	public Podcast(String nombre, String autor, int duracion, String tema) {
		this.nombre = nombre;
		this.autor = autor;
		this.duracion = duracion;
		this.tema = tema;
		this.estado = Estado.Stopped;
	}

	@Override
	public String mostrar() {
		return nombre+" | Autor: "+autor+" | "+tema +" | "+duracion+" ("+estado+")";
	}

	@Override
	public void play() {
		estado=Estado.Playing;
	}

	@Override
	public void pause() {
		estado=Estado.Paused;
	}

	@Override
	public void stop() {
		estado=Estado.Stopped;
	}
	
}
