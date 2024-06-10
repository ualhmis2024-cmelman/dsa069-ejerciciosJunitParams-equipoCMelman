package ual.hmis.sesion05.ejercicio4;
import java.util.*;

public class MezclaLineal<T extends Comparable<T>> {

	public static <T extends Comparable<T>> T[] mezclar(T[] conjunto1, T[] conjunto2) {  int i = 0, j = 0, k = 0;
    T[] resultado = Arrays.copyOf(conjunto1, conjunto1.length + conjunto2.length);

    while (i < conjunto1.length && j < conjunto2.length) {
        int cmp = conjunto1[i].compareTo(conjunto2[j]);
        if (cmp < 0) {
            if (k == 0 || !resultado[k-1].equals(conjunto1[i])) {
                resultado[k++] = conjunto1[i];
            }
            i++;
        } else if (cmp > 0) {
            if (k == 0 || !resultado[k-1].equals(conjunto2[j])) {
                resultado[k++] = conjunto2[j];
            }
            j++;
        } else {
            if (k == 0 || !resultado[k-1].equals(conjunto1[i])) {
                resultado[k++] = conjunto1[i];
            }
            i++;
            j++;
        }
    }

    // Copiar los elementos restantes de conjunto1, si hay alguno
    while (i < conjunto1.length) {
        if (k == 0 || !resultado[k-1].equals(conjunto1[i])) {
            resultado[k++] = conjunto1[i];
        }
        i++;
    }

    // Copiar los elementos restantes de conjunto2, si hay alguno
    while (j < conjunto2.length) {
        if (k == 0 || !resultado[k-1].equals(conjunto2[j])) {
            resultado[k++] = conjunto2[j];
        }
        j++;
    }

    return Arrays.copyOf(resultado, k);
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
