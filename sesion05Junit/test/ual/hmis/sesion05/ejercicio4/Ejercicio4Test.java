package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

public class Ejercicio4Test {
		@CsvFileSource(resources = "Ejercicio4.csv", delimiter=':', numLinesToSkip = 1)
		@ParameterizedTest(name = "{index} => al1=({0}), al2=({1}), resultado=({2})")
		@MethodSource
		void testpaswor(List<String> al1, List<String> al2, List<String> result) {
			// Arrange
			MezclaLineal<String> e4 = new MezclaLineal<>();
			// Act
			// Assert
			assertEquals(result, e4.LinealShake(al1,al2));
		}
	}

