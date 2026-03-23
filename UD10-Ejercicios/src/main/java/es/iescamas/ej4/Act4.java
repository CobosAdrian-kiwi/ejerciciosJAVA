package es.iescamas.ej4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Act4 {

	public static void main(String[] args) {
		int contador_lineas = 0;
		int contador_palabras = 0;
		int contador_caracteres = 0;
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader("carta.txt"))){
			
			String linea;
			
			while ((linea = reader.readLine()) != null) {
				contador_lineas++;
				
				contador_palabras += linea.split(" ").length;
				
				contador_caracteres += linea.length();
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Numero líneas: "+ contador_lineas);
		System.out.println("Numero palabras: "+ contador_palabras);
		System.out.println("Numero caracteres: "+ contador_caracteres);
	}
}
