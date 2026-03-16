package es.iescamas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import jdk.dynalink.StandardOperation;

public class NuevaLinea {
	public static void main(String[] args) {
		try {
			Path ruta = Path.of("salida.txt");
			Files.writeString(ruta, "\nNueva Línea", 
					StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
			
			
		}catch (Exception ex) {
			
		}finally {
			System.out.println("-FIN-");
		}
	}
}
