package es.tabla;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ArrayApp (TDD) - Pruebas unitarias JUnit 5")
class ArrayAppTest {

    private ArrayApp app;

    @BeforeEach
    void setUp() throws Exception {
        app = new ArrayApp();
    }

    // -------------------------
    // 1) invertirArray
    // -------------------------
    // ✅ Debe hacer el alumno:
    // int[] invertirArray(int[] t): devuelve un NUEVO array con los elementos en orden inverso.
    //
    // Ejemplo:
    // [1,2,3] -> [3,2,1]
    @Test
    @DisplayName("invertirArray: invierte el orden y NO modifica el array original")
    void invertirArray_basico() {
        int[] original = { 1, 2, 3 };
        int[] copiaOriginal = Arrays.copyOf(original, original.length);

        int[] esperado = { 3, 2, 1 };
        int[] resultado = app.invertirArray(original);

        assertArrayEquals(esperado, resultado, "Debe devolver el array invertido");
        assertArrayEquals(copiaOriginal, original, "No debe modificar el array original");
    }
    
    // -------------------------
    // 2) mediaPositivos / mediaNegativos / cuentaCeros
    // -------------------------
    // ✅ Debe hacer el alumno:
    // double mediaPositivos(int[] t): media de positivos (si no hay positivos -> 0)
    // double mediaNegativos(int[] t): media de negativos (si no hay negativos -> 0)
    // int cuentaCeros(int[] t): cuenta cuántos ceros hay
    @Test
    @DisplayName("medias y ceros: calcula medias de positivos/negativos y cuenta ceros")
    void mediasYCeros() {
        int[] t = { 1, -2, 0, 5, -8, 0 };

        double mediaPosEsperada = (1 + 5) / 2.0;
        double mediaPos = app.mediaPositivos(t);
        assertEquals(mediaPosEsperada, mediaPos, 1e-9, "Media de positivos incorrecta");

        double mediaNegEsperada = (-2 + -8) / 2.0;
        double mediaNeg = app.mediaNegativos(t);
        assertEquals(mediaNegEsperada, mediaNeg, 1e-9, "Media de negativos incorrecta");

        int cerosEsperados = 2;
        int ceros = app.cuentaCeros(t);
        assertEquals(cerosEsperados, ceros, "Conteo de ceros incorrecto");
    }

    @Test
    @DisplayName("mediaPositivos: si no hay positivos devuelve 0")
    void mediaPositivos_sinPositivos() {
        int[] t = { -1, -2, 0 };
        assertEquals(0.0, app.mediaPositivos(t), 1e-9);
    }

    @Test
    @DisplayName("mediaNegativos: si no hay negativos devuelve 0")
    void mediaNegativos_sinNegativos() {
        int[] t = { 1, 2, 0 };
        assertEquals(0.0, app.mediaNegativos(t), 1e-9);
    }

    // -------------------------
    // 3) borrarElemento (eliminar por índice)
    // -------------------------
    // ✅ Debe hacer el alumno:
    // int[] borrarElemento(int[] t, int pos):
    // - si pos es inválida -> lanza IllegalArgumentException con mensaje exacto
    // - devuelve un NUEVO array de tamaño t.length-1 sin el elemento en pos
    //
    // Ejemplo:
    // [10,20,30], pos=1 -> [10,30]
    @Test
    @DisplayName("borrarElemento: elimina por índice y devuelve nuevo array")
    void borrarElemento_basico() {
        int[] t = { 10, 20, 30 };

        int[] esperado = { 10, 30 };
        int[] resultado = app.borrarElemento(t, 1);

        assertArrayEquals(esperado, resultado, "Debe eliminar el elemento en la posición indicada");
        assertArrayEquals(new int[]{10,20,30}, t, "No debe modificar el array original");
    }

    @Test
    @DisplayName("borrarElemento: pos inválida lanza excepción (mensaje comprobado)")
    void borrarElemento_posInvalida_lanzaExcepcion() {
        int[] t = { 10, 20, 30 };

        IllegalArgumentException exNeg = assertThrows(IllegalArgumentException.class,
                () -> app.borrarElemento(t, -1));
        assertEquals("posicion invalida", exNeg.getMessage());

        IllegalArgumentException exFuera = assertThrows(IllegalArgumentException.class,
                () -> app.borrarElemento(t, 3));
        assertEquals("posicion invalida", exFuera.getMessage());
    }

    // -------------------------
    // 4) sinRepetidos
    // -------------------------
    // ✅ Debe hacer el alumno:
    // int[] sinRepetidos(int[] t): devuelve un NUEVO array manteniendo el orden de primera aparición.
    //
    // Ejemplo:
    // [3,3,2,3,2,1] -> [3,2,1]
    @Test
    @DisplayName("sinRepetidos: elimina duplicados manteniendo orden")
    void sinRepetidos_basico() {
        int[] t = { 3, 3, 2, 3, 2, 1 };
        int[] esperado = { 3, 2, 1 };
        int[] resultado = app.sinRepetidos(t);
        assertArrayEquals(esperado, resultado);
    }

    // -------------------------
    // 5) fusionOrdenada
    // -------------------------
    // ✅ Debe hacer el alumno:
    // int[] fusionOrdenada(int[] a, int[] b):
    // - a y b YA vienen ordenados ascendente
    // - fusiona SIN volver a ordenar, en O(n)
    //
    // Ejemplo:
    // [1,4,7] + [2,3,9] -> [1,2,3,4,7,9]
    @Test
    @DisplayName("fusionOrdenada: fusiona dos arrays ordenados sin reordenar")
    void fusionOrdenada_basico() {
        int[] a = { 1, 4, 7 };
        int[] b = { 2, 3, 9 };

        int[] esperado = { 1, 2, 3, 4, 7, 9 };
        int[] resultado = app.fusionOrdenada(a, b);

        assertArrayEquals(esperado, resultado);
    }

