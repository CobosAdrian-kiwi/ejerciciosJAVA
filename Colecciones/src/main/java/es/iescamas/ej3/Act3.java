package es.iescamas.ej3;

import java.util.ArrayList;
import java.util.List;

public class Act3 {

	public static void main(String[] args) {
		List<Alumno> lista = new ArrayList<Alumno>();
		
		Alumno al1 = new Alumno("Adrian", 8);
		Alumno al2 = new Alumno("Pepe", 4);
		Alumno al3 = new Alumno("Andrea", 6);
		Alumno al4 = new Alumno("Luisa", 2);
		Alumno al5 = new Alumno("Jose", 9);
		
		lista.add(al1); lista.add(al2); lista.add(al3);
		lista.add(al4); lista.add(al5);
		
		//Mostrar solo aprobados
		for (Alumno alumnos : lista) {
			if (alumnos.getNota() >= 5) {
				System.out.println(alumnos.getNombre() + " | "+ alumnos.getNota());
			}
		}
		
		//Calcular media
		double media = 0;
		int suma = 0;
		
		for (Alumno alumnos : lista) {
			suma += alumnos.getNota();
		}
		
		media = suma / lista.size();
		
		System.out.println("La media es: "+media);
	}

}
