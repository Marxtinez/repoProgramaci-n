package PilasYColas;
import java.util.*;

public class ExpresionesAritmeticas {
    public static String pila(String expresion) {
        String[] elementos = expresion.split(" ");
        Deque<Integer> pila = new ArrayDeque<>();
        for (String elemento : elementos) {
            if (elemento.matches("\\d+")) {
                pila.push(Integer.parseInt(elemento));
            } else {
                if (pila.size() < 2) {
                    return "ERROR";
                } else {
                    int operando2 = pila.pop();
                    int operando1 = pila.pop();
                    switch (elemento) {
                        case "+":
                            pila.push(operando1 + operando2);
                            break;
                        case "-":
                            pila.push(operando1 - operando2);
                            break;
                        case "*":
                            pila.push(operando1 * operando2);
                            break;
                        case "/":
                            if (operando2 == 0) {
                                return "ERROR";
                            }
                            pila.push(operando1 / operando2);
                            break;
                    }
                }
            }
        }
        if (pila.size() == 1) {
            return Integer.toString(pila.pop());
        } else {
            return "ERROR";
        }
    }

    public static String cola(String expresion) {
        String[] elementos = expresion.split(" ");
        Deque<Integer> cola = new ArrayDeque<>();
        for (String elemento : elementos) {
            if (elemento.matches("\\d+")) {
                cola.offer(Integer.parseInt(elemento));
            } else {
                if (cola.size() < 2) {
                    return "ERROR";
                } else {
                    int operando1 = cola.poll();
                    int operando2 = cola.poll();
                    switch (elemento) {
                        case "+":
                            cola.offerFirst(operando1 + operando2);
                            break;
                        case "-":
                            cola.offerFirst(operando1 - operando2);
                            break;
                        case "*":
                            cola.offerFirst(operando1 * operando2);
                            break;
                        case "/":
                            if (operando2 == 0) {
                                return "ERROR";
                            }
                            cola.offerFirst(operando1 / operando2);
                            break;
                    }
                }
            }
        }
        if (cola.size() == 1) {
            return Integer.toString(cola.poll());
        } else {
            return "ERROR";
        }
    }
}
