package Boletin2.ProjectFinal;
import java.util.Random;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class CarrerasCaballos {
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
        int[] posiciones = {0, 0, 0, 0}; // Posiciones de los caballos
        int meta = 50; // Distancia de la carrera
        int seleccionUsuario;

        // Menú inicial con arte ASCII
        System.out.println(PURPLE + "*****************************************");
        System.out.println("*     ¡BIENVENIDO A LA CARRERA ÉPICA!   *");
        System.out.println("*****************************************");
        System.out.println(RESET + "Selecciona tu caballo (1 a 4):");
        System.out.println("1. " + RED + "Caballo Rojo" + RESET);
        System.out.println("2. " + GREEN + "Caballo Verde" + RESET);
        System.out.println("3. " + YELLOW + "Caballo Amarillo" + RESET);
        System.out.println("4. " + BLUE + "Caballo Azul" + RESET);

        // Pedir al usuario que seleccione un caballo
        do {
            System.out.print(PURPLE + "Elige tu caballo: " + RESET);
            seleccionUsuario = scanner.nextInt();
        } while (seleccionUsuario < 1 || seleccionUsuario > 4);

        System.out.println(PURPLE + "*****************************************");
        System.out.println("*        ¡Que comience la carrera!      *");
        System.out.println("*****************************************" + RESET);

        boolean carreraTerminada = false;

        // Bucle para la carrera
        while (!carreraTerminada) {
            Thread.sleep(500); // Retardo para dar sensación de movimiento

            // Borrar la pantalla simulando una carrera en tiempo real
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Mover los caballos
            for (int i = 0; i < 4; i++) {
                int avance = random.nextInt(3) + 1; // Avance de 1 a 3 posiciones
                posiciones[i] += avance;

                // Si alguno de los caballos llega a la meta
                if (posiciones[i] >= meta) {
                    carreraTerminada = true;
                    posiciones[i] = meta;
                }
            }

            // Imprimir las posiciones de los caballos
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
                }

                // Imprimir el carril del caballo con el color correspondiente
                System.out.print(color + "Caballo " + (i + 1) + ": ");
                for (int j = 0; j < posiciones[i]; j++) {
                    System.out.print("-");
                }
                System.out.println(">");
                System.out.print(RESET);
            }
            System.out.println();

            // Verificar si algún caballo ha ganado
            if (carreraTerminada) {
                System.out.println(PURPLE + "*****************************************");
                System.out.println("* ¡LA CARRERA HA TERMINADO!             *");
                System.out.println("* Caballo Ganador: " + (seleccionUsuario) + "              *");
                System.out.println("*****************************************" + RESET);

                // Verificar si el caballo seleccionado por el usuario ha ganado
                if (posiciones[seleccionUsuario - 1] == meta) {
                    System.out.println(GREEN + "¡Felicidades! ¡Tu caballo ha ganado!" + RESET);
                } else {
                    System.out.println(RED + "Lo siento, tu caballo no ganó esta vez." + RESET);
                }

                // Preguntar si desea volver a jugar
                System.out.print(PURPLE + "¿Deseas jugar otra partida? (S/N): " + RESET);
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("S")) { // lo que hace esto es que sirve poner mayuscula o minuscula la letra
                    carreraTerminada = false;
                    posiciones = new int[]{0, 0, 0, 0}; // Reiniciar posiciones
                } else {
                    System.out.println(PURPLE + "¡Gracias por jugar!" + RESET);
                    break;
                }
            }
        }
    }
}
