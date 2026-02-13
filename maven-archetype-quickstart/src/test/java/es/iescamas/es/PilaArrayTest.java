package es.iescamas.es;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaArrayTest {

    private PilaArray pila;

    @BeforeEach
    void setUp() {
        pila = new PilaArray();
    }

    @Test
    void testPushYPeek() {
        pila.push(10);
        pila.push(20);

        Integer resultadoEsperado = 20;
        Integer resultado = pila.peek();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testPop() {
        pila.push(5);
        pila.push(15);

        Integer resultadoEsperado = 15;
        Integer resultado = pila.pop();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testPopPilaVacia() {
        Integer resultadoEsperado = null;
        Integer resultado = pila.pop();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testPeekPilaVacia() {
        Integer resultadoEsperado = null;
        Integer resultado = pila.peek();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testIsEmpty() {
        Boolean resultadoEsperado = true;
        Boolean resultado = pila.isEmpty();

        assertEquals(resultadoEsperado, resultado);

        pila.push(1);

        resultadoEsperado = false;
        resultado = pila.isEmpty();

        assertEquals(resultadoEsperado, resultado);
    }
}
