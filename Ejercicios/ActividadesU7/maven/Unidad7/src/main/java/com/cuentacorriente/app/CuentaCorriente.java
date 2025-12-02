package com.cuentacorriente.app;

public class CuentaCorriente {

	//ATRIBUTOS
	private double saldo;
	private double limitDescub;
	public String nombre;
	protected String dni;
	
	//Ejercicio 5
	static String banco = "BBVA";
	
	//Constructor
	public  CuentaCorriente(String nombre, String DNI) {
		this.nombre = nombre;
		this.dni = DNI;
		saldo = 0;
		limitDescub = -50;
	}
	
	//EJERCICIO 2 SOBRECARGA a)
	public  CuentaCorriente(double SaldoInicial) {
		nombre = "";
		dni = "";
		this.saldo = SaldoInicial;
		limitDescub = 0;
	}
	
	//EJERCICIO 2 SOBRECARGA b)
		public  CuentaCorriente(String DNI, double SaldoInicial, double LimitDescub) {
			nombre = "";
			this.dni = DNI;
			this.saldo = SaldoInicial;
			this.limitDescub = LimitDescub;
		}
	
	//MÉTODOS
	//Metodo para sacar dinero
	public void SacarDinero(double Cantidad) {
		
		//Se comprueba el saldo y si es mayor a la cantidad se resta del saldo
		if (saldo >= Cantidad) {
			saldo -= Cantidad;
			System.out.println("Se ha realizado la operación con éxito");
			//Si el saldo es 0 y cantidad es menor o igual al limite se le resta a este
		}else if (saldo == 0 && Cantidad <= Math.abs(limitDescub)) {
			limitDescub += Cantidad;
			System.out.println("Se ha realizado la operación con éxito");
			//Si el saldo es 0 y la cantidad es mayor al limite no se puede hacer la operacion
		}else if(saldo == 0 && Cantidad > Math.abs(limitDescub)) {
			System.out.println("No se ha podido realizar la operación con éxito");
		}else if (saldo + Math.abs(limitDescub) > Cantidad && saldo < Cantidad) {
			Cantidad -= saldo;
			saldo = 0;
			limitDescub += Cantidad;
			System.out.println("Se ha realizado la operación con éxito");
		}
	}
	
	//Metodo para ingresar el dinero
	public void IngresarDinero(double Cantidad) {
		saldo += Cantidad;
	}
	
	//Metodo para mostrar la información de la cuenta
	public void MostrarInfo() {
		System.out.println("##INFORMACIÓN DE LA CUENTA:"
				+ "\nNOMBRE DEL TITULAR: "+ nombre
				+ "\nDNI DEL TITULAR: "+ dni
				+ "\nSALDO ACTUAL: "+ saldo
				+ "\nLÍMITE DE DESCUBIERTO " + limitDescub
				+ "\nBANCO: "+ banco);
	}

	//GETTERS Y SETTERS
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimitDescub() {
		return limitDescub;
	}

	public void setLimitDescub(double limitDescub) {
		this.limitDescub = limitDescub;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
}
