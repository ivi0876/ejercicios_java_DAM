package Boletin3_Opcional.exercise1;

public class ejercicio1 {
    public static void mostrarNumeros(boolean mostrarTodos) {
        if (mostrarTodos) {
            // Muestra números del 1 al 20
            for (int i = 1; i <= 20; i++) {
                System.out.println(i);
            }
        } else {
            // Muestra números pares entre 1 y 50, formateados a la derecha
            for (int i = 2; i <= 50; i += 2) {
                System.out.printf("%5d\n", i);
            }
        }
    }

    public static void main(String[] args) {
        mostrarNumeros(true);  // Llamada con true
        System.out.println();
        mostrarNumeros(false); // Llamada con false
    }
}
