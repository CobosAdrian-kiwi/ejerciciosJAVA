package es.iescamas.interfaz;

public interface Repositorio<T> {
	void add (T item);
	boolean remove (T item);
	T findById (String id);
	int size();
	
	
};

