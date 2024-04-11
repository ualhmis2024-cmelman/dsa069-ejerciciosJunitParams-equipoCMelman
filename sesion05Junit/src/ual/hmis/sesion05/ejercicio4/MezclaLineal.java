package ual.hmis.sesion05.ejercicio4;
import java.util.*;

public class MezclaLineal<T extends Comparable<T>> {

	public List<T> LinealShake(List<T> al1, List<T> al2) {
		List<T> conjuntoFinal = new ArrayList<>();

		int i = 0;
		int j = 0;

		//Recorro los elementos de cada array list y los ordeno 
		while (i < al1.size() && j < al2.size()) {
			T elemento1 = al1.get(i);
			T elemento2 = al2.get(j);

			if (elemento1.compareTo(elemento2) < 0) {
				conjuntoFinal.add(elemento1);
				i++;
			} else {
				conjuntoFinal.add(elemento2);
				j++;
			}
		}

		// Agregar los elementos restantes del primer AL
		while (i < al1.size()) {
			conjuntoFinal.add(al1.get(i));
			i++;
		}

		// Agregar los elementos restantes del segundo AL
		while (j < al2.size()) {
			conjuntoFinal.add(al2.get(j));
			j++;
		}

		return conjuntoFinal;
	}

	   public static void main(String[] args) {

    }
}
