package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Botin {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int primer;
        int numero;

        ArrayList<Integer> numeros = new ArrayList<>();

        do {
            System.out.println("Introduce cantidad de miembros: ");
            primer = scan.nextInt();
            if (primer <= 0) {
                primer=0;
            }
        }while (primer <= 0 );


        do {
            System.out.println("Introduce billets (0 para finalizar): ");
            numero = scan.nextInt();
            if (numero > 0) {
                numeros.add(numero);
            }

        }while (numero > 0 );
        System.out.println("El reparto queda: "+repartir(primer,numeros.stream().toArray()));
    }

    public static String repartir(int participantes, Object[] billetes){

        HashMap <Integer, String> reparto = new HashMap<>();
        for (int i = 0; i < billetes.length; i++) {

            String botin = reparto.get(i % participantes);

            //System.out.println("Botín: "+botin);
            //System.out.println(i%participantes);

            if (botin ==  null){
                reparto.put(i % participantes, billetes[i] + " ");
            }else{
                reparto.put(i % participantes, botin + " " + billetes[i]);
            }
        }
        return reparto.toString();
    }

    }
