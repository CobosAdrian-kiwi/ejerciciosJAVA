package com.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("StringUtils (TDD) - Pruebas unitarias JUnit 5")
class StringUtilsTest {

	 private StringUtils stringUtils;

	    @BeforeEach
	    void setUp() {
	        stringUtils = new StringUtils();
	    }

    // -------------------------
    // 1) PALABRA MÁS CORTA
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar palabraMasCorta(a,b) devolviendo la palabra con menos caracteres.
    // Si ambas palabras tienen la misma longitud, se consideran IGUALES y se devuelve la primera.
    //
    // Ejemplo:
    // palabraMasCorta("sol","luna") -> "sol"
    // palabraMasCorta("hola","adios") -> "hola" (iguales)
    @Test
    @DisplayName("palabraMasCorta(a,b): devuelve la palabra más corta; si son iguales, devuelve la primera")
    void palabraMasCorta_basico() {
        String resultadoEsperado = "sol";
        String resultado = stringUtils.palabraMasCorta("sol", "luna");
        assertEquals(resultadoEsperado, resultado, "Debe devolver la palabra más corta");

        String resultadoEsperado2 = "hola";
        String resultado2 = stringUtils.palabraMasCorta("hola", "adios");
        assertEquals(resultadoEsperado2, resultado2, "Si son iguales en longitud, debe devolver la primera");
    }
    
    // -------------------------
    // 2) PISTA BÁSICA CONTRASEÑA
    // -------------------------
    // ✅ Debe realizar el alumno:
    // Implementar pistaBasicaContrasena(pass) devolviendo "len:first:last".
    // first y last deben ir en minúscula.
    //
    // Ejemplo:
    // pistaBasicaContrasena("hello") -> "5:h:o"
    // pistaBasicaContrasena("A") -> "1:a:a"
    @Test
    @DisplayName("pistaBasicaContrasena(pass): devuelve 'len:first:last' (first/last en minúscula)")
    void pistaBasicaContrasena_formato() {
        String resultadoEsperado = "5:h:o";
        String resultado = stringUtils.pistaBasicaContrasena("hello");
        assertEquals(resultadoEsperado, resultado, "Debe devolver longitud, primer y último carácter");

        String resultadoEsperado2 = "1:a:a";
        String resultado2 = stringUtils.pistaBasicaContrasena("A");
        assertEquals(resultadoEsperado2, resultado2, "Debe funcionar con longitud 1");
    }
   
    // -------------------------
    // 3) COMPARACIÓN ALFABÉTICA IGNORE CASE
    // -------------------------
    // ✅ Debe realizar el alumno:
    // compararAlfabeticamenteIgnoreCase(a,b):
    // devuelve -1 si a<b, 0 si iguales, 1 si a>b, ignorando mayúsculas.
    //
    // Ejemplo:
    // compararAlfabeticamenteIgnoreCase("Java","jAvA") -> 0
    @Test
    @DisplayName("compararAlfabeticamenteIgnoreCase(a,b): -1 si a<b, 0 si iguales, 1 si a>b (ignora mayúsculas)")
    void compararAlfabeticamenteIgnoreCase() {
        int resultadoEsperado = -1;
        int resultado = stringUtils.compararAlfabeticamenteIgnoreCase("casa", "perro");
        assertEquals(resultadoEsperado, resultado, "casa debe ser menor que perro");

        int resultadoEsperado2 = 1;
        int resultado2 = stringUtils.compararAlfabeticamenteIgnoreCase("zorro", "abeja");
        assertEquals(resultadoEsperado2, resultado2, "zorro debe ser mayor que abeja");

        int resultadoEsperado3 = 0;
        int resultado3 = stringUtils.compararAlfabeticamenteIgnoreCase("Java", "jAvA");
        assertEquals(resultadoEsperado3, resultado3, "Debe ignorar mayúsculas/minúsculas");
    }
    
    // -------------------------
    // 4) FRASE HASTA "fin"
    // -------------------------
    // ✅ Debe realizar el alumno:
    // fraseHastaFin(palabras): concatena palabras separadas por espacio
    // hasta encontrar "fin" en cualquier combinación de mayúsculas/minúsculas.
    // La palabra "fin" no debe aparecer en la frase final.
    //
    // Ejemplo:
    // ["hola","mundo","FIN","otra"] -> "hola mundo"
    @Test
    @DisplayName("fraseHastaFin(palabras): concatena hasta 'fin' (ignora mayúsculas), sin incluir 'fin'")
    void fraseHastaFin() {
        String resultadoEsperado = "hola mundo";
        String resultado = stringUtils.fraseHastaFin(new String[] { "hola", "mundo", "FIN", "otra" });
        assertEquals(resultadoEsperado, resultado, "Debe construir la frase sin incluir 'fin'");

        String resultadoEsperado2 = "";
        String resultado2 = stringUtils.fraseHastaFin(new String[] { "fin" });
        assertEquals(resultadoEsperado2, resultado2, "Si la primera palabra es 'fin', debe devolver cadena vacía");

        String resultadoEsperado3 = "uno dos tres";
        String resultado3 = stringUtils.fraseHastaFin(new String[] { "uno", "dos", "tres", "FiN" });
        assertEquals(resultadoEsperado3, resultado3, "Debe cortar al encontrar 'fin'");
    }
    
