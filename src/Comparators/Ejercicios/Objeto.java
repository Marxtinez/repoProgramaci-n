package Comparators.Ejercicios;

public class Objeto implements Comparable<Objeto> {
    private String nombre;
    private int valor;
    private int peso;


    public Objeto(String nombre, int valor, int peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public int compareTo(Objeto o) {
        if (this.valor > o.getValor()){
            return 1;
        }else if(this.valor < o.getValor()){
            return -1;
        }else if(this.valor == o.getValor()){
            if(this.peso > o.getPeso()){
                return -1;
            } else if (this.peso < o.getPeso()) {
                return 1;
            }
        }
        return 0;
    }
}
