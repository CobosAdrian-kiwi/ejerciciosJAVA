package es.iescamas.ej5;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.util.Arrays;

public class Act5 {

	public static void main(String[] args) {
		int longitud = 0;
		double[] array = new double[longitud];
		
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("ejercicio4.dat"))){
			
			double num;
			
			while (true) {
				num = dis.readDouble();
				array = Arrays.copyOf(array, longitud+1);
				array[longitud] = num;
				longitud++;
			}
			
		}catch(EOFException e) {
			//Nada porque es con lo que termina el bucle
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}

		for (double numeros : array) {
			System.out.print(numeros+" ");
		}
	}

}
