package Boletin3.EjerciciosNuevos.exercise13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Bol3_Ejer13 {

    // Colores para la salida en consola
    private static final String ANSI_RESET = "\u001B[0m";
    // private static final String ANSI_GREEN = "\u001B[32m"; // Aciertos
    private static final String ANSI_RED = "\u001B[31m";   // Números del ordenador
    private static final String ANSI_BLUE = "\u001B[34m";  // Números seleccionados

    public static int tirarDado(int caras) {
        Random random = new Random();
        return random.nextInt(caras) + 1;
    }

    public static void jugarDados(int caras, String nombreUsuario) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tres números diferentes entre 1 y " + caras + ": ");
        int[] seleccionados = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            seleccionados[i] = sc.nextInt();
        }

        int dado1 = tirarDado(caras);
        int dado2;
        do {
            dado2 = tirarDado(caras);
        } while (dado2 == dado1);

        System.out.println("El ordenador ha tirado los dados: " + dado1 + " y " + dado2);

        int aciertos = 0;

        System.out.println("\nResultados:\n");
        for (int i = 1; i <= caras; i++) {
            if (i == dado1 || i == dado2) {
                System.out.print(ANSI_RED + i + ANSI_RESET + " ");
            } else if (esSeleccionado(i, seleccionados)) {
                System.out.print(ANSI_BLUE + i + ANSI_RESET + " ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 5 == 0) {
                System.out.println();
            }
        }

        for (int num : seleccionados) {
            if (num == dado1 || num == dado2) {
                aciertos++;
            }
        }

        System.out.println("\nHas tenido " + aciertos + " acierto(s).\n");
        guardarResultado(nombreUsuario, caras, aciertos);
    }

    public static boolean esSeleccionado(int num, int[] seleccionados) {
        for (int seleccionado : seleccionados) {
            if (seleccionado == num) {
                return true;
            }
        }
        return false;
    }

    public static void guardarResultado(String nombre, int caras, int aciertos) {
        // utilizo append para añadir contenido al final del archivo, no sobreescribirlo
        try (FileWriter writer = new FileWriter("Boletin3/EjerciciosNuevos/exercise13/ejercicio13datos.txt", true)) {
            writer.write(String.format("%-10s%4d%4d%n", nombre, caras, aciertos));
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static void mostrarArchivo() {
        try (Scanner fileScanner = new Scanner(new java.io.File("Boletin3/EjerciciosNuevos/exercise13/ejercicio13datos.txt"))) {
            System.out.println("\nContenido del archivo de récords:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Introduce tu nombre: ");
            String nombreUsuario = sc.next();

            System.out.print("¿Cuántas caras tendrán los dados? ");
            int caras = sc.nextInt();

            jugarDados(caras, nombreUsuario);

            System.out.print("¿Quieres jugar otra vez? (s/n): ");
            respuesta = sc.next();

        } while (respuesta.equalsIgnoreCase("s"));

        mostrarArchivo();
        System.out.println("¡Gracias por jugar!");
    }
}
