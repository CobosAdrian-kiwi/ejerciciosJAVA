package es.calculadora;

public class ControladorCalculadora {
	private int num1;
	private int num2;
	
	
	//Constructor
	public ControladorCalculadora (int numero1, int numero2) {
		this.num1 = numero1;
		this.num2 = numero2;
	}
	
	//Métodos
	public int Sumar () {
		int result = num1 + num2;
		return result;
	}
	
	public int Restar () {
		int result = num1 - num2;
		return result;
	}
	
	public int Multiplicar () {
		int result = num1 * num2;
		return result;
	}
	
	public double Dividir () throws Exception{
		try {
			double result = num1 / num2;
			return result;
		}catch (Exception e){
			throw new Exception ("No se puede dividir entre 0");
		}
	}
}
