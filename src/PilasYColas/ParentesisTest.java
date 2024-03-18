package PilasYColas;

import org.junit.jupiter.api.Test;

import static PilasYColas.Parentesis.evaluarParentesis;
import static org.junit.jupiter.api.Assertions.*;

class ParentesisTest {

    @Test
    void evaluarParen() {
        Parentesis parentesis = new Parentesis();

        assertTrue(evaluarParentesis("{([{}])}"));
        assertTrue(evaluarParentesis("{([{uno}{otro}])([])}"));
        assertTrue(evaluarParentesis("{([{dos}}])([])}"));
        assertTrue(evaluarParentesis("{([{}{}])[])}"));
    }
}