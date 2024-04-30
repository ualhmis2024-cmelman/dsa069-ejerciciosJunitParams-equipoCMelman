package ual.hmis.sesion05.ejercicio4;
import java.util.*;

public class MezclaLineal<T extends Comparable<T>> {

	public String LinealShake(String coj1, String coj2) {
		List<T> conjuntoFinal = new ArrayList<>();
		List<T> al1 = new ArrayList<>();
		List<T> al2 = new ArrayList<>();

		if (coj1 == null) return coj2;
		else {
			// Obtener elementos de coj1 separados por ':'
			String[] elementosCoj1 = coj1.split(":");
			for (String elemento : elementosCoj1) {
				// Convertir cada elemento a tipo T y agregarlo a al1
				al1.add((T) elemento);
			}
		}

		if (coj2 == null) return coj1;
		else {
			// Obtener elementos de coj2 separados por ':'
			String[] elementosCoj2 = coj2.split(":");
			for (String elemento : elementosCoj2) {
				// Convertir cada elemento a tipo T y agregarlo a al2
				al2.add((T) elemento);
			}
		}

		int i = 0;
		int j = 0;

		//Recorrer los elementos de cada ArrayList y ordenarlos 
		while (i < al1.size() && j < al2.size()) {
			T elemento1 = al1.get(i);
			T elemento2 = al2.get(j);

			// Comparar los elementos y agregarlos al conjuntoFinal
			if (Integer.parseInt(elemento1.toString()) < Integer.parseInt(elemento2.toString())) {
				conjuntoFinal.add(elemento1);
				i++;
			} else {
				conjuntoFinal.add(elemento2);
				j++;
			}
		}

		// Agregar los elementos restantes del primer ArrayList
		while (i < al1.size()) {
			conjuntoFinal.add(al1.get(i));
			i++;
		}

		// Agregar los elementos restantes del segundo ArrayList
		while (j < al2.size()) {
			conjuntoFinal.add(al2.get(j));
			j++;
		}

		//USAR TREEMAP PARA AHORRRARSE PASOS DE VARIABLES
		
		// Construir el string del resultado
		StringBuilder resultadoDuplicado = new StringBuilder();
		for (int k = 0; k < conjuntoFinal.size(); k++) {
			resultadoDuplicado.append(conjuntoFinal.get(k));
			if (k < conjuntoFinal.size() - 1) {
				resultadoDuplicado.append(":");
			}
		}

		 // Dividir el string en un array de strings usando ":" como delimitador
        String[] elementos = resultadoDuplicado.toString().split(":");
        
        // Usar un HashSet para almacenar los elementos únicos
        HashSet<Integer> jaset = new HashSet<>();
        for (String elemento : elementos) {
            // Convertir el elemento a entero y agregarlo al HashSet
            jaset.add(Integer.parseInt(elemento));
        }
        
        // Convertir el HashSet a un ArrayList y ordenarlo
        ArrayList<Integer> listaOrdenada = new ArrayList<>(jaset);
        Collections.sort(listaOrdenada);
        
        // Reconstruir el string usando ":" como separador
        StringBuilder resultado = new StringBuilder();
        for (Integer elemento : listaOrdenada) {
            resultado.append(elemento).append(":");
        }
        
        // Eliminar el último ":" 
            resultado.deleteCharAt(resultado.length() - 1);
        
        return resultado.toString();
	}

//	public static void main(String[] args) {
//		MezclaLineal<String> mezclador = new MezclaLineal<>();
//
//		String conjunto1 = "1:1:1:1:9:";
//		String conjunto2 = "1:2:4:6:8:10:";
//
//		String resultado = mezclador.LinealShake(conjunto1, conjunto2);
//
//		System.out.println("Conjunto 1: " + conjunto1);
//		System.out.println("Conjunto 2: " + conjunto2);
//		System.out.println("Resultado: " + resultado);
//	}
}
