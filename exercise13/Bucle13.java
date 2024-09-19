package exercise13;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bucle13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        // Bucle do-while para pedir un número entre 1 y 10
        do {
            System.out.print("Introduce un número decimal entre 1 y 10: ");
            numero = scanner.nextDouble();
            
            // Verificar si el número está en el rango permitido
            if (numero < 1 || numero > 10) {
                System.out.println("Error: El número debe estar entre 1 y 10. Por favor, inténtalo de nuevo.");
            }
        } while (numero < 1 || numero > 10); // Continuar mientras el número esté fuera del rango

        // Mostrar el número con printf ocupando 3 decimales
        System.out.printf("Número válido ingresado: %.3f%n", numero);
    }
}
