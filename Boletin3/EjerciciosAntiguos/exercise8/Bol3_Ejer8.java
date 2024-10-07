package Boletin3.EjerciciosAntiguos.exercise8;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol3_Ejer8 {

    /**
     * Método que calcula el factorial de un número.
     * @param num Número del cual se quiere obtener el factorial.
     * @return El factorial de num.
     */

    public static long factorial(int num) {
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Método que calcula el factorial de un número de forma recursiva (opcional).
     * @param num Número del cual se quiere obtener el factorial.
     * @return El factorial de num.
     */
    public static long factorialRecursivo(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorialRecursivo(num - 1);
        }
    }

    /**
     * Método que calcula el binomio de Newton usando factorial.
     * Fórmula: m! / (n! * (m - n)!)
     * @param m Valor de m.
     * @param n Valor de n.
     * @return El coeficiente del binomio.
     */
    public static long binomioNewton(int m, int n) {
        if (n > m) {
            return -1; // Error: n no puede ser mayor que m
        }
        long factorialM = factorial(m); // Se llama a la función de factorial
        long factorialN = factorial(n);
        long factorialMmenosN = factorial(m - n);
        return factorialM / (factorialN * factorialMmenosN);
    }    

    /**
    * Método principal que pide los valores m y n al usuario,
    * asegura que sean correctos, y muestra el resultado del binomio.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        //Pedir valores
        do {
            System.out.print("Introduce el valor de m (mayor o igual que 0): ");
            m = sc.nextInt();
            System.out.print("Introduce el valor de n (mayor o igual que 0 y menor o igual que m): ");
            n = sc.nextInt();
        }while(m < 0 || n < 0 || n > m);


            // Calcular el binomio de Newton
        long coeficienteBinomio = binomioNewton(m, n);

        // Mostrar el resultado
        if (coeficienteBinomio != -1) {
            System.out.printf("El coeficiente binomial de (%d, %d) es: %d\n", m, n, coeficienteBinomio);
        } else {
            System.out.println("Error: El valor de n no puede ser mayor que m.");
        }

        }
    }


