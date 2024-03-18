package Objetos;

public class Main3 {
    public static void main(String[] args){
        Punto puntoIncioSegmento = new Punto(4,5);
        Punto puntoFinSegmento = new Punto(6,8);

        Segmento miSegmento = new Segmento(puntoIncioSegmento, puntoFinSegmento);

        double longitudSegmento = miSegmento.longitud();
        System.out.println("El segmento: " + miSegmento.toString()+", tiene una longitud de: " + longitudSegmento);

        miSegmento.desplaza(4,3);
        longitudSegmento = miSegmento.longitud();
//<<<<<<< HEAD
        System.out.println("Tras desplazarlo, " + miSegmento.toString()+"y tiene una longitud de: " + longitudSegmento);
//=======
        System.out.println("Tras desplazarlo: el segmento: " + miSegmento.toString()+", tiene una longitud de: " + longitudSegmento);
//>>>>>>> origin/master

    }
}
