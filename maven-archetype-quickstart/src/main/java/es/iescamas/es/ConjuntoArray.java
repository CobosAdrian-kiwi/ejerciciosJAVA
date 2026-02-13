package es.iescamas.es;

public class ConjuntoArray extends ListaArray{
	
	public ConjuntoArray() {
		super();
	}
	
	public boolean contains(Integer n) {
		if (indexOf(n) == -1) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean add(Integer n) {
		if(contains(n)) {
			return  false;
		}else {
			addFinal(n);
			return true;
		}
	}
	
	public boolean removeValue(Integer n) {
		if (indexOf(n) == -1) {
			return false;
		}else {
			int index = indexOf(n);
			remove(index);
			return true;
		}
	}
	
}
