package Boletin3.piramide;

import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el número de líneas para ambas figuras
        System.out.print("¿Cuántas líneas deseas mostrar? ");
        int n = sc.nextInt();

        // Llamar a las funciones para imprimir el triángulo y la pirámide
        System.out.println("\nTriángulo:");
        printTriangulo(n);

        System.out.println("\nPirámide:");
        printPiramide(n);

        sc.close();
    }

    // Función para imprimir un triángulo de n líneas
    private static void printTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            printCharacters('*', i);
            System.out.println();
        }
    }

    // Función para imprimir una pirámide de n líneas
    private static void printPiramide(int n) {
        for (int i = 1; i <= n; i++) {
            printCharacters(' ', n - i);            // Espacios antes de los asteriscos
            printCharacters('*', 2 * i - 1);        // Asteriscos en cada fila
            System.out.println();
        }
    }


    private static void printCharacters(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
    }
}

