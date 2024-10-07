
package Boletin3.EjerciciosAntiguos.exercise7;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol3_Ejer7B {

    /**
     * Método que calcula el área de un triángulo o un rectángulo.
     * @param base La base de la figura.
     * @param altura La altura de la figura.
     * @param esRectangulo Bandera para decidir el tipo de cálculo. true para rectángulo, false para triángulo.
     * @return El área calculada.
     */
    public static double calcularAreaBaseAltura(double base, double altura, boolean esRectangulo) {
        if (esRectangulo) {
            return base * altura;  // Área de un rectángulo
        } else {
            return (base * altura) / 2;  // Área de un triángulo
        }
    }

    /**
     * Método que calcula el área de un cuadrado.
     * @param lado El lado del cuadrado.
     * @return El área del cuadrado.
     */
    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;  // Área de un cuadrado
    }

    /**
     * Método que calcula el área de un círculo.
     * @param radio El radio del círculo.
     * @return El área del círculo.
     */
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);  // Área de un círculo
    }

    /**
     * Método que muestra el menú y gestiona la entrada de usuario.
     */
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Cálculo de Áreas ---");
            System.out.println("1. Área de un triángulo");
            System.out.println("2. Área de un rectángulo");
            System.out.println("3. Área de un cuadrado");
            System.out.println("4. Área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Área de un triángulo
                    System.out.print("Introduce la base: ");
                    double baseTriangulo = sc.nextDouble();
                    System.out.print("Introduce la altura: ");
                    double alturaTriangulo = sc.nextDouble();
                    System.out.printf("El área del triángulo es: %.3f\n", calcularAreaBaseAltura(baseTriangulo, alturaTriangulo, false));
                    break;
                case 2:
                    // Área de un rectángulo
                    System.out.print("Introduce la base: ");
                    double baseRectangulo = sc.nextDouble();
                    System.out.print("Introduce la altura: ");
                    double alturaRectangulo = sc.nextDouble();
                    System.out.printf("El área del rectángulo es: %.3f\n", calcularAreaBaseAltura(baseRectangulo, alturaRectangulo, true));
                    break;
                case 3:
                    // Área de un cuadrado
                    System.out.print("Introduce el lado: ");
                    double lado = sc.nextDouble();
                    System.out.printf("El área del cuadrado es: %.3f\n", calcularAreaCuadrado(lado));
                    break;
                case 4:
                    // Área de un círculo
                    System.out.print("Introduce el radio: ");
                    double radio = sc.nextDouble();
                    System.out.printf("El área del círculo es: %.3f\n", calcularAreaCirculo(radio));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }

    public static void main(String[] args) {
        mostrarMenu(); 
    }
}
