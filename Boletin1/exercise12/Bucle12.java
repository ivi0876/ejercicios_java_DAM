package Boletin1.exercise12;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Bucle12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Bucle do-while para pedir un número positivo
        do {
            System.out.print("Introduce un número entero: ");
            numero = scanner.nextInt();
            
            // Verificar si el número es negativo
            if (numero < 0) {
                System.out.println("Error: El número es negativo. Por favor, introduce un número positivo.");
            }
        } while (numero <= 0); // Continuar mientras el número sea negativo o cero

        // Mostrar el número con printf ocupando 5 espacios
        System.out.printf("Número positivo ingresado: %5d%n", numero);
    }
}
