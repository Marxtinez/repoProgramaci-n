package PilasYColas;

import org.junit.jupiter.api.Test;

import static PilasYColas.ExpresionesAritmeticas.*;
import static org.junit.jupiter.api.Assertions.*;

class ExpresionesAritmeticasTest {

    @Test
    void Pila() {
        ExpresionesAritmeticas e = new ExpresionesAritmeticas();

        assertEquals(pila("2 4 6 3 / * +"), "10");
        assertEquals(pila("6"), "6");
        assertEquals(pila("3 5 4 + *"), "27");
        assertEquals(pila("8 1 1 - /"), "ERROR");
        assertEquals(pila("1 1 - 8 /"), "0");
        assertEquals(pila("0 0 /"), "ERROR");
        assertEquals(cola("2 4 6 3 / * +"), "20");
        assertEquals(cola("6"), "6");
        assertEquals(cola("3 5 4 + *"), "32");
        assertEquals(cola("8 1 1 - /"), "-7");
        assertEquals(cola("1 1 - 8 /"), "ERROR");
        assertEquals(cola("0 0 /"), "ERROR");
    }
}