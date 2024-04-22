package ual.hmis.sesion05.ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Pairtest {

    @ParameterizedTest
    @CsvSource({
        "1, 'value1', 1, 'value1'",  // Test case with Integer key and String value
        "'key2', 2.5, 'key2', 2.5",  // Test case with String key and Double value
        "'key3', true, 'key3', true"  // Test case with String key and Boolean value
    })
    void testPair(String key, Object value, String expectedKey, Object expectedValue) {
        Pair<String, Object> pair = new Pair<>(key, value);
        
        assertEquals(expectedKey, pair.getKey(), "Key doesn't match");
        assertEquals(expectedValue, pair.getValue(), "Value doesn't match");
    }
}
