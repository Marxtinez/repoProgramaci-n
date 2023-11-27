
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TransformaImagen {
    File f = null;
    public TransformaImagen(File fEnt){
        // Control de existencia del fichero y control de la extensión .bmp (sacar
        // mensajes de error)

            f = fEnt;

        String nombreArchivo = fEnt.getName();
        System.out.println("El archivo seleccionado es: " + nombreArchivo);
        char[] arrayNombreArchivo = nombreArchivo.toCharArray();
       //if (arrayNombreArchivo[arrayNombreArchivo.length]!="p" && arrayNombreArchivo[arrayNombreArchivo.length-1]!="m" && arrayNombreArchivo[arrayNombreArchivo.length]!="p" &&  )
          //  System.out.println("El archivo seleccionado no es de tipo .bmp");
        }





    public void transformaNegativo() throws IOException {
        // Transformar a negativo y guardar como *_n.bmp

        try{
            FileInputStream archivoALeer = new FileInputStream(f);

            int byteEntrada = 0, contador=0, byteEscritura=0;
            int[] arrayByteImagen = new int[(int) f.length()+1];


            while(byteEntrada != -1){
                byteEntrada = archivoALeer.read();
                arrayByteImagen[contador] = byteEntrada;
                contador++;
            }

            FileOutputStream archivoAGenerar = new FileOutputStream("./archivos/penyagolosa_n.bmp");
            for(int i =0; i<53; i++){
                archivoAGenerar.write(arrayByteImagen[i]); //Introduzco los primeros 54 bytes que tienen info sobre el fichero.

            }
            for (int i = 54; i< arrayByteImagen.length; i++){ //Modifico cada byte haciendo que
                byteEscritura =255-arrayByteImagen[i];

                archivoAGenerar.write(byteEscritura);
            }

        }catch (IOException e){

        }
    }
    public void transformaOscuro() throws IOException {
        // Transformar a una imagen más oscura y guardar como *_o.bmp
        try{
            FileInputStream archivoALeer = new FileInputStream(f);

            int byteEntrada = 0, contador=0, byteEscritura=0;
            int[] arrayByteImagen = new int[(int) f.length()+1];


            while(byteEntrada != -1){
                byteEntrada = archivoALeer.read();
                arrayByteImagen[contador] = byteEntrada;
                contador++;
            }

            FileOutputStream archivoAGenerar = new FileOutputStream("./archivos/penyagolosa_o.bmp");
            for(int i =0; i<53; i++){
                archivoAGenerar.write(arrayByteImagen[i]); //Introduzco los primeros 54 bytes que tienen info sobre el fichero.

            }
            for (int i = 54; i< arrayByteImagen.length; i++){ //Modifico cada byte haciendo que se cumpla el resultado de la imagen, en este caso OSCURO
                byteEscritura =arrayByteImagen[i]/2 ;

                archivoAGenerar.write(byteEscritura);
            }

        }catch (IOException e){

        }

    }

    public void transformaBlancoNegro() throws IOException {
        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp
        try{
            FileInputStream archivoALeer = new FileInputStream(f);

            int byteEntrada = 0, contador=0, byteEscritura=0;
            int[] arrayByteImagen = new int[(int) f.length()+1];


            while(byteEntrada != -1){
                byteEntrada = archivoALeer.read();
                arrayByteImagen[contador] = byteEntrada;
                contador++;
            }

            FileOutputStream archivoAGenerar = new FileOutputStream("./archivos/penyagolosa_bn.bmp");
            for(int i =0; i<54; i++){
                archivoAGenerar.write(arrayByteImagen[i]); //Introduzco los primeros 54 bytes que tienen info sobre el fichero.

            }
            for (int i = 53; i< arrayByteImagen.length; i++){ //Modifico cada byte haciendo que
                byteEscritura =arrayByteImagen[i];
                for(int j= 0; i<3;i++){

                }

                archivoAGenerar.write(byteEscritura);
            }

        }catch (IOException e){

        }
    }
    private String getNombreSinExtension() {
        //Devuelve el nombre del archivo f sin extensión
        String file = f.getName(), fileNombre="";
        char[] fileArray = file.toCharArray();
        for (int i = 0; i < fileArray.length-4; i++) {
            fileNombre= fileNombre + fileArray[i];

        }

        return fileNombre;

    }
}