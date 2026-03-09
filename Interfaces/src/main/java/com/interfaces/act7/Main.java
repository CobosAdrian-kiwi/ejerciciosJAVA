package com.interfaces.act7;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.interfaces.act6.Producto;
import com.interfaces.act6.ProductoComparator;
import com.interfaces.act6.Valorable;

public class Main {

	public static void main(String[] args) {
		Valorable[] valorable = new Valorable[4];
		
		Valorable p1 = new Producto("A", "Monitor", 100.0);
		Valorable p2 = new Producto("B", "PC", 500.0);
		Valorable p3 = new Producto("C", "Raton", 40.0);
		Valorable p4 = new Producto("D", "Alfombrilla", 100.0);
		
		valorable[0] = p1;
		valorable[1] = p2;
		valorable[2] = p3;
		valorable[3] = p4;
		
		System.out.println("Tabla sin ordenar:");
		for (Valorable v : valorable) {
		    System.out.println(v);
		}
		
		
		System.out.println("Elige opcion para ordenar (1/2/3):");
		System.out.println("1: Nombre A-Z | 2: Precio Desc | 3: Ambos");
		Scanner sc = new Scanner(System.in);
		int opcion;
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
		    System.out.println("Ordenada A-Z:");

		    Arrays.sort(valorable, (a,b) -> 
		        ((Producto)a).compareTo((Producto)b));

		    for (Valorable v : valorable) {
		        System.out.println(v);
		    }
		    break;

		case 2:
		    System.out.println("Ordenada por precio:");

		    Arrays.sort(valorable, (a,b) ->
		        Double.compare(b.getPrecio(), a.getPrecio()));

		    for (Valorable v : valorable) {
		        System.out.println(v);
		    }
		    break;

		case 3:

		    Valorable[] valorable2 = Arrays.copyOf(valorable, valorable.length);

		    System.out.println("Ordenada A-Z:");

		    Arrays.sort(valorable2, (a,b) ->
		        ((Producto)a).compareTo((Producto)b));

		    for (Valorable v : valorable2) {
		        System.out.println(v);
		    }

		    System.out.println("Ordenada por precio:");

		    Arrays.sort(valorable, (a,b) ->
		        Double.compare(b.getPrecio(), a.getPrecio()));

		    for (Valorable v : valorable) {
		        System.out.println(v);
		    }

		    break;
		}
	}

}
