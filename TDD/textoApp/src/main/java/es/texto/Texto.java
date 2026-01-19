package es.texto;
/**
 * Notas rápidas para que el alumnado haga TDD “bien”

Empieza implementando constructores + getters + longitud().

Luego anadirFinal(char) y anadirInicio(char).

Después anadirFinal(String) y anadirInicio(String) con regla “todo o nada” (si no cabe, no modifica).

Finalmente contarVocales().
 */
public class Texto {
	//Atributos
	private int capacidad;
	private String contenido;
	
	//Constructores
	public Texto(int i) {
		if (i <=0)
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		this.capacidad = i;
		this.contenido = "";
	}


	public Texto(String string, int i) {
		if (string == null)
			throw new IllegalArgumentException("contenidoInicial no puede ser null");
		
		if (i <=0)
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		
		if (string != null && string.length() > i)
			throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
		
		this.capacidad = i;	
		this.contenido = string;
			
	}

	//Métodos

	public String getContenido() {
		return contenido;
	}


	public int longitud() {
		return contenido.length();
	}


	public boolean anadirFinal(char c) {
		if (contenido.length() + 1 <= capacidad) {
			contenido = contenido.concat(String.valueOf(c));
			return true;
		}else {
			return false;
		}
	}


	public boolean anadirInicio(char c) {
		if(contenido.length() + 1 <= capacidad) {
			contenido = String.valueOf(c) + contenido;
			return true;
		}else {
			return false;
		}
	}


	public boolean anadirFinal(String string) {
		if (string == null)
			throw new IllegalArgumentException("cadena no puede ser null");
		
		if (contenido.length() + string.length() <= capacidad) {
			contenido = contenido + string;
			return true;
		}else {
			return false;
		}
	}


	public boolean anadirInicio(String string) {
		if (string == null)
			throw new IllegalArgumentException("cadena no puede ser null");
		
		if (contenido.length() + string.length() <= capacidad) {
			contenido = string + contenido;
			return true;
		}else {
			return false;
		}
	}


	public int contarVocales() {
		char[] vocales = {'a','e','i','o','u','á','é','í','ó','ú'};
		int acum = 0;
		
		for(int i = 0; i<contenido.length(); i++) {
			char caracter = contenido.charAt(i);
			for (char vocal : vocales) {
				if (Character.toLowerCase(caracter) == vocal) {
					acum++;
				}
			}
		}
		return acum;
	}

	public String toString() {
		return contenido;
	}
}
