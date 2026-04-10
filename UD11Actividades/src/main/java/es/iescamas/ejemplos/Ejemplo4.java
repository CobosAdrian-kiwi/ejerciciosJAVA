package es.iescamas.ejemplos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ejemplo4 {

	public static void main(String[] args) {

		try {
			
			ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream("ejemplo4.dat"));
			
			Persona p = new Persona("Pepe", 18);
			oos.writeObject(p);
			
			oos.close();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			System.out.println("fin");
		}
	}

}
