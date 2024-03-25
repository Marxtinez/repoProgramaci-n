package Comparators.Ejercicios;

public class Tarea implements Comparable<Tarea> {

    private int prioridad;
    private int tiempo;

    public Tarea(int tiempo, int prioridad) {
    this.tiempo = tiempo;
    this.prioridad = prioridad;
    }
    public int getTiempo(){
        return tiempo;
    }
    public int getPrioridad(){
        return prioridad;
    }

    @Override
    public int compareTo(Tarea t) {
        if (this.prioridad > t.getPrioridad()){ //Si la prioridad de la actual es mayor, devuelve 1.
            return 1;
        }else if(this.prioridad<t.getPrioridad()){ //Si la prioridad de la actual es menor, devuelve -1.
            return -1;
        }else if(this.prioridad == t.prioridad){ //Si las prioridades son iguales:
            if(this.tiempo > t.getTiempo()){
                return 1;
            } else if (this.prioridad< t.getTiempo()) {
                return -1;
            }
        }
        return 0;
    }
}
