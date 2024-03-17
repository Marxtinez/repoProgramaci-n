package Hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class U06T04 {
    public static void main(String[] args) {
        // 1. Crea un nuevo HashSet de enteros y almacena algunos valores. Inserta duplicados y observa el resultado.
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2);

        System.out.println("Duplicados: " + hashSet);

        // 2. Haciendo uso de un Iterator crea un método estático que acepte un HashSet de
        //enteros como entrada y lo retorne modificado incrementando en uno cada valor del
        //HashSet original.

        HashSet<Integer> hSModificado = incrementaValores(hashSet);
        System.out.println("Modificado: " + hSModificado);

        // 3.Crea un método estático que reciba un array de tipo String y lo imprima eliminando
        //los elementos duplicados

        String[] arrayPalabras = {"hola", "buenos", "dias", "tardees"};
        eliminaDuplicados(arrayPalabras);

        // 4.Crea un método estático que recibe un array de tipo String e imprime únicamente, y
        //una sola vez, aquellos elementos que aparecen duplicados
        muestraDuplicados(arrayPalabras);

        // 5. Crea un método estático que recibe dos conjuntos (tipo Set) como parámetros y
        //devuelve el conjunto resultante de la unión de estos.
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> unionSet = unionSets(set1, set2);
        System.out.println("Union: " + unionSet);

        // 6. Crea un método estático que recibe dos conjuntos como parámetros y devuelve el
        //conjunto resultante de la intersección de estos.
        Set<Integer> intersectionSet = intersectionSets(set1, set2);
        System.out.println("Intersección: " + intersectionSet);

        // 7. Crea un método estático que recibe dos conjuntos como parámetros y devuelve el
        //conjunto que contiene todos los elementos que solo están presentes en uno de los
        //dos conjuntos originales.
        Set<Integer> diferenciaSet = diferenciaSet(set1, set2);
        System.out.println("Diferencia: " + diferenciaSet);
    }

    public static HashSet<Integer> incrementaValores(HashSet<Integer> set) {
        HashSet<Integer> modifiedSet = new HashSet<>();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            modifiedSet.add(iterator.next() + 1);
        }
        return modifiedSet;
    }

    public static void eliminaDuplicados(String[] strings) {
        Set<String> uniqueStrings = new HashSet<>(Arrays.asList(strings));
        System.out.println("Strings únicos: " + uniqueStrings);
    }

    public static void muestraDuplicados(String[] strings) {
        Set<String> uniqueStrings = new HashSet<>();
        Set<String> duplicateStrings = new HashSet<>();
        for (String str : strings) {
            if (!uniqueStrings.add(str)) {
                duplicateStrings.add(str);
            }
        }
        System.out.println("Strings duplicados: " + duplicateStrings);
    }

    public static Set<Integer> unionSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersectionSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    // Método estático para obtener los elementos que están presentes en solo uno de los dos conjuntos
    public static Set<Integer> diferenciaSet(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> diferenciaSet = new HashSet<>(set1);
        diferenciaSet.addAll(set2);
        Set<Integer> auxiliar = new HashSet<>(set1);
        auxiliar.retainAll(set2);
        diferenciaSet.removeAll(auxiliar);
        return diferenciaSet;
    }
}
