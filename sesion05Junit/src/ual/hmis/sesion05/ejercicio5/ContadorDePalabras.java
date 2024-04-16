package ual.hmis.sesion05.ejercicio5;

import java.util.Map.Entry;
import java.util.TreeMap;

public class ContadorDePalabras {

	private TreeMap<String, Integer> datos;
	
	public TreeMap<String, Integer> contarPalabras (String palabras, int contador){
		TreeMap<String, Integer> result = new TreeMap<>();
		if (result.containsKey(palabras)) {
			for (Entry<String, Integer> entry : result.entrySet()) {
				contador = entry.getValue() + 1;
				result.put(palabras, contador);
			}
		}else {
			result.put(palabras, contador=1);
		}
	}
	
}
