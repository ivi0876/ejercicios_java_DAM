package Boletin3.exercise1;
public class Bol3_Ejer1 {

    /**
     * Imprime n líneas en blanco.
     * @param n Número de líneas en blanco a imprimir.
     */
    public static void imprimirLineasEnBlanco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();  
        }
    }

    /**
     * Verifica si un número es par.
     * @param num Número a verificar.
     * @return true si el número es par, false si no lo es.
     */
    public static boolean esPar(int num) {
        return num % 2 == 0;  // Si el resto de dividir por 2 es 0, es par
    }

    /**
     * Devuelve 'P' si el número es positivo, y 'N' si es cero o negativo.
     * @param num Número a verificar.
     * @return 'P' si es positivo, 'N' si es cero o negativo.
     */
    public static char positivoONegativo(int num) {
        return num > 0 ? 'P' : 'N';  // Ternario: si num > 0 devuelve 'P', si no, 'N'
    }

    public static void main(String[] args) {
        // Probar imprimirLineasEnBlanco
        System.out.println("Probando imprimir 3 líneas en blanco:");
        imprimirLineasEnBlanco(3);

        // Probar esPar
        System.out.println("¿Es 4 par? " + esPar(4));
        System.out.println("¿Es 5 par? " + esPar(5));

        // Probar positivoONegativo
        System.out.println("El número 10 es: " + positivoONegativo(10));
        System.out.println("El número 0 es: " + positivoONegativo(0));
        System.out.println("El número -5 es: " + positivoONegativo(-5));
    }
}
