package es.iescamas.ejemplos;

import java.io.DataInputStream;
import java.io.FileInputStream;

//Leer enteros de un archivo binario

public class Ejemplo2 {

	public static void main(String[] args) {
		try {
			
			DataInputStream dis = new DataInputStream(new FileInputStream("ejemplo1.dat"));
			
			while(true) {
				System.out.println(dis.readInt());
			}
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			System.out.println("fin");
		}

	}

}
