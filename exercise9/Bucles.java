package exercise9;

public class Bucles {
    public static void main(String[] args) {
        // Muestra números del 1 al 10 de forma creciente.
        System.out.println("Números del 1 al 10 de forma creciente:");
        for (int contador = 1; contador <= 10; contador++) {
            System.out.print(contador + " ");
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra números del 10 al 1 de forma descendente.
        System.out.println("Números del 10 al 1 de forma descendente:");
        for (int contador2 = 10; contador2 >= 1; contador2--) {
            System.out.print(contador2 + " ");
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra números pares entre 1 y 20 usando un contador de 2 en 2.
        System.out.println("Números pares entre 1 y 20 usando un contador de 2 en 2:");
        for (int contador3 = 2; contador3 <= 20; contador3 += 2) {
            System.out.print(contador3 + " ");
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra números pares entre 1 y 20 usando un contador de 1 en 1 y dentro un if comprobando el resto de la división entre 2.
        System.out.println("Números pares entre 1 y 20 usando un contador de 1 en 1:");
        for (int contador4 = 1; contador4 <= 20; contador4++) {
            if (contador4 % 2 == 0) {  // Verifica si el número es par
                System.out.print(contador4 + " ");
            }
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra números impares entre 1 y 20 (con el método que prefieras).
        System.out.println("Números impares entre 1 y 20:");
        for (int contador5 = 1; contador5 <= 20; contador5++) {
            if (contador5 % 2 != 0) {  // Verifica si el número es impar
                System.out.print(contador5 + " ");
            }
        }
        System.out.println(); // Salto de línea para separar resultados

        // Muestra números múltiplos de 5 del 10 al 50 con un contador que vaya de 5 en 5.
        System.out.println("Números múltiplos de 5 del 10 al 50:");
        for (int contador6 = 10; contador6 <= 50; contador6 += 5) {
            System.out.print(contador6 + " ");
        }
        //System.out.println(); // Salto de línea para separar resultados

        // Muestra del 100 al 0 de forma decreciente pero con contador de 10 en 10.
        System.out.println("Números del 100 al 0 de forma decreciente:");
        for (int contador7 = 100; contador7 >= 0; contador7 -= 10) {
            System.out.print(contador7 + " ");
        }
        System.out.println(); // Salto de línea para separar resultados
    }
}
