package es.iescamas.ej4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Act4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String usu = "";
		
		Map<String, String> diccionario = new HashMap<String, String>();
		
		diccionario.put("rojo", "red");
		diccionario.put("azul", "blue");
		diccionario.put("verde", "green");
		diccionario.put("morado", "purple");
		diccionario.put("rosa", "pink");
		diccionario.put("amarillo", "yellow");
		diccionario.put("naranja", "orange");
		diccionario.put("negro", "black");
		diccionario.put("blanco", "white");
		diccionario.put("marrón", "brown");
		
		while (true) {
			System.out.println("Introduce el color a buscar");
			usu = sc.nextLine();
			if (diccionario.get(usu) == null) { 
				System.err.println("No está en el diccionario");
			}else if (!usu.equals("")){
				System.out.println(diccionario.get(usu));
			}else {
				break;
			}
		}
	}

}
