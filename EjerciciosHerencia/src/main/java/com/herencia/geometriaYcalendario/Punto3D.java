package com.herencia.geometriaYcalendario;

public class Punto3D extends Punto{
	private double z;
	
	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public void desplaza (double dx, double dy, double dz) {
		this.x += dx;
		this.y += dy;
		this.z += dz;
	}
	
	
	public double distanciaEuclidea (Punto3D otro) {
		double result;
		
		//Formula para la distancia euclidea
		result = Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2) + Math.pow(this.z - otro.z, 2));
		
		return result;
	}
	
	@Override
	public double distanciaEuclidea (Punto otro) {
		double result;
		Punto3D otro2 = new Punto3D(otro.x, otro.y, 0);
		
		//Formula para la distancia euclidea
		result = Math.sqrt(Math.pow(this.x - otro2.x, 2) + Math.pow(this.y - otro2.y, 2) + Math.pow(this.z - otro2.z, 2));
		
		return result;
	}
	
	@Override
	public void muestra() {
		System.out.println("X = "+ this.x+" | Y = "+this.y+" | Z = "+this.z);
	}
}
