package Comparators.Ejercicios;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String datos ="5\n" +
                "flecha 5 1\n" +
                "sandalias 10 2\n" +
                "sarcofago 1000 1000\n" +
                "mascara 1000 10\n" +
                "arco 10 2\n" +
                "0";

        ArrayList<ArrayList<Objeto>> casos = leerCasosDePrueba(datos);

        for (ArrayList<Objeto> caso : casos) {
            ordena(caso);
        }


    }
    public static void ordena(ArrayList<Objeto> lista){
        Comparator<Objeto> comparador = Comparator
                .comparing(Objeto::getValor).reversed()
                .thenComparing(Objeto::getPeso);

        lista.stream().sorted(comparador).forEach(p -> System.out.print(p.getNombre()+" "));
    }

    public static ArrayList<ArrayList<Objeto>> leerCasosDePrueba(String datos){
        Scanner scan = new Scanner(new StringReader(datos));
        ArrayList <ArrayList<Objeto>> casos = new ArrayList<>();
        int numeroCasos = scan.nextInt();
        scan.nextLine();
        while (numeroCasos != 0){
            ArrayList<Objeto> objetos = new ArrayList<>();

            for (int i = 0; i < numeroCasos; i++) {
                String nombre = scan.next();
                int valor = scan.nextInt();
                int peso = scan.nextInt();

                objetos.add(new Objeto(nombre, valor, peso ));
            }
            casos.add(objetos);
            numeroCasos = scan.nextInt();


        }
        return casos;
    }
}
