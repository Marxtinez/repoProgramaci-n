package Comparators.Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        String datos = "4\n"+"9 4\n"+"10 6\n"+"9 5\n"+"1 3\n"+"3\n"+"10 5\n"+"20 5\n"+"30 5\n"+"0";

        ArrayList<ArrayList<Localidad>> casos = leerCasosDePrueba(datos);

        for (ArrayList<Localidad> caso : casos) {
            if (repartoJusto(caso)){
            System.out.println("SÍ.");
        }else{
            System.out.println("NO.");
            }
        }
    }
    public static boolean repartoJusto(ArrayList<Localidad> caso) {

            int inversionTot = caso.stream().mapToInt(Localidad::getDineroInvertido).sum();
            int premiosTot = caso.stream().mapToInt(Localidad::getPremiosObtenidos).sum();

            boolean justo = caso.stream()
                    .allMatch(localidad -> localidad.getDineroInvertido() <= inversionTot / (caso.toArray().length-1) ||
                            localidad.getPremiosObtenidos() > premiosTot / (caso.toArray().length-1));
            if (!justo) {
                return true;
            }
        return false;
    }

    public static ArrayList<ArrayList<Localidad>> leerCasosDePrueba(String datos){
        Scanner scan = new Scanner(datos);
        ArrayList <ArrayList<Localidad>> casos = new ArrayList<>();
        int numeroCasos = scan.nextInt();
        scan.nextLine();

        while (numeroCasos != 0){
            ArrayList<Localidad> localidades = new ArrayList<>();

            for (int i = 0; i < numeroCasos; i++) {
                int dineroInvertido = scan.nextInt();
                int premioObtenido = scan.nextInt();
                scan.nextLine();

                localidades.add(new Localidad(dineroInvertido, premioObtenido));
            }
            casos.add(localidades);
            numeroCasos = scan.nextInt();
            if (scan.hasNext())
                scan.nextLine();

        }
        return casos;
    }
}
