package com.interfaces.act6;

public class Producto implements Valorable, Comparable<Producto>, Mostrable {
	private String codigo;
	private String nombre;
	private double precio;
	
	public Producto(String cod, String nombre, double precio) {
		this.codigo = cod;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public double getPrecio() {
		return precio;
	}
	
	public String getCodigo() {
		return codigo;
	}

	@Override
	public String getNombre() {
		return nombre;
	}
	
	//Comparable
	@Override
	public int compareTo(Producto otro) {
		
		if (this.nombre.compareTo(otro.nombre) == 0) {
			
			if(this.precio > otro.precio) {
				return 1;
			}else if (this.precio < otro.precio) {
				return -1;
			}else {
				return 0;
			}
			
		}else if (this.nombre.compareTo(otro.nombre) > 0){
			return 1;
		}else {
			return -1;
		}
	}
	
	
	
	public static void ordenarPorPreciosAscYNombre (Valorable[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length -1; j++) {
				if (arr[j].getPrecio() > arr[j+1].getPrecio()) {
					Valorable aux = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = aux;
				} else if(arr[j].getPrecio() == arr[j+1].getPrecio()) {
					if (arr[j].getNombre().compareTo(arr[j+1].getNombre()) > 0) {
						Valorable aux = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = aux;
					}
				}
				
			}
		}
	}
	
	public static void ordenarPorNombreAZ (Valorable[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length -1; j++) {
					if (arr[j].getNombre().compareTo(arr[j+1].getNombre()) > 0) {
						Valorable aux = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = aux;
					}
				}
				
			}
		}
	
	
	public static void ordenarPorPrecioDesc (Valorable[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length -1; j++) {
				if (arr[j].getPrecio() > arr[j+1].getPrecio()) {
					Valorable aux = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = aux;
				}				
			}
		}
	}
	
	@Override
	public String toString() {
		return "Cod: "+ codigo + " | Nombre: "+ nombre+ " | Precio: "+precio;
	}
	
	@Override
	public String mostrar() {
		return "Cod: "+ codigo + " | Nombre: "+ nombre+ " | Precio: "+precio;
	}
}
