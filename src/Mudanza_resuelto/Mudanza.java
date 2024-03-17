package Mudanza_resuelto;
import java.util.ArrayList;
import java.util.List;

public class Mudanza {
    private String id;
    private double distancia;
    private Camion camion;
    private List<Bulto> bultos = new ArrayList<Bulto>();

    public Mudanza(String id, double distancia) {
        this.id = id;
        this.distancia = distancia;
    }

    public void incluyeBulto(Bulto bulto) {
        bultos.add(bulto);
    }

    public double precio() {
        return precioBultos() + precioDesplazamiento();
    }

    public double precioBultos() {
        double precio = 0;
        for (Bulto bulto : bultos)
            precio += bulto.esFragil() ? bulto.getPeso() * 4 : bulto.getPeso();
        return precio;
    }

    public double precioDesplazamiento() {
        return viajesRequeridos() * distancia * 2;
    }

    public int viajesRequeridos() {
        List<Bulto> copiaBultos = new ArrayList<>(bultos);
        int viajes = 0;
        while (!copiaBultos.isEmpty()) {
            cargaCamionAlMaximo(copiaBultos);
            copiaBultos.removeAll(camion.bultosCargados());
            camion.vaciar();
            viajes++;
        }
        return viajes;
    }

    private void cargaCamionAlMaximo(List<Bulto> bultosRestantes) {
        for (Bulto bulto : bultosRestantes)
            if (camion.cabeBulto(bulto))
                camion.cargaBulto(bulto);
    }

    @Override
    public String toString() {
        String cadena = "Mudanza";
        cadena += "\n---------------------------------";
        cadena += "\nDistancia: " + distancia + " km";
        cadena += "\nCamion: " + camion.getMatricula();
        cadena += "\nViajes: " + viajesRequeridos();
        cadena += "\nNº Bultos: " + bultos.size();
        cadena += "\nPrecio: " + precio();
        return cadena;
    }
    public String getId() {
        return id;
    }

    public double getDistancia() {
        return distancia;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

}
