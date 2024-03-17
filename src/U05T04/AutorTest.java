package U05T04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @Test
    void setEmail() {
        Autor autor = new Autor("Brandon",'m',"dragonsteel@gmail.com" );
        assertEquals("Brandon", autor.getNombre());
        assertEquals('m', autor.getGenero());
        assertEquals("dragonsteel@gmail.com", autor.getEmail());
        autor.setEmail("a");
        assertNull(autor.getEmail());
        autor.setEmail("123abc@gmail.com");
        assertEquals("123abc@gmail.com", autor.getEmail());
    }

    @Test
    void testToString() {
        Autor autor = new Autor("Brandon",'m',"dragonsteel@gmail.com" );
        assertEquals("Brandon m dragonsteel@gmail.com", autor.toString());
    }
}