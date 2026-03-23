package es.iescamas.ej2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce tu edad:");
		int edad = sc.nextInt();
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt", false))){
			
			writer.write("Nombre: "+nombre+", Edad: "+edad);
			
		}catch (Exception ex) {
			System.err.println(ex.getLocalizedMessage());
		}finally {
			
		}
		
		try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))){
			
			String linea;
			
			while ((linea = reader.readLine()) !=null) {
				System.out.println(linea);
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			
		}
		
	}

}
