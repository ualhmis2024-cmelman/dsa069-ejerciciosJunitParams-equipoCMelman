package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio4Test {
		@CsvSource({
			"[1, 3, 5, 7, 9],[2, 4, 6, 8, 10],[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]"

		})

		@ParameterizedTest(name = "{index} => al1={0}, al2={1}, resultado={2}")
		void testpaswor(List<Integer> al1, List<Integer> al2, List<Integer> result) {
			// Arrange
			MezclaLineal<Integer> e4 = new MezclaLineal<>();
			// Act
			// Assert
			assertEquals(result, e4.LinealShake(al1,al2));
		}
	}

