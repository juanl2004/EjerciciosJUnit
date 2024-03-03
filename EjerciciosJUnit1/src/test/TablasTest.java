package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Tablas;

class TablasTest {

    @ParameterizedTest
    @MethodSource("pruebasEsMagica")
    void testEsMagica(int[][] tabla, boolean expected) {
        assertEquals(expected, Tablas.esMagica(tabla));
    }

    private static Stream<Arguments> pruebasEsMagica() {
        return Stream.of(
            Arguments.of(new int[][]{{1, 1}, {1, 1}}, true), // Tabla mágica
            Arguments.of(new int[][]{{1, 2}, {1, 1}}, false) // Tabla no mágica
           
        );
    }

    @ParameterizedTest
    @MethodSource("pruebasGira90")
    void testGira90(int[][] tablaInicio, int[][] tablaFinalEsperada) {
        assertArrayEquals(tablaFinalEsperada, Tablas.gira90(tablaInicio));
    }

    private static Stream<Arguments> pruebasGira90() {
        return Stream.of(
            Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{3, 6, 9}, {2, 5, 8}, {1, 4, 7}}), // Tabla cuadrada 3x3
            Arguments.of(new int[][]{{1, 2}, {3, 4}}, new int[][]{{2, 4}, {1, 3}}), // Tabla cuadrada 2x2
            Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}}, null), // Tabla no cuadrada
            Arguments.of(null, null) // Tabla nula
        );
    }
}
