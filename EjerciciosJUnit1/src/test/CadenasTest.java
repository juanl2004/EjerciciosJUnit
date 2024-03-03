package test;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;

class CadenasTest {

    @ParameterizedTest
    @MethodSource("espacios")
    void TestCuentaEspacios(String frase, int expected) {
        Cadenas cad = new Cadenas(frase);
        int resultado = cad.cuentaEspacios();
        assertEquals(expected, resultado);
    }

    private static Stream<Arguments> espacios() {
        return Stream.of(
                Arguments.of("Hola, buenos dias", 2),
                Arguments.of("", 0),
                Arguments.of("a", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("reves")
    void TestDelReves(String frase, String expected) {
        Cadenas cad = new Cadenas(frase);
        String resultado = cad.delReves();
        assertEquals(expected, resultado);
    }

    private static Stream<Arguments> reves() {
        return Stream.of(
                Arguments.of("soy muy guapo", "opaug yum yos"),
                Arguments.of("", ""),
                Arguments.of("a", "a")
        );
    }

    @ParameterizedTest
    @MethodSource("contarPalabras")
    void TestContarPalabra(String frase, String palabra, int expected) {
        Cadenas cad = new Cadenas(frase);
        int resultado = cad.contarPalabra(palabra);
        assertEquals(expected, resultado);
    }

    private static Stream<Arguments> contarPalabras() {
        return Stream.of(
                Arguments.of("soy muy guapo", "soy", 1),
                Arguments.of("soy muy guapo", "guapo", 1),
                Arguments.of("soy muy guapo", "hola", 0)
        );
    }
}