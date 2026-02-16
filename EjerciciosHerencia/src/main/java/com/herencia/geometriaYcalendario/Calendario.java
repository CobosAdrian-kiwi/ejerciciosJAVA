package com.herencia.geometriaYcalendario;

public class Calendario {
	protected int anno;
	protected int mes;
	protected int dia;
	
	//Constructor
	public Calendario(int anno, int mes, int dia) {
		if (anno < 0) throw new  IllegalArgumentException("Los años tienen que estar en un formato válido");
		if (mes < 1 || mes > 12) throw new IllegalArgumentException("Los meses tienen que estar en un formato válido");
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 31 || dia < 1)) 
			throw new IllegalArgumentException("Los días tienen que estar en un formato válido");
		if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30 || dia < 1)) 
			throw new IllegalArgumentException("Los días tienen que estar en un formato válido");
		if (mes == 2 && (dia > 28 || dia < 1)) throw new IllegalArgumentException("Los días tienen que estar en un formato válido");
		
		this.anno = anno;
		this.mes = mes;
		this.dia = dia;
	}
	
	public void incrementarDia (int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia == 31) {
				incrementarMes(1);
				dia = 1;
			}else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30) {
				incrementarMes(1);
				dia = 1;
			}else if (mes == 2 && dia == 28) {
				incrementarMes(1);
				dia = 1;
			}else {
				dia++;
			}
		}
	}

	private void incrementarMes(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			if(mes == 12) {
				incrementarAnno(1);
				mes = 1;
			}else {
				mes++;
			}
		}
		
	}

	private void incrementarAnno(int cantidad) {
		if (cantidad == 0) throw new IllegalArgumentException("No se puede incrementar 0 años");
		anno += cantidad;
	}
	
	public void mostrar() {
		System.out.println("Calendario: "+dia+"/"+mes+"/"+anno);
	}
	
	public boolean iguales(Calendario otraFecha) {
		if (this.dia == otraFecha.dia) {
			
			if (this.mes == otraFecha.mes) {
				
				if (this.anno == otraFecha.anno) {
					
					return true;
					
				}else {
					return false;
				}
				
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}
}
