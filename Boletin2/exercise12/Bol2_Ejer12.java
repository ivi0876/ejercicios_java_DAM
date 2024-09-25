package Boletin2.exercise12;


public class Bol2_Ejer12 {
    public static void main(String[] args) {
        // a) Los números del 1 al 50
        System.out.println("a) Los números del 1 al 50:");
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // b) En orden inversa del 50 al 1
        System.out.println("\nb) En orden inversa del 50 al 1:");
        for (int i = 50; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // c) Los números pares menores que 20 por orden creciente
        System.out.println("\nc) Los números pares menores que 20:");
        for (int i = 2; i < 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea

        // d) Los números impares entre lo 90 y el 130 por orden creciente
        System.out.println("\nd) Los números impares entre 90 y 130:");
        for (int i = 91; i <= 130; i += 2) { // Comienza en 91, que es el primer impar mayor que 90
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea

        // e) Los múltiplos de 5 entre el 70 y el 25 por orden decreciente
        System.out.println("\ne) Los múltiplos de 5 entre el 70 y el 25 en orden decreciente:");
        for (int i = 70; i >= 25; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
