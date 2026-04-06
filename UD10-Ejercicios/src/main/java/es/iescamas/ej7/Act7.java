package es.iescamas.ej7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Act7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont_lineas = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader("more.txt"))){
			
			String linea;
			String opcion;
			
			while ((linea = reader.readLine())!=null) {
				cont_lineas++;
				if (cont_lineas <= 24) {
					System.out.println(linea);
				}else {
					System.out.println("Quiere seguir viendo el archivo? S / N");
					opcion = sc.nextLine().toLowerCase();
					
					if(opcion.equals("s")) {
						cont_lineas = 0;
					}else {
						break;
					}
				}
			}
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
