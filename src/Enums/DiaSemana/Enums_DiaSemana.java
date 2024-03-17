package Enums.DiaSemana;

public class Enums_DiaSemana {
    public static void main(String[] args) {


        dimePlaneta(DiaSemana.jueves);


    }
    public static void dimePlaneta(DiaSemana dia){
        switch (dia){
            case lunes:
                System.out.println("Día de la Luna");
                break;
            case martes:
                System.out.println("Día de Marte");
                break;
            case miercoles:
                System.out.println("Dia de Mercurio");
                break;
            case jueves:
                System.out.println("Día de Júpiter");
                break;
            case viernes:
                System.out.println("Día de Venus");
                break;
            case sabado:
                System.out.println("Día de Saturno");
                break;
            case domingo:
                System.out.println("Día del Sol");
                break;
            default:
                System.out.println("Fin del mundo");
                break;
        }
    }
}
