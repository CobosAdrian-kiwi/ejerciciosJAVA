package com;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CuentaCorriente cuenta1 = new CuentaCorriente("Adrian", "11111111A");
		
		cuenta1.IngresarDinero(30);
		
		cuenta1.MostrarInfo();
		
		cuenta1.SacarDinero(10);
		cuenta1.SacarDinero(30);
		
		cuenta1.MostrarInfo();
	}
}
