package exercise6;
import java.util.Scanner;

public class Operacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repetir = 1;  // inicio en 1 para que entre al menos una vez en el bucle

        while (repetir == 1) {
            System.out.print("Dime un número real: ");
            double numero1 = sc.nextDouble();
            
            System.out.print("Dime otro número real: ");
            double numero2 = sc.nextDouble();

            // Realizar las operaciones básicas
            double suma = numero1 + numero2;
            double resta = numero1 - numero2;
            double multiplicacion = numero1 * numero2;
            
            // Verificar división por cero
            if (numero2 != 0) {
                double division = numero1 / numero2;
                System.out.println("División: " + division);
            } else {
                System.out.println("Error: No se puede dividir por cero.");
            }

            // Mostrar resultados de suma, resta y multiplicación
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);

            // Verificar si son múltiplos
            if (numero2 != 0 && numero1 % numero2 == 0) {
                System.out.printf("%.2f es múltiplo de %.2f\n", numero1, numero2);
            } else {
                System.out.println("No son múltiplos entre sí.");
            }

            // Determinar cuál es el mayor número
            if (numero1 > numero2) {
                System.out.println("El mayor número es: " + numero1);
            } else if (numero1 < numero2) {
                System.out.println("El mayor número es: " + numero2);
            } else {
                System.out.println("Ambos números son iguales.");
            }

            // Preguntar si desea repetir el programa
            System.out.print("Introduce 1 para repetir el programa o cualquier otro número para terminar: ");
            repetir = sc.nextInt();
        }

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
