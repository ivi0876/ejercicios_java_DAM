package Boletin2.exercise16;
import java.util.Scanner;

public class Bol2_Ejer16 {
    // Códigos de colores ANSI
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroJugador1;
        int numeroJugador2;
        int intentosMax = 5;
        int intentosRestantes;
        char jugarDeNuevo;

        do {
            System.out.println(ANSI_CYAN + "===============================================");
            System.out.println(ANSI_GREEN + "           ¡Bienvenidos al juego de adivinar!  ");
            System.out.println(ANSI_CYAN + "===============================================");
            System.out.println(ANSI_YELLOW + "Reglas:");
            System.out.println("Jugador 1 elige un número secreto entre 1 y 100.");
            System.out.println("Jugador 2 tiene 5 intentos para adivinar el número.");
            System.out.println("Se indicará si el número es mayor o menor en cada intento.");
            System.out.println("¡Buena suerte!");
            System.out.println(ANSI_CYAN + "===============================================" + ANSI_RESET);

            // Pedir número al Jugador 1
            do {
                System.out.print(ANSI_YELLOW + "Jugador 1, elige un número entre 1 y 100: " + ANSI_RESET);
                numeroJugador1 = scanner.nextInt();

                if (numeroJugador1 < 1 || numeroJugador1 > 100) {
                    System.out.println(ANSI_RED + "Número fuera de rango. Debe estar entre 1 y 100." + ANSI_RESET);
                }
            } while (numeroJugador1 < 1 || numeroJugador1 > 100);

            // Simular "borrar" la pantalla imprimiendo varias líneas en blanco
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }

            // Jugador 2 intenta adivinar el número
            intentosRestantes = intentosMax;
            boolean adivinado = false;

            while (intentosRestantes > 0 && !adivinado) {
                do {
                    System.out.print(ANSI_CYAN + "Jugador 2, intenta adivinar el número entre 1 y 100: " + ANSI_RESET);
                    numeroJugador2 = scanner.nextInt();

                    if (numeroJugador2 < 1 || numeroJugador2 > 100) {
                        System.out.println(ANSI_RED + "Número fuera de rango. Debe estar entre 1 y 100." + ANSI_RESET);
                    }
                } while (numeroJugador2 < 1 || numeroJugador2 > 100);

                // Comparar el número
                if (numeroJugador2 == numeroJugador1) {
                    System.out.println(ANSI_GREEN + "¡Felicidades, has adivinado el número!" + ANSI_RESET);
                    adivinado = true;
                } else if (numeroJugador2 < numeroJugador1) {
                    System.out.println(ANSI_PURPLE + "El número es mayor. Te quedan " + (intentosRestantes - 1) + " intentos." + ANSI_RESET);
                } else {
                    System.out.println(ANSI_PURPLE + "El número es menor. Te quedan " + (intentosRestantes - 1) + " intentos." + ANSI_RESET);
                }

                intentosRestantes--;
            }

            // Si no lo adivina en los intentos disponibles
            if (!adivinado) {
                System.out.println(ANSI_RED + "Lo siento, has agotado los intentos. El número era: " + numeroJugador1 + ANSI_RESET);
            }

            // Preguntar si se desea jugar de nuevo
            System.out.print(ANSI_BLUE + "¿Deseas jugar otra partida? (S/N): " + ANSI_RESET);
            jugarDeNuevo = scanner.next().charAt(0);

        } while (jugarDeNuevo == 'S' || jugarDeNuevo == 's');

        System.out.println(ANSI_YELLOW + "Gracias por jugar. ¡Hasta la próxima!" + ANSI_RESET);
        scanner.close();
    }

}
