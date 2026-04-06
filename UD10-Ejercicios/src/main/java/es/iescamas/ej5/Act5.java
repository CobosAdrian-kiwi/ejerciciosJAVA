package es.iescamas.ej5;

import java.io.BufferedReader;
import java.io.FileReader;

/* 
 * Programa que analiza un archivo que tiene 1 numero por linea
 * dice el mayor y el menor del documento
 */


public class Act5 {

	public static void main(String[] args) {
		int aux = 0;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		try (BufferedReader reader = new BufferedReader(new FileReader("numeros.txt"))){
			
				String linea;
			
				while ((linea = reader.readLine()) != null) {
					aux = Integer.parseInt(linea);
					
					if (aux < menor) {
						menor = aux;
					}else if (aux > mayor) {
						mayor = aux;
					}
				}
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		
		System.out.println("Número mayor: "+mayor);
		System.out.println("Número menor: "+ menor);

	}

}
