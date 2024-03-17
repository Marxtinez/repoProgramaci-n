package ClaseFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3FlujoOrientadoAByte {
    public static void main(String[] args) throws IOException {
        int contadorCaracteres=0;
        boolean append = true;

        FileReader f_in = new FileReader("/home/INFORMATICA/alu10182221/Escriptori/archivo.txt");
        int c = f_in.read();
        FileWriter f_out = null;

        f_out=new FileWriter("/home/INFORMATICA/alu10182221/Escriptori/archivorespaldo.txt", append);

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
