package es.iescamas.ejemplos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Guardar 5 numeros enteros

public class Ejemplo1 {
	public static void main(String[] args) {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("ejemplo1.dat"));
			
			for(int i = 1; i <= 5; i++) {
				dos.writeInt(i*10);
			}
			
			dos.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}finally {
			System.out.println("fin");
		}
	}
}
