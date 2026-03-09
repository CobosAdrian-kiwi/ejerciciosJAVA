package com.interfaces.act5;

public class Producto implements Descuentable{
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		this.precio = precio;
		this.nombre = nombre;
	}

	@Override
	public double precioBase() {
		return precio;
	}
	
	
}
