import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaFutbol {
    public static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int seleccion =0;
        while (seleccion!=3) {
            System.out.println("Selecciona una opción: \n" +
                                "-0. Crear archivo con datos precargados.\n" +
                                "-1. Visualizar archivo creado.\n" +
                                "-2. Añadir datos desde archivo.\n" +
                                "-3. Cerrar progama.");

            seleccion = scan.nextInt();
            scan.nextLine();

            if (seleccion == 0){
                creaArchivo();
                System.out.println("Archivo generado con éxito.");
            }
            if (seleccion == 1){ //Visualizar archivo con algoritmo ordenación burbuja.
                System.out.println("Esta es la información del archivo generado: ");
                burbuja();
                muestraArchivo();

            }
            if (seleccion == 2){ //Pedir usuario que introduzca ruta del archivo con sus datos, luego añadir al inicialmente creado y finalmente printearlo.
                System.out.println("Introduce la ruta del archivo: ");
                String rutaArchivo = scan.nextLine();


                fusionaArchivo(rutaArchivo);
                burbuja();
                muestraArchivo();


            }
            if (seleccion == 3){//Cerrar Programa
                System.out.println("Programa cerrado con éxito.");
            }
            if (seleccion<0 | seleccion>3){// Control
                System.out.println("Por favor, introduce una opción válida.");

            }
        }




    }
    public static void creaArchivo() throws IOException {
        DataOutputStream flujoSalida = new DataOutputStream(new FileOutputStream(new File("./archivos/jugadores.dat")));

        jugadores.add(new Jugador(6, "Argentina", "Franco Armani",1986, 1.89F, "River plate"));
        jugadores.add(new Jugador(6, "Argentina", "Geronimo Rulli", 1992, 1.89F, "Villarreal"));
        jugadores.add(new Jugador(6, "Argentina", "Emiliano Martinez", 1992, 1.95F, "Aston Villa"));
        jugadores.add(new Jugador(6, "Argentina", "Juan Foyth", 1998, 1.88F, "Villarreal"));
        jugadores.add(new Jugador(6, "Argentina", "Nicolas Tagliafico", 1992, 1.72F, "Olympique Lyonnais"));
        jugadores.add(new Jugador(6, "Argentina", "Gonzalo Montiel", 1997, 1.75F, "Sevilla FC"));
        jugadores.add(new Jugador(6, "Argentina", "German Pezzella", 1991, 1.90F, "Real Betis"));
        jugadores.add(new Jugador(6, "Argentina", "Cristian Romero", 1998, 1.85F, "Tottenham Hotspur"));
        jugadores.add(new Jugador(6, "Argentina", "Nicolas Otamendi", 1988, 1.83F, "Benfica"));
        jugadores.add(new Jugador(6, "Argentina", "Lisandro Martinez", 1998, 1.75F, "Manchester United"));
        jugadores.add(new Jugador(6, "Argentina", "Nahuel Molina", 1998, 1.78F, "Atlético Madrid"));
        jugadores.add(new Jugador(6, "Argentina", "Leandro Paredes", 1994, 1.82F, "Juventus"));
        jugadores.add(new Jugador(6, "Argentina", "Rodrigo de Paul", 1994, 1.80F, "Atlético Madrid"));
        jugadores.add(new Jugador(6, "Argentina", "Marcos Acuña", 1991, 1.72F, "Sevilla FC"));
        jugadores.add(new Jugador(6, "Argentina", "Exequiel Palacios", 1998, 1.77F, "Bayer Leverkusen"));
        jugadores.add(new Jugador(6, "Argentina", "Thiago Almada", 2001, 1.71F, "Atlanta United FC"));
        jugadores.add(new Jugador(6, "Argentina", "Alejandro Gomez", 1988, 1.67F, "Sevilla FC"));
        jugadores.add(new Jugador(6, "Argentina", "Guido Rodriguez", 1994, 1.86F, "Real Betis"));
        jugadores.add(new Jugador(6, "Argentina", "Alexis Mac Allister", 1998, 1.76F, "Brighton & Hove Albion"));
        jugadores.add(new Jugador(6, "Argentina", "Enzo Fernandez", 2001, 1.78F, "Benfica"));
        jugadores.add(new Jugador(6, "Argentina", "Julian Alvarez", 2000, 1.70F, "Manchester City"));
        jugadores.add(new Jugador(6, "Argentina", "Lionel Messi", 1987, 1.70F, "PSG"));
        jugadores.add(new Jugador(6, "Argentina", "Angel Di Maria", 1988, 1.78F, "Juventus"));
        jugadores.add(new Jugador(6, "Argentina", "Ángel Correa", 1995, 1.74F, "Atlético Madrid"));
        jugadores.add(new Jugador(6, "Argentina", "Paulo Dybala", 1993, 1.77F, "Roma"));
        jugadores.add(new Jugador(6, "Argentina", "Lautaro Martinez", 1997, 1.74F, "Inter"));

        for (int i=0;i< jugadores.size();i++){
            flujoSalida.writeInt(jugadores.get(i).codPais);
            flujoSalida.writeUTF(jugadores.get(i).pais);
            flujoSalida.writeUTF(jugadores.get(i).nombreJugador);
            flujoSalida.writeInt(jugadores.get(i).anoNacimiento);
            flujoSalida.writeFloat(jugadores.get(i).altura);
            flujoSalida.writeUTF(jugadores.get(i).clubProcedencia);

        }
        flujoSalida.close();

    }
    public static void burbuja() {
        int i, j;
        Jugador jAuxiliar;
        for (i = 0; i < jugadores.size() - 1; i++) {
            for (j = 0; j < jugadores.size() - i - 1; j++) {
                if (jugadores.get(j + 1).anoNacimiento < jugadores.get(j).anoNacimiento){
                    jAuxiliar =jugadores.get(j + 1);
                    jugadores.set(j + 1,jugadores.get(j));
                    jugadores.set(j, jAuxiliar);
                }
            }
        }
    }
    public static void muestraArchivo() throws IOException {
        System.out.println("El contenido del archivo actual es: ");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Jugador " + (i+1) + ": \n" +
                    "Código de país: " + jugadores.get(i).codPais + ". \n" +
                    "País: " + jugadores.get(i).pais + ".\n" +
                    "Jugador: " + jugadores.get(i).nombreJugador + ". \n" +
                    "Año de nacimiento: " + jugadores.get(i).anoNacimiento + ". \n" +
                    "Altura: " + jugadores.get(i).altura + ". \n" +
                    "Club de procedencia: " + jugadores.get(i).clubProcedencia + ". \n");
        }

    }
    public static void fusionaArchivo(String rutaArchivo2) throws IOException {

        DataInputStream flujoEntrada = new DataInputStream(new FileInputStream(new File(rutaArchivo2)));

        while (flujoEntrada.available()>0){
            jugadores.add(new Jugador(flujoEntrada.readInt(), flujoEntrada.readUTF(), flujoEntrada.readUTF(),flujoEntrada.readInt(), flujoEntrada.readFloat(), flujoEntrada.readUTF()));

        }
        flujoEntrada.close();
    }


}

