package PilasYColas;

import java.util.Stack;

public class Parentesis {
    static boolean evaluarParentesis(String s){
      Stack<Character> pila = new Stack<>(); //Las pilas son LIFO

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            pila.push(s.charAt(i));
            else if (s.charAt(i) == ')' && pila.peek() == '('){
                    pila.pop();
            }else if (s.charAt(i) == '}' && pila.peek() == '{'){
             pila.pop();
            }else if (s.charAt(i) == ']' && pila.peek() == '['){
                    pila.pop();
            }
        }
        return pila.isEmpty();
    }
}
