package es.iescamas.ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<Integer>();
		
		int numero = 0;
		int suma = 0;
		double media = 0.0;
		
		
		//Rellenar lista
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce el numero "+(i+1)+"º :");
			numero = sc.nextInt();
			sc.nextLine(); //Borrar bufer
			lista.add(numero);
		}
		
		//Mostrar lista
		System.out.print("Lista: ");
		System.out.println(lista.toString());

		
		//Recorrer la lista para suma y contador
		for (Integer numeros : lista) {
			suma += numeros;
		}
		
		//Suma y media
		System.out.println("La suma es: "+ suma);
		media = suma / lista.size();
		
		System.out.println("La media es: "+ media);
	}

}
