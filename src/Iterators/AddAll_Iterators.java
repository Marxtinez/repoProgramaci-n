package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAll_Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            numeros.add(i);
        }
        System.out.println("numeros: "+numeros.toString()+"numeros2: "+numeros2.toString());
        Iterator<Integer> it = numeros.iterator();
        clona(it,numeros2);
        System.out.println("numeros: "+numeros.toString()+"numeros2: "+numeros2.toString());

    }
    public static void clona( Iterator<Integer> it, ArrayList<Integer> listaClonada ){
        while(it.hasNext()){
            listaClonada.add(it.next());
        }
    }
}
