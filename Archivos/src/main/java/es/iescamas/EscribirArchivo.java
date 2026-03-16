package es.iescamas;

import java.nio.file.Files;
import java.nio.file.Path;

public class EscribirArchivo {
	 public static void main(String[] args) {
	        try {
	            Path ruta = Path.of("salida.txt");
	            Files.writeString(ruta, "Hola desde Java");
	            System.out.println("Archivo guardado correctamente.");
	        } catch (Exception e) {
	            System.err.println("Error al escribir: " + e.getMessage());
	        }
	    }
}
