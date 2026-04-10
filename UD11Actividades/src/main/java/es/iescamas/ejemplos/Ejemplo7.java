package es.iescamas.ejemplos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//copiar una imagen

public class Ejemplo7 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("images.jpg");
			FileOutputStream fos = new FileOutputStream("image_copia.jpg");
			
			int dato;
			
			while((dato = fis.read())!= -1) {
				fos.write(dato);
			}
			
			fis.close();
			fos.close();
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
