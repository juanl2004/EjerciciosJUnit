package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Numeros;

class NumerosTest {

	@ParameterizedTest
	@MethodSource("capicua")
	void testEsCapicua(int numero, boolean capicua) {
		Numeros num = new Numeros(numero);
		boolean esCap = num.esCapicua();
		assertEquals(capicua, esCap);
	}

	private static Stream<Arguments> capicua() {

		return Stream.of(

				Arguments.of(4224, true), 
				Arguments.of(1245, false), 
				Arguments.of(-4444, false)

		);

	}

}