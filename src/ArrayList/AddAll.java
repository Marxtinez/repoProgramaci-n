package ArrayList;

import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            numeros.add(i);
        }
        ArrayList<Integer> numeros2 = new ArrayList<Integer>();
        System.out.println("numeros: "+numeros.toString()+"numeros2: "+numeros2.toString());

        clona(numeros,numeros2);
        System.out.println("numeros: "+numeros.toString()+"numeros2: "+numeros2.toString());




    }
    public static void clona(ArrayList<Integer> listaACLonar,ArrayList<Integer> listaClonada ){
        for(int i : listaACLonar){
            listaClonada.add(i);
        }
    }

}
