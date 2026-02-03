package es.clases;

import es.clases.StudentToolkit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("StudentToolkit (TDD) - Unidad 7 Clases - Pruebas unitarias JUnit 5")
class StudentToolkitTest {

    private StudentToolkit toolkit;

    @BeforeEach
    void setUp() {
        toolkit = new StudentToolkit();
    }


    // =========================================================
    // 1) ESTADO INICIAL (U1 - conceptos básicos)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // El objeto tiene un contador interno (int) que empieza en 0.
    //
    // Ejemplo:
    // new StudentToolkit().getContador() -> 0
    @Test
    @DisplayName("getContador(): el contador interno empieza en 0")
    void getContador_inicial() {
        int esperado = 0;
        int real = toolkit.getContador();
        assertEquals(esperado, real, "El contador interno debe empezar en 0");
    }

    // =========================================================
    // 2) INCREMENTAR (U1)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // incrementar(): suma 1 al contador interno.
    //
    // Ejemplo:
    // 0 -> incrementar() -> 1
    @Test
    @DisplayName("incrementar(): suma 1 al contador interno")
    void incrementar_basico() {
        toolkit.incrementar();
        assertEquals(1, toolkit.getContador(), "Tras incrementar una vez, debe valer 1");
    }

    // =========================================================
    // 3) DECREMENTAR (U1)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // decrementar(): resta 1 al contador interno.
    @Test
    @DisplayName("decrementar(): resta 1 al contador interno")
    void decrementar_basico() {
        toolkit.decrementar();
        assertEquals(-1, toolkit.getContador(), "Tras decrementar una vez, debe valer -1");
    }

    // =========================================================
    // 4) RESET (U1)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // reset(): pone el contador interno a 0.
    @Test
    @DisplayName("reset(): devuelve el contador interno a 0")
    void reset_basico() {
        toolkit.incrementar();
        toolkit.incrementar();
        toolkit.reset();
        assertEquals(0, toolkit.getContador(), "Reset debe dejar el contador a 0");
    }

    // =========================================================
    // 5) ES CERO (U2 - condicionales)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // esCero(): true si contador == 0, false en caso contrario.
    @Test
    @DisplayName("esCero(): true si contador==0")
    void esCero() {
        assertTrue(toolkit.esCero(), "Al inicio, contador es 0, por tanto esCero() debe ser true");

        toolkit.incrementar();
        assertFalse(toolkit.esCero(), "Si contador no es 0, esCero() debe ser false");
    }

    // =========================================================
    // 6) ES POSITIVO (U2)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // esPositivo(): true si contador > 0.
    @Test
    @DisplayName("esPositivo(): true si contador>0, false si no")
    void esPositivo() {
        assertFalse(toolkit.esPositivo(), "Al inicio (0), no es positivo");

        toolkit.incrementar();
        assertTrue(toolkit.esPositivo(), "Tras incrementar, debe ser positivo");
    }

    // =========================================================
    // 7) AÑADIR SI POSITIVO (U2)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // addSiPositivo(n): si n>0, suma n al contador; si n<=0, no hace nada.
    //
    // Ejemplo:
    // contador=0, addSiPositivo(3) -> contador=3
    // addSiPositivo(0) -> no cambia
    @Test
    @DisplayName("addSiPositivo(n): suma n si n>0; si n<=0 no cambia")
    void addSiPositivo() {
        toolkit.addSiPositivo(3);
        assertEquals(3, toolkit.getContador(), "Debe sumar 3");

        toolkit.addSiPositivo(0);
        assertEquals(3, toolkit.getContador(), "Con 0 no debe cambiar");

        toolkit.addSiPositivo(-5);
        assertEquals(3, toolkit.getContador(), "Con negativo no debe cambiar");
    }

    // =========================================================
    // 8) INCREMENTAR N VECES (U3 - bucles)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // incrementarNVeces(n): incrementa el contador n veces.
    // Si n<=0, no hace nada.
    @Test
    @DisplayName("incrementarNVeces(n): incrementa n veces; si n<=0 no cambia")
    void incrementarNVeces() {
        toolkit.incrementarNVeces(3);
        assertEquals(3, toolkit.getContador(), "Debe incrementar 3 veces");

        toolkit.incrementarNVeces(0);
        assertEquals(3, toolkit.getContador(), "Con 0 no debe cambiar");

        toolkit.incrementarNVeces(-2);
        assertEquals(3, toolkit.getContador(), "Con negativo no debe cambiar");
    }

