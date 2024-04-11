package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio2.Ejercicio2;

public class Ejercicio3Test {
	@CsvSource({
		"'',' '",
		"pass,password demasiado corto",
		"passo,********",
		"sainbrai,********",
		"sainbrais,Error",
 		"sainbrailake,************",
		"sainbrailakedaimonsainbrailakedaimonsain,************",
		"sainbrailakedaimonsainbrailakedaimonsainb,password demasiado largo"
	})
	
	@ParameterizedTest(name = "{index} => Con password ({0}) sale {1}")
	void testpaswor(String password, String result) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
		// Assert
		assertEquals(result, e3.paswor(password));
	}
	
}
