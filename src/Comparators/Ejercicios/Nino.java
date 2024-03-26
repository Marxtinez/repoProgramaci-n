package Comparators.Ejercicios;

public class Nino implements Comparable<Nino> {
    private int comportamiento;
    private int peso;

    public Nino(int comportamiento, int peso) {
        this.comportamiento = comportamiento;
        this.peso = peso;
    }


    public int getComportamiento() {
        return comportamiento;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public int compareTo(Nino o) {
        if (this.comportamiento > o.getComportamiento()){ //Si la prioridad de la actual es mayor, devuelve 1.
            return 1;
        }else if(this.comportamiento<o.getComportamiento()){ //Si la prioridad de la actual es menor, devuelve -1.
            return -1;
        }else if(this.comportamiento == o.getComportamiento()){ //Si las prioridades son iguales:
            if(this.peso > o.getPeso()){
                return -1;
            } else if (this.peso < o.getPeso()) {
                return 1;
            }
        }
        return 0;
    }
}
