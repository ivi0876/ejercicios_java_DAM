package Boletin2.exercise1;

class Bol2_Ejer1 {
    public static void main(String[] args) {
        // Bucle for
        System.out.println("Bucle for:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();  // Salto de línea

        // Bucle while
        System.out.println("Bucle while:");
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();  // Salto de línea

        // Bucle do-while
        System.out.println("Bucle do-while:");
        i = 1;  // Reiniciamos el contador
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 20);
        System.out.println();  // Salto de línea

        // Parte b) Mostrar números pares entre 1 y 50 formateados en una columna
        System.out.println("Números pares entre 1 y 50:");
        for (int j = 2; j <= 50; j += 2) {
            System.out.printf("%5d%n", j);  // Formateo en columna de 5 caracteres justificados a la derecha
        }
    }
}
