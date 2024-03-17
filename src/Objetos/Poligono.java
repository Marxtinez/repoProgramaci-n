package Objetos;

import java.util.ArrayList;

public class Poligono {
    private Punto[] puntosDelPoligono;

    public Poligono(Punto[] arrayPuntosdelPoligonoAnadir){
        this.puntosDelPoligono = arrayPuntosdelPoligonoAnadir;

        }
    public Poligono(Segmento[] arrayDeSegmentos){
        ArrayList<Punto> ALpuntosDelArraySegmentos = new ArrayList<>();
        for (int i= 0; i<arrayDeSegmentos.length; i++){
            ALpuntosDelArraySegmentos.add(arrayDeSegmentos[i].getPuntoInicioSegmento());
            ALpuntosDelArraySegmentos.add(arrayDeSegmentos[i].getPuntoFinSegmento());
        }
        Punto[] puntosDelArraySegmentos= new Punto[ALpuntosDelArraySegmentos.size()];
        for (int i = 0; i < ALpuntosDelArraySegmentos.size() ; i++) {
            puntosDelArraySegmentos[i] = ALpuntosDelArraySegmentos.get(i);
        }
        this.puntosDelPoligono = puntosDelArraySegmentos;
    }

    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < puntosDelPoligono.length; i++) {
           resultado.append(puntosDelPoligono[i].toString());
        }
        return resultado.toString();
    }
    public double perimetro(){
        double resultado = 0;
        for (int i = 0; i < puntosDelPoligono.length-1; i++) {
           Segmento s = new Segmento(puntosDelPoligono[i], puntosDelPoligono[i+1]);
           resultado+= s.longitud();
        }
        return resultado;
    }
    public void desplaza(int despX, int despY){
        for(int i=0; i< puntosDelPoligono.length; i++){
            puntosDelPoligono[i].desplaza(despX,despY);
        }
    }
    public void desplaza(Punto puntoDesplazamiento){
        for(int i=0; i< puntosDelPoligono.length; i++){
            puntosDelPoligono[i].desplaza(puntoDesplazamiento.getX(), puntoDesplazamiento.getY());
        }
    }

}
