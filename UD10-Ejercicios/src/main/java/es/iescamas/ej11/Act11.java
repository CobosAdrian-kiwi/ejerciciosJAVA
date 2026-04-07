package es.iescamas.ej11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Act11 {

	public static void main(String[] args) {
		
		String[][] matriz = null;		
		int contador = 0;
		
		int x = 0;
		int y = 0;

		String[] linea_array = null;
		
		try (BufferedReader reader = new BufferedReader(new FileReader("matriz.txt"))){
			
			String linea;
			
			//Leer primera linea
			linea = reader.readLine();
			linea_array = linea.split("");
			
			//Hacer matriz
			matriz = new String[linea.length()][linea.length()];
			
			//Rellenar primera linea
			for (int i = 0; i < matriz[0].length; i++) {
				matriz[x][y] = linea_array[i];
				y++;
			}
			x++;
			y=0;
			
			linea = "";
			linea_array = null;
			
			while ((linea = reader.readLine())!= null) {
				linea_array = linea.split("");
				
				for (int i = 0; i < linea_array.length;i++) {
					matriz[x][y] = linea_array[i];
					y++;
				}
				x++;
				y=0;
			}
			
			String[][] transpuesta = new String[matriz.length][matriz.length];

			for (int i = 0; i < matriz.length; i++) {
			    for (int j = 0; j < matriz.length; j++) {
			        transpuesta[i][j] = matriz[j][i];
			    }
			}
			
			
			for (int i = 0; i < transpuesta.length; i++) {
			    for (int j = 0; j < transpuesta.length; j++) {
			        System.out.print(transpuesta[i][j]);
			    }
			    System.out.println();
			}
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
