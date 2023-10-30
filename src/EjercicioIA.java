/*El juego consistirá, al menos de 5 rondas, donde el usuario y la IA, que tú vas a crear, escogen su jugada y se calcula el ganador.

El programa tendrá al menos tres métodos:

    Un método llamado jugadaIA que no tiene parámetros y devuelve la jugada del programa. Si optas por una solución con base aleatoria puedes consultar este artículo o bien el correspondiente a la documentación oficial.
    Un método llamado calculaGanador que recibe dos parámetros, la jugada realizada por el usuario y la jugada realizada por la IA, y devuelve el resultado que puede ser: Gana el usuario, gana la IA o empate.
    Un método llamado muestraEstadisticas, que recibe las jugadas realizadas en cada ronda y muestra:
            El % de partidas ganadas por cada jugador y empates
            El % ordenado de las jugadas seleccionadas (piedra, papel o tijera)*/
import java.util.Scanner;
import java.util.Random;
public class EjercicioIA {
    public static void main(String[] args){
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Introduce tu jugada:");
        System.out.println(" - 0 --> piedra.");
        System.out.println(" - 1 --> papel.");
        System.out.println(" - 2 --> tijera.");
        int jjugador = inputValue.nextInt();
        int jia = jugadaIA();

        String resultado = calculaGanador(jjugador, jia);



    }
    public static int jugadaIA(){ //aleatorizarla
        int jia = (int) (Math.random() * 3);
        return jia;
    }
    public static String calculaGanador(int jjugador, int jia){


    }
    public static String muestraEstadisticas(int ronda, String jjugador, String jia){

    }

}
