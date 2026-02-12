package es.iescamas.es;

public class ListaArray {
	protected Integer[] tabla;
	protected int numElementos;
	
	//Constructores
	public ListaArray() {
		tabla = new Integer[0];
		numElementos = 0;
	}
	
	//Metodos
	public int size() {
		return numElementos;
	}
	
	public void addFinal(Integer n) {
		Integer[] tablaTemp;
		if(tabla.length == numElementos) {
			tablaTemp = new Integer[tabla.length+1];
		}else {
			tablaTemp = new Integer[tabla.length];
		}
		
		for(int i = 0; i < numElementos; i++) {
			tablaTemp[i] = tabla[i];
		}
		
		tablaTemp[numElementos] = n;
		numElementos++;
		
		tabla = tablaTemp;
	}
	
	public Integer get(int i) {
		return tabla[i];
	}
	
	public Integer remove(int index) {
		Integer borrado = tabla[index];
		for (int i = index; i < numElementos - 1; i++) {
			tabla[i] = tabla[i+1];
		}
		numElementos--;
		Integer[] tablaTemp = new Integer[numElementos];
		
		for(int i = 0; i < numElementos; i++) {
			tablaTemp[i] = tabla[i];
		}
		
		tabla = tablaTemp;
		return borrado;
	}
	
	public int indexOf(Integer n) {
		for (int i = 0; i < numElementos; i++) {
			if (tabla[i] == n) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString() {
		String result = "| ";
		for (int i = 0; i < numElementos; i++) {
			result += String.valueOf(tabla[i]);
			result += " | ";
		}
		return result;
	}
	
	
}
