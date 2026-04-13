package es.iescamas.ej5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Act5 {

	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader("act5.txt"))){
			
			String linea;
			
			while ((linea = reader.readLine().trim())!= null) {
				if (mapa.get(linea) == null) {
					mapa.put(linea, 1);
				}else {
					mapa.put(linea, mapa.get(linea)+1);
				}
			}
		}catch (NullPointerException ex) {
			//No hacer nada porque es el final del archivo con el trim()		
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		List<Map.Entry<String,Integer>> lista = new ArrayList<>(mapa.entrySet());
		
		lista.sort((a,b) -> b.getValue() - a.getValue());
		
		for (Map.Entry<String,Integer> index : lista) {
			System.out.println(index);
		}
	}

}
