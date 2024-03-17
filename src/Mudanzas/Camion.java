package Mudanzas;

public class Camion {

    private String matricula;
    private int volumenMax;
    private int pesoMax;

    public Camion(String matricula, int volumenMax, int pesoMax){
        this.matricula = matricula;
        this.volumenMax = volumenMax;
        this.pesoMax = pesoMax;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public int getVolumenMax(){
        return this.volumenMax;
    }
    public int getPesoMax(){
        return this.pesoMax;
    }

    public String toString() {
            return "Matrícula: " + this.matricula + ".\n" +
                    "Volumen máximo: " + this.volumenMax + "  l.\n" +
                    "Peso máximo: " + this.pesoMax + " Kg.\n";

    }
}
