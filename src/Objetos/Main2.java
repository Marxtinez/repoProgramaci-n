package Objetos;

public class Main2 {
    public static void main(String[] args){
        Punto miPunto2 = new Punto(4,5);
        Punto miPunto3 = new Punto(6,8);

        miPunto2.desplaza(3, 4);
        miPunto3.desplaza(3,4);

        System.out.println("Punto 2: "+ miPunto2.toString()+".  Punto 3: "+ miPunto3.toString()+".");
    }
}
