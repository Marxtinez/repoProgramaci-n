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
    static double ronda = 0,
            cPapelIA = 0, cPiedraIA = 0, cTijeraIA = 0,
            cPapelJ = 0, cPiedraJ = 0, cTijeraJ = 0,
            cGanaIA = 0, cGanaJ = 0, cEmpate = 0;

    public static void main(String[] args){
        Scanner inputValue = new Scanner(System.in);
        double jjugador = 0;

        for (int i= 0; i<5; i++){

            do {
                System.out.println("Introduce tu jugada:");
                System.out.println(" - 0 --> piedra.");
                System.out.println(" - 1 --> papel.");
                System.out.println(" - 2 --> tijera.");
                jjugador = inputValue.nextInt();
                if(jjugador <0 || jjugador>3 ){
                    System.out.println("Número no válido. Por favor, introduce un valor permitido.");
                }
            }while (jjugador <0 || jjugador>3 );

            ronda++;

            if (jjugador == 0){
                System.out.println("Eliges: Piedra.");
                cPiedraJ++;
            }
            if (jjugador == 1){
                System.out.println("Eliges: Papel.");
                cPapelJ++;
            }
            if (jjugador == 2){
                System.out.println("Eliges: Tijera.");
                cTijeraJ++;
            }

            double jia = jugadaIA();
            System.out.print("La jugada de la IA es: ");
            if (jia == 0){System.out.println("Piedra.");}
            if (jia == 1){System.out.println("Papel.");}
            if (jia == 2){System.out.println("Tijera.");}

            String resultado = calculaGanador(jjugador, jia);
            System.out.println(resultado);
        }
        muestraEstadisticas();



    }
    public static int jugadaIA(){ //aleatorizarla
        double jia = (int) (Math.random() * 3);
        if (jia == 0){
            cPiedraIA++;
        }
        if (jia == 1){
            cPapelIA++;
        }
        if (jia == 2){
            cTijeraIA++;
        }
        return (int) jia;
    }
    public static String calculaGanador(double jjugador, double jia){
        String resultado = null;
        if(jjugador == 0 && jia == 0){
            cEmpate++;
            resultado = "Empate";

        }
        if(jjugador == 0 && jia == 1){
            cGanaIA++;
            resultado ="Gana la IA.";

        }
        if(jjugador == 0 && jia == 2){
            cGanaJ++;
            resultado = "Gana el humano.";

        }
        if(jjugador == 1 && jia == 0){
            cGanaJ++;
            resultado = "Gana el humano.";

        }
        if(jjugador == 1 && jia == 1){
            cEmpate++;
            resultado = "Empate.";

        }
        if(jjugador == 1 && jia == 2){
            cGanaIA++;
            resultado = "Gana la IA.";

        }
        if(jjugador == 2 && jia == 0){
            cGanaIA++;
            resultado = "Gana la IA.";

        }
        if(jjugador == 2 && jia == 1){
            cGanaJ++;
            resultado = "Gana el humano.";

        }
        if(jjugador == 2 && jia == 2){
            cEmpate++;
            resultado = "Empate.";

        }
    return resultado;
    }
    public static void muestraEstadisticas(){
        double porcentajeGanaIA, porcentajeGanaJ, porcentajeEmpate, porcentPiedra, porcentPapel, porcentTijera, totPiedra, totPapel, totTijera;

        porcentajeGanaIA = (cGanaIA*100)/ronda;
        porcentajeGanaJ = (cGanaJ*100)/ronda;
        porcentajeEmpate = (cEmpate*100)/ronda;

        double rondasTotales = cPapelIA + cPiedraIA + cTijeraIA + cPiedraJ + cPapelJ + cTijeraJ;

        totPiedra = ((cPiedraIA + cPiedraJ)*100)/rondasTotales;
        totPapel = ((cPapelIA + cPapelJ)*100)/rondasTotales;
        totTijera = ((cTijeraIA + cTijeraJ)*100)/rondasTotales;




        System.out.println("||FIN DE LA PARTIDA||");
        System.out.println("-Las estadísticas son:");
        System.out.println(" Partidas ganadas por la IA: " + porcentajeGanaIA + "%.");
        System.out.println(" Partidas ganadas por el jugador: " + porcentajeGanaJ + "%.");
        System.out.println(" Partidas con empate: " + porcentajeEmpate + "%.");
        System.out.println("Del total de " + rondasTotales + " rondas, los resultados han sido: ");
        System.out.println(" Partidas con resultado Piedra: " + totPiedra + "%.");
        System.out.println(" Partidas con resultado Papel: " + totPapel + "%.");
        System.out.println(" Partidas con resultado Tijera: " + totTijera + "%.");

    }

}
