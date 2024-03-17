package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> trabajadores = new HashMap<>();
        trabajadores.put("juanjo ramirez","656464544");
        trabajadores.put("carlos hernan", "698324906");
        trabajadores.put("francisco amela", "787456092");
        trabajadores.put("jorge klk", "634543890");

        String respuesta;
        do {
            System.out.println("Introduce nombre: ");

            respuesta = scan.nextLine();
            if(respuesta == ""){
                break;
            }else if (trabajadores.get(respuesta.toLowerCase()) == null){
                System.out.println("No hay registros sobre ese trabajador.");
            } else{
                System.out.println("Número de teléfono: "+trabajadores.get(respuesta.toLowerCase()));
            }
        }while (respuesta != "");



    }
}
