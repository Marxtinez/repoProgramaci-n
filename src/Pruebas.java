import java.util.Scanner;

public class Pruebas {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Fecha f1 = new Fecha(inputDia(), inputMes(), inputAnio());

        if (f1.valida())
            System.out.println("La fecha: " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio() + " es válida");
        else
            System.out.println("La fecha: " + f1.getDia() + "/" +f1.getMes()+ "/" + f1.getAnio() + " NO es válida");
    }

    public static int inputDia() {
        System.out.println("Introduce un día: ");
        return teclado.nextInt();
    }
    public static int inputMes() {
        System.out.println("Introduce un mes: ");
        return teclado.nextInt();
    }

    public static int inputAnio() {
        System.out.println("Introduce un año: ");
        return teclado.nextInt();
    }
}

    class Fecha {
        private int dia;
        private int mes;
        private int anio;

        public Fecha(int dia, int mes, int anio) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        }

        public boolean valida() {
            if (dia < 1 || dia > 31) return false;
            if (mes < 1 || mes > 12) return false;
            if (anio < 0) return false;
            // determinamos la cantidad de días del mes:
            int diasMes = 0;
            switch (mes) {
                case 12:
                    diasMes = 31;
                    break;
                case 11:
                    diasMes = 30;
                    break;
                case 2: // verificación de año bisiesto
                    if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio %
                            100 != 0)))
                        diasMes = 29;
                    else
                        diasMes = 28;
                    break;

            }
            return dia <= diasMes;
        }

        public int getDia() {
            return dia;
        }

        public int getMes() {
            return mes;
        }

        public int getAnio() {
            return anio;
        }
}

