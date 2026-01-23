package com.string;

public class StringUtils {
    public StringUtils() { }  // constructor público

	public String palabraMasCorta(String string, String string2) {
		if (string.length() == string2.length()) {
			return "iguales";
		}else if(string.length() < string2.length()) {
			return string;
		}else {
			return string2;
		}
	}

	public String pistaBasicaContrasena(String string) {
		char primera = string.charAt(0);
		char ultima = string.charAt(string.length()-1);
		
		return ""+string.length()+":"+String.valueOf(primera).toLowerCase()+":"+String.valueOf(ultima).toLowerCase()+"";
	}

	public int compararAlfabeticamenteIgnoreCase(String string, String string2) {
		int result = string.compareToIgnoreCase(string2);
		
		String result_str;
		
		if (result == 0) {
			result_str = "0";
		}else if(result > 0) {
			result_str = "1";
		}else {
			result_str = "-1";
		}
		
		return Integer.parseInt(result_str);
		
	}

	public String fraseHastaFin(String[] strings) {
		StringBuilder frase = new StringBuilder();
		
		for (int i=0; i <= strings.length; i++) {
			if (strings[i].toLowerCase().equals("fin")) {
				break;
			}else {
				frase.append(strings[i]+" ");
			}
		}
		
		return frase.toString().trim();
	}

	public int contarEspacios(String string) {
		int acum = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				acum++;
			}
		}
		
		return acum;
	}

	public String sinVocales(String string) {
		char[] vocales = {'a','e','i','o','u','á','é','í','ó','ú','ü'};
		boolean hay_vocales;
		StringBuilder frase_no_vocles = new StringBuilder();
		
		for(int i = 0; i < string.length(); i++) {
			
			hay_vocales = false;
			for (int j = 0; j < vocales.length; j++) {
				
				if (string.toLowerCase().charAt(i) == vocales[j]) {
					hay_vocales = true;
					break;
				}
			}
			
			if(hay_vocales == false) {
				frase_no_vocles.append(string.charAt(i));
			}
		}
		
		return frase_no_vocles.toString();
	}

	public String invertir(String string) {
		StringBuilder frase = new StringBuilder();
		
		for (int i = string.length()-1; i >= 0; i--) {
			frase.append(string.charAt(i));
		}
		
		return frase.toString();
	}

	public int contarPalabra(String string, String string2) {
		int acum = 0;
		
		int fin_busqueda;
		String string_minus = string.toLowerCase();
		String string2_minus = string2.toLowerCase();
		
		
		for(int i = 0; i < string.length();i++) {
			fin_busqueda = i + string2.length();
			if(string_minus.charAt(i) == string2_minus.charAt(0)) {
				if(string_minus.substring(i, fin_busqueda).equals(string2_minus) ) {
					acum++;
					i += string2.length()-1;
				}
			}
		}
		
		return acum;
	}

	public boolean esPalindroma(String string) {
		StringBuilder frase1 = new StringBuilder();
		StringBuilder frase2 = new StringBuilder();
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				frase1.append(string.toLowerCase().charAt(i));
			}
		}
		
		
		for(int j = frase1.length()-1; j >= 0; j--) {
			frase2.append(frase1.charAt(j));
		}
		
		
		if(frase1.toString().equals(frase2.toString())) {
			return true;
		}else {
			return false;
		}
	}

	public String traducirJavalandia(String string) {
		String muletilla1 = "Javalín, javalón\t\t";
		String muletilla2 = "     javalén, len, len";
		
		if(string.contains(muletilla1)) {
			return string.substring(muletilla1.length(), string.length());
		}else if (string.contains(muletilla2)) {
			return string.substring(0, string.length()-muletilla2.length());
		}else {
			return null;
		}
	}

	public char codifica(char[] c1, char[] c2, char c) {
		String letra = String.valueOf(c).toLowerCase();
		
		for (int i = 0; i < c1.length; i++) {
			if(letra.charAt(0) == c1[i]) {
				return c2[i];
			}
		}
		return letra.charAt(0);
	}

	private final char[] C1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
    private final char[] C2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
	
	public String codificarTexto(String string) {
		
	    StringBuilder frase_codi = new StringBuilder();
		
		for(int i = 0; i < string.length(); i++) {
			
			for (int j = 0; j < C1.length ;j++) {
				
				if (string.charAt(i) == C1[j]) {
					frase_codi.append(C2[j]);
				}else {
					frase_codi.append(string.charAt(i));
				}
				
			}
			
		}
		
		return frase_codi.toString();
	}

	public String descodificarTexto(String codificado) {
		 StringBuilder frase_descodi = new StringBuilder();
			
			for(int i = 0; i < codificado.length(); i++) {
				
				for (int j = 0; j < C2.length ;j++) {
					
					if (codificado.charAt(i) == C2[j]) {
						frase_descodi.append(C1[j]);
					}else {
						frase_descodi.append(codificado.charAt(i));
					}
					
				}
				
			}
			
			return frase_descodi.toString();
	}
	
	
	
}
