package cuenta_corriente;

public class Ej3Main {
	public static void main(String[]args) {
		CuentaCorriente cuenta1 = new CuentaCorriente("Pepito", "11111111A");
		
		CuentaCorriente cuenta2 = new CuentaCorriente(100);
		
		CuentaCorriente cuenta3 = new CuentaCorriente("22222222B", 68, -2);
		
		System.out.println(
		"getDni: "+cuenta1.getDni() +"\ngetNombre: "+	cuenta1.getNombre()
		+"\ngetSaldo "+cuenta1.getSaldo()
		+"\ngetLimitDescub: "+cuenta1.getLimitDescub()
		);
		
		System.out.println();
		
		cuenta2.MostrarInfo();
		
		cuenta2.IngresarDinero(50);
		
		System.out.println("##Saldo cuenta2: "+cuenta2.getSaldo());
		cuenta2.setNombre("Adrian");
		cuenta2.setDni("33333333C");
		
		cuenta2.MostrarInfo();
		
		System.out.println();
		
		cuenta3.SacarDinero(0.3);
		
		System.out.println(cuenta3.getSaldo());
		
		cuenta3.setLimitDescub(67);
		cuenta3.setSaldo(76);
		
		cuenta3.MostrarInfo();
		
		
	}
}
