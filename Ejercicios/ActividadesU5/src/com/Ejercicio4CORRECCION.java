package com;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Implementar un programa que inicialice una tabla con tus números favoritos. 
 * Pedir al usuario el índice de un elemento que será eliminado. 
 * Continuar eliminando elementos hasta que el índice introducido sea negativo o 
 * no existan más elementos que borrar. Validar siempre que el índice es válido.
 */

public class Ejercicio4CORRECCION {
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definimos variables
		int numUsu;
		
		//Inicializamos la tabla
		int[] nums_favs = {6, 8, 16, 22};
		
		do {
			for (int i = 0; i < nums_favs.length; i++) {
				System.out.print(nums_favs[i] + " | ");  //Este for() es para mostrar la tabla
			}
			System.out.println("Dime el índice a eliminar"); // Se le pregunta al usuario por el índice a eliminar
			numUsu = sc.nextInt();
			
			int[] nums_mod = borrarElemento(nums_favs, numUsu); //Se ejecuta la función
			
			nums_favs = nums_mod; //Se hace que la tabla sea igual a la tabla nums_mod que está modificada
			
		}while(nums_favs.length > 0); //El bucle se ejecuta hasta que la longitud sea 0
		
		System.out.println("Ya no quedan más números!!!");
	}
	
	//----------FUNCIONES----------
	public static int[] borrarElemento(int[] tabla, int n) {
		///Se hace un bucle que va a recorrer la tabla, una vez que llegue al índice n (el introducido por el usuario)
		///osea j = n se va a sobreescribir n por n+1 osea el siguiente número pero en el if al poner >= lo que se hace
		///es que todos los números mayores a n se sobreescriban por el siguiente. Es importante que en el for()
		///tabla.lenght se le reste 1 para que no llegue al último numero del array e intente sumarle el siguiente
		///(que no existe).
		///
		///POR PASOS: tabla: 1/2/3/4 queremos borrar el /2/
		///1/2 = siguiente pos.(3) / 3 = sig. pos.(4) / 4 se queda igual
		///1/3/4/4
		for (int j = 0; j < tabla.length - 1; j++) {
			if (j >= n && j != tabla.length) {
				tabla[j] = tabla[j+1];
			}
		}
		///Si la tabla original es: 1/2/3/4 y queremos borrar el indice 1 osea el /2/ en este punto la tabla
		///estaría asi: 1/3/4/4 y con la línea que hay debajo se corta el último indice de la tabla osea
		///que se quedaría así: 1/3/4 y se devuelve esta tabla
		int[] tablaMod = Arrays.copyOf(tabla, tabla.length-1);
		
		return tablaMod;
	}
}
