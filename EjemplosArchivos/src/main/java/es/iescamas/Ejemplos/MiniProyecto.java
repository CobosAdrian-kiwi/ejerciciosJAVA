package es.iescamas.Ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MiniProyecto {
	private static final String NOMBRE_ARCHIVO = "tareas.txt";
	private static final int CAPACIDAD_MAXIMA = 100;
	private static final Tarea[] tareas = new Tarea[CAPACIDAD_MAXIMA];
	private static int totalTareas = 0;
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		cargarTareas();
		
		int opcion;
		
		do {
			System.out.println("\n=== MENÚ DE TAREAS ===");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Guardar tareas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());
            
            switch (opcion) {
            case 1:
            	anadirTarea(sc);
            	break;
            case 2:
            	mostrarTareas();
            	break;
            case 3:
            	guardarTareas();
            	break;
            case 0:
            	guardarTareas();
            	System.out.println("Saliendo... ");
            	break;
        	default:
        		System.out.println("Opción no válida");
            }
		}while (opcion != 0);
		
		sc.close();
	}
	
	private static void anadirTarea(Scanner sc) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))){
		if (totalTareas >= CAPACIDAD_MAXIMA) {
			System.out.println("No se pueden añadir mas Tareas. Capacidad maxima");
			return;
		}
		
		System.out.println("ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Título: ");
		String titulo = sc.nextLine();
		
		System.out.println("Módulo: ");
		String modulo = sc.nextLine();
		
		System.out.println("Estado: ");
		String estado = sc.nextLine();
		
		tareas[totalTareas] = new Tarea(id, titulo, modulo, estado);
		totalTareas++;
		System.out.println("Tarea añadida");
		} catch (IOException ex) {
			System.out.println("Error al añadir la tarea: "+ ex.getMessage());
		}
	}
	
	private static void mostrarTareas() {
		if (totalTareas == 0) {
			System.out.println("No hay tareas");
			return;
		}
		
		for (int i = 0; i < totalTareas; i++) {
			System.out.println(tareas[i].toLinea());
		}
	}
	
	private static void guardarTareas() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))){
			
			for (int i = 0; i < totalTareas; i++) {
				writer.write(tareas[i].toLinea() );
				writer.newLine();
			}
			
		}catch (IOException ex) {
			System.out.println("Error al guardar: "+ ex.getMessage());
		}
	}
	
	private static void cargarTareas() {
		try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))){
			
			String linea;
			while ((linea = reader.readLine()) != null && totalTareas < CAPACIDAD_MAXIMA) {
				String[] partes = linea.split(";");
				int id = Integer.parseInt(partes[0]);
				String titulo = partes[1];
				String modulo = partes[2];
				String estado = partes[3];
				
				tareas[totalTareas] = new Tarea(id, titulo, modulo, estado);
				totalTareas++;
			}
			
		}catch (IOException ex) {
			System.out.println("Error al cargar tareas: "+ ex.getMessage());
		}
	}
}
