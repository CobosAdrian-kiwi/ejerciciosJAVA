package es.iescamas.ejemplos;

import java.io.Serializable;

public class Persona implements Serializable{
	String nombre;
	int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}	
	
	
}
