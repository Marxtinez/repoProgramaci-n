package Comparators.Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String datos = "3\n" +
                "80 2\n" +
                "100 12\n" +
                "100 1\n" +
                "2\n" +
                "1 1\n" +
                "1 1\n" +
                "0";

        ArrayList<ArrayList<Nino>> casos = leerCasosDePrueba(datos);
        for (ArrayList<Nino> caso : casos) {
            ordena(caso);
        }


    }
    public static void ordena(ArrayList<Nino> lista){
        lista.stream().sorted().forEach(p -> System.out.println(p.getComportamiento()+", "+p.getPeso()));
        System.out.println("\n");
    }
    public static ArrayList<ArrayList<Nino>> leerCasosDePrueba(String datos){
        Scanner scan = new Scanner(datos);
        ArrayList <ArrayList<Nino>> casos = new ArrayList<>();
        int numeroCasos = scan.nextInt();
        scan.nextLine();

        while (numeroCasos != 0){
            ArrayList<Nino> ninos = new ArrayList<>();

            for (int i = 0; i < numeroCasos; i++) {
                int comportamiento = scan.nextInt();
                int peso = scan.nextInt();
                scan.nextLine();

                ninos.add(new Nino(comportamiento, peso));
            }
            casos.add(ninos);
            numeroCasos = scan.nextInt();
            if (scan.hasNext())
                scan.nextLine();

        }
        return casos;
    }
}
