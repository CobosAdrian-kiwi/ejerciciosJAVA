package com.interfaces.act9;

public class Reproductor {
	private Reproducible reproducible;
	
	public Reproductor(Reproducible reproducible) {
		this.reproducible = reproducible;
	}
	
	public void playReproducible() {
		reproducible.play();
		System.out.println("Ahora reproduciendo: \n"+((Mostrable)reproducible).mostrar());
	}
	
	public void pauseReproducible() {
		reproducible.pause();
		System.out.println("Se ha pausado: \n"+((Mostrable)reproducible).mostrar());
	}
	
	public void stopReproducible() {
		reproducible.stop();
		System.out.println("Se ha parado: \n"+((Mostrable)reproducible).mostrar());
	}
	
	public void cambiarReproducible(Reproducible reproducible2) {
		this.reproducible = reproducible2;
	}
}
