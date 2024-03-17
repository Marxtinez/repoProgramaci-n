package Objetos;

public class Main {
    public static void main(String[] args){

        Punto miPunto = new Punto(4,3);
        System.out.println("El punto generado es: " + miPunto.toString()+ ".");

        miPunto.posicona(-3,1);
        System.out.println("El punto actual es: " + miPunto.toString()+ ".");
    }
}
