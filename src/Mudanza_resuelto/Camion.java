package Mudanza_resuelto;
import java.util.ArrayList;
import java.util.List;

public class Camion {
    private String matricula;
    private double volumenMaximo;
    private double pesoMaximo;
    private ArrayList<Bulto> bultosCargados = new ArrayList<Bulto>();

    public Camion(String matricula, double volumenMaximo, double pesoMaximo) {
        this.matricula = matricula;
        this.volumenMaximo = volumenMaximo;
        this.pesoMaximo = pesoMaximo;
    }

    public void cargaBulto(Bulto bulto) {
        bultosCargados.add(bulto);
    }

    public boolean cabeBulto(Bulto bulto) {
        return bulto.getPeso() <= pesoDisponible() && bulto.getVolumen() <= volumenDisponible();
    }

    public double pesoDisponible() {
        return pesoMaximo - pesoCarga();
    }

    public double pesoCarga() {
        double pesoCarga = 0;
        for (Bulto bultoCargado : bultosCargados)
            pesoCarga += bultoCargado.getPeso();
        return pesoCarga;
    }

    public double volumenDisponible() {
        return volumenMaximo - volumenCarga();
    }

    public double volumenCarga() {
        double volumenCarga = 0;
        for (Bulto bultoCargado : bultosCargados)
            volumenCarga += bultoCargado.getVolumen();
        return volumenCarga;
    }

    public List<Bulto> bultosCargados() {
        return new ArrayList<>(bultosCargados);
    }

    public void vaciar(){
        bultosCargados.clear();
    }


    @Override
    public String toString() {
        return "Camion{" +
                "matricula='" + matricula + '\'' +
                ", volumenMaximo=" + volumenMaximo +
                ", pesoMaximo=" + pesoMaximo +
                ", bultos=" + bultosCargados +
                '}';
    }
    public String getMatricula() {
        return matricula;
    }

    public double getVolumenMaximo() {
        return volumenMaximo;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

}
