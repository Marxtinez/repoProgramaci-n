package Objetos;

public class Main4 {
    public static void main(String[] args){
        Punto p1 = new Punto(2,0);
        Punto p2 = new Punto(0,4);
        Punto p3 = new Punto(-2,0);
        


        Punto[] puntosPoligono = {p1, p2, p3};

        Poligono poligono = new Poligono(puntosPoligono);

        System.out.println("El polígono actual es: "+ poligono.toString()+ "\n" +
                "Y su perímetro es: " + poligono.perimetro());

        poligono.desplaza(1,2);

        System.out.println("El polígono desplazado es: "+ poligono.toString()+ "\n" +
                "Y su perímetro es: " + poligono.perimetro());

        Segmento s1 = new Segmento(2,1,2,4);
        Segmento s2 = new Segmento(2,4,-1,4);
        Segmento s3 = new Segmento(-1,4,-1,1);
        Segmento s4 = new Segmento(-1,1,2,1);

        Segmento[] segmentosPoligono = {s1, s2, s3, s4};

        Poligono poligono2 = new Poligono(segmentosPoligono);

        System.out.println("El nuevo polígono es: "+ poligono2.toString()+ "\n" +
                "Y su perímetro es: " + poligono2.perimetro());



    }
}
