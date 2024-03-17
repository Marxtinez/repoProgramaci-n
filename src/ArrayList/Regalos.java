package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Regalos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> portales = new ArrayList<>();
        int n =0;
        System.out.println("Introduce el primero portal: ");
        int portalActual = scan.nextInt();
        while (n != -1){
            System.out.println("Introduce siguiente portal: ");
            n = scan.nextInt();
            if (n != -1) {
                portales.add(n);
            }
        }
        System.out.println("Los portales que has añadido son: "+portales.toString());
        System.out.println("Y la ruta establecida será: \n" +
                "Parte del: " +portalActual);

        int absoluto;
        ArrayList<Integer> distancias = new ArrayList<>();

        for (int i=0; i<portales.size(); i++){

            absoluto = abs(portalActual-portales.get(i));
            distancias.add(absoluto);

            }

        System.out.println(distancias.toString());
        int next = calculaSiguiente(portalActual, portales, distancias);
        System.out.println("El siguiente  portal es: "+ next);

        for (int i = 0; i < portales.size(); i++) {
            next = calculaSiguiente(portalActual, portales, distancias);
            portalActual= next;
            System.out.println("El siguiente  portal es: "+ next);
        }


    }
    public static int calculaSiguiente(int primerPortal, ArrayList<Integer> portales, ArrayList<Integer> distancias ){
        int min = -1;
        int i = 0;
        while (min == -1){
            if (distancias.contains(i)){
                min = portales.get(distancias.indexOf(i));
                portales.remove(distancias.indexOf(i));
            }
            i++;
        }
        return min;
    }

}
