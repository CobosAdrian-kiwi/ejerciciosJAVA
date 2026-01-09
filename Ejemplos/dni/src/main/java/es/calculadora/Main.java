package es.calculadora;

public class Main {
	public static void main(String[] args) throws Exception {
		ControladorCalculadora calc = new ControladorCalculadora(10, 1);
		
		double test = calc.Dividir();
		System.out.println(test);
	}
}
