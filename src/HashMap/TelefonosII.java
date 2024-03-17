package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonosII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String[]> trabajadores = new HashMap<>();

        String[] reg1 ={"123123123","123123123"};
        String[] reg2 ={"123123123","123123123"};
        String[] reg3 ={"123123123","123123123"};
        String[] reg4 ={"123123123","123123123"};


        trabajadores.put("juanjo ramirez",reg1 );
        trabajadores.put("carlos hernan", reg2);
        trabajadores.put("francisco amela", reg3);
        trabajadores.put("jorge klk", reg4);

        String respuesta;
        do {
            System.out.println("Introduce nombre: ");

            respuesta = scan.nextLine();
            if(respuesta == ""){
                break;
            }else if (trabajadores.get(respuesta.toLowerCase()) == null){
                System.out.println("No hay registros sobre ese trabajador.");
            } else{
                for (int i = 0; i < trabajadores.get(respuesta.toLowerCase()).length; i++) {
                    System.out.println("Número de teléfono: "+trabajadores.get(respuesta.toLowerCase())[i]);
                }
            }
        }while (respuesta != "");



    }
}
