package es.tabla;

public class ArrayApp {
	
	
	//Constructor
	public ArrayApp() {
		
	}

	public int[] invertirArray(int[] original) {
		int[] invertido = new int[original.length];
		
		int i = 0;
		int j = original.length -1;
		
		while (i < invertido.length) {
			invertido[i] = original[j];
			
			i++;
			j--;
		}
		
		return invertido;
	}

	public double mediaPositivos(int[] t) {
		int acum = 0;
		int contador = 0;
		double result = 0;
		
		for (int i = 0; i < t.length; i++) {
			if (t[i] > 0) {
				acum += t[i];
				contador++;
			}
		}
		
		if(contador > 0) {
			result = acum / contador;
		}
		
		return result;
	}

	public double mediaNegativos(int[] t) {
		int acum = 0;
		int contador = 0;
		double result = 0;
		
		for (int i = 0; i < t.length; i++) {
			if (t[i] < 0) {
				acum += t[i];
				contador++;
			}
		}
		
		if(contador > 0) {
			result = acum / contador;
			return result;
		}
		
		if(contador > 0) {
			result = acum / contador;
		}
		
		return result;		
	}

	public int cuentaCeros(int[] t) {
		int contador = 0;
		
		for (int i = 0; i < t.length; i++) {
			if (t[i] == 0) {
				contador++;
			}
		}
		
		return contador;
	}

	public int[] borrarElemento(int[] t, int i) {
		if (i < 0 || i >= t.length) {
			throw new IllegalArgumentException("posicion invalida");
		}else {
			int[] cambiado = new int[t.length -1];
			int contador = 0;
			
			for (int j = 0; j < t.length; j++) {
				if (j != i) {
					cambiado[contador] = t[j];
					contador++;
				}
			}
			return cambiado;
		}
	}

	public int[] sinRepetidos(int[] t) {
		int[] norepe = new int[t.length];
		boolean hayrepe = false;
		int contador = 0;
		
		for (int n = 0; n < t.length; n++) {
			hayrepe = false;
			 for (int pos = 0; pos < norepe.length; pos++) {
				 if (t[n] == norepe[pos]) {
					 hayrepe = true;
					 break;
				 }
			 }
			 
			 if (!hayrepe) {
				 norepe[contador] = t[n];
				 contador++;
			 }
		}
		
		int[] norepedefinitivo = new int[contador];
		
		for (int i = 0; i < norepedefinitivo.length; i++) {
			norepedefinitivo[i] = norepe[i];
		}
		return norepedefinitivo;
	}

	public int[] fusionOrdenada(int[] a, int[] b) {
		int i1 = 0;
		int i2 = 0;
		int i = 0;
		
		int[] result = new int[a.length + b.length];
		
		while (i1 < a.length && i2 < b.length) {
	        if (a[i1] <= b[i2]) {
	            result[i] = a[i1];
	            i1++;
	        } else {
	            result[i] = b[i2];
	            i2++;
	        }
	        i++;
	    }
		
		 while (i1 < a.length) {
		        result[i] = a[i1];
		        i1++;
		        i++;
		    }
		 
		 while (i2 < b.length) {
			 result[i] = b[i2];
			 i2++;
			 i++;
		 }
		
		return result;
	}

	public int[][] separarParesImpares(int[] t) {
		int[] pares = new int[t.length];
		int[] impares = new int[t.length];
		
		int contador_par = 0;
		int contador_impar = 0;
		
		for (int i = 0; i < t.length; i++) {
			if ((t[i] % 2) == 0) {
				pares[contador_par] = t[i];
				contador_par++;
			}else if ((t[i] % 2) != 0) {
				impares[contador_impar] = t[i];
				contador_impar++;
			}
		}
		
		int[] pares_def = new int[contador_par];
		int[] impares_def = new int[contador_impar];
		
		for (int j = 0; j < pares_def.length; j++) {
			pares_def[j] = pares[j];
		}
		for (int j = 0; j < impares_def.length; j++) {
			impares_def[j] = impares[j];
		}
		
		int[][] res = new int[2][];
	    res[0] = pares_def;
	    res[1] = impares_def;

	    return res;
	}
}