    // -------------------------
    // 6) separarParesImpares
    // -------------------------
    // ✅ Debe hacer el alumno:
    // int[][] separarParesImpares(int[] t):
    // - devuelve un array 2D: res[0] = pares, res[1] = impares
    //
    // Ejemplo:
    // [1,2,3,4] -> pares [2,4], impares [1,3]
    @Test
    @DisplayName("separarParesImpares: separa en dos arrays (pares e impares)")
    void separarParesImpares_basico() {
        int[] t = { 1, 2, 3, 4, 5 };

        int[][] res = app.separarParesImpares(t);

        assertArrayEquals(new int[] { 2, 4 }, res[0], "Pares incorrectos");
        assertArrayEquals(new int[] { 1, 3, 5 }, res[1], "Impares incorrectos");
    }
    /**
    // -------------------------
    // 7) esMatrizMagica (4x4)
    // -------------------------
    // ✅ Debe hacer el alumno:
    // boolean esMatrizMagica(int[][] m):
    // - true si todas las filas suman lo mismo y todas las columnas suman lo mismo
    // - asume tamaño 4x4 (si no lo es -> IllegalArgumentException, mensaje exacto)
    @Test
    @DisplayName("esMatrizMagica: detecta matriz mágica 4x4")
    void esMatrizMagica_true() {
        int[][] m = {
                { 1, 1, 1, 1 },
                { 2, 0, 1, 1 },
                { 0, 2, 1, 1 },
                { 1, 1, 1, 1 }
        };
        assertTrue(app.esMatrizMagica(m));
    }

    @Test
    @DisplayName("esMatrizMagica: false si alguna fila/columna no coincide")
    void esMatrizMagica_false() {
        int[][] m = {
                { 1, 1, 1, 1 },
                { 2, 0, 1, 2 }, // rompe suma
                { 0, 2, 1, 1 },
                { 1, 1, 1, 1 }
        };
        assertFalse(app.esMatrizMagica(m));
    }

    @Test
    @DisplayName("esMatrizMagica: tamaño distinto de 4x4 lanza excepción (mensaje comprobado)")
    void esMatrizMagica_tamanoInvalido() {
        int[][] m = { { 1, 2 }, { 3, 4 } };

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> app.esMatrizMagica(m));

        assertEquals("matriz debe ser 4x4", ex.getMessage());
    }

    // -------------------------
    // 8) rellenaSumaIndices (5x5)
    // -------------------------
    // ✅ Debe hacer el alumno:
    // int[][] rellenaSumaIndices():
    // - crea una matriz 5x5 con m[f][c] = f + c
    @Test
    @DisplayName("rellenaSumaIndices: genera matriz 5x5 con m[f][c] = f + c")
    void rellenaSumaIndices_basico() {
        int[][] m = app.rellenaSumaIndices();

        assertEquals(5, m.length, "Debe tener 5 filas");
        assertEquals(5, m[0].length, "Debe tener 5 columnas");

        assertEquals(0, m[0][0]);
        assertEquals(1, m[0][1]);
        assertEquals(4, m[2][2]);
        assertEquals(8, m[4][4]);
    }

    // -------------------------
    // 9) maximo (sobrecarga para array)
    // -------------------------
    // ✅ Debe hacer el alumno:
    // int maximo(int[] t): devuelve el máximo del array
    // - si t es null -> IllegalArgumentException ("array no puede ser null")
    // - si t está vacío -> IllegalArgumentException ("array vacio")
    @Test
    @DisplayName("maximo(array): devuelve el mayor elemento")
    void maximo_array_basico() {
        int[] t = { -5, 10, 3, 10, 2 };
        assertEquals(10, app.maximo(t));
    }

    @Test
    @DisplayName("maximo(array): null lanza excepción (mensaje comprobado)")
    void maximo_array_null() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> app.maximo(null));
        assertEquals("array no puede ser null", ex.getMessage());
    }

    @Test
    @DisplayName("maximo(array): vacío lanza excepción (mensaje comprobado)")
    void maximo_array_vacio() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> app.maximo(new int[0]));
        assertEquals("array vacio", ex.getMessage());
    }

    // -------------------------
    // 10) aciertosPrimitiva
    // -------------------------
    // ✅ Debe hacer el alumno:
    // int aciertosPrimitiva(int[] apuesta, int[] ganadora):
    // - cuenta cuántos números de apuesta aparecen en ganadora
    // - no cuenta duplicados dos veces (si apuesta tiene repetidos, solo cuenta apariciones reales)
    @Test
    @DisplayName("aciertosPrimitiva: cuenta aciertos entre apuesta y ganadora")
    void aciertosPrimitiva_basico() {
        int[] apuesta = { 1, 2, 3, 4, 5, 6 };
        int[] ganadora = { 6, 5, 4, 10, 11, 12 };

        int esperado = 3; // 4,5,6
        int resultado = app.aciertosPrimitiva(apuesta, ganadora);

        assertEquals(esperado, resultado);
    }

    @Test
    @DisplayName("aciertosPrimitiva: si apuesta tiene repetidos, no cuenta doble")
    void aciertosPrimitiva_sinDobles() {
        int[] apuesta = { 1, 1, 1, 2, 2, 3 };
        int[] ganadora = { 1, 9, 8, 7, 6, 5 };

        int esperado = 1;
        int resultado = app.aciertosPrimitiva(apuesta, ganadora);

        assertEquals(esperado, resultado);
    }*/
}
