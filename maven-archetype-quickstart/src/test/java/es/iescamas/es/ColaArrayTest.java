package es.iescamas.es;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColaArrayTest {

    private ColaArray cola;

    @BeforeEach
    public void setUp() {
        cola = new ColaArray();
    }

    @Test
    public void testIsEmptyInicial() {
        boolean resultadoEsperado = true;
        boolean resultado = cola.isEmpty();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testEnqueueYFirst() {
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        Integer resultadoEsperado = 10;
        Integer resultado = cola.first();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testDequeue() {
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        Integer resultadoEsperado = 10;
        Integer resultado = cola.dequeue();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testDequeueReduceTamano() {
        cola.enqueue(1);
        cola.enqueue(2);

        cola.dequeue();

        Integer resultadoEsperado = 2;
        Integer resultado = cola.first();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testDequeueColaVacia() {
        Integer resultadoEsperado = null;
        Integer resultado = cola.dequeue();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testFirstColaVacia() {
        Integer resultadoEsperado = null;
        Integer resultado = cola.first();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testIsEmptyDespuesDeOperaciones() {
        cola.enqueue(5);
        cola.dequeue();

        boolean resultadoEsperado = true;
        boolean resultado = cola.isEmpty();

        assertEquals(resultadoEsperado, resultado);
    }
}
