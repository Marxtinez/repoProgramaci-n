package Objetos;

public class Main5 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(1,1);
        System.out.println("El rectangulo creado es: "+ rectangulo.toString());
        rectangulo.posicona(4,7);
        System.out.println("Tras moverlo es: "+ rectangulo.toString());
    }
}
