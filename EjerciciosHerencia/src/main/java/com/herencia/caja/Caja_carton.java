package com.herencia.caja;

public class Caja_carton extends Caja{

	private final int ETIQUETA_NUM;
	
	public Caja_carton(int ancho, int alto, int fondo, Unidades uds) {
		super(
		        uds == Unidades.m ? ancho * 100 : ancho,
		        uds == Unidades.m ? alto * 100 : alto,
		        uds == Unidades.m ? fondo * 100 : fondo,
		        uds == Unidades.m ? Unidades.cm : uds
		    );
		this.ETIQUETA_NUM = 0;
	}
	
	public Caja_carton(int ancho, int alto, int fondo, Unidades uds, String destinatario, String direccion, String emisor) {
		super(
		        uds == Unidades.m ? ancho * 100 : ancho,
		        uds == Unidades.m ? alto * 100 : alto,
		        uds == Unidades.m ? fondo * 100 : fondo,
		        uds == Unidades.m ? Unidades.cm : uds
		    );
		this.ETIQUETA_NUM = (int) (Math.random()*1000);
	}
	
	@Override
	public double getVolumen() {
		double result = (this.ANCHO * this.ALTO * this.FONDO) * 0.8;
		return result;		
	}
	
	public double getSuperficie() {
		double anch_alt = 2 * (this.ANCHO * this.ALTO);
		double alt_fond = 2 * (this.ALTO * this.FONDO);
		double fond_anch = 2 * (this.FONDO * this.ANCHO);
		
		return anch_alt+alt_fond+fond_anch;
	}
	
	@Override
	public String toString() {
		return "La caja tiene estas medidas: Ancho: "+ANCHO+" Alto: "+ALTO+" Fondo: "+FONDO+
				"\nDatos de la etiqueta: "+ETIQUETA_NUM+"";
	}
}
