import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjercicioTratamientoBytesImagen {
    public static void main(String[] args) throws IOException {

        File f = new File("./archivos/penyagolosa.bmp");

        TransformaImagen ti = new TransformaImagen(f);
        ti.transformaNegativo();
        ti.transformaOscuro();
        ti.transformaBlancoNegro();


    }
}
