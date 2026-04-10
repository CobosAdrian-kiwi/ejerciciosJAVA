package es.iescamas.ejemplos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//Leer objeto de un archivo binario

public class Ejemplo5 {

	public static void main(String[] args) {
		
		try {
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ejemplo4.dat"));
			
			Persona p = (Persona) ois.readObject();
			System.out.println(p);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
