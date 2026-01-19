package es.texto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


@DisplayName("Texto (TDD) - Pruebas unitarias JUnit 5")
class TextoTest {

    private Texto texto;

    @BeforeEach
    void setUp() {
        // Texto vacío con capacidad 5 para la mayoría de casos
        texto = new Texto(5);
    }

    // -------------------------
    // CONSTRUCTORES
    // -------------------------

    @Test
    @DisplayName("Constructor(maxLongitud): crea texto vacío con longitud 0 y max configurado")
    void constructorSoloMax_creaTextoVacio() {
        String resultadoEsperado = "";
        String resultado = texto.getContenido();
        assertEquals(resultadoEsperado, resultado, "Debe iniciar con contenido vacío");

        int longitudEsperada = 0;
        int longitud = texto.longitud();
        assertEquals(longitudEsperada, longitud, "La longitud inicial debe ser 0");
    }

    @Test
    @DisplayName("Constructor(maxLongitud): lanza excepción si maxLongitud <= 0 (mensaje comprobado)")
    void constructorSoloMax_maxInvalido_lanzaExcepcion() {
        IllegalArgumentException ex0 = assertThrows(IllegalArgumentException.class, () -> new Texto(0),
                "Debe lanzar IllegalArgumentException si maxLongitud es 0");
        String mensajeEsperado0 = "maxLongitud debe ser > 0";
        String mensaje0 = ex0.getMessage();
        assertEquals(mensajeEsperado0, mensaje0, "Mensaje de error incorrecto para maxLongitud=0");

        IllegalArgumentException exNeg = assertThrows(IllegalArgumentException.class, () -> new Texto(-1),
                "Debe lanzar IllegalArgumentException si maxLongitud es negativo");
        String mensajeEsperadoNeg = "maxLongitud debe ser > 0";
        String mensajeNeg = exNeg.getMessage();
        assertEquals(mensajeEsperadoNeg, mensajeNeg, "Mensaje de error incorrecto para maxLongitud<0");
    }

    @Test
    @DisplayName("Constructor(contenidoInicial, maxLongitud): inicializa contenido y longitud correctamente")
    void constructorConContenido_inicializaCorrectamente() {
        Texto t = new Texto("Hola", 10);

        String resultadoEsperado = "Hola";
        String resultado = t.getContenido();
        assertEquals(resultadoEsperado, resultado, "Debe mantener el contenido inicial");

        int longitudEsperada = 4;
        int longitud = t.longitud();
        assertEquals(longitudEsperada, longitud, "La longitud debe coincidir con el contenido inicial");
    }

