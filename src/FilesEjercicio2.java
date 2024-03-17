import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesEjercicio2 {
public static void main(String[] args) throws IOException {
    Scanner inputvalue = new Scanner(System.in);

    File f0 = new File("."); //creo el file f0 en el directorio actual.
    File f1 = f0;
    f0 = f0.listRoots()[0]; //asigno a f0 al directorio raíz.

    int seleccion = 0;
    int seleccionBackup = 0;

    while (seleccion > -1) {


        File lista[] = f0.listFiles();


        seleccionBackup = seleccion;

        System.out.println("                                                      ");
        System.out.println("                                                      ");
        System.out.println("------------------------------------------------------");
        System.out.println("Lista de ficheros y directorios del directorio: " + f0);
        System.out.println("------------------------------------------------------");
        System.out.println("-0.- Directorio padre");
        for (int i = 0; i < lista.length; i++) {
            System.out.print("-" + (i + 1) + ".- " + lista[i]);
            if (lista[i].isDirectory()) {
                System.out.print("   d");
            }else{
                System.out.print("   -");
            }
            if(lista[i].canRead()){
                System.out.print("r");
            }else{
                System.out.print("-");
            }
            if(lista[i].canWrite()){
                System.out.print("w");
            }else{
                System.out.print("-");
            }
            if(lista[i].canExecute()){
                System.out.println("x  ");
            }else{
                System.out.println("-  ");
            }
            if (lista[i].isFile()) {
                System.out.println(" -" + ((float) lista[i].length() / 1000000) + " MB");
            }
        }

        System.out.println("Introduce el número de directorio para acceder o -1 para salir: ");
        seleccion = inputvalue.nextInt();

        if (seleccion > 0 && seleccion <= lista.length + 1) {
            f0 = lista[seleccion - 1];
        }

        if (seleccion <= -1) {
            System.out.println("Has cerrado el programa.");
            break;
        }
        if (seleccion == 0) {
            f0 = f0.getParentFile();

        }
        if (((seleccion - 1) > lista.length) || (lista[seleccion - 1].isFile())) {
            System.out.println("Introduce un número que corresponda con un directorio:");
            f0 = f0.getParentFile();
        }


    }

}

}
