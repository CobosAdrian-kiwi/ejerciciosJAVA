package texto;

public class Texto {
	//Atributos
	private StringBuilder cuerpo;
	private int longitud;
	private int numVocales;
	
	//Constructores
	public Texto( int longitud) {
		cuerpo = new StringBuilder();
		this.longitud = longitud;
		numVocales = 0; 
	}
	
	//Métodos
	public void IngresarCuerpo(String Cuerpo) {
		if (Cuerpo.length() > longitud) {
			System.out.println("El cuerpo introducido es demasiado largo");
		}else {
			this.cuerpo = this.cuerpo.append(Cuerpo);
		}
	}
	
	public int ContarVocales() {
		int acum = 0;
		
		for (int i = 0; i < cuerpo.length();i++) { 
			if(cuerpo.charAt(i) == 'a' ||cuerpo.charAt(i) == 'e' ||cuerpo.charAt(i) == 'i' ||cuerpo.charAt(i) == 'o' ||
					cuerpo.charAt(i) == 'u' ||cuerpo.charAt(i) == 'A' ||cuerpo.charAt(i) == 'E' ||cuerpo.charAt(i) == 'I' ||
					cuerpo.charAt(i) == 'O' ||cuerpo.charAt(i) == 'U' ||cuerpo.charAt(i) == 'á' ||cuerpo.charAt(i) == 'é' ||
					cuerpo.charAt(i) == 'í' ||cuerpo.charAt(i) == 'ó' ||cuerpo.charAt(i) == 'ú' ||cuerpo.charAt(i) == 'Á' ||
					cuerpo.charAt(i) == 'É' ||cuerpo.charAt(i) == 'Í' ||cuerpo.charAt(i) == 'Ó' ||cuerpo.charAt(i) == 'Ú') { //Si el valor actual es un espacio en blanco le añadimos 1 al acumulador
				acum++;
			}
		}
		
		numVocales = acum;
		
		return numVocales;
	}
}
