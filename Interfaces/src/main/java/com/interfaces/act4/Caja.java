package com.interfaces.act4;

public class Caja {
	public boolean cobrar (MetodoPago mp, double importe) {
		boolean result = mp.pagar(importe);
		if (result) {
			System.out.println("("+mp.getClass().toString()+") El cobro se ha hecho correctamente");
		}else {
			System.out.println("("+mp.getClass().toString()+") El cobro no se ha hecho");
		}
		return result;
	}
}
