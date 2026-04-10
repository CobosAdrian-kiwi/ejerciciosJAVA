package es.iescamas.ejemplos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//copiar una imagen

public class Ejemplo6 {

	public static void main(String[] args) {
		
		try {
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("killpop.mp3"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("killpopCopia.mp3"));
			
			int dato;
			
			while((dato = bis.read())!= -1) {
				bos.write(dato);
			}
			
			bis.close();
			bos.close();
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
