package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Numeros;

class NumerosTest {

	@ParameterizedTest
    @MethodSource("pruebasEsPrimo")
    void testEsPrimo(int numero, boolean expected) {
        Numeros num = new Numeros(numero);
        boolean resultado = num.esPrimo();
        assertEquals(expected, resultado);
    }

    private static Stream<Arguments> pruebasEsPrimo() {
        return Stream.of(
                Arguments.of(1, false), 
                Arguments.of(2, true) 

        );
    }
	
    @ParameterizedTest
    @MethodSource("capicua")
    void testEsCapicua(int numero, boolean capicua) {
        Numeros num = new Numeros(numero);
        boolean esCap = num.esCapicua();
        assertEquals (capicua, esCap);
    }

    private static Stream<Arguments> capicua(){

        return Stream.of(

                Arguments.of(1221, true),
                Arguments.of(1231, false),
                Arguments.of(-2222, false)

        );

    }

}