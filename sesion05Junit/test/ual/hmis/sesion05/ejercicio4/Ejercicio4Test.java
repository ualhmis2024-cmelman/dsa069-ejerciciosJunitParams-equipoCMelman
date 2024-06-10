package ual.hmis.sesion05.ejercicio4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

public class Ejercicio4Test {

    // Método auxiliar para convertir una cadena de números separados por dos puntos en un array de enteros
    private Integer[] parseArray(String str) {
        if (str == null || str.isEmpty()) {
            return new Integer[0];
        }
        return Arrays.stream(str.split(":"))
                     .map(String::trim)
                     .map(Integer::parseInt)
                     .toArray(Integer[]::new);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/Ejercicio4.csv", delimiter = ';', numLinesToSkip = 1)
    void testMezclar(String listaA, String listaB, String resultadoEsperado) {
        Integer[] arrayA = parseArray(listaA);
        Integer[] arrayB = parseArray(listaB);
        Integer[] esperado = parseArray(resultadoEsperado);

        Integer[] resultado = MezclaLineal.mezclar(arrayA, arrayB);

        assertArrayEquals(esperado, resultado);
    }
}

