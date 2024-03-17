package U05T04;

public class Libro {
    private String nombre;
    private Autor autor;
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    private double precio;
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    private int stock;
    public Libro(String nombre, Autor autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = -1;
        this.stock = 0;
    }
    public Libro(String nombre, Autor autor, double precio, int stock) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public Autor getAutor() {
        return autor;
    }
    public String getAutorNombre(){
        return autor.getNombre();
    }
    public char getAutorGenero(){
        return autor.getGenero();
    }
    public String getAutorEmail(){
        return autor.getEmail();
    }
    @Override
    public String toString() {
        return nombre+" "+ autor.getNombre() + " "+(autor.getGenero())+" "+autor.getEmail();
    }
}