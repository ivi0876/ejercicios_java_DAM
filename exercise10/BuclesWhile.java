package exercise10;

public class BuclesWhile {
    public static void main(String[] args) {
        // Muestra números del 1 al 10 de forma creciente.
        System.out.println("Números del 1 al 10 de forma creciente:");
        int contador = 1;
        while (contador <= 10) {
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra números del 10 al 1 de forma descendente.
        System.out.println("Números del 10 al 1 de forma descendente:");
        int contador2 = 10;
        while (contador2 >= 1) {
            System.out.print(contador2 + " ");
            contador2--;
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra números pares entre 1 y 20 usando un contador de 2 en 2.
        System.out.println("Números pares entre 1 y 20 usando un contador de 2 en 2:");
        int contador3 = 2;
        while (contador3 <= 20) {
            System.out.print(contador3 + " ");
            contador3 += 2;
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra números pares entre 1 y 20 usando un contador de 1 en 1 y dentro un if comprobando el resto de la división entre 2.
        System.out.println("Números pares entre 1 y 20 usando un contador de 1 en 1:");
        int contador4 = 1;
        while (contador4 <= 20) {
            if (contador4 % 2 == 0) {  // Verifica si el número es par
                System.out.print(contador4 + " ");
            }
            contador4++;
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra números impares entre 1 y 20.
        System.out.println("Números impares entre 1 y 20:");
        int contador5 = 1;
        while (contador5 <= 20) {
            if (contador5 % 2 != 0) {  // Verifica si el número es impar
                System.out.print(contador5 + " ");
            }
            contador5++;
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra números múltiplos de 5 del 10 al 50 con un contador que vaya de 5 en 5.
        System.out.println("Números múltiplos de 5 del 10 al 50:");
        int contador6 = 10;
        while (contador6 <= 50) {
            System.out.print(contador6 + " ");
            contador6 += 5;
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra del 100 al 0 de forma decreciente pero con contador de 10 en 10.
        System.out.println("Números del 100 al 0 de forma decreciente:");
        int contador7 = 100;
        while (contador7 >= 0) {
            System.out.print(contador7 + " ");
            contador7 -= 10;
        }
        System.out.println(); // Salto de línea para separar resultados
    }
}