    // -------------------------
    // 5) CONTAR ESPACIOS
    // -------------------------
    // ✅ Debe realizar el alumno:
    // contarEspacios(frase): cuenta cuántos caracteres ' ' (espacio) aparecen.
    //
    // Ejemplo:
    // "A  B C" -> 3
    @Test
    @DisplayName("contarEspacios(frase): cuenta espacios ' ' (incluye consecutivos)")
    void contarEspacios() {
        int resultadoEsperado = 0;
        int resultado = stringUtils.contarEspacios("Hola");
        assertEquals(resultadoEsperado, resultado, "Una palabra sin espacios debe devolver 0");

        int resultadoEsperado2 = 1;
        int resultado2 = stringUtils.contarEspacios("Hola mundo");
        assertEquals(resultadoEsperado2, resultado2, "Debe contar 1 espacio");

        int resultadoEsperado3 = 3;
        int resultado3 = stringUtils.contarEspacios("A  B C");
        assertEquals(resultadoEsperado3, resultado3, "Debe contar espacios consecutivos");
    }
    
    // -------------------------
    // 6) ELIMINAR VOCALES (incluye tildes y ü)
    // -------------------------
    // ✅ Debe realizar el alumno:
    // sinVocales(texto): elimina vocales may/min y acentuadas.
    // Vocales a eliminar: a,e,i,o,u, á,é,í,ó,ú, ü (y equivalentes mayúsculas).
    //
    // Ejemplo:
    // "Álvaro Pérez" -> "lvr Prz"
    @Test
    @DisplayName("sinVocales(texto): elimina vocales may/min incluyendo tildes y ü")
    void sinVocales_conTildes() {
        String resultadoEsperado = "lvr Prz";
        String resultado = stringUtils.sinVocales("Álvaro Pérez");
        assertEquals(resultadoEsperado, resultado, "Debe eliminar vocales acentuadas y no acentuadas");

        String resultadoEsperado2 = "crzn";
        String resultado2 = stringUtils.sinVocales("corazón");
        assertEquals(resultadoEsperado2, resultado2, "Debe eliminar vocales y mantener consonantes");

        String resultadoEsperado3 = "";
        String resultado3 = stringUtils.sinVocales("aeiouAEIOUáéíóúÁÉÍÓÚüÜ");
        assertEquals(resultadoEsperado3, resultado3, "Si todo son vocales, el resultado debe ser vacío");
    }
    
    // -------------------------
    // 7) INVERTIR CADENA
    // -------------------------
    // ✅ Debe realizar el alumno:
    // invertir(texto): devuelve la cadena invertida.
    //
    // Ejemplo:
    // "Hola mundo" -> "odnum aloH"
    @Test
    @DisplayName("invertir(texto): devuelve la cadena invertida")
    void invertir() {
        String resultadoEsperado = "aloH";
        String resultado = stringUtils.invertir("Hola");
        assertEquals(resultadoEsperado, resultado, "Debe invertir una palabra");

        String resultadoEsperado2 = "odnum aloH";
        String resultado2 = stringUtils.invertir("Hola mundo");
        assertEquals(resultadoEsperado2, resultado2, "Debe invertir respetando espacios");

        String resultadoEsperado3 = "";
        String resultado3 = stringUtils.invertir("");
        assertEquals(resultadoEsperado3, resultado3, "Invertir vacío debe devolver vacío");
    }
    
