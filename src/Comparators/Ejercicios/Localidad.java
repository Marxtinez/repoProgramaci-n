package Comparators.Ejercicios;

public class Localidad implements Comparable<Localidad> {
    private int dineroInvertido, premiosObtenidos;

    public Localidad(int dineroInvertido, int premiosObtenidos) {
        this.dineroInvertido = dineroInvertido;
        this.premiosObtenidos = premiosObtenidos;
    }

    public int getDineroInvertido() {
        return dineroInvertido;
    }

    public int getPremiosObtenidos() {
        return premiosObtenidos;
    }

    @Override
    public int compareTo(Localidad l) {
        if (this.dineroInvertido > l.getDineroInvertido()){
            return 1;
        }else if(this.dineroInvertido < l.getDineroInvertido()){
            return -1;
        }else if(this.dineroInvertido == l.getDineroInvertido()){
            if(this.premiosObtenidos > l.getPremiosObtenidos()){
                return 1;
            } else if (this.premiosObtenidos< l.getPremiosObtenidos()) {
                return -1;
            }
        }
        return 0;
    }

}

