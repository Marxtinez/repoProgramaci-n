package U05T04;

public class Autor {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if (controlGenero(genero)){
            this.genero=genero;
        }else{
            System.out.println("Valor de género no válido. Establecido en '?' por defecto. ");
            this.genero ='?';
        }
    }

    private char genero;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (controlEmail(email)){
            this.email=email;
        }else {
            System.out.println("Valor de email no válido. Establecido en 'null' por defecto. ");
            this.email = null;
        }
    }

    private String email;

    public Autor(String nombre, char genero, String email){

        if (controlGenero(genero)){
            this.genero=genero;
        }else{
            System.out.println("Valor de género no válido. Establecido en '?' por defecto. ");
            this.genero ='?';
        }
        if (controlEmail(email)){
            this.email=email;
        }else {
            System.out.println("Valor de email no válido. Establecido en 'null' por defecto. ");
            this.email = null;
        }
        this.nombre = nombre;



    }
    public boolean controlGenero(char genero){

        if (genero == 'm'|| genero == 'f'||genero=='n') {
            return true;
        }else {
            return false;
        }
    }
    public boolean controlEmail(String email){
        if(email.charAt(0) != '@' && email.charAt(email.length()-1) != '@' && email.contains("@")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return  nombre + " " + genero + " " +email ;
    }
}
