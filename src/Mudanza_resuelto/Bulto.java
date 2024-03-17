package Mudanza_resuelto;
public class Bulto {
    private String id;

    private double volumen;

    private double peso;

    private boolean esFragil;
    public boolean esFragil() {
        return esFragil;
    }

    public Bulto (String id, double volumen, double peso, boolean esFragil){
        this.id = id;
        this.volumen = volumen;
        this.peso = peso;
        this.esFragil = esFragil;
    }

    @Override
    public String toString() {
        return "Bulto{" +
                "id='" + id + '\'' +
                ", volumen=" + volumen +
                ", peso=" + peso +
                ", esFragil=" + esFragil +
                '}';
    }
    public double getVolumen() {
        return volumen;
    }
    public double getPeso() {
        return peso;
    }

}
