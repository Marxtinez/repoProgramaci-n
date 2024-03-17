package Objetos;

public class Main6 {
    public static void main(String[] args) {
        Punto punto1 = new Punto(2,2);
        Punto punto2 = new Punto(5,8);
        Rectangulo rect = new Rectangulo(punto1, punto2);

        System.out.println("El área del rectángulo generado es: "+ rect.getArea());

        Rectangulo[] rectangulos = new Rectangulo[10];
        for (int i = 0; i < rectangulos.length; i++) {
            Punto pCarga = new Punto(i,i);
            rectangulos[i] = new Rectangulo(pCarga,3,2);
        }
        for(Rectangulo rectangulo: rectangulos) {
            System.out.println(rectangulo.toString());
        }
        }


}
