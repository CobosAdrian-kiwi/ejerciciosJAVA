package es.iescamas.ej9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Act9 {
	public static void main(String[] args) {
		//Se definen 2 tablas para guardar el alfabeto y el cifrado
		String[] alfabeto = null;
		String[] cifrado = null;
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader("codec.txt"))){
			
			//como en teoria los archivos codec.txt tienen el alfabeto en la primera linea y el cifrado en la segunda contador ayuda a saber por cual vamos
			int contador = 0;
			String linea;
			
			while ((linea = reader.readLine())!=null) {
				if(contador == 0) {									//Si el contador es 0 (primera linea) se guarda en alfabeto esa linea
					alfabeto = linea.split(" ");
				}else if (contador == 1){							//Lo mismo con cifrado si contador es 1
					cifrado = linea.split(" ");
				}else {
					System.out.println("El archivo codec contiene más de 2 líneas, solo se consideraran las 2 primeras");
				}
				contador++;
				
			}
			
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			
			String[]LineaCarta; //Tabla que va a guardar la linea del fichero
			StringBuilder LineaNueva = new StringBuilder(); //StringBuilder que guarda la linea cifrada
			boolean encontrado = false; //Boolean para saber si se ha encontrado coincidencia en el cifrado y alfabeto
			
			try (BufferedReader reader2 = new BufferedReader(new FileReader("carta.txt"));
				     BufferedWriter writer = new BufferedWriter(new FileWriter("cartaEncript.txt"))){
				
				String LineaCartaStr; //Linea del fichero en mi caso carta
				
				while ((LineaCartaStr = reader2.readLine())!=null) {
					LineaNueva.delete(0, LineaNueva.length()); //Limpiamos en cada ciclo LineaNueva
					LineaCarta = LineaCartaStr.split(""); //Guardamos en la tabla LineaCarta el String LineaCaraStr separada por "" dando el String en una tabla
					
					for(int i = 0; i < LineaCarta.length;i++) { 		//Recorremos La tabla LineaCarta
						for (int j = 0; j < alfabeto.length; j++) {		//Recorremos alfabeto
							if (LineaCarta[i].equals(alfabeto[j])) {		//Si alguna letra de la linea está en alfabeto...
								LineaNueva.append(cifrado[j]);			//... se pone en lineaNueva el equivalente de la tabla cifrado
								encontrado = true;								// se habilita encontrado para no añadir el caracter original de la tabla
								break;
							}
						}
						if(!encontrado) {											//Si no se ha encontrado ningun caracter de alfabeto se añade el caracter original
							LineaNueva.append(LineaCarta[i]);
						}
						encontrado = false;	//Se reinicia encontrado
					}
					System.out.println(LineaCartaStr);
					System.out.println(LineaNueva);									//Se imprimen las equivalencias
					System.out.println("--------------------------------");
					
					writer.write(LineaNueva.toString());								//Se escribe en el nuevo archivo LineaNueva ya encriptada
					writer.newLine();
				}
				
			}catch (Exception e2) {
				System.err.println(e2.getMessage());
			}
			
		}
	}
}
