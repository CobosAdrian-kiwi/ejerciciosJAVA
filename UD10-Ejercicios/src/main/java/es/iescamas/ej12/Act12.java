package es.iescamas.ej12;

import java.io.BufferedReader;
import java.io.FileReader;

public class Act12 {

	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("texto1.txt"));
				BufferedReader reader2 = new BufferedReader(new FileReader("texto2.txt"))){
			
			String linea1 = reader.readLine();
			String linea2 = reader.readLine();
			boolean fallo = false;
			int contadorlinea = 0;
			int contador = 0;
			
			while (linea1 != null && linea2 != null && !fallo) {
			    contador = 0;

			    if (!linea1.equals(linea2)) {
			        int min = Math.min(linea1.length(), linea2.length());

			        for (int i = 0; i < min; i++) {
			            if (linea1.charAt(i) != linea2.charAt(i)) {
			                fallo = true;
			                contador = i;
			                break;
			            }
			        }

			        // Si no encontró diferencia pero las longitudes son distintas
			        if (!fallo && linea1.length() != linea2.length()) {
			            fallo = true;
			            contador = min;
			        }
			    }

			    if (!fallo) {
			        linea1 = reader.readLine();
			        linea2 = reader2.readLine();
			    }

			    contadorlinea++;
			}
			
			if(fallo) {
				System.out.println("El fallo está en la línea: "+contadorlinea+", en el carácter: "+ contador);
			}else {
				System.out.println("Los archivos son iguales");
			}
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
