package Iterators;

import java.util.ArrayList;
import java.util.Scanner;

public class Altura_Iterators {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Double> alturas = new ArrayList<Double>();

        int numAlumnos = numeroAlumnos();

        alturas = leerAlturas(alturas, numAlumnos);
        double media = calcularMedia(alturas);
        System.out.println("La media de alturas es: "+ media);

        int cantAlumnosSuperiorMedia = calcularAlumnosAlturaSuperior(alturas,media);
        System.out.println("La cantidad de alumnos con una altura superior a la media es: "+cantAlumnosSuperiorMedia);
        int cantAlumnosInferiorMedia = calcularAlumnosAlturaInferior(alturas,media);
        System.out.println("La cantidad de alumnos con una altura inferior a la media es: "+cantAlumnosInferiorMedia);

    }
    public static int numeroAlumnos(){
        System.out.println("Introduce el número de alumnos:");
        return scan.nextInt();
    }
    public static ArrayList<Double> leerAlturas(ArrayList <Double> alturas, int numeroAlumnos){
        Double input = 0.0;
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("Introduce altura del alumno "+(i+1)+": ");
            input = scan.nextDouble();
            alturas.add(input);
        }
        return alturas;
    }
    public static double calcularMedia(ArrayList <Double> alturas){
        double sumaDeALturas = 0;
        for (int i = 0; i < alturas.size(); i++) {
            sumaDeALturas += alturas.get(i);
        }
        return sumaDeALturas/alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(ArrayList <Double> alturas, double media ){
        int cantidad =0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > media){
                cantidad++;
            }
        }
        return cantidad;
    }
    public static int calcularAlumnosAlturaInferior(ArrayList <Double> alturas, double media ){
        int cantidad =0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < media){
                cantidad++;
            }
        }
        return cantidad;
    }
}
