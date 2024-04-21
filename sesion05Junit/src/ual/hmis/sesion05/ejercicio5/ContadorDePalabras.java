package ual.hmis.sesion05.ejercicio5;

import java.io.File;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import ual.hmis.sesion05.ejercicio5.Pair;

public class ContadorDePalabras {

	private static TreeMap<String, Integer> datos = new TreeMap<>();
	private static TreeMap<Integer, ArrayList<String>> frecuencia = new TreeMap<>();
	private static ArrayList<Pair<String, Integer>> pal = new ArrayList<>();
	

	public TreeMap<String, Integer> contadorPalabras (String[] palabras){
		for (String palabra : palabras) {
			datos.put(palabra, datos.containsKey(palabra) ? datos.get(palabra) + 1 : 1);
		}
		return datos;
	}
	
	public TreeMap<Integer, ArrayList<String>> ordenarFrecuencia (TreeMap<String, Integer> auxiliar){
		for (Entry<String, Integer> entry : datos.entrySet()) {
			String palabra = entry.getKey();
			int contador = entry.getValue();
			if (frecuencia.containsKey(contador)) {
				frecuencia.get(contador).add(palabra);
			} else {
				frecuencia.put(contador, new ArrayList<>());
				frecuencia.get(contador).add(palabra);
			}
		}
		return frecuencia;
	}
	
	public ArrayList<Pair<String, Integer>> ordenarPalabra (TreeMap<String, Integer> auxiliar){
		for (Entry<String, Integer> entry : datos.entrySet()) {
			for (int i=0; i<entry.getValue(); i++) {
				Pair<String, Integer> par = new Pair<>(entry.getKey(), entry.getValue());
				pal.add(par);
			}
		}
		return pal;
	}

	public static void main(String[] args) {
		ContadorDePalabras cont = new ContadorDePalabras();
		String line = "";
		Scanner scan = null;
		try {
			scan = new Scanner(new File("Coriolis"));
		} catch (Exception e) {
			System.out.println("Se ha producido un error al abrir el archivo " + e.getMessage());
		}
		line = scan.nextLine();
		String[] palabras = line.toLowerCase().trim().split(" ");
		cont.contadorPalabras(palabras);
		System.out.println(datos);
		cont.contadorPalabras(palabras);
		System.out.println(datos);
		cont.ordenarFrecuencia(datos);
		System.out.println(frecuencia);
		cont.ordenarPalabra(datos);
		System.out.println(pal);
	}

}
