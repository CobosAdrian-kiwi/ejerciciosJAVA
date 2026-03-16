package es.iescamas.Ejemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo4ReconstruirObjetos {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("tareas.txt"))){
			
			String linea;
			
			while ((linea = reader.readLine()) != null) {
				String[] partes = linea.split(";");
				
				int id = Integer.parseInt(partes[0]);
				String titulo = partes[1];
				String modulo = partes[2];
				String estado = partes[3];
				
				Tarea tarea = new Tarea(id, titulo, modulo, estado);
				
				System.out.println("ID: " + tarea.getId());
                System.out.println("Título: " + tarea.getTitulo());
                System.out.println("Módulo: " + tarea.getModulo());
                System.out.println("Estado: " + tarea.getEstado());
                System.out.println("--------------------------");
			}
			
			
		}catch (IOException ex) {
			System.err.println("Error al Reconstruir la clase ----> "+ ex.getMessage());
		}finally {
			System.out.println("Fin del programa");
		}
	}
}
