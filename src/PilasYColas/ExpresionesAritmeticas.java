package PilasYColas;
import java.util.*;

public class ExpresionesAritmeticas {
    public static String pila(String expresion) {
        String[] elementos = expresion.split(" ");
        Stack<Integer> pila = new Stack<>();

        try {
            for (String elemento : elementos) {

                if (elemento.equals("+")) {
                    int n2 = pila.pop();
                    int n1 = pila.pop();
                    pila.push(n1 + n2);

                } else if (elemento.equals("-")) {
                    int n2 = pila.pop();
                    int n1 = pila.pop();
                    pila.push(n1 - n2);

                } else if (elemento.equals("*")) {
                    int n2 = pila.pop();
                    int n1 = pila.pop();
                    pila.push(n1 * n2);

                } else if (elemento.equals("/")) {
                    int n2 = pila.pop();
                    int n1 = pila.pop();

                    if (n2 == 0) {
                        return "ERROR";
                    }
                    pila.push(n1 / n2);

                } else {

                    pila.push(Integer.parseInt(elemento));
                }
            }

            return String.valueOf(pila.pop());

        } catch (Exception e) {
            return "ERROR";
        }
    }

    public static String cola(String expresion) {
        String[] elementos = expresion.split(" ");
        Queue<Integer> cola = new LinkedList<>();

        try {
            for (String elemento : elementos) {

                if (elemento.equals("+")) {
                    int n2 = cola.poll();
                    int n1 = cola.poll();
                    cola.add(n1 + n2);

                } else if (elemento.equals("-")) {
                    int n2 = cola.poll();
                    int n1 = cola.poll();
                    cola.add(n1 - n2);

                } else if (elemento.equals("*")) {
                    int n2 = cola.poll();
                    int n1 = cola.poll();
                    cola.add(n1 * n2);

                } else if (elemento.equals("/")) {
                    int n2 = cola.poll();
                    int n1 = cola.poll();

                    if (n2 == 0) {
                        return "ERROR";
                    }
                    cola.add(n1 / n2);

                } else {
                    cola.add(Integer.parseInt(elemento));
                }
            }

            return String.valueOf(cola.poll());

        } catch (Exception e) {

            return "ERROR";
        }
    }
}
