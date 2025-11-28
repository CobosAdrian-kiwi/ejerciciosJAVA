package com;

public class CuentaCorriente {

	//ATRIBUTOS
	private int Saldo;
	private int LimitDescub;
	private String Nombre;
	private String DNI;
	
	//Constructor
	public  CuentaCorriente(String Nombre, String DNI) {
		this.Nombre = Nombre;
		this.DNI = DNI;
		Saldo = 0;
		LimitDescub = -50;
	}
	
	//MÉTODOS
	//Metodo para sacar dinero
	public void SacarDinero(int Cantidad) {
		
		//Se comprueba el saldo y si es mayor a la cantidad se resta del saldo
		if (Saldo >= Cantidad) {
			Saldo -= Cantidad;
			System.out.println("Se ha realizado la operación con éxito");
			//Si el saldo es 0 y cantidad es menor o igual al limite se le resta a este
		}else if (Saldo == 0 && Cantidad <= Math.abs(LimitDescub)) {
			LimitDescub += Cantidad;
			System.out.println("Se ha realizado la operación con éxito");
			//Si el saldo es 0 y la cantidad es mayor al limite no se puede hacer la operacion
		}else if(Saldo == 0 && Cantidad > Math.abs(LimitDescub)) {
			System.out.println("No se ha podido realizar la operación con éxito");
		}else if (Saldo + Math.abs(LimitDescub) > Cantidad && Saldo < Cantidad) {
			Cantidad -= Saldo;
			Saldo = 0;
			LimitDescub += Cantidad;
			System.out.println("Se ha realizado la operación con éxito");
		}
	}
	
	//Metodo para ingresar el dinero
	public void IngresarDinero(int Cantidad) {
		Saldo += Cantidad;
	}
	
	//Metodo para mostrar la información de la cuenta
	public void MostrarInfo() {
		System.out.println("INFORMACIÓN DE LA CUENTA:"
				+ "\nNOMBRE DEL TITULAR: "+ Nombre
				+ "\nDNI DEL TITULAR: "+ DNI
				+ "\nSALDO ACTUAL: "+ Saldo
				+ "\nLÍMITE DE DESCUBIERTO " + LimitDescub);
	}
	
}
