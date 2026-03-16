package es.iescamas.Ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo1CrearArchivo {

	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))){
			
			//Contenido del archivo
			writer.write("Java");
			writer.newLine();
			writer.write("kiwi es el mejor");
			writer.newLine();
			writer.write("En verdad no esta medio pajo");
			
			System.out.println("Archivo creado y datos insertados");
			
		}catch (IOException ex) {
			System.err.println("Error al crear / insertar texto ----> " + ex.getMessage());
		}finally {
			System.out.println("Fin del programa");
		}
	}

}
