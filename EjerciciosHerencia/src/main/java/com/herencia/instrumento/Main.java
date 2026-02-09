package com.herencia.instrumento;

public class Main {

	public static void main(String[] args) {
		Piano piano = new Piano();
		Campana campana = new Campana();
		
		piano.add(Nota.Do);
		piano.add(Nota.Re);
		
		piano.interpretar();
		
		campana.add(Nota.Fa);
		campana.add(Nota.Si);
		
		campana.interpretar();
	}

}
