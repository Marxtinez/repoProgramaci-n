package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Capitales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> capitales = new HashMap<String, String>();
        capitales.put("spain", "Madrid");
        capitales.put("france", "Paris");
        capitales.put("italy", "Rome");
        capitales.put("england", "London");

        System.out.println("Introduce país: ");
        System.out.println(capitales.get(scan.nextLine().toLowerCase()));




    }
}
