package Boletin3_Opcional.exercise2;

import java.util.Scanner;

public class ComparadorYMultiplo {

    // a) Función para comparar dos números reales
    public static int compararNumeros(double num1, double num2) {
        if (num1 > num2) {
            return 1;
        } else if (num2 > num1) {
            return 2;
        } else {
            return 0;
        }
    }

    // b) Función para verificar si dos enteros son múltiplos
    public static boolean sonMultiplos(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return false; // Evitar división por cero
        }
        return (num1 % num2 == 0) || (num2 % num1 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejemplo de uso para la función compararNumeros
        System.out.print("Introduce el primer número real: ");
        double numero1 = sc.nextDouble();
        
        System.out.print("Introduce el segundo número real: ");
        double numero2 = sc.nextDouble();
        
        int resultadoComparacion = compararNumeros(numero1, numero2);
        
        switch (resultadoComparacion) {
            case 1:
                System.out.println("El primer número es mayor.");
                break;
            case 2:
                System.out.println("El segundo número es mayor.");
                break;
            case 0:
                System.out.println("Los números son iguales.");
                break;
            default:
                System.out.println("Resultado no válido.");
                break;
        }

        
        System.out.print("Introduce el primer número entero: ");
        int entero1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número entero: ");
        int entero2 = sc.nextInt();
        
        boolean resultadoMultiplo = sonMultiplos(entero1, entero2);
        
        if (resultadoMultiplo) {
            System.out.println("Los números son múltiplos entre sí.");
        } else {
            System.out.println("Los números no son múltiplos entre sí.");
        }

        sc.close();
    }
}