    // =========================================================
    // 9) SUMA DE 1..N (U3 + U4)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // sumaHasta(n): devuelve 1+2+...+n.
    // Si n<=0, devuelve 0.
    //
    // Ejemplo:
    // sumaHasta(4) -> 10
    @Test
    @DisplayName("sumaHasta(n): 1+2+...+n; si n<=0 devuelve 0")
    void sumaHasta() {
        assertEquals(10, toolkit.sumaHasta(4), "1+2+3+4=10");
        assertEquals(0, toolkit.sumaHasta(0), "Con 0 devuelve 0");
        assertEquals(0, toolkit.sumaHasta(-3), "Con negativo devuelve 0");
    }

    // =========================================================
    // 10) PAR O IMPAR (U2 + U4)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // esPar(n): true si n es par.
    @Test
    @DisplayName("esPar(n): true si n es par")
    void esPar() {
        assertTrue(toolkit.esPar(4), "4 es par");
        assertFalse(toolkit.esPar(7), "7 es impar");
        assertTrue(toolkit.esPar(0), "0 es par");
    }

    // =========================================================
    // 11) MEDIA DE ARRAY (U5 - tablas)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // media(v): devuelve la media de un array de int.
    // Si v es null o vacío -> IllegalArgumentException.
    //
    // Ejemplo:
    // [2,4,6] -> 4.0
    @Test
    @DisplayName("media(v): calcula media; null o vacío lanza IllegalArgumentException")
    void media_array() {
        assertEquals(4.0, toolkit.media(new int[]{2,4,6}), "La media debe ser 4.0");

        assertThrows(IllegalArgumentException.class, () -> toolkit.media(null),
                "Si el array es null debe lanzar IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> toolkit.media(new int[]{}),
                "Si el array está vacío debe lanzar IllegalArgumentException");
    }

    // =========================================================
    // 12) MÁXIMO DE ARRAY (U5)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // maximo(v): devuelve el máximo.
    // null o vacío -> IllegalArgumentException.
    @Test
    @DisplayName("maximo(v): devuelve el máximo; null o vacío lanza IllegalArgumentException")
    void maximo_array() {
        assertEquals(9, toolkit.maximo(new int[]{-1, 9, 3}), "El máximo debe ser 9");

        assertThrows(IllegalArgumentException.class, () -> toolkit.maximo(null),
                "Si el array es null debe lanzar IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> toolkit.maximo(new int[]{}),
                "Si el array está vacío debe lanzar IllegalArgumentException");
    }
  
    // =========================================================
    // 13) INVERTIR ARRAY SIN MUTAR ORIGINAL (U5)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // invertirArray(v): devuelve un NUEVO array invertido (no muta el original).
    @Test
    @DisplayName("invertirArray(v): devuelve nuevo array invertido sin modificar el original")
    void invertirArray_noMuta() {
        int[] original = {1,2,3,4};
        int[] invertido = toolkit.invertirArray(original);

        assertArrayEquals(new int[]{4,3,2,1}, invertido, "Debe devolver el array invertido");
        assertArrayEquals(new int[]{1,2,3,4}, original, "No debe modificar el array original");
    }

