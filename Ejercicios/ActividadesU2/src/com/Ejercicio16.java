package com;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//definimos variables
		int numU, decU, unidU;
		final String uno = "uno";
		final String dos = "dos";
		final String tres = "tres";
		final String cuatro = "cuatro";
		final String cinco = "cinco";
		final String seis = "seis";
		final String siete = "siete";
		final String ocho = "ocho";
		final String nueve = "nueve";
		
		final String dieci = "dieci";
		final String veinti = "veinti";
		final String treinta = "trenta y ";
		final String cuarenta = "cuarenta y ";
		final String cincuenta = "cincuenta y ";
		final String sesenta = "sesenta y ";
		final String setenta = "setenta y ";
		final String ochenta = "ochenta y ";
		final String noventa = "noventa y ";
		
		//le preguntamos al usuario
		System.out.println("Introduce un número entre 1 y 99");
		numU = sc.nextInt();
		
		//Separamos las decenas y las unidades del numero introducido
		decU = numU / 10;
		unidU = numU % 10;
		
		//comprobamos si está en el rango indicado
		if (numU < 1 || numU > 99) {
			System.out.println("El número no está en el rango indicado");
		} else {
			//si las decenas son 0 solo decimos el numero normal
			if (decU == 0) {
				switch (unidU){
					case 1:
						System.out.println(uno);
						break;
					case 2:
						System.out.println(dos);
						break;
					case 3:
						System.out.println(tres);
						break;
					case 4:
						System.out.println(cuatro);
						break;
					case 5:
						System.out.println(cinco);
						break;
					case 6:
						System.out.println(seis);
						break;
					case 7:
						System.out.println(siete);
						break;
					case 8:
						System.out.println(ocho);
						break;
					case 9:
						System.out.println(nueve);
						break;
				}
			//si las decena es 1 entonces para los primeros que son especiales y despues	
			//concatenamos dieci + (unidades)
			}else if(decU == 1) {
				switch (unidU) {
				case 0:
					System.out.println("diez");
					break;
				case 1:
					System.out.println("once");
					break;
				case 2:
					System.out.println("doce");
					break;
				case 3:
					System.out.println("trece");
					break;
				case 4:
					System.out.println("catorce");
					break;
				case 5:
					System.out.println("quince");
					break;
				case 6:
					System.out.println(dieci+""+seis);
					break;
				case 7:
					System.out.println(dieci+""+siete);
					break;
				case 8:
					System.out.println(dieci+""+ocho);
					break;
				case 9:
					System.out.println(dieci+""+nueve);
					break;
				}
			}else if(decU == 2) {
				switch (unidU){
				case 0:
					System.out.println("veinte");
					break;
				case 1:
					System.out.println(veinti+""+uno);
					break;
				case 2:
					System.out.println(veinti+""+dos);
					break;
				case 3:
					System.out.println(veinti+""+tres);
					break;
				case 4:
					System.out.println(veinti+""+cuatro);
					break;
				case 5:
					System.out.println(veinti+""+cinco);
					break;
				case 6:
					System.out.println(veinti+""+seis);
					break;
				case 7:
					System.out.println(veinti+""+siete);
					break;
				case 8:
					System.out.println(veinti+""+ocho);
					break;
				case 9:
					System.out.println(veinti+""+nueve);
					break;
				}
			}else if (decU == 3) {
				switch (unidU){
				case 0:
					System.out.println("treinta");
					break;
				case 1:
					System.out.println(treinta+""+uno);
					break;
				case 2:
					System.out.println(treinta+""+dos);
					break;
				case 3:
					System.out.println(treinta+""+tres);
					break;
				case 4:
					System.out.println(treinta+""+cuatro);
					break;
				case 5:
					System.out.println(treinta+""+cinco);
					break;
				case 6:
					System.out.println(treinta+""+seis);
					break;
				case 7:
					System.out.println(treinta+""+siete);
					break;
				case 8:
					System.out.println(treinta+""+ocho);
					break;
				case 9:
					System.out.println(treinta+""+nueve);
					break;
				}
			}else if (decU == 4) {
				switch (unidU){
				case 0:
					System.out.println("cuarenta");
					break;
				case 1:
					System.out.println(cuarenta+""+uno);
					break;
				case 2:
					System.out.println(cuarenta+""+dos);
					break;
				case 3:
					System.out.println(cuarenta+""+tres);
					break;
				case 4:
					System.out.println(cuarenta+""+cuatro);
					break;
				case 5:
					System.out.println(cuarenta+""+cinco);
					break;
				case 6:
					System.out.println(cuarenta+""+seis);
					break;
				case 7:
					System.out.println(cuarenta+""+siete);
					break;
				case 8:
					System.out.println(cuarenta+""+ocho);
					break;
				case 9:
					System.out.println(cuarenta+""+nueve);
					break;
				}
			}else if (decU == 5) {
				switch (unidU){
				case 0:
					System.out.println("cincuenta");
					break;
				case 1:
					System.out.println(cincuenta+""+uno);
					break;
				case 2:
					System.out.println(cincuenta+""+dos);
					break;
				case 3:
					System.out.println(cincuenta+""+tres);
					break;
				case 4:
					System.out.println(cincuenta+""+cuatro);
					break;
				case 5:
					System.out.println(cincuenta+""+cinco);
					break;
				case 6:
					System.out.println(cincuenta+""+seis);
					break;
				case 7:
					System.out.println(cincuenta+""+siete);
					break;
				case 8:
					System.out.println(cincuenta+""+ocho);
					break;
				case 9:
					System.out.println(cincuenta+""+nueve);
					break;
				}
			}else if (decU == 6) {
				switch (unidU){
				case 0:
					System.out.println("sesenta");
					break;
				case 1:
					System.out.println(sesenta+""+uno);
					break;
				case 2:
					System.out.println(sesenta+""+dos);
					break;
				case 3:
					System.out.println(sesenta+""+tres);
					break;
				case 4:
					System.out.println(sesenta+""+cuatro);
					break;
				case 5:
					System.out.println(sesenta+""+cinco);
					break;
				case 6:
					System.out.println(sesenta+""+seis);
					break;
				case 7:
					System.out.println(sesenta+""+siete);
					break;
				case 8:
					System.out.println(sesenta+""+ocho);
					break;
				case 9:
					System.out.println(sesenta+""+nueve);
					break;
				}
			}else if (decU == 7) {
				switch (unidU){
				case 0:
					System.out.println("setenta");
					break;
				case 1:
					System.out.println(setenta+""+uno);
					break;
				case 2:
					System.out.println(setenta+""+dos);
					break;
				case 3:
					System.out.println(setenta+""+tres);
					break;
				case 4:
					System.out.println(setenta+""+cuatro);
					break;
				case 5:
					System.out.println(setenta+""+cinco);
					break;
				case 6:
					System.out.println(setenta+""+seis);
					break;
				case 7:
					System.out.println(setenta+""+siete);
					break;
				case 8:
					System.out.println(setenta+""+ocho);
					break;
				case 9:
					System.out.println(setenta+""+nueve);
					break;
				}
			}else if (decU == 8) {
				switch (unidU){
				case 0:
					System.out.println("ochenta");
					break;
				case 1:
					System.out.println(ochenta+""+uno);
					break;
				case 2:
					System.out.println(ochenta+""+dos);
					break;
				case 3:
					System.out.println(ochenta+""+tres);
					break;
				case 4:
					System.out.println(ochenta+""+cuatro);
					break;
				case 5:
					System.out.println(ochenta+""+cinco);
					break;
				case 6:
					System.out.println(ochenta+""+seis);
					break;
				case 7:
					System.out.println(ochenta+""+siete);
					break;
				case 8:
					System.out.println(ochenta+""+ocho);
					break;
				case 9:
					System.out.println(ochenta+""+nueve);
					break;
				}
			}else if(decU == 9) {
				switch (unidU){
				case 0:
					System.out.println("noventa");
					break;
				case 1:
					System.out.println(noventa+""+uno);
					break;
				case 2:
					System.out.println(noventa+""+dos);
					break;
				case 3:
					System.out.println(noventa+""+tres);
					break;
				case 4:
					System.out.println(noventa+""+cuatro);
					break;
				case 5:
					System.out.println(noventa+""+cinco);
					break;
				case 6:
					System.out.println(noventa+""+seis);
					break;
				case 7:
					System.out.println(noventa+""+siete);
					break;
				case 8:
					System.out.println(noventa+""+ocho);
					break;
				case 9:
					System.out.println(noventa+""+nueve);
					break;
				}
			}
			
		}
		
	}

}
