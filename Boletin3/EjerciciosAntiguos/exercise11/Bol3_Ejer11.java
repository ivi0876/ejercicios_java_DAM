package Boletin3.EjerciciosAntiguos.exercise11;
import java.util.Random;
import java.util.Scanner;
@SuppressWarnings({ "resource" })


public class Bol3_Ejer11 {
    private static final int CARAS = 6; // Número de caras de los dados
    private static Random random = new Random(); // Generador de números aleatorios

    /**
     * Método para tirar dos dados y calcular la suma.
     * @return La suma de los dos dados.
     */
    public static int tirada() {
        int dado1 = random.nextInt(CARAS) + 1; // Tirar el primer dado
        int dado2 = random.nextInt(CARAS) + 1; // Tirar el segundo dado
        int suma = dado1 + dado2; // Calcular la suma
        System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2 + ", Suma: " + suma);
        return suma; // Devolver la suma
    }

    /**
     * Método para comprobar el resultado de la tirada.
     * @param suma La suma de los dados.
     * @return -1 si pierde, 0 si gana o la puntuación en caso de que se mantenga el punto.
     */
    public static int comprobacion(int suma) {
        if (suma == 7 || suma == 11) {
            return 0; // Gana
        } else if (suma == 2 || suma == 3 || suma == 12) {
            return -1; // Pierde
        } else {
            return suma; // Se establece el punto
        }
    }

    /**
     * Método principal que ejecuta el juego de Craps.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jugar;

        do {
            System.out.println("\n--- Bienvenido al juego de Craps ---");
            int sumaJugador = tirada(); // Tirada del jugador
            int resultadoJugador = comprobacion(sumaJugador); // Comprobación del resultado

            if (resultadoJugador == 0) {
                System.out.println("¡Has ganado!");
            } else if (resultadoJugador == -1) {
                System.out.println("¡Has perdido!");
            } else {
                // El jugador ha establecido un punto
                int punto = resultadoJugador;
                System.out.println("Tu punto es: " + punto);
                int sumaCPU;

                // La CPU tirará hasta que gane o pierda
                do {
                    sumaCPU = tirada();
                    int resultadoCPU = comprobacion(sumaCPU);

                    if (resultadoCPU == 0) {
                        System.out.println("¡La CPU ha ganado!");
                        break;
                    } else if (resultadoCPU == -1) {
                        System.out.println("¡La CPU ha perdido!");
                        break;
                    } else {
                        System.out.println("La CPU ha establecido su punto: " + resultadoCPU);
                        if (resultadoCPU == punto) {
                            System.out.println("¡Es un empate!");
                            break;
                        }
                    }

                } while (true); // Continua hasta que haya un ganador o empate
            }

            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            jugar = scanner.next();

        } while (jugar.equalsIgnoreCase("s"));

        System.out.println("¡Gracias por jugar!");
    }
}
