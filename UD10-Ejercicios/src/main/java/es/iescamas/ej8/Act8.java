package es.iescamas.ej8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Act8 {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("perso1.txt"));
				BufferedReader reader2 = new BufferedReader(new FileReader("perso2.txt"))){
					
				String linea = reader.readLine();
				String linea2 = reader2.readLine();
				
				try (BufferedWriter writer = new BufferedWriter(new FileWriter("perso3.txt"))) {
					
					while (linea != null && linea2 != null) {

					    if (linea.compareToIgnoreCase(linea2) <= 0) {
					        writer.write(linea);
					        linea = reader.readLine(); //Solo se avanza si se mete uno en el archivo 3
					    } else {
					        writer.write(linea2);
					        linea2 = reader2.readLine();
					    }

					    writer.newLine();
					}

					
					while (linea != null) {
					    writer.write(linea);
					    writer.newLine();
					    linea = reader.readLine();
					}

					while (linea2 != null) {
					    writer.write(linea2);
					    writer.newLine();
					    linea2 = reader2.readLine();
					}
					
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
		
			}catch (Exception e) {
				System.err.println(e.getMessage());
			}

	}

}
