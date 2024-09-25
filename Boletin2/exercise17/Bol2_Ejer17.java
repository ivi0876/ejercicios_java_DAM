package Boletin2.exercise17;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol2_Ejer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            // Pedir un número entre 1 y 50
            int numero;
            do {
                System.out.print("Introduzca un número entre 1 y 50: ");
                numero = sc.nextInt();
                if (numero < 1 || numero > 50) {
                    System.out.println("Error: El número debe estar entre 1 y 50. Inténtelo de nuevo.");
                }
            } while (numero < 1 || numero > 50);

            // Calcular y mostrar los múltiplos del número entre 1 y 100
            int suma = 0;
            System.out.print("Múltiplos de " + numero + " entre 1 y 100: ");
            for (int i = numero; i <= 100; i += numero) {
                System.out.print(i + " ");
                suma += i;
            }
            System.out.println("\nLa suma de los múltiplos es: " + suma);

            // Preguntar si desea repetir el programa
            System.out.print("¿Desea probar otro número? (S/N): ");
            repetir = sc.next().charAt(0);

        } while (repetir == 'S' || repetir == 's');

        System.out.println("Programa finalizado.");
    }
}
