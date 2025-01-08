package Arrays.Actividad1;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // a) Pedir 10 números al usuario y almacenarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número entero (" + (i + 1) + "): ");
            numeros[i] = scanner.nextInt();
        }

        // b) Calcular la media utilizando una función
        double media = calcularMedia(numeros);

        // Mostrar el contenido del array con un bucle clásico
        System.out.println("Contenido del array:");
        for (int i = 0; i < numeros.length; i++) { 
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        // Mostrar el contenido del array con un for mejorado
        System.out.println("\nContenido del array (usando for mejorado):");
        int index = 1;
        for (int numero : numeros) { // For mejorado
            System.out.println("Número " + (index++) + ": " + numero);
        }

        // Mostrar la media
        System.out.println("\nLa media es: " + media);
    }

    // c) Función para calcular la media
    public static double calcularMedia(int[] array) {
        int suma = 0;
        for (int num : array) { // For mejorado
            suma += num;
        }
        return (double) suma / array.length;
    }
}
