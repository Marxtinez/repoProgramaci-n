package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> arraylista = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            arraylista.add(i);
        }

        Object[] array = arraylista.toArray();
        Iterator<Integer> it = arraylista.iterator();
        System.out.println("ArrayList(con Iterator): ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
