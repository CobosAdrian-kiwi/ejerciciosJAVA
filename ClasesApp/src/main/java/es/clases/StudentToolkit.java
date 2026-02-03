package es.clases;

import java.util.function.BooleanSupplier;

public class StudentToolkit {

	private int contador;
	
	//Constructores
	
	public StudentToolkit () {
		this.contador = 0;
	}
	
	//Metodos
	public int getContador() {
		return contador;
	}

	public void incrementar() {
		contador++;
	}

	public void decrementar() {
		contador--;
	}

	public void reset() {
		contador = 0;
	}

	public boolean esCero() {
		if (contador == 0) {
			return true;
		}else {
			return false;
		}
	}

	public boolean esPositivo() {
		if (contador > 0) {
			return true;
		}else {
			return false;
		}
	}

	public void addSiPositivo(int num) {
		if (num > 0) {
			contador += num;
		}
	}

	public void incrementarNVeces(int num) {
		for (int j = 0; j < num; j++) {
			contador++;
		}
	}

	public Integer sumaHasta(int num) {
		if (num <= 0) {
			return 0;
		}else {
			int result = num;
			for (int in = num-1; in > 0; in--) {
				result += in;
			}
			return result;
		}
	}

	public boolean esPar(int num) {
		if ((num % 2) == 0) {
			return true;
		}else {
			return false;
		}
	}

	public double media(int[] array) {
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Si el array es null debe lanzar IllegalArgumentException");
		}else {
		
		int acumulador = 0;
		int contador = 0;
		double result = 0;
		
		for (int i = 0; i < array.length; i++) {
			acumulador += array[i];
			contador++;
		}
		
		result = acumulador / contador;
		return result;
		}
	}

	public int maximo(int[] array) {
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Si el array es null debe lanzar IllegalArgumentException");
		}else {
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length;i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
		}
	}

	public int[] invertirArray(int[] original) {
		int[] invertido = new int[original.length];
		int contador = 0;
		
		for (int i = original.length - 1; i >= 0; i--) {
			invertido[contador] = original[i];
			contador++;
		}
		
		return invertido;
	}
	
	
	
}


