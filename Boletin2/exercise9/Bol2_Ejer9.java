package Boletin2.exercise9;

import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol2_Ejer9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir la cantidad de números a leer
        System.out.print("¿Cuántos números deseas introducir? ");
        int cantidad = sc.nextInt();

        // Inicializamos el máximo
        System.out.print("Introduce número: ");
        int maximo = sc.nextInt(); // Guardamos el primer número como el mayor por ahora

        // Bucle para pedir los números restantes
        for (int i = 1; i < cantidad; i++) {
            System.out.print("Introduce número: ");
            int numero = sc.nextInt();
            
            // Si el número introducido es mayor que el máximo actual, lo actualizamos
            if (numero > maximo) {
                maximo = numero;
            }
        }

        // Mostrar el número máximo
        System.out.println("El número máximo introducido es " + maximo);
    }
}
