package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Frecuencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> hmap = new HashMap<>();
        String palabra;
        System.out.println("Introduce palabra: ");

        do{
            palabra = scan.nextLine();
            Integer freq = hmap.get(palabra);
            hmap.put(palabra, (freq == null) ? 1 : freq + 1);
        }while(palabra != "");

        System.out.println(hmap.size() + " palabras diferentes: ");
        System.out.println(hmap);
    }

}
