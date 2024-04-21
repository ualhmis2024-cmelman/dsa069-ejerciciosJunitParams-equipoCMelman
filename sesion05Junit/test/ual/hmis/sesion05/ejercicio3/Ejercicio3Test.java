package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class Ejercicio3Test {
	
	@CsvFileSource(resources = "/Ejercicio3.csv", delimiter=',', numLinesToSkip = 1)
	@ParameterizedTest(name = "{index} => Con password ({0}) sale {1}")
	void testpaswor(String password, String result) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
		// Assert
		assertEquals(result, e3.paswor(password));
	}
	
}
