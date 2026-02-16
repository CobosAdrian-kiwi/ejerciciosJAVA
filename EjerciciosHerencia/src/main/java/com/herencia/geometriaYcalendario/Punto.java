package com.herencia.geometriaYcalendario;

public class Punto {
	protected double x;
	protected double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void desplaza (double dx) {
		x += dx;
	}
	
	public void desplaza (double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public double distanciaEuclidea (Punto otro) {
		double result;
		
		//Formula para la distancia euclidea
		result = Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
		
		return result;
	}
	
	public void muestra() {
		System.out.println("X = "+ this.x+" | Y = "+this.y);
	}
	
	public double getX() {
	    return x;
	}

	public double getY() {
	    return y;
	}
}
