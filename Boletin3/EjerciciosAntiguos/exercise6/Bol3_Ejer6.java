package Boletin3.EjerciciosAntiguos.exercise6;
import java.util.Scanner;
import java.util.Random;
@SuppressWarnings({ "resource" })

public class Bol3_Ejer6 {

    /**
     * Método que compara dos números.
     * @param num1 Primer número.
     * @param num2 Segundo número.
     * @return 0 si el primer número es menor, 1 si son iguales, 2 si es mayor.
     */
    public static int compara(int num1, int num2) {
        if (num1 < num2) {
            return 0; // num1 es menor
        } else if (num1 == num2) {
            return 1; // num1 es igual
        } else {
            return 2; // num1 es mayor
        }
    }

    /**
     * Método para pedir un número entre 1 y 100.
     * @return El número introducido por el usuario dentro del rango.
     */
    public static int pideNumero() {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número entre 1 y 100: ");
            numero = sc.nextInt();
            if (numero < 1 || numero > 100) {
                System.out.println("Número fuera de rango. Inténtalo de nuevo.");
            }
        } while (numero < 1 || numero > 100);
        return numero;
    }

    /**
     * Método para jugar en modo un jugador. El número es generado aleatoriamente.
     */
    public static void unJugador() {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        int intentos = 0;
        int numeroJugador;

        System.out.println("¡Bienvenido al juego de adivinar el número! (Modo 1 jugador)");

        do {
            numeroJugador = pideNumero();
            int resultado = compara(numeroAdivinar, numeroJugador);
            System.out.println(numeroAdivinar + " "+numeroJugador);;
            switch (resultado) {
                case 0:
                    System.out.println("El número es mayor.");
                    break;
                case 1:
                    System.out.println("¡Has acertado! El número era " + numeroAdivinar);
                    break;
                case 2:
                    System.out.println("El número ingresado es menor.");
                    break;
            }
            intentos++;
        } while (numeroJugador != numeroAdivinar);

        System.out.println("¡Lo conseguiste en " + intentos + " intentos!");
    }

    /**
     * Método para jugar en modo dos jugadores. El jugador 1 elige el número, y el jugador 2 lo intenta adivinar.
     */
    public static void dosJugadores() {
        System.out.println("Jugador 1: elige un número para que el Jugador 2 lo adivine.");
        int numeroAdivinar = pideNumero();
        int intentos = 0;
        int numeroJugador;
        
        System.out.println("Jugador 2: intenta adivinar el número.");
        
        do {
            numeroJugador = pideNumero();
            int resultado = compara(numeroAdivinar, numeroJugador);
            System.out.println(numeroAdivinar + " "+numeroJugador);;
            switch (resultado) {
                case 0:
                    System.out.println("El número es mayor.");
                    break;
                case 1:
                    System.out.println("¡Has acertado! El número era " + numeroAdivinar);
                    break;
                case 2:
                    System.out.println("El número ingresado es menor.");
                    break;
            }
            intentos++;
        } while (numeroJugador != numeroAdivinar);

        System.out.println("¡Lo conseguiste en " + intentos + " intentos!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elige el modo de juego:");
            System.out.println("1. Un jugador (el número es aleatorio)");
            System.out.println("2. Dos jugadores (el jugador 1 elige el número)");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    unJugador();
                    break;
                case 2:
                    dosJugadores();
                    break;
                case 0:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción no válida, elige 1, 2 o 0.");
            }
        } while (opcion != 0);
    }
}
