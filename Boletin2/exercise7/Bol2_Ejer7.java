package Boletin2.exercise7;

import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol2_Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Media de 5 números");
            System.out.println("2. Media de números indefinidos (termina con 0)");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Media de 5 números
                    double suma = 0;
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Introduce número " + i + ": ");
                        suma += sc.nextDouble();
                    }
                    double media = suma / 5;
                    System.out.printf("La media de los 5 números es: %.2f%n", media);
                    break;

                case 2:
                    // Media de números indefinidos
                    double sumaIndefinida = 0;
                    int contador = 0;
                    double numero;
                    do {
                        System.out.print("Introduce un número (0 para terminar): ");
                        numero = sc.nextDouble();
                        if (numero != 0) {
                            sumaIndefinida += numero;
                            contador++;
                        }
                    } while (numero != 0);

                    if (contador > 0) {
                        double mediaIndefinida = sumaIndefinida / contador;
                        System.out.printf("La media de los números introducidos es: %.2f%n", mediaIndefinida);
                    } else {
                        System.out.println("No se introdujeron números válidos.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);
    }
}
