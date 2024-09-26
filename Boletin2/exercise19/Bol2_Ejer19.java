package Boletin2.exercise19;

import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol2_Ejer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menú principal
        System.out.println("Opciones:");
        System.out.println("1. Dibujar ristra de asteriscos en línea");
        System.out.println("2. Dibujar ristra de asteriscos en diagonal");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        // Solicitar el número de asteriscos
        System.out.print("¿Cuántos asteriscos deseas dibujar? ");
        int N = sc.nextInt();

        switch (opcion) {
            case 1:
                // Parte a) Ristra de asteriscos en línea recta
                for (int i = 0; i < N; i++) {
                    System.out.print("*");
                }
                System.out.println();  // Salto de línea al final
                break;

            case 2:
                // Parte b) Ristra en diagonal
                System.out.print("¿Quieres que la diagonal vaya de izquierda a derecha (1) o de derecha a izquierda (2)? ");
                int direccion = sc.nextInt();

                if (direccion == 1) {
                    // Diagonal de izquierda a derecha
                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                } else if (direccion == 2) {
                    // Diagonal de derecha a izquierda
                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < N - i - 1; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                } else {
                    System.out.println("Opción inválida.");
                }
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}

