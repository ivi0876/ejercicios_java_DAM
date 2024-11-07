package Boletin3.EjerciciosNuevos.exercise11;


public class CosenoTaylor {

    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double potencia(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * potencia(x, n - 1);
        }
    }

    public static double cosenoTaylor(double x, int n) {
        double suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += potencia(-1, i / 2) * potencia(x, 2 * i) / factorial(2 * i);
        }
        return suma;
    }

    public static void main(String[] args) {
        for (double x = 0.1; x <= 1.0; x += 0.1) {
            double cosenoAproximado = cosenoTaylor(x, 4);
            
            System.out.printf("Coseno de %.1f: %.5f %n", x , cosenoAproximado);
        }
    }
}
