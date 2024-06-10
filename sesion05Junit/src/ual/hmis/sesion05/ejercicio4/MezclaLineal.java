package ual.hmis.sesion05.ejercicio4;
import java.util.*;

public class MezclaLineal<T extends Comparable<T>> {

	public static <T extends Comparable<T>> T[] mezclar(T[] conjunto1, T[] conjunto2) {
		// Método que mezcla dos arrays ordenados en uno solo ordenado
			int i = 0, j = 0, k = 0;
			T[] resultado = Arrays.copyOf(conjunto1, conjunto1.length + conjunto2.length);

			while (i < conjunto1.length && j < conjunto2.length) {
				if (conjunto1[i].compareTo(conjunto2[j]) <= 0) {
					resultado[k++] = conjunto1[i++];
				} else {
					resultado[k++] = conjunto2[j++];
				}
			}

			// Copiar los elementos restantes de conjunto1, si hay alguno
			while (i < conjunto1.length) {
				resultado[k++] = conjunto1[i++];
			}

			// Copiar los elementos restantes de conjunto2, si hay alguno
			while (j < conjunto2.length) {
				resultado[k++] = conjunto2[j++];
			}

			return resultado;
		}
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
