package Boletin3.exercise10;
import java.util.Random;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol3_Ejer10 {

    // Colores para la salida en consola
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m"; // Aciertos
    private static final String ANSI_RED = "\u001B[31m";   // Números del ordenador
    private static final String ANSI_BLUE = "\u001B[34m";  // Números seleccionados

    /**
     * Tira un dado de N caras y devuelve el resultado.
     * @param caras Número de caras del dado.
     * @return Resultado del dado.
     */
    public static int tirarDado(int caras) {
        Random random = new Random();
        return random.nextInt(caras) + 1; // Genera un número entre 1 y "caras"
    }

    /**
     * Juega un juego donde el usuario selecciona 3 números y se tiran dos dados.
     * @param caras Número de caras de los dados.
     */
    public static void jugarDados(int caras) {
        Scanner sc = new Scanner(System.in);

        // Pidiendo tres números distintos al usuario
        System.out.println("Introduce tres números diferentes entre 1 y " + caras + ": ");
        int[] seleccionados = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            seleccionados[i] = sc.nextInt();
        }

        // Tirada de dos dados
        int dado1 = tirarDado(caras);
        int dado2 = tirarDado(caras);

        System.out.println("El ordenador ha tirado los dados: " + dado1 + " y " + dado2);

        // Comprobando los aciertos
        int aciertos = 0;

        // Muestra los resultados en una tabla
        System.out.println("\nResultados:\n");
        for (int i = 1; i <= caras; i++) {
            if (i == dado1 || i == dado2) {
                System.out.print(ANSI_RED + i + ANSI_RESET + " ");
            } else if (esSeleccionado(i, seleccionados)) {
                System.out.print(ANSI_BLUE + i + ANSI_RESET + " ");
            } else if (i == dado1 || i == dado2) {
                System.out.print(ANSI_GREEN + i + ANSI_RESET + " ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 5 == 0) {
                System.out.println(); // Nueva línea cada 5 números
            }
        }

        // Verificar aciertos
        for (int num : seleccionados) {
            if (num == dado1 || num == dado2) {
                aciertos++;
            }
        }

        // Mostrando el resultado
        System.out.println("\nHas tenido " + aciertos + " acierto(s).\n");
    }

    /**
     * Comprueba si el número está en la selección del usuario.
     * @param num Número a comprobar.
     * @param seleccionados Números seleccionados por el usuario.
     * @return true si está seleccionado, false en caso contrario.
     */
    public static boolean esSeleccionado(int num, int[] seleccionados) {
        for (int seleccionado : seleccionados) {
            if (seleccionado == num) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método principal que ejecuta el juego.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Bienvenido al juego de los dados.");
            System.out.print("¿Cuántas caras tendrán los dados? ");
            int caras = sc.nextInt();

            jugarDados(caras);

            System.out.print("¿Quieres jugar otra vez? (s/n): ");
            respuesta = sc.next();

        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("¡Gracias por jugar!");
    }
}
