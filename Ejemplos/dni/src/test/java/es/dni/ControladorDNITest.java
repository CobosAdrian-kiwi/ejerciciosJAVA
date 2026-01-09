package es.dni;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@DisplayName("ControladorDNI - Ejemplos con etiquetas JUnit 5")
class ControladorDNITest {

	ControladorDNI controladorDNI;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Test - Antes de cada comprobacion");
		controladorDNI = new ControladorDNI();
	}

	@Test
	@DisplayName("Un DNI correcto con números de 8 dígitos y letra correspondiente")
	void testCalcularLetraValido() {
		//DNI válido
		String dniValido = "12345678Z";
		assertTrue(controladorDNI.esValido(dniValido));
	}
	
	@Test
	@DisplayName("DNI con la letra que no coincide con el número")
	void testCalcularLetraRangosExtremos() {
		//Letra incorrecta
		String dniInvalido = "12345678A";
		assertFalse(controladorDNI.esValido(dniInvalido));
	}
	@Test
	@DisplayName("DNI demasiado corto, formato inválido")
	void testEsValido_DniValido() {
		String dniInvalido = "1234567Z";
		assertFalse(controladorDNI.esValido(dniInvalido));
	}
	
	@Test
	@DisplayName("DNI demasiado corto (menos de 8 dígitos)")
	void testDniMenosDe8Digitos() {
		// Menos de 8 dígitos
		String dniCorto = "1234567Z";
		assertFalse(controladorDNI.esValido(dniCorto));
	}

	@Test
	@DisplayName("DNI demasiado largo (más de 8 dígitos)")
	void testDniMasDe8Digitos() {
		// Más de 8 dígitos (longitud incorrecta)
		String dniLargo = "123456789Z";
		assertFalse(controladorDNI.esValido(dniLargo));
	}

	@Test
	@DisplayName("DNI con caracteres no numéricos en el número")
	void testDniConCaracteresNoNumericos() {
		// Caracteres no numéricos en el número
		String dniNoNumerico = "abcdefghI";
		assertFalse(controladorDNI.esValido(dniNoNumerico));
	}

	@Test
	@DisplayName("Entrada nula para el DNI")
	void testDniNulo() {
		// Entrada nula
		assertFalse(controladorDNI.esValido(null));
	}

	@Test
	@DisplayName("DNI válido con el número mínimo posible")
	void testDniNumeroMinimoValido() {
		// Número mínimo válido
		String dniMinimo = "00000001R";
		assertTrue(controladorDNI.esValido(dniMinimo));
	}

	@Test
	@DisplayName("DNI válido con el número máximo posible")
	void testDniNumeroMaximoValido() {
		// Número máximo válido
		String dniMaximo = "99999999R";
		assertTrue(controladorDNI.esValido(dniMaximo));
	}

	/** Otros ejemplos */
	// Ejemplo de repetición 
	@RepeatedTest(5)
	@DisplayName("El DNI aleatorio generado siempre debe ser válido")
	@Tag("aleatorio")
	void generarAleatorio_siempreValido() {
	    String dni = controladorDNI.generarAleatorioDNI();
	    assertAll(
	            () -> assertNotNull(dni),
	            () -> assertEquals(9, dni.length()),
	            () -> assertTrue(controladorDNI.esValido(dni))
	    );
	}
	//Ejemplo de orueba de método privado
	@Test
	@DisplayName("Probar método private calcularLetra con reflexión (caso válido)")
	@Tag("privado")
	void calcularLetra_private_valido_reflection() throws Exception {
	    var m = ControladorDNI.class.getDeclaredMethod("calcularLetra", String.class);
	    m.setAccessible(true);

	    char letra = (char) m.invoke(controladorDNI, "12345678");
	    assertEquals('Z', letra);
	}
	// Ejemplo de Mensaje con excepciones
	@Test
	@DisplayName("Probar método private calcularLetra con reflexión (null -> excepción + mensaje)")
	@Tag("privado")
	void calcularLetra_private_null_excepcion_mensaje_reflection() throws Exception {
		//Configuración para habilitar a publico
		var m = ControladorDNI.class.getDeclaredMethod("calcularLetra", String.class);
	    m.setAccessible(true);
	    
	    //Ejecución
	    
	    var ex = assertThrows(java.lang.reflect.InvocationTargetException.class, () -> m.invoke(controladorDNI, (String) null));
	    
	    String mensajeEsperado = "El número del DNI no es válido.";
	    String mensajeRecibido =  ex.getCause().getMessage();

	   
	    assertInstanceOf(IllegalArgumentException.class, ex.getCause());
	    assertEquals(mensajeEsperado,mensajeRecibido);
	}

	// Etiquetas de Disable y método fail
	@Disabled("Ejemplo: activar cuando se quiera mostrar un test deshabilitado")
	@Test
	@DisplayName("Ejemplo de test deshabilitado")
	@Tag("demo")
	void ejemplo_disabled() {
	    fail("No debería ejecutarse");
	}
}