    // -------------------------
    // 8) CONTAR PALABRA EN FRASE
    // -------------------------
    // ✅ Debe realizar el alumno:
    // contarPalabra(frase, palabra):
    // - cuenta cuántas veces aparece "palabra" dentro de "frase"
    // - sin distinguir mayúsculas/minúsculas
    // - sin solapamiento (en "aaaa" palabra "aa" -> 2)
    //
    // Ejemplo:
    // contarPalabra("Java java JAVa", "jAvA") -> 2
    @Test
    @DisplayName("contarPalabra(frase,palabra): cuenta apariciones no solapadas e ignora mayúsculas")
    void contarPalabra() {
        int resultadoEsperado = 3;
        int resultado = stringUtils.contarPalabra("a a a", "a");
        assertEquals(resultadoEsperado, resultado, "Debe contar apariciones simples");

        int resultadoEsperado2 = 2;
        int resultado2 = stringUtils.contarPalabra("aaaa", "aa");
        assertEquals(resultadoEsperado2, resultado2, "No debe contar solapadas: 'aaaa' contiene 'aa' dos veces");

        int resultadoEsperado3 = 3;
        int resultado3 = stringUtils.contarPalabra("Java java JAVa", "jAvA");
        assertEquals(resultadoEsperado3, resultado3, "Debe ignorar mayúsculas/minúsculas");

        int resultadoEsperado4 = 0;
        int resultado4 = stringUtils.contarPalabra("Hola mundo", "adios");
        assertEquals(resultadoEsperado4, resultado4, "Si no aparece, debe devolver 0");
    }
    
    // -------------------------
    // 9) ES PALÍNDROMA
    // -------------------------
    // ✅ Debe realizar el alumno:
    // esPalindroma(texto):
    // - ignora espacios
    // - ignora mayúsculas
    // - asume que el usuario no mete tildes si es palíndroma (según enunciado)
    //
    // Ejemplo:
    // "Anita lava la tina" -> true
    @Test
    @DisplayName("esPalindroma(texto): ignora espacios y mayúsculas")
    void esPalindroma() {
        boolean resultadoEsperado = true;
        boolean resultado = stringUtils.esPalindroma("Anita lava la tina");
        assertEquals(resultadoEsperado, resultado, "Debe detectar palíndromo ignorando espacios");

        boolean resultadoEsperado2 = true;
        boolean resultado2 = stringUtils.esPalindroma("Dabale arroz a la zorra el abad");
        assertEquals(resultadoEsperado2, resultado2, "Debe detectar palíndromo en frases largas");

        boolean resultadoEsperado3 = false;
        boolean resultado3 = stringUtils.esPalindroma("Hola mundo");
        assertEquals(resultadoEsperado3, resultado3, "Una frase normal no debe ser palíndroma");

        boolean resultadoEsperado4 = true;
        boolean resultado4 = stringUtils.esPalindroma("");
        assertEquals(resultadoEsperado4, resultado4, "Por decisión: la cadena vacía se considera palíndroma");
    }
    
    // -------------------------
    // 10) TRADUCTOR JAVALANDIA
    // -------------------------
    // ✅ Debe realizar el alumno:
    // traducirJavalandia(frase):
    // Caso 1: si empieza por "Javalín, javalón" + (espacios/tabs) + mensaje -> devuelve mensaje
    // Caso 2: si termina con (espacios/tabs) + "javalén, len, len" -> devuelve mensaje
    // Si no pertenece a ninguno -> devuelve null
    //
    // Ejemplo:
    // "Javalín, javalón\t\tmensaje secreto" -> "mensaje secreto"
    // "hola     javalén, len, len" -> "hola"
    @Test
    @DisplayName("traducirJavalandia(frase): devuelve mensaje si es dialecto válido; si no, null")
    void traducirJavalandia() {
        String resultadoEsperado = "mensaje secreto";
        String resultado = stringUtils.traducirJavalandia("Javalín, javalón\t\tmensaje secreto");
        assertEquals(resultadoEsperado, resultado, "Debe recortar muletilla inicial y espacios/tabs");

        String resultadoEsperado2 = "hola";
        String resultado2 = stringUtils.traducirJavalandia("hola     javalén, len, len");
        assertEquals(resultadoEsperado2, resultado2, "Debe recortar muletilla final y espacios/tabs");

        String resultadoEsperado3 = null;
        String resultado3 = stringUtils.traducirJavalandia("Esto no es javalandia");
        assertEquals(resultadoEsperado3, resultado3, "Si no es del idioma, debe devolver null");
    }
    
    // -------------------------
    // 11) CODIFICA CARÁCTER
    // -------------------------
    // ✅ Debe realizar el alumno:
    // codifica(c1,c2,c):
    // - busca el carácter en c1 (en minúscula)
    // - si está, devuelve c2[pos]
    // - si no está, devuelve el propio carácter en minúscula
    //
    // Ejemplo:
    // c='P' -> 'm' (según conjuntos del enunciado)
    private static final char[] C1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
    private static final char[] C2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

