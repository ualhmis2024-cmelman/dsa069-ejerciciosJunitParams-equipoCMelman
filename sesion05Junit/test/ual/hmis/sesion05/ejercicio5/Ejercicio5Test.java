package ual.hmis.sesion05.ejercicio5;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class Ejercicio5Test {
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
			Ejercicio5 e3 = new Ejercicio5();
			// Act
			// Assert
			//assertEquals(result, e3.paswor(password));
		}
		
	}


