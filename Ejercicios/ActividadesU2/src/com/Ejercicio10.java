package com;
import java.util.Scanner;
import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir las variables que vamos a usar
		//numUsu para el numero que el usuario introduzca
		//numStr para la conversión del numUsu a String
		//numStrInvert para numStr invertido
		//capicua (booleano) para saber si es capicua o no
		
		short numUsu, numUsuIn;
		String numUsuInStr;
		int rest1, rest2, rest3, rest4, rest5;
		int div1, div2, div3, div4, div5;
		
		System.out.println("Introduce el numero a comprobar:");
		numUsu = sc.nextShort();
		
		//System.out.println(rest1 + " , " + div1);
		
		rest1 = numUsu % 10;
		div1 = numUsu / 10;
		System.out.println(rest1 + " , " + div1);
		
		rest2 = div1 % 10;
		div2 = div1 / 10;
		System.out.println(rest2 + " , " + div2);
		
		rest3 = div2 % 10;
		div3 = div2 / 10;
		System.out.println(rest3 + " , " + div3);
		
		rest4 = div3 % 10;
		div4 = div3 / 10;
		System.out.println(rest4 + " , " + div4);
		
		rest5 = div4 % 10;
		div5 = div4 / 10;
		System.out.println(rest5 + " , " + div5);
		
		numUsuInStr = String.valueOf(rest5) + String.valueOf(rest4) + String.valueOf(rest3) + String.valueOf(rest2) + String.valueOf(rest1);
		numUsuIn = Short.parseShort(numUsuInStr);
		System.out.println(numUsuIn);
		
		if (numUsuIn == numUsu) {
			System.out.println("El número "+ numUsu +" es capicua");
		} else {
			System.out.println("El número " + numUsu+" no es capicua");
		}
	}

}
