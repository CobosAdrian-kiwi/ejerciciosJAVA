package es.iescamas.ej2;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Act2 {

	public static void main(String[] args) {
		try (DataInputStream dis = new DataInputStream(new FileInputStream("ejercicio1.dat"))){
			
			System.out.println(dis.readDouble());
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
