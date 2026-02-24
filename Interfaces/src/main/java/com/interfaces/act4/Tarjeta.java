package com.interfaces.act4;

public class Tarjeta implements MetodoPago{
	private double saldoDisponible;
	private double limite;
	
	public Tarjeta(double saldo, double limite) {
		this.saldoDisponible=saldo;
		this.limite=limite;
	}
	
	@Override
	public boolean pagar(double importe) {
		if (importe > saldoDisponible) {
			return false;
		}else if(importe <= saldoDisponible && importe > importe) {
			return false;
		}else {
			saldoDisponible -= importe;
			return true;
		}
	}
}
