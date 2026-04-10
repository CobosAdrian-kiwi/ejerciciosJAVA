package es.iescamas.ej1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		double numero = 0;
		
		do {
			try {
				System.out.println("Introduce el numero a guardar");
				numero = sc.nextDouble();
				valido = true;
				
			}catch (Exception e){
				System.err.println(e.getMessage());
				numero = sc.nextDouble();
			}
		}while (!valido);
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ejercicio1.dat"))){
		
			dos.writeDouble(numero);
			System.out.println("Numero guardado con exito");
			
		}catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
