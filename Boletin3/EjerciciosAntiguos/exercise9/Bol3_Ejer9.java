package Boletin3.EjerciciosAntiguos.exercise9;
import java.util.Random;
import java.util.Scanner;
@SuppressWarnings({ "resource" })


public class Bol3_Ejer9 {

    /**
     * Genera un resultado aleatorio para la quiniela normal.
     * @return "1", "X" o "2" aleatoriamente.
     */
    public static String generarResultadoNormal() {
        Random random = new Random();
        int resultado = random.nextInt(3); // Genera un número entre 0 y 2
        switch (resultado) {
            case 0: return "1";
            case 1: return "X";
            default: return "2";
        }
    }

    /**
     * Genera un resultado para la quiniela ponderada.
     * La probabilidad es: 1 -> 60%, X -> 25%, 2 -> 15%.
     * @return "1", "X" o "2" basado en probabilidades.
     */
    public static String generarResultadoPonderado() {
        Random random = new Random();
        int num = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        if (num <= 60) {
            return "1";
        } else if (num <= 85) {
            return "X";
        } else {
            return "2";
        }
    }

    /**
     * Muestra la quiniela en pantalla alineada en columna.
     * @param esPonderada Indica si la quiniela es ponderada o normal.
     */
    public static void mostrarQuiniela(boolean esPonderada) {
        System.out.println("Resultado de la quiniela:");
        for (int i = 1; i <= 14; i++) {
            String resultado;
            if (esPonderada) {
                resultado = generarResultadoPonderado();
            } else {
                resultado = generarResultadoNormal();
            }
            // Ajuste para mostrar alineado
            System.out.printf("Partido %2d: %s\n", i, resultado);
        }
    }

    /**
     * Método principal. Ofrece al usuario la opción de elegir entre quiniela normal o ponderada.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Menú de selección
        do {
            System.out.println("Elige el tipo de quiniela:");
            System.out.println("1. Quiniela normal");
            System.out.println("2. Quiniela ponderada");
            System.out.println("3. Salir");
            System.out.print("Introduce tu opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nHas elegido: Quiniela normal\n");
                    mostrarQuiniela(false); // Genera quiniela normal
                    break;
                case 2:
                    System.out.println("\nHas elegido: Quiniela ponderada\n");
                    mostrarQuiniela(true); // Genera quiniela ponderada
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige 1, 2 o 3.");
            }

            System.out.println(); // Línea en blanco para mejor legibilidad

        } while (opcion != 3);
    }
}
