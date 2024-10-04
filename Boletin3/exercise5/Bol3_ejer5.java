package Boletin3.exercise5;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol3_ejer5 {

    /**
     * Método que determina si un número es primo.
     * @param num Número a verificar.
     * @return true si el número es primo, false en caso contrario.
     */
    public static boolean esPrimo(int num) {
        // Un número menor o igual a 1 no es primo
        if (num <= 1) {
            return false;
        }
        
        // Solo necesitamos comprobar divisores hasta la raíz cuadrada del número
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Si es divisible por cualquier número entre 2 y la raíz, no es primo
            }
        }
        return true; // Si no tiene divisores, es primo
    }

    /**
     * Programa principal que pide un número al usuario y muestra los primos menores que ese número.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario un número mayor que 1
        System.out.print("Introduce un número mayor que 1: ");
        int limite = sc.nextInt();

        // Mostrar todos los números primos menores que el número ingresado
        System.out.println("Los números primos menores que " + limite + " son:");
        for (int i = 2; i < limite; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
