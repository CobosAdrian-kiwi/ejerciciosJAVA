package es.iescamas.ejemplos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ejemplo8 {

	public static void main(String[] args) {
		
		try {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ejemplo8.dat"));
			
			oos.write(null);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
