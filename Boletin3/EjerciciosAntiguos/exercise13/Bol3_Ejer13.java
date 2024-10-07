package Boletin3.EjerciciosAntiguos.exercise13;
import java.util.Random;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

/**
 * Simulación del juego West Bank donde el jugador actúa como sheriff en un banco del viejo oeste.
 */
public class Bol3_Ejer13 {

    // Variables globales
    private static int vidas = 3; // Vidas del sheriff
    private static int puntos = 0; // Puntos obtenidos por matar bandidos
    private static int clientesEntrados = 0; // Contador de clientes que entran

    /**
     * Genera un número aleatorio que representa la puerta (1, 2 o 3) que se abrirá.
     * 
     * @return número aleatorio entre 1 y 3
     */
    public static int puertaAleatoria() {
        Random random = new Random();
        return random.nextInt(3) + 1; // Retorna un número entre 1 y 3
    }

    /**
     * Simula la entrada de un cliente o bandido. 
     * 
     * @return true si es un bandido, false si es un cliente.
     */
    public static boolean esBandido() {
        Random random = new Random();
        return random.nextBoolean(); // Retorna true (bandido) o false (cliente)
    }

    /**
     * Lógica del juego donde el sheriff elige puerta y acción (disparar o no).
     */
    public static void jugar() {
        Scanner scanner = new Scanner(System.in);
        
        while (vidas > 0) {
            System.out.println("\n\u001B[34m--- Bienvenido al juego West Bank ---\u001B[0m");
            System.out.printf("\u001B[32mVidas: %d | Puntos: %d\u001B[0m%n", vidas, puntos);
            System.out.print("\u001B[33mElige una puerta (1, 2 o 3): \u001B[0m");
            int puertaElegida = scanner.nextInt();

            System.out.print("\u001B[33m¿Disparar? (1: Sí, 0: No): \u001B[0m");
            int decisionDisparo = scanner.nextInt();
            boolean disparar = (decisionDisparo == 1); // True si elige disparar

            int puertaAbierta = puertaAleatoria();
            boolean esBandido = esBandido(); // Determina si es bandido o cliente

            System.out.printf("\u001B[35mSe abre la puerta %d.\u001B[0m%n", puertaAbierta);
            System.out.printf("\u001B[35m%s ha entrado por la puerta %d.\u001B[0m%n",
                    esBandido ? "Un bandido" : "Un cliente", puertaAbierta);

            // Verifica si la puerta del sheriff coincide con la que se abrió
            if (puertaElegida == puertaAbierta) {
                if (esBandido) {
                    if (disparar) {
                        puntos++; // El sheriff gana un punto
                        System.out.println("\u001B[32m¡Has matado al bandido! Ganaste 1 punto.\u001B[0m");
                    } else {
                        // 50% de probabilidad de perder una vida
                        if (new Random().nextBoolean()) {
                            vidas--; // Pierde una vida
                            System.out.println("\u001B[31m¡Has perdido una vida! (El bandido te atacó).\u001B[0m");
                        } else {
                            System.out.println("\u001B[32mEl bandido te ha ignorado.\u001B[0m");
                        }
                    }
                } else { // Cliente
                    if (disparar) {
                        if (new Random().nextBoolean()) {
                            vidas--; // Pierde una vida
                            System.out.println("\u001B[31m¡Has matado al cliente! Has perdido 1 vida.\u001B[0m");
                        } else {
                            System.out.println("\u001B[32mHas fallado el tiro al cliente.\u001B[0m");
                        }
                    } else {
                        System.out.println("\u001B[32mEl cliente ha entrado sin problemas.\u001B[0m");
                    }
                }

                clientesEntrados++;
                // Cada 3 clientes se le da una vida extra
                if (clientesEntrados % 3 == 0) {
                    vidas++;
                    System.out.println("\u001B[32m¡Has ganado una vida extra! Ahora tienes " + vidas + " vidas.\u001B[0m");
                }
            } else {
                System.out.println("\u001B[32mNadie entró por la puerta que elegiste.\u001B[0m");
            }

            // Fin del juego si se han perdido todas las vidas
            if (vidas <= 0) {
                System.out.println("\u001B[31m¡Has perdido todas tus vidas! Fin del juego.\u001B[0m");
            }
        }
    }

    /**
     * Método principal que inicia el juego.
     * 
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        jugar(); // Inicia el juego
    }
}
