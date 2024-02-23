package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;
import clases.Numeros;

class CadenasTest {

	@ParameterizedTest
	@MethodSource("frase")
	void cuentaEspacios(String frase, int espacios) {
		Cadenas cad = new Cadenas(frase);
		int numEspacios = cad.cuentaEspacios();
		assertEquals(frase, espacios);
	}

	private static Stream<Arguments> frase() {

		return Stream.of(

				Arguments.of(4224, true), 
				Arguments.of(1245, false), 
				Arguments.of(-4444, false)

		);
	}

}
