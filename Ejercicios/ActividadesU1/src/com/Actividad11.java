package com;
import java.util.Scanner;
/**
 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
La aplicación debe solicitar las ventas (en kilos) de cada semestre para cada fruta.
Se mostrará el importe total, sabiendo que:

El kilo de manzanas = 2,35 €
El kilo de peras = 1,95 €
 */
public class Actividad11 {
	
	public static void main(String [] args) {
		// Precios CONSTANTES durante el año
		final double PRECIO_MANZANA = 2.35;
		final double PRECIO_PERAS = 1.95;
		
		Scanner sc = new Scanner(System.in);
		
		// Definimos las variables de ambos semestres
		double kiloManzana1, kiloPera1, kiloManzana2, kiloPera2;
		// Definimos las variables de los beneficios y total
		double manzanaBeneficios, perasBeneficios, totalBeneficios;
		
		/*****
		 ** Leemos los valores 
		 */
		System.out.println("Inserte los kilos de manzana vendidos en el primer semestre");
		kiloManzana1 = sc.nextDouble();
		
		System.out.println("Inserte los kilos de peras vendidos en el primer semestre");
		kiloPera1 = sc.nextDouble();
		
		
		System.out.println("Inserte los kilos de manzana vendidos en el segundo semestre");
		kiloManzana2 = sc.nextDouble();
		
		System.out.println("Inserte los kilos de peras vendidos en el segundo semestre");
		kiloPera2 = sc.nextDouble();
		
		// Calcula la ganancia de cada fruta en los dos semestre
	    manzanaBeneficios = (kiloManzana1 * PRECIO_MANZANA) + (kiloManzana2 * PRECIO_MANZANA);
		//manzanaBeneficios = (kiloManzana1 + kiloManzana2)  * PRECIO_MANZANA;
	
	    perasBeneficios = PRECIO_PERAS * (kiloPera1 + kiloPera2);
	    
	    // Suma la ganancia de ambas fruta
	    totalBeneficios = manzanaBeneficios + perasBeneficios;
	    
	    // Mostramos los resultados
	   System.out.println("Total de las ganancia a sido: "+ totalBeneficios + " €");
	}
	
	
	
	
	
}
