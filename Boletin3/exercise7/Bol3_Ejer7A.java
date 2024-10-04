package Boletin3.exercise7;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol3_Ejer7A {

    /**
     * Método que calcula el área de un triángulo o un rectángulo.
     * @param base La base de la figura.
     * @param altura La altura de la figura.
     * @param esRectangulo Bandera para decidir el tipo de cálculo. true para rectángulo, false para triángulo.
     * @return El área calculada.
     */
    public static double calcularArea(double base, double altura, boolean esRectangulo) {
        if (esRectangulo) {
            return base * altura;  // Área de un rectángulo
        } else {
            return (base * altura) / 2;  // Área de un triángulo
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar los datos de entrada al usuario
        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = sc.nextDouble();
        System.out.print("¿Es un rectángulo? (true para rectángulo, false para triángulo): ");
        boolean esRectangulo = sc.nextBoolean();

        // Llamar al método para calcular el área
        double area = calcularArea(base, altura, esRectangulo);

        // Mostrar el resultado
        if (esRectangulo) {
            System.out.printf("El área del rectángulo es: %.2f\n", area);
        } else {
            System.out.printf("El área del triángulo es: %.2f\n", area);
        }
    }
}
