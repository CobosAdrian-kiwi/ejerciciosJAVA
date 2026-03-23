package es.iescamas.act3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Act3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce la opcion: (1): Duplicar en copia.txt | (2): Hacer copia_de_");
			int opcion = sc.nextInt(); 
			sc.nextLine();
			
			switch (opcion) {
			case 1: 
				
				try (BufferedReader reader = new BufferedReader(new FileReader("original.txt"))){
					
					try (BufferedWriter writer = new BufferedWriter(new FileWriter("copia.txt", false))){
						
						String linea;
						
						while ((linea = reader.readLine()) !=null) {
							System.out.println(linea);
							writer.write(linea);
							writer.newLine();
						}
						
					} catch (Exception ex) {
						System.err.println(ex.getMessage());
					}
					
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				
				break;
				
			case 2:
			
				System.out.println("Nombre del fichero a copiar:");
				String nombre = sc.nextLine();
				
				String copia = "copia_de_"+nombre;
				
				try (BufferedReader reader = new BufferedReader(new FileReader(nombre))){
					
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(copia, false))){
						
						String linea;
						
						while ((linea = reader.readLine()) !=null) {
							System.out.println(linea);
							writer.write(linea);
							writer.newLine();
						}
						
					} catch (Exception ex) {
						System.err.println(ex.getMessage());
					}
					
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				
				break;

				
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}
}
