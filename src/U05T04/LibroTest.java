package U05T04;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LibroTest {
    @Test
    void setPrecio() {
        Libro libro = new Libro("Juramentada", new Autor("Brandon Sanderson", 'm',"dragonsteel@gmail.com"));
        libro.setPrecio(16.5);
        libro.setStock(100);
        assertEquals(16.5,libro.getPrecio());
    }
    @Test
    void setStock() {
        Libro libro = new Libro("Juramentada", new Autor("Brandon Sanderson", 'm',"dragonsteel@gmail.com"), 16.5,100);
        assertEquals(100,libro.getStock());
    }
    @Test
    void testToString() {
        Libro libro = new Libro("Juramentada", new Autor("Brandon Sanderson", 'm',"dragonsteel@gmail.com"), 16.5,100);
        assertEquals(libro.toString(), "Juramentada Brandon Sanderson m dragonsteel@gmail.com");
    }
}