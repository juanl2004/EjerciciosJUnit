package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.FuncionesRecursivas;

class FuncionesRecursivasTest {

    @ParameterizedTest
    @MethodSource("sumatorio")
    void testSumatorio(int numero, int expected) {
        int resultado = FuncionesRecursivas.sumatorio(numero);
        assertEquals(expected, resultado);
    }

    private static Stream<Arguments> sumatorio() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(5, 15),
                Arguments.of(10, 55)
        );
    }

    @ParameterizedTest
    @MethodSource("potencia")
    void testPotencia(int numero, int elevado, double expected) {
        double resultado = FuncionesRecursivas.potencia(numero, elevado);
        assertEquals(expected, resultado);
    }

    private static Stream<Arguments> potencia() {
        return Stream.of(
                Arguments.of(2, 0, 1),
                Arguments.of(2, 3, 8),
                Arguments.of(2, 4, 16)
        );
    }

    @ParameterizedTest
    @MethodSource("fibonacci")
    void testFibonacci(int numero, int expected) {
        int resultado = FuncionesRecursivas.fibonacci(numero);
        assertEquals(expected, resultado);
    }

    private static Stream<Arguments> fibonacci() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(5, 5),
                Arguments.of(6, 8),
                Arguments.of(7, 13),
                Arguments.of(8, 21)
        );
    }

}
