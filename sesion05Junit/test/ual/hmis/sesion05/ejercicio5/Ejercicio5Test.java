package ual.hmis.sesion05.ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.TreeMap;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Ejercicio5Test {

    @ParameterizedTest
    @ValueSource(strings = {"test/resources/Coriolis.txt"})
    public void testContadorPalabras(String rutaArchivo) {
        ContadorDePalabras contador = new ContadorDePalabras();
        TreeMap<String, Integer> resultadoEsperado = new TreeMap<>();
        
        //Podriamos poner el reusltado otra columna del txt e ir leyendo de ahi en vez de ir comparando 1 por 1, esto quita el proposito de lo parametrizao.
        resultadoEsperado.put("1836", 1);
        resultadoEsperado.put("cientifico", 1);
        resultadoEsperado.put("coriolis", 1);
        resultadoEsperado.put("de", 1);
        resultadoEsperado.put("descrito", 1);
        resultadoEsperado.put("efecto", 2);
        resultadoEsperado.put("el", 3);
        resultadoEsperado.put("en", 3);
        resultadoEsperado.put("es", 1);
        resultadoEsperado.put("frances", 1);
        resultadoEsperado.put("observa", 1);
        resultadoEsperado.put("por", 1);
        resultadoEsperado.put("que", 1);
        resultadoEsperado.put("referencia", 1);
        resultadoEsperado.put("rotacion", 1);
        resultadoEsperado.put("se", 1);
        resultadoEsperado.put("sistema", 1);
        resultadoEsperado.put("un", 1);

        TreeMap<String, Integer> resultadoObtenido = contador.contadorPalabras(rutaArchivo);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test/resources/Coriolis.txt"})
    public void testOrdenarFrecuencia(String rutaArchivo) {
        ContadorDePalabras contador = new ContadorDePalabras();
        TreeMap<String, Integer> datos = contador.contadorPalabras(rutaArchivo);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("efecto");
        TreeMap<Integer, ArrayList<String>> resultadoObtenido = contador.ordenarFrecuencia(datos);
        
        assertEquals(3, resultadoObtenido.size());
        assertEquals(arr2, resultadoObtenido.get(2));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test/resources/Coriolis.txt"})
    public void testOrdenarPalabra(String rutaArchivo) {
        ContadorDePalabras contador = new ContadorDePalabras();
        TreeMap<String, Integer> datos = contador.contadorPalabras(rutaArchivo);
        
        ArrayList<Pair<String, Integer>> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(new Pair<>("1836", 1));
        resultadoEsperado.add(new Pair<>("cientifico", 1));
        resultadoEsperado.add(new Pair<>("coriolis", 1));
        resultadoEsperado.add(new Pair<>("de", 1));
        resultadoEsperado.add(new Pair<>("descrito", 1));
        resultadoEsperado.add(new Pair<>("efecto", 2));
        resultadoEsperado.add(new Pair<>("efecto", 2));
        resultadoEsperado.add(new Pair<>("el", 3));
        resultadoEsperado.add(new Pair<>("el", 3));
        resultadoEsperado.add(new Pair<>("el", 3));
        resultadoEsperado.add(new Pair<>("en", 3));
        resultadoEsperado.add(new Pair<>("en", 3));
        resultadoEsperado.add(new Pair<>("en", 3));
        resultadoEsperado.add(new Pair<>("es", 1));
        resultadoEsperado.add(new Pair<>("frances", 1));
        resultadoEsperado.add(new Pair<>("observa", 1));
        resultadoEsperado.add(new Pair<>("por", 1));
        resultadoEsperado.add(new Pair<>("que", 1));
        resultadoEsperado.add(new Pair<>("referencia", 1));
        resultadoEsperado.add(new Pair<>("rotacion", 1));
        resultadoEsperado.add(new Pair<>("se", 1));
        resultadoEsperado.add(new Pair<>("sistema", 1));
        resultadoEsperado.add(new Pair<>("un", 1));

        ArrayList<Pair<String, Integer>> resultadoObtenido = contador.ordenarPalabra(datos);

        assertEquals(resultadoEsperado.toString(), resultadoObtenido.toString());
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"test/resources/Almería.txt"})
    public void testContadorPalabrasFallo(String rutaArchivo) {
        ContadorDePalabras contador = new ContadorDePalabras();
        TreeMap<String, Integer> resultadoEsperado = new TreeMap<>();
        TreeMap<String, Integer> resultadoObtenido = contador.contadorPalabras(rutaArchivo);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
