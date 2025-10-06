package com;

public class While {

	public static void main(String[] args) {
		//i vale 1
		int i = 1;
		
		//si i es menor o igual que 5 se ejecuta (*)
		while (i <= 5) {
			//(*) se imprime y se suma 1 a i
			System.out.println("Número "+ i);
			i++;
		}
	}

}
