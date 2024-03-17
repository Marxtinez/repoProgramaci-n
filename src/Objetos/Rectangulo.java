package Objetos;

public class Rectangulo extends Punto {
    private int ancho;
    private int alto;

    public Rectangulo(int x, int y) {
        super(x, y);
        this.ancho = 0;
        this.alto = 0;

    }
    public Rectangulo(Punto punto, int ancho, int alto){
        super(punto.getX(), punto.getY());
        this.ancho = ancho;
        this.alto = alto;

    }
    public Rectangulo(Punto puntoInfIzq, Punto puntoSupDer){
        super(puntoInfIzq.getX(), puntoInfIzq.getY());
        this.ancho = puntoSupDer.getX()- puntoInfIzq.getX();
        this.alto = puntoSupDer.getY()-puntoInfIzq.getY();
    }
    public Rectangulo (Segmento segmento){
        super(segmento.getPuntoInicioSegmento().getX(), segmento.getPuntoInicioSegmento().getY());
        this.ancho = (int) segmento.longitud();
        this.alto = (int) segmento.longitud();

    }

    public String toString() {
        return "{("+ getX()+","+getY()+")"+" anchura: "+ ancho + " altura: "+alto+"}";
    }
    public double getArea(){
        return this.ancho*this.alto;
    }
    public Punto getPunto(){
        return new Punto(getX(),getY());
    }
    public Punto getSuperiorIzquierdo(){
        return new Punto(getX(), getY()+alto);
    }
    public Punto getSuperiorDerecho(){
        return new Punto(getX()+ancho,getY()+alto);
    }
    public Punto getInferiorDerecho(){
        return new Punto(getX()+ancho, getY());
    }
    public Punto getInferiorIzquierdo(){
        return new Punto(getX(),getY());
    }
    public void setAncho(int ancho){
        this.ancho = ancho;
    }
    public void setAlto(int alto){
        this.alto = alto;
    }
    public int getAncho(){
        return this.ancho;
    }
    public int getAlto(){
        return this.alto;
    }

}
