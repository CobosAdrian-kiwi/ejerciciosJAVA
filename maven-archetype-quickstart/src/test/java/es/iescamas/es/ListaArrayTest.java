package es.iescamas.es;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaArrayTest {

	ListaArray lista;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		lista = new ListaArray();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testConstructor() {
		//el constructor debe crear una tabla sin nada y un contador de elementos a 0
		Integer contadorEsperado = 0;
		Integer contador = lista.numElementos;
		
		assertEquals(contadorEsperado, contador);
		
		Integer[] tablaEsperada = new Integer[0];
		Integer[] tabla = lista.tabla;
		
		assertArrayEquals(tablaEsperada, tabla);
	}
	
	@Test
	void testSize() {
		//Deberia de devolver 0 ya que la tabla no ha añadido nada
		Integer resultadoEsperado = 0;
		Integer resultado = lista.size();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testAddFinal() {
		//Deberia añadir 1 al final de la tabla
		Integer[] tablaEsperada = {1};
		lista.addFinal(1);
		Integer[] tabla = lista.tabla;
		
		assertArrayEquals(tablaEsperada, tabla);
		
		//Deberia añadir 2 al final
		Integer[] tablaEsperada2 = {1,2};
		lista.addFinal(2);
		Integer[] tabla2 = lista.tabla;
		
		assertArrayEquals(tablaEsperada2, tabla2);
	}

}
