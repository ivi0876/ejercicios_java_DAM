a) Realizar una función que devuelva el factorial de un número seg ún se definió
en el boletín anterior (recuerda que 0!=1).
b) Realizar un método que realice y devuelva el siguiente cálculo (es el denominado
binomio de Newton ).
m!
n !·( m−n )!
Parámetros: m, n. Devuelve el resultado de la operaci ón anterior. Se debe usar la
función de (a)
c) Realizar un programa que pida al usuario los datos m y n del binomio y muestre
el coeficiente. Es obligatorio que m y n sean mayores que 0 y además m>=n.
Opcional: Realiza la función factorial aplicando recursividad (ver apéndice de
apuntes, evita buscar en internet).








import java.util.Scanner;

public class BinomioNewton {

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
        long factorialM = factorial(m); // Se llama a la función de factorial del apartado a)
        long factorialN = factorial(n);
        long factorialMmenosN = factorial(m - n);
        return factorialM / (factorialN * factorialMmenosN);
    }

    /**
     * Método principal que pide los valores m y n al usuario,
     * asegura que sean correctos, y muestra el resultado del binomio.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;

        // Pedir al usuario los valores de m y n asegurando que son válidos
        do {
            System.out.print("Introduce el valor de m (mayor o igual que 0): ");
            m = scanner.nextInt();
            System.out.print("Introduce el valor de n (mayor o igual que 0 y menor o igual que m): ");
            n = scanner.nextInt();
        } while (m < 0 || n < 0 || n > m);

        // Calcular el binomio de Newton
        long coeficienteBinomio = binomioNewton(m, n);

        // Mostrar el resultado
        if (coeficienteBinomio != -1) {
            System.out.printf("El coeficiente binomial de (%d, %d) es: %d\n", m, n, coeficienteBinomio);
        } else {
            System.out.println("Error: El valor de n no puede ser mayor que m.");
        }

        // Opción recursiva (opcional)
        System.out.println("\nCálculo del factorial de " + m + " de forma recursiva: " + factorialRecursivo(m));
    }
}
