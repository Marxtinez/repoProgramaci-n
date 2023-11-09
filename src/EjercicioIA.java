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
    static int ronda = 0,
            cPapelIA = 0, cPiedraIA = 0, cTijeraIA = 0,
            cPapelJ = 0, cPiedraJ = 0, cTijeraJ = 0,
            cGanaIA = 0, cGanaJ = 0, cEmpate = 0;

    public static void main(String[] args){
        Scanner inputValue = new Scanner(System.in);
        int jjugador = 0;

        while(jjugador != 0 || jjugador != 1 ||jjugador != 2) {
            System.out.print("Introduce tu jugada:");
            System.out.println(" - 0 --> piedra.");
            System.out.println(" - 1 --> papel.");
            System.out.println(" - 2 --> tijera.");
            jjugador = inputValue.nextInt();
            int jia = jugadaIA();

            String resultado = calculaGanador(jjugador, jia);
        }



    }
    public static int jugadaIA(){ //aleatorizarla
        int jia = (int) (Math.random() * 3);
        return jia;
    }
    public static String calculaGanador(int jjugador, int jia){
        if(jjugador == 0 && jia == 0){
            cEmpate ++;
            return "Empate.";

        }
        if(jjugador == 0 && jia == 1){
            cGanaIA++;
            return "Gana la IA.";

        }
        if(jjugador == 0 && jia == 2){
            cGanaJ++;
            return "Gana el humano.";

        }
        if(jjugador == 1 && jia == 0){
            cGanaJ++;
            return "Gana el humano.";

        }
        if(jjugador == 1 && jia == 1){
            cEmpate ++;
            return "Empate.";

        }
        if(jjugador == 1 && jia == 2){
            cGanaIA++;
            return "Gana la IA.";

        }
        if(jjugador == 2 && jia == 0){
            cGanaIA++;
            return "Gana la IA.";

        }
        if(jjugador == 2 && jia == 1){
            cGanaJ++;
            return "Gana el humano.";

        }
        if(jjugador == 2 && jia == 2){
            cEmpate ++;
            return "Empate.";

        }


    }
    public static String muestraEstadisticas(int ronda, String jjugador, String jia){

    }

}
