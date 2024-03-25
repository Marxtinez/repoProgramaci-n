package Comparators.Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int seleccion = 1;

       do{
           List<Tarea> tareas = introduceTareas();
           ordena(tareas);
           System.out.println("Introduce 1 para nueva ordenación o 0 para cerrar el programa: ");
           seleccion = scan.nextInt();

       }while (seleccion != 0);
    }
    public static void ordena(List<Tarea> lista){
        lista.stream().sorted().forEach(p -> System.out.println(p.getPrioridad()+", "+p.getTiempo()));
        System.out.println("---");
    }
    public static List<Tarea> introduceTareas(){
        List<Tarea> tareas = new ArrayList<>();
        int prioridad;
        int tiempo;
        do{
            System.out.println("1-Introduce prioridad de tarea (0-Exit): ");
            prioridad = scan.nextInt();
            if (prioridad < 0){
                break;
            }
            System.out.println("2-Introduce tiempo de la tarea (0-Exit): ");
            tiempo = scan.nextInt();
            if (tiempo < 0){
                break;
            }
            tareas.add(new Tarea(tiempo, prioridad));

        }while (prioridad > 0|| tiempo > 0);
        return tareas;
    }
}
