package ArrayList;

import java.util.ArrayList;

public class Existe {
    public static void main(String[] args) {
        ArrayList<Integer> arraylista = new ArrayList<Integer>();
        for (int i = 0; i < 30; i++) {
            arraylista.add(i);
        }
        contiene(arraylista,100);

    }
    public static void contiene(ArrayList<Integer> arraylista, int numero){

        if(arraylista.contains(numero)){
            System.out.println("Lo contiene");
        }else{
            System.out.println("No lo contiene");
        }
    }

}
