package cuenta_corriente;
import java.util.Scanner;

public class Ej2Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		CuentaCorriente cuenta2 = new CuentaCorriente(100);
		
		cuenta2.MostrarInfo();
		
		CuentaCorriente cuenta2b = new CuentaCorriente("22222222F", 100, 50);
		
		cuenta2b.MostrarInfo();
	}
}
