package Boletin2.exercise20;

import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol2_Ejer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el número de líneas para ambas figuras
        System.out.print("¿Cuántas líneas deseas mostrar? ");
        int n = sc.nextInt();

        // Parte a) Triángulo
        System.out.println("\nTriángulo:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte b) Pirámide
        System.out.println("\nPirámide:");
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios antes de los asteriscos
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos en cada fila, con la fórmula (2 * i - 1) para los asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}

