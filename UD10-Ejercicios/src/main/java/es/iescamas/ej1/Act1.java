package es.iescamas.ej1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del fichero a buscar:");
		String nombre = sc.nextLine();
		
		if (nombre == "") {
			nombre = "prueba.txt";
		}
		
		try (BufferedReader reader = new BufferedReader(new FileReader(nombre))){
			
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
