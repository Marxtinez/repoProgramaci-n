import java.util.Scanner;

public class Tablero {
    public static void main(String[] args) {
        // Crear una matriz de strings de tamaño 3x3 e inicializar con la letra 'B'
        String[][] matriz = new String[3][3];
        inicializarMatriz(matriz, "B");

        // Imprimir la matriz antes de la asignación
        System.out.println("Matriz antes de la asignación:");
        imprimirMatriz(matriz);

        // Pedir al usuario la posición y el valor a asignar
        asignarValorUsuario(matriz);

        // Imprimir la matriz después de la asignación
        System.out.println("\nMatriz después de la asignación:");
        imprimirMatriz(matriz);
        asignarValorUsuario(matriz);
        System.out.println("\nMatriz después de la asignación:");
        imprimirMatriz(matriz);
        asignarValorUsuario(matriz);
        System.out.println("\nMatriz después de la asignación:");
        imprimirMatriz(matriz);
        asignarValorUsuario(matriz);
        System.out.println("\nMatriz después de la asignación:");
        imprimirMatriz(matriz);
    }

    // Método para inicializar la matriz con un valor específico
    private static void inicializarMatriz(String[][] matriz, String valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
            }
        }
    }

    // Método para imprimir la matriz
    private static void imprimirMatriz(String[][] matriz) {
        for (String[] fila : matriz) {
            for (String elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    // Método para asignar un valor ingresado por el usuario a una posición específica
    private static void asignarValorUsuario(String[][] matriz) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngrese la fila (0, 1, 2): ");
        int fila = scanner.nextInt();

        System.out.print("Ingrese la columna (0, 1, 2): ");
        int columna = scanner.nextInt();

        System.out.print("Ingrese la letra a asignar: ");
        String letra = scanner.next();

        // Verificar que la posición ingresada sea válida
        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[fila].length) {
            matriz[fila][columna] = letra;
            System.out.println("Valor asignado correctamente.");
        } else {
            System.out.println("Posición inválida. No se pudo asignar el valor.");
        }
    }
}