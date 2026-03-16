package es.iescamas.Ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo3GuardarObjetos {
	public static void main (String[] args) {
		Tarea t1 = new Tarea(1, "Crear formulario", "Programación", "pendiente");
        Tarea t2 = new Tarea(2, "Leer archivo", "Entornos", "hecha");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tareas.txt"))){
        	
        	writer.write(t1.toLinea());
        	writer.newLine();
        	writer.write(t2.toLinea());
        	writer.newLine();
        	
        }catch (IOException ex) {
        	System.err.println("Error al guardar objeto ----> "+ ex.getMessage());
        }finally {
        	System.out.println("Fin del programa");
        }
	}
}
	