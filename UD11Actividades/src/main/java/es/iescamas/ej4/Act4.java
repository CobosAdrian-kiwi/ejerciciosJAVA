package es.iescamas.ej4;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Act4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		double num = 0;
		double[] array = null;
		
		try {
			System.out.println("Introduce la cantidad de numeros a introducir");
			cantidad = sc.nextInt();
			array = new double[cantidad]; //Definir la longitud del array
		}catch (Exception e) {
			System.err.println(e.getMessage());
			sc.nextLine(); //Limpiar el buffer
		}
		
		try {
			
			for (int i = 0 ; i < cantidad; i++) {
				try {
					System.out.println("Introduce el "+(i+1)+"º numero:");
					num = sc.nextDouble();
					array[i] = num;
					System.out.println("Numero introducido con exito");
					
				}catch(Exception ex) {
					System.err.println(ex.getMessage());
					sc.nextLine(); //Limpiar el buffer
				}
			}
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		//Guardar la tabla de archivos
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ejercicio4.dat"))){
			
			for(int i = 0; i < array.length-1; i++) {
				dos.writeDouble(array[i]);
			}
			System.out.println("tabla guardada con exito");
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
