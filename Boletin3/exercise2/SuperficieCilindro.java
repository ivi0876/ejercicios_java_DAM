package Boletin3.exercise2;
import java.util.Scanner;
@SuppressWarnings({ "resource" })


public class SuperficieCilindro {

    /**
     * Pide un dato real al usuario y verifica que sea positivo.
     * @param mensaje El mensaje a mostrar al usuario.
     * @return El valor positivo ingresado por el usuario.
     */
    public static double pedirDato(String mensaje) {
        Scanner sc = new Scanner(System.in);
        double valor;
        do {
            System.out.print(mensaje + ": ");
            valor = sc.nextDouble();
            if (valor <= 0) {
                System.out.println("El valor debe ser positivo. Inténtalo de nuevo.");
            }
        } while (valor <= 0);
        return valor;
    }

    /**
     * Calcula la superficie de un cilindro.
     * @param radio El radio del cilindro.
     * @param altura La altura del cilindro.
     * @return La superficie del cilindro.
     */
    public static double superficieCilindro(double radio, double altura) {
        return 2 * Math.PI * radio * altura;
    }

    /**
     * Muestra un valor real con un mensaje, formateado a 3 decimales.
     * @param mensaje El mensaje a mostrar.
     * @param valor El valor real a mostrar.
     */
    public static void mostrarDato(String mensaje, double valor) {
        System.out.printf("%s: %.3f%n", mensaje, valor);
    }

    public static void main(String[] args) {
        // Pedir el radio y la altura al usuario
        double radio = pedirDato("Introduce el radio del cilindro");
        double altura = pedirDato("Introduce la altura del cilindro");

        // Calcular la superficie
        double superficie = superficieCilindro(radio, altura);

        // Mostrar el resultado
        mostrarDato("La superficie del cilindro es", superficie);
    }
}
