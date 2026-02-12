package es.iescamas.es;

public class PilaArray extends ListaArray{
	
	public PilaArray() {
		super();
	}
	
	public void push(Integer n) {
		addFinal(n);
	}
	
	public Integer pop() {
		if (numElementos == 0) {
			return null;
		}
		
		Integer ultimo = this.tabla[this.numElementos - 1];
		
		Integer[] tablaTemp = new Integer[numElementos - 1];
		
		for (int i = 0; i < numElementos - 1; i++) {
			tablaTemp[i] = tabla[i];
		}
		
		numElementos--;
		
		tabla = tablaTemp;
		
		return ultimo;
	}
	
	public Integer peek() {
		if (numElementos == 0) {
			return null;
		}
		
		return tabla[numElementos - 1];
	}
	
	public boolean isEmpty() {
		if (numElementos == 0) {
			return true;
		}else {
			return false;
		}
	}
}
