package es.iescamas.ej7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Act7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = null;
		
		try {
			System.out.println("Introduce la frase a guardar");
			frase = sc.nextLine();
			if (frase.equals("")) throw new IllegalArgumentException("La frase no puede estar vacia");
			
			try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ejercicio7.dat"))){
				
				dos.writeUTF(frase);
				System.out.println("Frase guardada con exito");
				
			}catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		//Mostrar la frase
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("ejercicio7.dat"))){
			
			String frase_leer = dis.readUTF();
			
			System.out.println("Frase:");
			System.out.println(frase_leer);
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
