package Boletin2.exercise10;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Bol2_Ejer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir dos números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Mostrar los valores antes del intercambio
        System.out.println("Antes del intercambio:");
        System.out.println("Primer número: " + num1);
        System.out.println("Segundo número: " + num2);

        // Intercambio de variables
        int temporal = num1; // Guardamos el valor de num1 en una variable temporal
        num1 = num2;     // Asignamos el valor de num2 a num1
        num2 = temporal;     // Asignamos el valor de la variable temporal (num1 original) a num2

        // Mostrar los valores después del intercambio
        System.out.println("Después del intercambio:");
        System.out.println("Primer número: " + num1);
        System.out.println("Segundo número: " + num2);

    }
}
