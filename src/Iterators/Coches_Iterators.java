package Iterators;

import java.util.ArrayList;
import java.util.Scanner;

public class Coches_Iterators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String input = " ";
        while (input != ""){
            System.out.println("Introduce un coche al arraylist: ");
            input = scan.nextLine();
            if (input != "") {
                lista.add(input);
            }
        }

        System.out.println("Los coches que has añadido son: "+lista.toString());
    }
}
