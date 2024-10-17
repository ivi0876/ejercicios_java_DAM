package Boletin3.EjerciciosAntiguos.exercise4;
public class Bol3_Ejer4 {

    /**
     * Calcula la potencia de un número sin usar la función Math.
     * Si el exponente es negativo, devuelve la inversa de la potencia positiva.
     * @param base La base de la potencia.
     * @param exponente El exponente entero.
     * @return El resultado de base elevado a exponente.
     */
    public static double potencia(double base, int exponente) {
        double resultado = 1;
        int exp = Math.abs(exponente);  // Tomamos valor absoluto del exponente

        for (int i = 0; i < exp; i++) {
            resultado *= base;
        }

        // Si el exponente es negativo, devolvemos la inversa de la potencia
        if (exponente < 0) {
            resultado = 1 / resultado;
        }

        return resultado;
    }

    /**
     * Muestra las primeras n potencias de un número a.
     * @param base La base del número.
     * @param n El número de potencias a mostrar.
     */
    public static void mostrarPotencias(double base, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Potencia " + i + " de " + base + " es: " + potencia(base, i));
        }
    }

    /**
     * Suma la progresión geométrica 1 + x + x^2 + x^3 + ... + x^n.
     * @param x El valor base de la progresión.
     * @param n El número de términos de la progresión.
     * @return La suma de la progresión geométrica.
     */
    public static double sumarProgresionGeometrica(double x, int n) {
        double suma = 0;

        for (int i = 0; i <= n; i++) {
            suma += potencia(x, i);  // Usamos la función potencia
        }

        return suma;
    }

    public static void main(String[] args) {
        // Parte a) Probar la función potencia
        double base = 2;
        int exponente = 9;
        System.out.println("La potencia de " + base + "^" + exponente + " es: " + potencia(base, exponente));

        // Parte b) Mostrar las primeras n potencias de un número
        int n = 4;
        System.out.println("\nLas primeras " + n + " potencias de " + base + " son:");
        mostrarPotencias(base, n);

        // Parte c) Sumar la progresión geométrica
        System.out.println("\nLa suma de la progresión geométrica 1 + x + x^2 + ... + x^" + n + " con x = " + base + " es: " + sumarProgresionGeometrica(base, n));
    }
}
