package es.iescamas;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeerLinea {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("salida.txt"))){
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			
		}catch(Exception ex){
			System.err.println("Error: "+ ex.getMessage());
			
		}finally {
			System.out.println("-FIN-");
		}
	}
}
