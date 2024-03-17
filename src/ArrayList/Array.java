package ArrayList;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList <Integer> arraylista = new ArrayList<Integer>();
        for (int i = 0; i < 30; i++) {
            arraylista.add(i);
        }
        Object[] array = arraylista.toArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
