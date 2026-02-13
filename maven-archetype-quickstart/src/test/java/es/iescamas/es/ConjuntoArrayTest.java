package es.iescamas.es;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConjuntoArrayTest {

	ConjuntoArray conj;
	
	@BeforeEach
	void setUp() throws Exception {
		conj = new ConjuntoArray();
	}


	@Test
	void testConstructor() {
		//el constructor debe crear una tabla sin nada y un contador de elementos a 0
		Integer contadorEsperado = 0;
		Integer contador = conj.numElementos;
		
		assertEquals(contadorEsperado, contador);
		
		Integer[] tablaEsperada = new Integer[0];
		Integer[] tabla = conj.tabla;
		
		assertArrayEquals(tablaEsperada, tabla);
	}

	@Test
	void testContains() {
		conj.add(7);
		conj.add(2);
		
		boolean resultEs = true;
		boolean result = conj.contains(2);
		
		assertEquals(resultEs, result);
		
		boolean resultEs2 = false;
		boolean result2 = conj.contains(3);
		
		assertEquals(resultEs2, result2);
	}
	
	@Test
	void testAdd() {
		Integer[] resultEs = {4,5};
		conj.add(4);
		conj.add(5);
		conj.add(5);
		Integer[] result = conj.tabla;
		
		assertArrayEquals(resultEs, result);
		
		boolean resutlEs2 = true;
		boolean result2 = conj.add(6);
		
		boolean resultEs3 = false;
		boolean result3 = conj.add(4);
		
		assertEquals(resutlEs2, result2);
		assertEquals(resultEs3, result3);
		
	}
}
