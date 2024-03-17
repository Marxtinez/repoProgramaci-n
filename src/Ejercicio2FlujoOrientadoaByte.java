//Copiar el contenido de un fichero de texto en un fichero de respaldo
// informando de la cantidad de caracteres copiados.
package ClaseFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2FlujoOrientadoaByte {
    public static void main(String[] args) throws IOException {
        int contadorCaracteres=0;

        FileReader f_in = new FileReader("/home/INFORMATICA/alu10182221/Escriptori/archivo.txt");
        int c = f_in.read();
        FileWriter f_out = null;

        f_out=new FileWriter("/home/INFORMATICA/alu10182221/Escriptori/archivorespaldo.txt");

        while(c != -1){
            contadorCaracteres++;
            f_out.write(c);
            c = f_in.read();
        }
        f_out.close();
        f_in.close();
        System.out.println("La cantidad de caracteres copiados es de: "+contadorCaracteres+".");
    }
}
