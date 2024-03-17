package Iterators;

import java.util.*;

public class Regalos_Iterators {

    public static void main(String[] args) {

        System.out.println(repartir(0, 2, 4));
        System.out.println(repartir(3, 2, 5, 1));
        System.out.println(repartir(3, 2, 4, 7));

    }

    public static String repartir(int aterriza, Integer ... portales) {
        List<Integer> portals = new ArrayList<>();
        String result = "";
        int  temp, index = -1;
        int actual = aterriza;
        int diff, min;
        Arrays.sort(portales);
        Collections.addAll(portals, portales);
        Iterator<Integer> it = portals.iterator();
        while (it.hasNext()){
            min = Integer.MAX_VALUE;
            temp = 0;

            for (int i = 0; i < portals.size(); i++) {
                //Calcular el mínimo desde el actual
                diff = Math.abs(portals.get(i) - actual);
                if (diff <= min ){
                    min = diff;
                    temp = portals.get(i);
                    index = i;
                }
            }
            actual = temp;
            result += actual + " ";
            portals.remove(index);

        }
        return result;
    }

}

