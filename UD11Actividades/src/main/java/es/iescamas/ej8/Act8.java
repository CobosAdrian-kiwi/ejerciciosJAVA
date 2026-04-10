package es.iescamas.ej8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Act8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = null;
		
		//Limpiar el archivo
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ejercicio8.dat"))){
			dos.writeUTF("");
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		//Pro
		try {
			
			do {
				frase = null;
				
				System.out.println("Introduce la frase");
				frase = sc.nextLine();
				
				if (!frase.equals("")) {
					try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ejercicio8.dat",true))){
						
						dos.writeUTF(frase);
						
					}catch(Exception e) {
						System.err.println(e.getMessage());
					}
				}
				
			}while(!frase.equals(""));
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		//Mostrar
		try (DataInputStream dis = new DataInputStream(new FileInputStream("ejercicio8.dat"))){
			
			String frase_leer;
			
			while (true) {
				frase_leer = dis.readUTF();
				System.out.println(frase_leer);
			}
			
		}catch(EOFException e) {
			//No pasa nada porque es lo que debe de pasar
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
