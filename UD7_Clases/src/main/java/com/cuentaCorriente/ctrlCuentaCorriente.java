package com.cuentaCorriente;

public class ctrlCuentaCorriente {
	//private static String Banco = "BBVA";
	
	//Cambios en private (Ejercicio4)
	private int saldo;
	private int limit_descu;
	public String nombre;
	String DNI;
	protected com.Banco.Banco banco;
	
	//Constructores
	public ctrlCuentaCorriente (String Nombre, String DNI) {
		this.nombre = Nombre;
		this.DNI = DNI;
		saldo = 0;
		limit_descu = -50;
	}
	
	public ctrlCuentaCorriente (int SaldoInicial) {
		this.saldo = SaldoInicial;
		limit_descu = 0;
		nombre = null;
		DNI = null;
	}
	
	public ctrlCuentaCorriente (int SaldoInicial, int Limite, String Nombre, String DNI) {
		this.saldo = SaldoInicial;
		this.limit_descu = Limite;
		this.DNI = DNI;
		this.nombre = Nombre;
	}
	
	//Constructor con banco
	public ctrlCuentaCorriente (int SaldoInicial, int Limite, String Nombre, String DNI, com.Banco.Banco Banco) {
		this.saldo = SaldoInicial;
		this.limit_descu = Limite;
		this.DNI = DNI;
		this.nombre = Nombre;
		this.banco = Banco;
	}
	//Métodos
	public boolean SacarDinero (int cantidad) {
		boolean operacion_posible = false;
		
		if(cantidad <= saldo + Math.abs(limit_descu)) {
			operacion_posible = true;
			
			if (cantidad <= saldo) {
				saldo -= cantidad;
			} else if (cantidad > saldo) {
				limit_descu += (cantidad - saldo);
				saldo = 0;
			}
		}
		
		return operacion_posible;
	}
	
	public int IngresarDinero (int cantidad) {
		saldo += cantidad;
		return saldo;
	}
	
	public void MostrarInfo () {
		System.out.println("Titular: "+nombre+", DNI: "+DNI+"\nSaldo: "+ saldo+"\nLimite Descubierto: "+ limit_descu);
	}
	
	public int getLimite () {
		return limit_descu;
	}
	
	public int getSaldo () {
		return saldo;
	}
	public String getNombre () {
		return nombre;
	}
	public String getDni () {
		return DNI;
	}
	
	//Cambiar banco ej 6
	/*public void CambiarBanco (String NuevoNombre) {
		Banco = NuevoNombre;
	}
	
	public String getBanco() {
		return Banco;
	}*/
	
	//Gestion del banco ej 7
	public void setBanco (com.Banco.Banco Banco) {
		banco = Banco;
	}
	
	public com.Banco.Banco getBanco() {
		return banco;
	}
}
