package com.interfaces.act4;

public class Bizum implements MetodoPago{
	private double saldo;
	private int telefono;
	
	public Bizum(double saldo, int telefono) {
		this.saldo = saldo;
		this.telefono = telefono;
	}
	
	@Override
	public boolean pagar(double importe) {
		if (importe > saldo) {
			return false;
		}else {
			saldo -= importe;
			return true;
		}
	}
}
