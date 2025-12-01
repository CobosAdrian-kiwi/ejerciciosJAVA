package cuenta_corriente;

public class Ej4Main {
	public static void main(String[] args ) {
		//PRUEBA VISIBILIDAD
		
		CuentaCorriente cuenta1 = new CuentaCorriente(0);
		
		cuenta1.nombre = "Pepe";
		
		cuenta1.dni = "67676767A";
		
		//cuenta1.saldo = 20;
		
		//cuenta1.limitDescub = 0;
		
		cuenta1.MostrarInfo();
	}
}
