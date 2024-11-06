package Boletin3.EjerciciosNuevos.exercise11;

import java.lang.Math;

public class Coseno {

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
        double resultado = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                resultado += potencia(x, 2 * i) / factorial(2 * i);
            } else {
                resultado -= potencia(x, 2 * i) / factorial(2 * i);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        for (double x = 0.1; x <= 1; x += 0.1) {
            double cosenoAproximado = cosenoTaylor(x, 4);
            double error = Math.abs(Math.cos(x) - cosenoAproximado);
            System.out.printf("Coseno de %.1f: %.5f (Error: %.5f)%n", x, cosenoAproximado, error);
        }
    }
}