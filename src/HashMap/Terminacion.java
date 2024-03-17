package HashMap;

import java.util.*;

public class Terminacion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Integer> cantidadNumeros = new HashMap<>();
        cantidadNumeros.put(0,0);
        cantidadNumeros.put(1,0);
        cantidadNumeros.put(2,0);
        cantidadNumeros.put(3,0);
        cantidadNumeros.put(4,0);
        cantidadNumeros.put(5,0);
        cantidadNumeros.put(6,0);
        cantidadNumeros.put(7,0);
        cantidadNumeros.put(8,0);
        cantidadNumeros.put(9,0);

        String numero;
        ArrayList<String> numeros = new ArrayList<>();

        do {
            System.out.println("Introduce número de la lotería (enter vacío para finalizar): ");
            numero = scan.nextLine();
            if (numero!= "") {
                numeros.add(numero);
            }

        }while (numero != "" );

        for (int i = 0; i < numeros.size(); i++) {
            int value;
            value = Character.getNumericValue(numeros.get(i).charAt(numeros.get(i).length()-1));

            cantidadNumeros.put(value,(cantidadNumeros.get(value)+1));

        }
        System.out.println("La cantidad de números que acaban en 0 es de: "+cantidadNumeros.get(0));
        System.out.println("La cantidad de números que acaban en 1 es de: "+cantidadNumeros.get(1));
        System.out.println("La cantidad de números que acaban en 2 es de: "+cantidadNumeros.get(2));
        System.out.println("La cantidad de números que acaban en 3 es de: "+cantidadNumeros.get(3));
        System.out.println("La cantidad de números que acaban en 4 es de: "+cantidadNumeros.get(4));
        System.out.println("La cantidad de números que acaban en 5 es de: "+cantidadNumeros.get(5));
        System.out.println("La cantidad de números que acaban en 6 es de: "+cantidadNumeros.get(6));
        System.out.println("La cantidad de números que acaban en 7 es de: "+cantidadNumeros.get(7));
        System.out.println("La cantidad de números que acaban en 8 es de: "+cantidadNumeros.get(8));
        System.out.println("La cantidad de números que acaban en 9 es de: "+cantidadNumeros.get(9));
    }
}
