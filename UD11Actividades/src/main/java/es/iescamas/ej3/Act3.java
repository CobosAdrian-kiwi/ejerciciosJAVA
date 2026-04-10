package es.iescamas.ej3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Act3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ejercicio3.dat"))){
		
			do {
				try {
					System.out.println("Introduce un número");
					num = sc.nextInt();
					if(num >= 0)
						dos.writeInt(num);
					
				}catch (Exception e) {
					System.err.println(e.getMessage());
					num = sc.nextInt();
				}
			}while(num >= 0);
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("ejercicio3.dat"))){
			
			Integer num2;
			
			while (true ) {
				num2 = dis.readInt();
				System.out.println(num2);
			}
			
		}catch (Exception e) {
		}
	}
}
