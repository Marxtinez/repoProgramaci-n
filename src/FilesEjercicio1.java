import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesEjercicio1 {
    public static void main(String[] args) throws IOException {
        Scanner inputvalue = new Scanner(System.in);

        File f0 = new File("."); //creo el file f0 en el directorio actual.
        File f1 = f0;
        f0 = f0.listRoots()[0]; //asigno a f0 al directorio raíz.

        int seleccion = 0;

        while(seleccion > -1){


            File lista[] = f0.listFiles();


            System.out.println("                                                      ");
            System.out.println("                                                      ");
            System.out.println("------------------------------------------------------");
            System.out.println("Lista de ficheros y directorios del directorio: " + f0);
            System.out.println("------------------------------------------------------");
            System.out.println("-0.- Directorio padre");
            for (int i = 0; i < lista.length; i++) {
                System.out.print("-" + (i + 1) + ".- " + lista[i]);
                if (lista[i].isDirectory()) {
                    System.out.println(" <Directorio>");
                }
                if (lista[i].isFile()) {
                    System.out.println(" "+((float)lista[i].length() / 1000000) + " MB");
                }
            }

            System.out.println("Introduce el número de directorio para acceder o -1 para salir: ");
            seleccion = inputvalue.nextInt();

            if (seleccion > 0 && seleccion <= lista.length+1){
                f0 = lista[seleccion-1];
            }

            if (seleccion <= -1){
                System.out.println("Has cerrado el programa.");
                break;
            }
            if (seleccion == 0){
                f0 = f0.getParentFile();

            }
            if (((seleccion-1) > lista.length)||(lista[seleccion-1].isFile())){
                System.out.println("Introduce un número que corresponda con un directorio:");
                f0 = f0.getParentFile();
            }



        }
        


    }
}
/*
if (seleccion == 0){
                if(f0 == (f0.listRoots()[0])){
                    System.out.println("Ya estás en el archivo raíz, por lo que no puedes ir al archivo padre.");
                    seleccion = seleccionBackup;
                    f0 = lista[seleccion-1];

                }else{
                    f0 = f0.getParentFile();
                    seleccion = seleccionBackup;

                }

            }if (seleccion == -1){

            }else{
                f0 = lista[(seleccion-1)];
            }

            if(f0.isFile()){
                System.out.println("El número introducido pertenece a un archivo, por favor introduce un número de directorio válido.");
                seleccion = seleccionBackup;
                f0 = lista[seleccion-1];*/
