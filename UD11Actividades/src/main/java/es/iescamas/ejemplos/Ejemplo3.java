package es.iescamas.ejemplos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

//Guardar texto

public class Ejemplo3 {

	public static void main(String[] args) {
		try {
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("ejemplo3.dat"));
			
			dos.writeUTF("Hola mundo");
			dos.writeUTF("Java en binario");
			
			dos.close();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
