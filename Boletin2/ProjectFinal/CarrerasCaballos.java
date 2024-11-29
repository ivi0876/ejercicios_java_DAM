package Boletin2.ProjectFinal;

import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("resource")
public class CarrerasCaballos {
    // Colores ANSI
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[31m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";
    public static final String BLUE = "\033[34m";
    public static final String PURPLE = "\033[35m";
    public static final String CYAN = "\033[36m";

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] posiciones = {0, 0, 0, 0}; // Posiciones iniciales
        int meta = 50; // Distancia de la carrera
        int seleccionUsuario;
        int puntos = 100; // Puntos iniciales para el usuario
        boolean seguirJugando = true;

        while (seguirJugando) {
            // Menú inicial
            System.out.println(PURPLE + "*****************************************");
            System.out.println("*     ¡BIENVENIDO A LA CARRERA ÉPICA!   *");
            System.out.println("*****************************************");
            System.out.println(RESET + "Tienes " + GREEN + puntos + RESET + " puntos.");
            System.out.println("Selecciona tu caballo (1 a 4):");
            System.out.println("1. " + RED + "Caballo Rojo" + RESET);
            System.out.println("2. " + GREEN + "Caballo Verde" + RESET);
            System.out.println("3. " + YELLOW + "Caballo Amarillo" + RESET);
            System.out.println("4. " + BLUE + "Caballo Azul" + RESET);

            // Seleccionar caballo
            do {
                System.out.print(PURPLE + "Elige tu caballo: " + RESET);
                seleccionUsuario = scanner.nextInt();
            } while (seleccionUsuario < 1 || seleccionUsuario > 4);

            // Apuesta
            System.out.print(CYAN + "¿Cuántos puntos deseas apostar? (máx. " + puntos + "): " + RESET);
            int apuesta;
            do {
                apuesta = scanner.nextInt();
                if (apuesta > puntos || apuesta <= 0) {
                    System.out.println(RED + "Apuesta inválida. Inténtalo de nuevo." + RESET);
                }
            } while (apuesta > puntos || apuesta <= 0);

            System.out.println(PURPLE + "*****************************************");
            System.out.println("*        ¡Que comience la carrera!      *");
            System.out.println("*****************************************" + RESET);

            boolean carreraTerminada = false;

            // Bucle de la carrera
            while (!carreraTerminada) {
                Thread.sleep(500);

                // Simular movimiento
                System.out.print("\033[H\033[2J");
                System.out.flush();

                for (int i = 0; i < 4; i++) {
                    posiciones[i] += random.nextInt(3) + 1;
                    if (posiciones[i] >= meta) {
                        posiciones[i] = meta;
                        carreraTerminada = true;
                    }
                }

                // Mostrar posiciones
                for (int i = 0; i < 4; i++) {
                    String color = "";
                    switch (i) {
                        case 0:
                            color = RED;
                            break;
                        case 1:
                            color = GREEN;
                            break;
                        case 2:
                            color = YELLOW;
                            break;
                        case 3:
                            color = BLUE;
                            break;
                        default:
                            color = RESET;
                    };
                    System.out.print(color + "Caballo " + (i + 1) + ": ");
                    for (int j = 0; j < posiciones[i]; j++) {
                        System.out.print("-");
                    }
                    System.out.println(">");
                }
            }

            // Determinar ganador
            int ganador = 0;
            for (int i = 0; i < 4; i++) {
                if (posiciones[i] == meta) {
                    ganador = i + 1;
                    break;
                }
            }

            System.out.println(PURPLE + "*****************************************");
            System.out.println("* ¡LA CARRERA HA TERMINADO!             *");
            System.out.println("* Caballo Ganador: " + ganador + "                  *");
            System.out.println("*****************************************" + RESET);

            if (seleccionUsuario == ganador) {
                System.out.println(GREEN + "¡Felicidades! ¡Tu caballo ha ganado!" + RESET);
                puntos += apuesta;
            } else {
                System.out.println(RED + "Lo siento, tu caballo no ganó esta vez." + RESET);
                puntos -= apuesta;
            }

            // Revisar puntos
            if (puntos <= 0) {
                System.out.println(RED + "Te has quedado sin puntos. ¡Gracias por jugar!" + RESET);
                break;
            }

            // Preguntar si desea jugar otra vez
            System.out.print(PURPLE + "¿Deseas jugar otra partida? (S/N): " + RESET);
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                seguirJugando = false;
                System.out.println(PURPLE + "¡Gracias por jugar! Te vas con " + GREEN + puntos + RESET + " puntos.");
            }

            // Reiniciar posiciones
            posiciones = new int[]{0, 0, 0, 0};
        }
    }
}
