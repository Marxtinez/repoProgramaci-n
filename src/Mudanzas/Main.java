package Mudanzas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Bulto> bultos = new ArrayList<Bulto>();
    static ArrayList<Camion> camiones = new ArrayList<Camion>();
    static ArrayList<Mudanza> mudanzas = new ArrayList<Mudanza>();
    public static void main(String[] args) {


        int respuesta= 1;

        while (respuesta !=0) {

            System.out.println("--------------------------------------------------\n" +
                    "Selecciona una opción:\n" +
                    "1.-Añadir bulto.\n" +
                    "2.-Consultar bultos.\n" +
                    "3.-Añadir camión.\n" +
                    "4.-Consultar camiones.\n" +
                    "5.-Crear mudanza.\n" +
                    "6.-Cargar datos de bultos y camiones de prueba.\n" +
                    "0.-Cerrar el programa.\n" +
                    "--------------------------------------------------\n" +
                    "");

            respuesta = scan.nextInt();

            switch (respuesta) {
                case 1:
                    creaBulto();
                    break;
                case 2:
                    muestraBultos();
                    break;
                case 3:
                    creaCamion();
                    break;
                case 4:
                    muestraCamiones();
                    break;
                case 5:
                    creaMudanza();
                    break;
                case 6:
                    cargaDatos();
                    break;

                case 0:
                    System.out.println("Cerrando el programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor, introduce un número de selección válido.");

            }
        }
    }
    public static void creaBulto(){
        /*System.out.println("Nombre del bulto: ");
        String nombreBulto = scan.nextLine();
        scan.nextLine();*/
        System.out.println("Código identificador del bulto: ");
        int idIntroducido = scan.nextInt();
        System.out.println("Volumen del bulto: ");
        int volumenInroducido = scan.nextInt();
        System.out.println("Peso del bulto: ");
        int pesoIntroducido = scan.nextInt();
        System.out.println("Indica si el bulto es frágil (1) o no (0): ");
        int fragilIntroducido = scan.nextInt();
        boolean fragil = false;
         if (fragilIntroducido == 1){
             fragil = true;
         }
        bultos.add(new Bulto(idIntroducido,volumenInroducido, pesoIntroducido, fragil));
        System.out.println("Bulto generado con éxito.");

    }
    public static void muestraBultos(){
        for (int i = 0; i < bultos.size(); i++) {
            System.out.println("--------------------------------\n"+
                    bultos.get(i).toString());
            System.out.println("--------------------------------\n");
        }

    }
    public static void creaCamion(){
        System.out.println("Matrícula del camión: ");
        String matriculaIntroducida = scan.nextLine();
        System.out.println("Volumen máximo del camión: ");
        int volumenInroducido = scan.nextInt();
        System.out.println("Peso máximo del camión: ");
        int pesoIntroducido = scan.nextInt();

        camiones.add(new Camion(matriculaIntroducida,volumenInroducido,pesoIntroducido));
    }
    public static void muestraCamiones() {
        for (int i = 0; i < camiones.size(); i++) {
            System.out.println("--------------------------------\n" +
                    camiones.get(i).toString());
            System.out.println("--------------------------------\n");
        }
    }
    public static void cargaDatos(){

        bultos.add(new Bulto(1,50,10,true));
        bultos.add(new Bulto(2,500,500,true));
        bultos.add(new Bulto(3,1500,1500,false));
        bultos.add(new Bulto(4,5000,5000,true));



        camiones.add(new Camion("1094CXV",10000,10000));
        camiones.add(new Camion("2094CXV",10000,10000));
        camiones.add(new Camion("3094CXV",10000,10000));

    }
    public static void creaMudanza(){
        System.out.println("Introduce el id de mudanza: ");
        int idMudanza = scan.nextInt();
        System.out.println("Introduce la distancia: ");
        int distanciaMudanza = scan.nextInt();

        Bulto arrayBultos[] = new Bulto[bultos.size()];
        for (int i = 0; i < bultos.size(); i++) {
            arrayBultos[i]= bultos.get(i);
        }
        Camion arrayCamiones[] = camiones.toArray(new Camion[camiones.size()]);


        /*int volumenBultosTotal = 0;
        int pesoBultosTotal = 0;

        for (int i = 0; i < arrayBultos.length; i++) {
            pesoBultosTotal += arrayBultos[i].getPeso();
            volumenBultosTotal += arrayBultos[i].getVolumen();
        }
        int volumenCamionesTotal = 0;
        int pesoCamionesTotal = 0;
        for (int i = 0; i < arrayCamiones.length; i++) {
            pesoCamionesTotal += arrayCamiones[i].getPesoMax();
            volumenCamionesTotal += arrayCamiones[i].getVolumenMax();
        }
        while(volumenBultosTotal > volumenCamionesTotal || pesoBultosTotal > pesoCamionesTotal){
            for (int i = 0; i < arrayCamiones.length; i++) {
                if (arrayCamiones[i] == null){
                    arrayCamiones[i] = camiones.get(i);
                }
            }
        }*/
        Mudanza mudanza1 = new Mudanza(idMudanza,distanciaMudanza,arrayBultos, arrayCamiones);

        System.out.println("El coste de la mudanza será de: "+ mudanza1.coste() + " euros.");
        mudanzas.add(mudanza1);
    }
}
