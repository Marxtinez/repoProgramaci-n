//Lectura de un fichero de texto mostrando el resultado por pantalla como una cadena de caracteres.
package ClaseFile;
import java.io.FileReader;
import java.io.IOException;
public class Ejercicio1FlujoOrientadoAByte {
    public static void main(String[] args) throws IOException{
        FileReader f_in = new FileReader("/home/INFORMATICA/alu10182221/Escriptori/archivo.txt");
        int c = f_in.read();
        while(c != -1){
            System.out.println((char) c);
            c = f_in.read();
        }
        f_in.close();
    }
}
