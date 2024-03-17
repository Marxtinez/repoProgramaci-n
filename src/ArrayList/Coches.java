package ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class Coches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> lista = new ArrayList<>();
        String input = " ";
        while (input != ""){
            System.out.println("Introduce un coche al arraylist: ");
            input = scan.nextLine();
            if (input != "") {
                lista.add(input);
            }
        }
        System.out.println("Los coches que has añadido son: ");
        Iterator<String> it = lista.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