    // =========================================================
    // 14) SIN REPETIDOS (U5)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // sinRepetidos(v): devuelve un nuevo array con la primera aparición de cada número, manteniendo orden.
    @Test
    @DisplayName("sinRepetidos(v): elimina duplicados manteniendo el orden de primera aparición")
    void sinRepetidos() {
        int[] resultado = toolkit.sinRepetidos(new int[]{2,2,1,2,3,3});
        assertArrayEquals(new int[]{2,1,3}, resultado, "Debe devolver [2,1,3]");
    }
    /**
    // =========================================================
    // 15) BORRAR ELEMENTO EN POSICIÓN (U5 + validación)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // borrarEn(v,pos): devuelve un nuevo array sin el elemento en pos.
    // Si pos inválida -> IllegalArgumentException("posicion invalida")
    @Test
    @DisplayName("borrarEn(v,pos): elimina elemento; pos inválida lanza IllegalArgumentException('posicion invalida')")
    void borrarEn_validacion() {
        int[] resultado = toolkit.borrarEn(new int[]{10,20,30}, 1);
        assertArrayEquals(new int[]{10,30}, resultado, "Debe eliminar el elemento en posición 1");

        IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class,
                () -> toolkit.borrarEn(new int[]{10,20,30}, -1));
        assertEquals("posicion invalida", ex1.getMessage(), "Mensaje exacto requerido");

        IllegalArgumentException ex2 = assertThrows(IllegalArgumentException.class,
                () -> toolkit.borrarEn(new int[]{10,20,30}, 3));
        assertEquals("posicion invalida", ex2.getMessage(), "Mensaje exacto requerido");
    }

    // =========================================================
    // 16) CONTAR ESPACIOS (U6 - cadenas)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // contarEspacios(frase): cuenta caracteres ' '.
    @Test
    @DisplayName("contarEspacios(frase): cuenta espacios ' ' (incluye consecutivos)")
    void contarEspacios() {
        assertEquals(0, toolkit.contarEspacios("Hola"), "Sin espacios -> 0");
        assertEquals(1, toolkit.contarEspacios("Hola mundo"), "Debe contar 1 espacio");
        assertEquals(3, toolkit.contarEspacios("A  B C"), "Debe contar espacios consecutivos");
    }

    // =========================================================
    // 17) INVERTIR CADENA (U6)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // invertirTexto(texto): devuelve texto invertido.
    @Test
    @DisplayName("invertirTexto(texto): devuelve la cadena invertida")
    void invertirTexto() {
        assertEquals("aloH", toolkit.invertirTexto("Hola"), "Debe invertir una palabra");
        assertEquals("odnum aloH", toolkit.invertirTexto("Hola mundo"), "Debe invertir con espacios");
        assertEquals("", toolkit.invertirTexto(""), "Vacío -> vacío");
    }

    // =========================================================
    // 18) ES PALÍNDROMA (U6 + normalización)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // esPalindroma(texto):
    // - ignora espacios
    // - ignora mayúsculas
    // - cadena vacía: true
    @Test
    @DisplayName("esPalindroma(texto): ignora espacios y mayúsculas; vacío es palíndroma")
    void esPalindroma() {
        assertTrue(toolkit.esPalindroma("Anita lava la tina"), "Debe detectar palíndromo ignorando espacios");
        assertTrue(toolkit.esPalindroma("Dabale arroz a la zorra el abad"), "Debe detectar palíndromo largo");
        assertFalse(toolkit.esPalindroma("Hola mundo"), "No es palíndroma");
        assertTrue(toolkit.esPalindroma(""), "Por decisión: vacío es palíndroma");
    }

    // =========================================================
    // 19) CONTAR PALABRA NO SOLAPADA (U6 más exigente)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // contarPalabra(frase,palabra):
    // - ignora mayúsculas
    // - no solapamiento ("aaaa" con "aa" -> 2)
    @Test
    @DisplayName("contarPalabra(frase,palabra): ignora mayúsculas y no cuenta solapamientos")
    void contarPalabra_noSolapada() {
        assertEquals(3, toolkit.contarPalabra("a a a", "a"), "Debe contar apariciones simples");
        assertEquals(2, toolkit.contarPalabra("aaaa", "aa"), "No debe contar solapadas");
        assertEquals(3, toolkit.contarPalabra("Java java JAVa", "jAvA"), "Ignora mayúsculas");
        assertEquals(0, toolkit.contarPalabra("Hola mundo", "adios"), "Si no aparece -> 0");
    }

    // =========================================================
    // 20) INTEGRACIÓN FINAL: INFORME DE ALUMNO (U1-U6)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // generarInforme(nombre, notas, comentario):
    // - nombre se devuelve tal cual
    // - media de notas con 2 decimales
    // - comentario se devuelve invertido
    // - si notas es null o vacío -> IllegalArgumentException("notas invalidas")
    //
    // Formato exacto:
    // "Alumno: <nombre> | Media: <media> | ComentarioInvertido: <comentarioInvertido>"
    //
    // Ejemplo:
    // generarInforme("Ana",[7,9],"Hola") ->
    // "Alumno: Ana | Media: 8.00 | ComentarioInvertido: aloH"
    @Test
    @DisplayName("generarInforme(nombre,notas,comentario): integra arrays + strings + validación con formato exacto")
    void generarInforme_integracionFinal() {
        String esperado = "Alumno: Ana | Media: 8.00 | ComentarioInvertido: aloH";
        String real = toolkit.generarInforme("Ana", new int[]{7,9}, "Hola");
        assertEquals(esperado, real, "El informe debe tener el formato exacto y cálculos correctos");

        IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class,
                () -> toolkit.generarInforme("Ana", null, "Hola"));
        assertEquals("notas invalidas", ex1.getMessage(), "Mensaje exacto requerido");

        IllegalArgumentException ex2 = assertThrows(IllegalArgumentException.class,
                () -> toolkit.generarInforme("Ana", new int[]{}, "Hola"));
        assertEquals("notas invalidas", ex2.getMessage(), "Mensaje exacto requerido");
    }
        // =========================================================
    // 21) ATRIBUTO + GETTER/SETTER (Tema 7: miembros del objeto)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // - setNombre(String nombre)
    // - getNombre()
    //
    // Objetivo: ver atributos privados + métodos públicos.
    @Test
    @DisplayName("setNombre/getNombre: guarda y devuelve el nombre")
    void t21_nombre_getterSetter() {
        toolkit.setNombre("Ana");
        assertEquals("Ana", toolkit.getNombre(), "Debe devolver el nombre asignado");
    }

    // =========================================================
    // 22) this (Tema 7: referencia this para desambiguar)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // setApellidos(String apellidos) debe asignar correctamente el atributo del objeto
    // usando this.apellidos = apellidos; (hay parámetro con mismo nombre).
    @Test
    @DisplayName("this: setApellidos(apellidos) asigna bien cuando el parámetro oculta al atributo")
    void t22_this_desambiguacion_apellidos() {
        toolkit.setApellidos("Pérez");
        assertEquals("Pérez", toolkit.getApellidos(), "Debe asignar el atributo del objeto (this.apellidos)");
    }

    // =========================================================
    // 23) VALIDACIÓN EN SETTER (Tema 7: ejemplo Persona.setEdad)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // setEdad(int edad):
    // - si edad >= 0, actualiza
    // - si edad < 0, NO cambia
    @Test
    @DisplayName("setEdad: si edad<0 no cambia; si edad>=0 actualiza")
    void t23_setEdad_validacion() {
        toolkit.setEdad(20);
        assertEquals(20, toolkit.getEdad(), "Debe actualizar a 20");

        toolkit.setEdad(-1);
        assertEquals(20, toolkit.getEdad(), "Con edad negativa NO debe cambiar el valor anterior");
    }

    // =========================================================
    // 24) MÉTODO DE OBJETO CONDICIONAL (Tema 7: métodos y estado)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // esMayorDeEdad(): true si edad >= 18
    @Test
    @DisplayName("esMayorDeEdad(): true si edad>=18")
    void t24_esMayorDeEdad() {
        toolkit.setEdad(17);
        assertFalse(toolkit.esMayorDeEdad(), "Con 17 no es mayor de edad");

        toolkit.setEdad(18);
        assertTrue(toolkit.esMayorDeEdad(), "Con 18 sí es mayor de edad");
    }

    // =========================================================
    // 25) RELACIÓN ENTRE CLASES (Tema 7: atributo de otra clase)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // - setDomicilio(Direccion d)
    // - getDomicilio()
    //
    // (Usa el ejemplo: private Direccion domicilio;)
    @Test
    @DisplayName("relación: setDomicilio/getDomicilio guardan referencia a Direccion")
    void t25_relacion_domicilio() {
        Direccion d = new Direccion("Calle Real", 12);
        toolkit.setDomicilio(d);

        assertSame(d, toolkit.getDomicilio(), "Debe guardar la referencia (tipos por referencia)");
        assertEquals("Calle Real", toolkit.getDomicilio().getCalle(), "Debe conservar calle");
        assertEquals(12, toolkit.getDomicilio().getNumero(), "Debe conservar número");
    }

    // =========================================================
    // 26) SOBRECARGA DE CONSTRUCTORES (Tema 7: constructores sobrecargados)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // Constructor completo:
    // StudentToolkit(String nombre, String apellidos, int edad, Direccion domicilio, String profesion)
    @Test
    @DisplayName("constructor completo: inicializa todos los atributos (nombre, apellidos, edad, domicilio, profesion)")
    void t26_constructorCompleto_inicializaTodo() {
        Direccion d = new Direccion("Av. Roma", 3);

        StudentToolkit t = new StudentToolkit("Ana", "Pérez", 20, d, "Estudiante");

        assertAll(
            () -> assertEquals("Ana", t.getNombre(), "Nombre mal inicializado"),
            () -> assertEquals("Pérez", t.getApellidos(), "Apellidos mal inicializados"),
            () -> assertEquals(20, t.getEdad(), "Edad mal inicializada"),
            () -> assertSame(d, t.getDomicilio(), "Domicilio debe ser la misma referencia"),
            () -> assertEquals("Estudiante", t.getProfesion(), "Profesión mal inicializada")
        );
    }

    // =========================================================
    // 27) this() EN CONSTRUCTOR (Tema 7: llamada a this())
    // =========================================================
    // ✅ Debe realizar el alumno:
    // Constructor sin profesión:
    // StudentToolkit(String nombre, String apellidos, int edad, Direccion domicilio)
    // debe llamar al constructor completo usando this(nombre, apellidos, edad, domicilio, "")
    @Test
    @DisplayName("constructor sin profesión: usa this(...) y deja profesion como cadena vacía")
    void t27_constructorSinProfesion_usaThis() {
        Direccion d = new Direccion("Av. Roma", 3);

        StudentToolkit t = new StudentToolkit("Ana", "Pérez", 20, d);

        assertAll(
            () -> assertEquals("Ana", t.getNombre(), "Nombre mal inicializado"),
            () -> assertEquals("Pérez", t.getApellidos(), "Apellidos mal inicializados"),
            () -> assertEquals(20, t.getEdad(), "Edad mal inicializada"),
            () -> assertSame(d, t.getDomicilio(), "Domicilio debe ser la misma referencia"),
            () -> assertEquals("", t.getProfesion(), "La profesión debe ser \"\" por defecto")
        );
    }

    // =========================================================
    // 28) STATIC (Tema 7: miembros de clase) + TEST ESTABLE
    // =========================================================
    // ✅ Debe realizar el alumno:
    // - static int instanciasCreadas
    // - static int getInstanciasCreadas()
    // - static void resetInstanciasCreadas()  (para que los tests sean repetibles)
    //
    // Nota: Esto es "pragmático para testing".
    @Test
    @DisplayName("static instancias: reset + cuenta objetos creados")
    void t28_static_reset_y_cuenta() {
        StudentToolkit.resetInstanciasCreadas();

        new StudentToolkit();
        new StudentToolkit(7);

        assertEquals(2, StudentToolkit.getInstanciasCreadas(),
                "Tras reset, crear 2 objetos debe dejar el contador en 2");
    }

    // =========================================================
    // 29) RELACIÓN CON ARRAY DE OBJETOS (Tema 7: AnimalDomestico[] mascotas)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // - setMascotas(Mascota[] mascotas)
    // - getMascotas()
    // - contarMascotas(): devuelve 0 si null, si no length
    @Test
    @DisplayName("relación: setMascotas/getMascotas + contarMascotas (null->0)")
    void t29_relacion_arrayObjetos_mascotas() {
        assertEquals(0, toolkit.contarMascotas(), "Si no hay mascotas (null), debe devolver 0");

        Mascota[] mascotas = {
            new Mascota("Luna"),
            new Mascota("Sol")
        };
        toolkit.setMascotas(mascotas);

        assertSame(mascotas, toolkit.getMascotas(), "Debe guardar la referencia al array de objetos");
        assertEquals(2, toolkit.contarMascotas(), "Debe contar 2 mascotas");
    }

    // =========================================================
    // 30) TIPOS POR REFERENCIA + equals (nivel más alto)
    // =========================================================
    // ✅ Debe realizar el alumno:
    // Implementar equals() y hashCode() en Direccion para que:
    // new Direccion("Calle",1).equals(new Direccion("Calle",1)) sea true.
    //
    // Objetivo: entender diferencias entre referencias y equivalencia lógica.
    @Test
    @DisplayName("Direccion.equals/hashCode: dos direcciones con mismos datos deben ser iguales (pero no la misma referencia)")
    void t30_equals_hashCode_enDireccion() {
        Direccion d1 = new Direccion("Calle Real", 12);
        Direccion d2 = new Direccion("Calle Real", 12);

        assertNotSame(d1, d2, "Son objetos distintos (referencias distintas)");
        assertEquals(d1, d2, "Deben ser iguales por contenido si equals está bien implementado");
        assertEquals(d1.hashCode(), d2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    */
}