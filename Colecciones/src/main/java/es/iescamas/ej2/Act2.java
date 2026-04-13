package es.iescamas.ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> conjunto= new HashSet<Integer>();
		
		List<Integer> lista = new ArrayList<Integer>();
		int numero;
		
		//Rellenar lista
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce el numero "+(i+1)+"º :");
			numero = sc.nextInt();
			sc.nextLine(); //Borrar bufer
			lista.add(numero);
		}
		
		conjunto.addAll(lista);
		System.out.println("Total: "+ conjunto.size());
		
		System.out.println(conjunto.toString());
	}

}
