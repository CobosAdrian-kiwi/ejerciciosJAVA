package es.iescamas.ej6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Act6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean completo = true;
		
		while (completo){
			System.out.println("Di la opcion a ejecutar: (1) Mostrar las firmas, (2) Insertar nombre, (3) Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			case 1:
				
				try (BufferedReader reader =new BufferedReader (new FileReader("firmas.txt"))){
					
					String linea;
					
					while ((linea = reader.readLine())!= null) {
						System.out.println(linea);
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 2:
				boolean ya_esta = false;
				String nombre;
				System.out.println("Introduce el nombre de la persona a firmar:");
				nombre = sc.nextLine();
				
				try (BufferedWriter writer = new BufferedWriter(new FileWriter("firmas.txt", true))){					
					
					try (BufferedReader reader =new BufferedReader (new FileReader("firmas.txt"))){
						
						
						String linea2;
						
						while((linea2 = reader.readLine()) != null) {
							if(nombre.equals(linea2)) {
								ya_esta = true;
							}
						}
						
						if (ya_esta) {
							System.out.println("No se puede introducir esa firma (ya está)");
						}else {
							writer.newLine();
							writer.write(nombre);
						}
						
					}catch (Exception e) {
						System.err.println(e.getMessage());
					}
					

					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 3:
				completo = false;
				break;
		
			}
			
		}

	}

}
