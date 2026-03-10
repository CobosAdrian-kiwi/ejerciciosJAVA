package com.interfaces.act9;

public class Main {

	public static void main(String[] args) {
		Reproducible[] reproducibles = new Reproducible[4];
		
		Reproducible cancion1 = new Cancion("50_plutonianos", "Pluton764", 3);
		Reproducible cancion2 = new Cancion("Algo_Verde&Raro", "Pluton764", 2);
		Reproducible podcast1 = new Podcast("Ow stadium", "Toniki", 1, "OW2");
		Reproducible podcast2 = new Podcast("Ardillas asesinas", "yo", 4, "Ardillas");
		
		reproducibles[0] = cancion1;
		reproducibles[1] = cancion2;
		reproducibles[2] = podcast1;
		reproducibles[3] = podcast2;
		
		Reproductor reproductor = new Reproductor(null);
		
		for (Reproducible repro : reproducibles) {
			reproductor.cambiarReproducible(repro);
			reproductor.playReproducible();
			System.out.println("...");
			reproductor.pauseReproducible();
			System.out.println("...");
			reproductor.stopReproducible();
			System.out.println("Ha terminado la pista: "+ ((Mostrable)repro).mostrar());
		}
	}

}
