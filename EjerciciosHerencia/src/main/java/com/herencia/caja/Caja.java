package com.herencia.caja;

public class Caja {
	protected final int ANCHO;
	protected final int ALTO;
	protected final int FONDO;
	protected final Unidades UDS;
	
	protected final String DESTINATARIO;
	protected final String DIRECCION;
	protected final String EMISOR;
	
	public Caja(int ancho, int alto, int fondo, Unidades uds) {
		this.ANCHO = ancho;
		this.ALTO = alto;
		this.FONDO = fondo;
		this.UDS = uds;
		this.DESTINATARIO = null;
		this.DIRECCION = null;
		this.EMISOR = null;
	}
	
	public Caja(int ancho, int alto, int fondo, Unidades uds, String destinatario, String direccion, String emisor) {
		this.ANCHO = ancho;
		this.ALTO = alto;
		this.FONDO = fondo;
		this.UDS = uds;
		this.DESTINATARIO = destinatario;
		this.DIRECCION = direccion;
		this.EMISOR = emisor;
	}
	
	public double getVolumen() {
		double result;
		if (this.UDS == Unidades.m) {
			result = ANCHO * ALTO * FONDO;
		}else {
			result = (ANCHO * ALTO * FONDO) / 1000000;
		}
		return result;
	}
	
	public String toString() {
		return "La caja tiene estas medidas: Ancho: "+ANCHO+" Alto: "+ALTO+" Fondo: "+FONDO+
				"\nDatos de la etiqueta: Direccion"+DIRECCION +" Destinatario: "+ DESTINATARIO+
				" Emisor "+EMISOR;
	}
	
	
}