    @Test
    @DisplayName("Constructor(contenidoInicial, maxLongitud): lanza excepción si contenidoInicial es null")
    void constructorConContenido_null_lanzaExcepcion() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Texto(null, 5),
                "Debe lanzar IllegalArgumentException si contenidoInicial es null");

        String mensajeEsperado = "contenidoInicial no puede ser null";
        String mensaje = ex.getMessage();
        assertEquals(mensajeEsperado, mensaje, "Mensaje de error incorrecto para contenidoInicial null");
    }

    @Test
    @DisplayName("Constructor(contenidoInicial, maxLongitud): lanza excepción si contenidoInicial supera maxLongitud")
    void constructorConContenido_superaMax_lanzaExcepcion() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Texto("123456", 5),
                "Debe lanzar IllegalArgumentException si contenidoInicial supera maxLongitud");

        String mensajeEsperado = "contenidoInicial supera maxLongitud";
        String mensaje = ex.getMessage();
        assertEquals(mensajeEsperado, mensaje, "Mensaje de error incorrecto cuando el contenido inicial excede el máximo");
    }
    
    @Test
    @DisplayName("Constructor(contenidoInicial, maxLongitud): lanza excepción si maxLongitud <= 0 (mensaje comprobado)")
    void constructorConContenido_maxInvalido_lanzaExcepcion() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Texto("abc", 0),
                "Debe lanzar IllegalArgumentException si maxLongitud <= 0");

        String mensajeEsperado = "maxLongitud debe ser > 0";
        String mensaje = ex.getMessage();
        assertEquals(mensajeEsperado, mensaje, "Mensaje de error incorrecto para maxLongitud inválido");
    }
    
    // -------------------------
    // AÑADIR CARACTERES (final)
    // -------------------------

    @Test
    @DisplayName("anadirFinal(char): añade al final si hay espacio y devuelve true")
    void anadirFinal_char_conEspacio_devuelveTrue() {
        boolean resultadoEsperado = true;
        boolean resultado = texto.anadirFinal('A');
        assertEquals(resultadoEsperado, resultado, "Debe devolver true si se añade el carácter al final");

        String contenidoEsperado = "A";
        String contenido = texto.getContenido();
        assertEquals(contenidoEsperado, contenido, "El contenido debe actualizarse correctamente al añadir al final");

        int longitudEsperada = 1;
        int longitud = texto.longitud();
        assertEquals(longitudEsperada, longitud, "La longitud debe incrementarse tras añadir un carácter");
    }
    
    @Test
    @DisplayName("anadirFinal(char): si está lleno no modifica y devuelve false")
    void anadirFinal_char_sinEspacio_devuelveFalse() {
        Texto t = new Texto("12345", 5);

        boolean resultadoEsperado = false;
        boolean resultado = t.anadirFinal('X');
        assertEquals(resultadoEsperado, resultado, "Debe devolver false si no hay espacio para añadir al final");

        String contenidoEsperado = "12345";
        String contenido = t.getContenido();
        assertEquals(contenidoEsperado, contenido, "No debe modificar el contenido si no hay espacio");
    }
    
    // -------------------------
    // AÑADIR CARACTERES (inicio)
    // -------------------------

    @Test
    @DisplayName("anadirInicio(char): añade al inicio si hay espacio y devuelve true")
    void anadirInicio_char_conEspacio_devuelveTrue() {
        Texto t = new Texto("BC", 5);

        boolean resultadoEsperado = true;
        boolean resultado = t.anadirInicio('A');
        assertEquals(resultadoEsperado, resultado, "Debe devolver true si se añade el carácter al inicio");

        String contenidoEsperado = "ABC";
        String contenido = t.getContenido();
        assertEquals(contenidoEsperado, contenido, "Debe anteponer el carácter al contenido existente");
    }
    
    @Test
    @DisplayName("anadirInicio(char): si está lleno no modifica y devuelve false")
    void anadirInicio_char_sinEspacio_devuelveFalse() {
        Texto t = new Texto("12345", 5);

        boolean resultadoEsperado = false;
        boolean resultado = t.anadirInicio('X');
        assertEquals(resultadoEsperado, resultado, "Debe devolver false si no hay espacio para añadir al inicio");

        String contenidoEsperado = "12345";
        String contenido = t.getContenido();
        assertEquals(contenidoEsperado, contenido, "No debe modificar el contenido si no hay espacio");
    }

    // -------------------------
    // AÑADIR CADENA (final)
    // -------------------------
    
    @Test
    @DisplayName("anadirFinal(String): añade cadena completa si cabe y devuelve true")
    void anadirFinal_string_cabe_devuelveTrue() {
        Texto t = new Texto("Hi", 5);

        boolean resultadoEsperado = true;
        boolean resultado = t.anadirFinal("123");
        assertEquals(resultadoEsperado, resultado, "Debe devolver true si la cadena cabe al final");

        String contenidoEsperado = "Hi123";
        String contenido = t.getContenido();
        assertEquals(contenidoEsperado, contenido, "Debe concatenar la cadena al final correctamente");

        int longitudEsperada = 5;
        int longitud = t.longitud();
        assertEquals(longitudEsperada, longitud, "La longitud debe coincidir con el máximo tras añadir");
    }
    
    @Test
    @DisplayName("anadirFinal(String): si no cabe NO modifica y devuelve false")
    void anadirFinal_string_noCabe_noModifica_devuelveFalse() {
        Texto t = new Texto("Hi", 4);

        boolean resultadoEsperado = false;
        boolean resultado = t.anadirFinal("123");
        assertEquals(resultadoEsperado, resultado, "Debe devolver false si la cadena no cabe al final");

        String contenidoEsperado = "Hi";
        String contenido = t.getContenido();
        assertEquals(contenidoEsperado, contenido, "No debe modificar el contenido si la cadena no cabe");
    }
   
    @Test
    @DisplayName("anadirFinal(String): lanza excepción si la cadena es null (mensaje comprobado)")
    void anadirFinal_string_null_lanzaExcepcion() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> texto.anadirFinal((String) null),
                "Debe lanzar IllegalArgumentException si la cadena es null");

        String mensajeEsperado = "cadena no puede ser null";
        String mensaje = ex.getMessage();
        assertEquals(mensajeEsperado, mensaje, "Mensaje de error incorrecto para cadena null");
    }

    @Test
    @DisplayName("anadirFinal(String): añadir \"\" no cambia contenido y devuelve true")
    void anadirFinal_string_vacia_noCambia_devuelveTrue() {
        Texto t = new Texto("ABC", 5);

        boolean resultadoEsperado = true;
        boolean resultado = t.anadirFinal("");
        assertEquals(resultadoEsperado, resultado, "Añadir cadena vacía debe ser operación válida y devolver true");

        String contenidoEsperado = "ABC";
        String contenido = t.getContenido();
        assertEquals(contenidoEsperado, contenido, "El contenido no debe cambiar al añadir una cadena vacía");
    }
    
    // -------------------------
    // AÑADIR CADENA (inicio)
    // -------------------------

    @Test
    @DisplayName("anadirInicio(String): añade cadena completa al inicio si cabe y devuelve true")
    void anadirInicio_string_cabe_devuelveTrue() {
        Texto t = new Texto("lo", 5);

        boolean resultadoEsperado = true;
        boolean resultado = t.anadirInicio("Hel");
        assertEquals(resultadoEsperado, resultado, "Debe devolver true si la cadena cabe al inicio");

        String contenidoEsperado = "Hello";
        String contenido = t.getContenido();
        assertEquals(contenidoEsperado, contenido, "Debe anteponer la cadena al contenido correctamente");
    }

    @Test
    @DisplayName("anadirInicio(String): si no cabe NO modifica y devuelve false")
    void anadirInicio_string_noCabe_noModifica_devuelveFalse() {
        Texto t = new Texto("ABCD", 5);

        boolean resultadoEsperado = false;
        boolean resultado = t.anadirInicio("XY");
        assertEquals(resultadoEsperado, resultado, "Debe devolver false si la cadena no cabe al inicio");

        String contenidoEsperado = "ABCD";
        String contenido = t.getContenido();
        assertEquals(contenidoEsperado, contenido, "No debe modificar el contenido si la cadena no cabe");
    }

    @Test
    @DisplayName("anadirInicio(String): lanza excepción si la cadena es null (mensaje comprobado)")
    void anadirInicio_string_null_lanzaExcepcion() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> texto.anadirInicio((String) null),
                "Debe lanzar IllegalArgumentException si la cadena es null");

        String mensajeEsperado = "cadena no puede ser null";
        String mensaje = ex.getMessage();
        assertEquals(mensajeEsperado, mensaje, "Mensaje de error incorrecto para cadena null");
    }

    @Test
    @DisplayName("anadirInicio(String): añadir \"\" no cambia contenido y devuelve true")
    void anadirInicio_string_vacia_noCambia_devuelveTrue() {
        Texto t = new Texto("ABC", 5);

        boolean resultadoEsperado = true;
        boolean resultado = t.anadirInicio("");
        assertEquals(resultadoEsperado, resultado, "Añadir cadena vacía debe ser operación válida y devolver true");

        String contenidoEsperado = "ABC";
        String contenido = t.getContenido();
        assertEquals(contenidoEsperado, contenido, "El contenido no debe cambiar al añadir una cadena vacía");
    }
    
    // -------------------------
    // CONTEO DE VOCALES
    // -------------------------

    @Test
    @DisplayName("contarVocales(): 0 si el texto está vacío")
    void contarVocales_textoVacio_esCero() {
        int resultadoEsperado = 0;
        int resultado = texto.contarVocales();
        assertEquals(resultadoEsperado, resultado, "El número de vocales en un texto vacío debe ser 0");
    }
    
    @Test
    @DisplayName("contarVocales(): cuenta vocales mayúsculas y minúsculas (AEIOUaeiou)")
    void contarVocales_cuentaMayusMinus() {
        Texto t = new Texto("aE_iO-uX", 20);

        int resultadoEsperado = 5;
        int resultado = t.contarVocales();
        assertEquals(resultadoEsperado, resultado, "Debe contar vocales ignorando mayúsculas/minúsculas y símbolos");
    }
    
    @Test
    @DisplayName("contarVocales(): no cuenta letras no vocales ni signos")
    void contarVocales_noCuentaConsonantesNiSignos() {
        Texto t = new Texto("bcdfg!?.", 20);

        int resultadoEsperado = 0;
        int resultado = t.contarVocales();
        assertEquals(resultadoEsperado, resultado, "No debe contar consonantes ni signos como vocales");
    }
    
    // -------------------------
    // CONSISTENCIA DE MÉTODOS
    // -------------------------

    @Test
    @DisplayName("getContenido() y longitud(): coherentes tras varias operaciones")
    void coherenciaContenidoLongitud() {
        Texto t = new Texto(6);

        assertTrue( t.anadirFinal('A'), "Debe añadir 'A' al final");
        assertTrue( t.anadirInicio("bc"), "Debe añadir \"bc\" al inicio");
        assertTrue( t.anadirFinal("12"), "Debe añadir \"12\" al final");
        assertTrue( t.anadirInicio('Z'), "Debe añadir 'Z' al inicio");

        String contenidoEsperado = "ZbcA12";
        String contenido = t.getContenido();
        assertEquals(contenidoEsperado, contenido, "Contenido final incorrecto tras varias operaciones");

        int longitudEsperada = 6;
        int longitud = t.longitud();
        assertEquals(longitudEsperada, longitud, "La longitud debe ser coherente con el contenido final");

        boolean resultadoEsperado = false;
        boolean resultado = t.anadirFinal('X');
        assertEquals(resultadoEsperado, resultado, "Debe devolver false al intentar añadir con el texto lleno");

        String contenidoEsperadoTrasFallo = "ZbcA12";
        String contenidoTrasFallo = t.getContenido();
        assertEquals(contenidoEsperadoTrasFallo, contenidoTrasFallo, "No debe cambiar el contenido si no hay espacio");
    }

    @Test
    @DisplayName("toString(): devuelve el contenido")
    void toString_devuelveContenido() {
        Texto t = new Texto("Hola", 10);
        assertEquals("Hola", t.toString(), "toString() debería devolver el contenido");
    }
    

}
