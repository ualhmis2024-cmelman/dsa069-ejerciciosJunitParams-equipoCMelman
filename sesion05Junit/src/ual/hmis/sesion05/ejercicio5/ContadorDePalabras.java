package ual.hmis.sesion05.ejercicio5;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ContadorDePalabras {

	private static TreeMap<String, Integer> datos = new TreeMap<>();

	public TreeMap<String, Integer> contadorPalabras (String[] palabras){
		for (String palabra : palabras) {
			datos.put(palabra, datos.containsKey(palabra) ? datos.get(palabra) + 1 : 1);
		}
		return datos;
	}
	
	public TreeMap<Integer, String> ordenarFrecuencia (TreeMap<String, Integer> auxiliar){
		TreeMap<Integer, String> result = new TreeMap<>();
		for (Entry<String, Integer> entry : datos.entrySet()) {
			result.put(entry.getValue(), entry.getKey());
		}
		return result;
	}

	public static void main(String[] args) {
		ContadorDePalabras cont = new ContadorDePalabras();
		String[] palabras = {"Sofia", "Viator", "Marcelo", "Marcela", "Macarena", "Macarena"};
		cont.contadorPalabras(palabras);
		System.out.println(datos);
		cont.contadorPalabras(palabras);
		System.out.println(datos);
		String[] palabras1 = {"Pedro"};
		cont.contadorPalabras(palabras1);
		System.out.println(datos);
	}

}
