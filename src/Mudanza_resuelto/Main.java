package Mudanza_resuelto;
public class Main {
    public static void main(String[] args) {
        Bulto sofa = new Bulto("sofa", 20, 50, false);
        Bulto sillas = new Bulto("sillsa", 10, 15, false);
        Bulto jarron = new Bulto("jarron", 5, 10, true);
        Bulto mesa = new Bulto("mesa", 25, 50, false);

        Camion camionPequeño = new Camion("1234ABC", 50, 100);
        Camion camionGrande = new Camion("4567DEF", 100, 200);

        Mudanza mudanza = new Mudanza("1", 25);
        mudanza.setCamion(camionPequeño);
        mudanza.incluyeBulto(sofa);
        mudanza.incluyeBulto(sillas);
        mudanza.incluyeBulto(jarron);
        mudanza.incluyeBulto(mesa);

        System.out.println("Mudanza con camion pequeño");
        System.out.println(mudanza);

        System.out.println();
        mudanza.setCamion(camionGrande);
        System.out.println("Mudanza con camion grande");
        System.out.println(mudanza);
    }
}
