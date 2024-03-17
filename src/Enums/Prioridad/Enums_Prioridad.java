package Enums.Prioridad;

public class Enums_Prioridad {
    public static void main(String[] args) {

        Prioridad prioridadActual = Prioridad.baja;

        mensajeDePrioridad(prioridadActual);

        prioridadActual = Prioridad.alta;

        mensajeDePrioridad(prioridadActual);

        prioridadActual = Prioridad.media;

        mensajeDePrioridad(prioridadActual);
    }
    public static void mensajeDePrioridad(Prioridad prioridadActual){
                System.out.println("La prioridad actual es "+ prioridadActual.name()+" y su valor es: "+prioridadActual.getValor());


    }
}
