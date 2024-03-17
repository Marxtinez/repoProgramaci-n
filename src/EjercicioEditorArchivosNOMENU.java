package EjerciciosClaseFile;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioEditorArchivosNOMENU {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner scan = new Scanner(System.in);
        int seleccion = 0;
        boolean guardado = true;
        ArrayList<String> linea = new ArrayList<String>();

        while(seleccion!=4) {


            System.out.println("Selecciona opción: -.O:Abrir archivo.      -.1:Eliminar línea.     -.2:Insertar línea.      -.3:Guardar.    -.4:Cerrar.");
            seleccion = scan.nextInt();
            File archivoPublic= new File(".");


            switch (seleccion) {

                case 0:
                    //Llamar a abrir archivo
                    try{
                        guardado = false;
                        System.out.println("Introduce la ruta del archivo: ");
                        scan.nextLine();//Tengo que llamar a Scanner porque si no, como antes lo he llamado para leer un int, me h acogido un salto de linea y eso hace que no espere en l asiguiente llamada, es una especie de error de java.
                        String rutaArchivo = scan.nextLine();

                        File archivo = new File(rutaArchivo);
                        archivoPublic = archivo;




                        FileReader leeArchivo = new FileReader(archivo);
                        BufferedReader buffer_in = new BufferedReader(leeArchivo);


                        linea.add(buffer_in.readLine());

                        for (int i = 0; i < 22; i++) {
                            linea.add(buffer_in.readLine());
                            System.out.print(i + ".");
                            System.out.print(linea.get(i));
                            System.out.println("");


                        }
                        buffer_in.close();
                        System.out.println("");
                    }
                    catch(FileNotFoundException String ){
                        System.out.println("Por favor, introduce una ruta de fichero válida:");
                        seleccion =0;
                    }
                    break;

                case 1:
                    //Llamar a eliminar linea
                    guardado = false;
                    System.out.println("Introduce la línea que deseas eliminar:");
                    scan.nextLine();
                    int lineaEliminar = scan.nextInt();
                    scan.nextLine();
                    if(lineaEliminar<=22 && lineaEliminar>=0){
                        linea.remove(lineaEliminar);
                    }
                    for (int i = 0; i < 22; i++) {

                        System.out.print(i + ".");
                        System.out.print(linea.get(i));
                        System.out.println("");


                    }
                    seleccion =0;
                    break;

                case 2:
                    //Llamar a insertar linea
                    guardado = false;
                    System.out.println("Introduce el número de línea que deseas insertar:");
                    int lineaInsertar = scan.nextInt();
                    scan.nextLine();
                    if(lineaInsertar<=22 && lineaInsertar>=0){
                        System.out.println("Introduce el texto:");
                        String textoAInsertar = scan.nextLine();
                        linea.set(lineaInsertar,textoAInsertar);
                    }
                    for (int i = 0; i < 22; i++) {
                        System.out.print(i + ".");
                        System.out.print(linea.get(i));
                        System.out.println("");
                    }
                    seleccion =0;
                    break;

                case 3:
                    //Guardar
                    guardado = true;
                    FileWriter escribeArchivo = new FileWriter(archivoPublic);
                    BufferedWriter buffer_out = new BufferedWriter(escribeArchivo);
                    for (int i = 0; i < 22; i++) {
                        buffer_out.write(linea.get(i));
                    }
                    seleccion=0;
                    break;

                case 4:
                    //Cerrar (solo si se comprueba que se ha guardad antes).
                    if (guardado){

                    }else{
                        System.out.println("Por favor, guarda antes de cerrar el programa.");
                        seleccion = 0;
                    }
                    break;
            }
        }


        }

}
