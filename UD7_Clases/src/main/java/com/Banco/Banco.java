package com.Banco;

public class Banco {
	private String nombre;
	private int capital;
	private String direccion;
	private int capital_def;
	
	//Constructores
	public Banco (String Nombre) {
		this.nombre = Nombre;
		this.capital= 5200000;
	}
	
	public Banco(String Nombre, int Capital) {
		this.nombre = Nombre;
		this.capital = Capital;	
	}
	
	public Banco (String Nombre, int Capital, String Direccion) {
		this.nombre = Nombre;
		this.capital = Capital;
		this.direccion = Direccion;
		capital_def = 5200000;
	}
	
	public Banco (String Nombre, int Capital, String Direccion, int Capital_Def) {
		this.nombre = Nombre;
		this.capital = Capital;
		this.direccion = Direccion;
		this.capital_def = Capital_Def;
	}
	
	//Metodos
	public int QuitarCapital (int cantidad) {
		return capital - cantidad;
	}
	
	public int AnnadirCapital (int cantidad) {
		return capital + cantidad;
	}
	
	public void CambiarDireccion (String nuevaDir) {
		direccion = nuevaDir;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getCapital_Def () {
		return capital_def;
	}
	
	public int getCapital() {
		return capital;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
