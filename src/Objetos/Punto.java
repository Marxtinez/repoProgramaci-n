package Objetos;

import java.util.Scanner;

//1. Creación de la clase Punto:
//a. Crea la clase Punto con dos atributos x e y de tipo entero.
//b. Incorpora un constructor sin parámetros que inicializa la posición a x=0 e y=0
//(0,0).
//c. Incorpora un constructor que recibe dos parámetros para inicializar la
//posición.
//d. Añade el método toString() que retorna un String con la información de la
//posición en formato “(x , y)”.
//e. Añade el método posiciona con dos parámetros que permitan mover el punto
//a la localización especificada
public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;

    }
    public String toString(){
        return  "("+x+","+y+")";
    }
    public void posicona(int posX, int posY){
        x = posX;
        y = posY;
    }
    //3.Encapsulación de la información en la clase Punto
    public int getX(){
        return this.x;
    }
    public int getY(){
        return  this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void desplaza(int desplazaX, int desplazaY){
        this.x = this.x+ desplazaX;
        this.y = this.y+ desplazaY;
    }

}