    @Test
    @DisplayName("codifica(c1,c2,c): sustituye según conjuntos y devuelve siempre minúscula")
    void codifica() {
        char resultadoEsperado = 'm';
        char resultado = stringUtils.codifica(C1, C2, 'p');
        assertEquals(resultadoEsperado, resultado, "Debe sustituir p -> m");

        char resultadoEsperado2 = 'm';
        char resultado2 = stringUtils.codifica(C1, C2, 'P');
        assertEquals(resultadoEsperado2, resultado2, "Debe funcionar igual con mayúsculas");

        char resultadoEsperado3 = 'a';
        char resultado3 = stringUtils.codifica(C1, C2, 'A');
        assertEquals(resultadoEsperado3, resultado3, "Si no está en el conjunto, debe devolver la letra en minúscula");

        char resultadoEsperado4 = '!';
        char resultado4 = stringUtils.codifica(C1, C2, '!');
        assertEquals(resultadoEsperado4, resultado4, "Los signos deben mantenerse");
    }
    
    // -------------------------
    // 12) CODIFICAR TEXTO / DESCODIFICAR TEXTO
    // -------------------------
    // ✅ Debe realizar el alumno:
    // codificarTexto(texto): recorre el texto y aplica codifica(C1,C2,c) a cada carácter.
    // descodificarTexto(texto): usa los conjuntos intercambiados (C2->C1).
    //
    // Ejemplo:
    // "PaquiTo" -> "matqvko"
    @Test
    @DisplayName("codificarTexto(texto): ejemplo del enunciado 'PaquiTo' -> 'matqvko'")
    void codificarTexto() {
        String resultadoEsperado = "matqvko";
        String resultado = stringUtils.codificarTexto("PaquiTo");
        assertEquals(resultadoEsperado, resultado, "Debe codificar según los conjuntos del enunciado");
    }

    @Test
    @DisplayName("descodificarTexto(texto): revierte codificación (swap conjuntos)")
    void descodificarTexto() {
        String original = "PaquiTo!";
        String codificado = stringUtils.codificarTexto(original);

        String resultadoEsperado = original.toLowerCase();
        String resultado = stringUtils.descodificarTexto(codificado);

        assertEquals(resultadoEsperado, resultado, "Descodificar debe devolver el original en minúscula");
    }
    /**
    // -------------------------
    // 13) ANAGRAMAS
    // -------------------------
    // ✅ Debe realizar el alumno:
    // sonAnagramas(a,b):
    // - true si tienen mismos caracteres y misma longitud (ignorando mayúsculas)
    // - false en caso contrario
    //
    // Ejemplo:
    // "roma" y "amor" -> true
    @Test
    @DisplayName("sonAnagramas(a,b): true si son anagramas (ignora mayúsculas)")
    void sonAnagramas() {
        boolean resultadoEsperado = true;
        boolean resultado = stringUtils.sonAnagramas("roma", "amor");
        assertEquals(resultadoEsperado, resultado, "roma y amor deben ser anagramas");

        boolean resultadoEsperado2 = true;
        boolean resultado2 = stringUtils.sonAnagramas("Ramo", "Mora");
        assertEquals(resultadoEsperado2, resultado2, "Debe ignorar mayúsculas");

        boolean resultadoEsperado3 = false;
        boolean resultado3 = stringUtils.sonAnagramas("casa", "cas");
        assertEquals(resultadoEsperado3, resultado3, "Si cambia longitud, no son anagramas");

        boolean resultadoEsperado4 = false;
        boolean resultado4 = stringUtils.sonAnagramas("hola", "halo!");
        assertEquals(resultadoEsperado4, resultado4, "Los símbolos cuentan como caracteres si aparecen en la cadena");
    }

    // -------------------------
    // 14) FRECUENCIA DE LETRAS
    // -------------------------
    // ✅ Debe realizar el alumno:
    // frecuenciaLetras(frase):
    // - devuelve un Map<Character,Integer> con las letras (a-z) y su conteo
    // - ignora mayúsculas/minúsculas
    // - ignora espacios y signos
    //
    // Ejemplo:
    // "En un lugar." -> e:1, n:2, u:2, l:1, g:1, a:1, r:1
    @Test
    @DisplayName("frecuenciaLetras(frase): cuenta letras a-z ignorando mayúsculas, espacios y signos")
    void frecuenciaLetras() {
        Map<Character, Integer> resultado = stringUtils.frecuenciaLetras("En un lugar.");
        assertNotNull(resultado, "Debe devolver un Map no null");

        int eEsperado = 1;
        int e = resultado.get('e');
        assertEquals(eEsperado, e, "La letra 'e' debe aparecer 1 vez");

        int nEsperado = 2;
        int n = resultado.get('n');
        assertEquals(nEsperado, n, "La letra 'n' debe aparecer 2 veces");

        int uEsperado = 2;
        int u = resultado.get('u');
        assertEquals(uEsperado, u, "La letra 'u' debe aparecer 2 veces");

        assertFalse(resultado.containsKey('.'), "No debe incluir signos");
        assertFalse(resultado.containsKey(' '), "No debe incluir espacios");
    }*/
}
