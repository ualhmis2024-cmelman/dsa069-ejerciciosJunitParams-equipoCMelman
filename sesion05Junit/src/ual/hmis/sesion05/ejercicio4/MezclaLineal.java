package ual.hmis.sesion05.ejercicio4;
import java.util.*;

public class MezclaLineal<T extends Comparable<T>> {

    public String LinealShake(String coj1, String coj2) {
        List<T> conjuntoFinal = new ArrayList<>();
        List<T> al1 = new ArrayList<>();
        List<T> al2 = new ArrayList<>();

        // Obtener elementos de coj1 separados por ':'
        String[] elementosCoj1 = coj1.split(":");
        for (String elemento : elementosCoj1) {
            // Convertir cada elemento a tipo T y agregarlo a al1
            al1.add((T) elemento);
        }

        // Obtener elementos de coj2 separados por ':'
        String[] elementosCoj2 = coj2.split(":");
        for (String elemento : elementosCoj2) {
            // Convertir cada elemento a tipo T y agregarlo a al2
            al2.add((T) elemento);
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

        // Construir el string del resultado
        StringBuilder resultado = new StringBuilder();
        for (int k = 0; k < conjuntoFinal.size(); k++) {
            resultado.append(conjuntoFinal.get(k));
            if (k < conjuntoFinal.size() - 1) {
                resultado.append(", ");
            }
        }

        // Devolver el string del resultado
        return resultado.toString();
    }

    public static void main(String[] args) {
        MezclaLineal<String> mezclador = new MezclaLineal<>();

        String conjunto1 = "1:3:5:7:9:";
        String conjunto2 = "2:4:6:8:10:";

        String resultado = mezclador.LinealShake(conjunto1, conjunto2);

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("Resultado: " + resultado);
    }
}
