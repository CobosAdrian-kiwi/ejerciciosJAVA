package es.iescamas.Ejemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2LeerDatos {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))){
			
			String linea;
			
			while ((linea = reader.readLine()) !=null) {
				System.out.println(linea);
			}
			
		}catch (IOException ex) {
			System.err.println("Error al leer los datos ----> "+ ex.getMessage());
		}finally {
			System.out.println("Fin del programa");
		}
	}
}
