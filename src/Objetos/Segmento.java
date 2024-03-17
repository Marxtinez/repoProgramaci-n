package Objetos;
import java.math.*;
public class Segmento {

    private Punto inicioSegmento;
    private Punto finSegmento;

    public Segmento(){
      this.inicioSegmento.setX(0);
      this.inicioSegmento.setY(0);
      this.finSegmento.setX(0);
      this.finSegmento.setY(0);
    }
    public Segmento(int x1, int y1, int x2, int y2){
        inicioSegmento.setX(x1);
        inicioSegmento.setY(y1);
        finSegmento.setX(x2);
        finSegmento.setY(y2);
    }
    public  Segmento(Punto puntoInicioSegmento, Punto puntoFinSegmento){
        inicioSegmento = puntoInicioSegmento;
        finSegmento = puntoFinSegmento;
    }
    public double longitud(){
        double resultado = 0; //Aquí irá el resultado, es decir longitud

        resultado = Math.sqrt(((finSegmento.getX() - inicioSegmento.getX())^2) +(((finSegmento.getY() - inicioSegmento.getY())^2)));
        return resultado;
    }

    public String toString() {
        return "(x"+inicioSegmento.getX()+", y"+ inicioSegmento.getY()+") - (x"+ finSegmento.getX()+", y"+ finSegmento.getY()+")";

    }

    public void desplaza(Punto nuevoPuntoInicial, Punto nuevoPuntoFinal){
        this.inicioSegmento = nuevoPuntoInicial;
        this.finSegmento = nuevoPuntoFinal;
    }
    public void desplaza(int despX, int despY){
        this.inicioSegmento.desplaza(despX, despY);
        this.finSegmento.desplaza(despX, despY);

    }
    public Punto getPuntoInicioSegmento(){
        return this.inicioSegmento;
    }
    public Punto getPuntoFinSegmento(){
        return  this.finSegmento;
    }
    public void setNuevoPuntoInicioSegmento(Punto nuevoPuntoInicioSegmento){
        this.inicioSegmento = nuevoPuntoInicioSegmento;
    }
    public void setNuevoPuntoFinSegmento(Punto nuevoPuntoFinSegmento){
        this.finSegmento = nuevoPuntoFinSegmento;
    }

}
