package es.iescamas.ejemplos;

import java.io.Serializable;

public class Alumno implements Serializable{
	int id;
	String nombre;
	double nota;
	
	public Alumno(int id, String nombre, double nota) {
		this.id = id;
		this.nombre = nombre;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	
}
