package es.iescamas.es;

public class ColaArray  extends ListaArray{
	
	public ColaArray() {
		super();
	}
	
	public void enqueue(Integer n) {
		Integer[] tablaTemp = new Integer[tabla.length+ 1];
		
		tablaTemp[0] = n;
		
		for (int i = 0; i < numElementos; i++) {
			tablaTemp[i+1] = tabla[i];	
		}
		
		numElementos++;
		
		tabla = tablaTemp;
	}
	
	public Integer dequeue() {
		if (tabla.length == 0) return null;
		
		Integer num = tabla[numElementos-1];
		
		Integer[] tablaTemp = new Integer[tabla.length-1];
		
		for (int i = 0; i < numElementos - 1;i++) {
			tablaTemp[i] = tabla[i];
		}
		
		tabla = tablaTemp;
		numElementos--;
		
		return num;
	}
	
	public Integer first() {
		if (numElementos == 0) {
			return null;
		}
		
		return tabla[numElementos - 1];
	}

	public boolean isEmpty() {
		if (tabla.length == 0) {
			return true;
		}else {
			return false;
		}
	}
}
