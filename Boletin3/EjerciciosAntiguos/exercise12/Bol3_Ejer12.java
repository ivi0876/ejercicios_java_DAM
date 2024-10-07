package Boletin3.EjerciciosAntiguos.exercise12;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
/**
 * Programa para realizar cálculos trigonométricos como coseno, seno y tangente.
 */
public class Bol3_Ejer12 {
    
    /**
     * Convierte un ángulo de grados a radianes.
     * 
     * @param grados El ángulo en grados.
     * @return El ángulo en radianes.
     */
    public static double gradosARadianes(double grados) {
        return grados * Math.PI / 180; // Conversión a radianes
    }

    /**
     * Pregunta al usuario si desea realizar cálculos en grados o en radianes.
     * 
     * @return true si el usuario elige grados, false si elige radianes.
     */
    public static boolean calculoEnGrados() {
        Scanner sc = new Scanner(System.in);
        String opcion;
        
        do {
            System.out.print("¿Quieres hacer el cálculo en grados (g) o en radianes (r)? ");
            opcion = sc.nextLine().toLowerCase();
            if (!opcion.equals("g") && !opcion.equals("r")) {
                System.out.println("\u001B[31mError: Opción no válida. Intenta de nuevo.\u001B[0m");
            }
        } while (!opcion.equals("g") && !opcion.equals("r"));
        
        return opcion.equals("g"); // Devuelve true si se selecciona grados
    }

    /**
     * Muestra el menú principal y gestiona las selecciones del usuario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n\u001B[34m--- Menú de Cálculos Trigonométricos ---\u001B[0m");
            System.out.println("1. Coseno de un ángulo");
            System.out.println("2. Seno de un ángulo");
            System.out.println("3. Tangente de un ángulo");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (calculoEnGrados()) {
                        System.out.print("Introduce el ángulo en grados: ");
                        double anguloGrados = sc.nextDouble();
                        double coseno = Math.cos(gradosARadianes(anguloGrados));
                        System.out.printf("El coseno de %.2f grados es: %.4f%n", anguloGrados, coseno);
                    } else {
                        System.out.print("Introduce el ángulo en radianes: ");
                        double anguloRadianes = sc.nextDouble();
                        double coseno = Math.cos(anguloRadianes);
                        System.out.printf("El coseno de %.2f radianes es: %.4f%n", anguloRadianes, coseno);
                    }
                    break;

                case 2:
                    if (calculoEnGrados()) {
                        System.out.print("Introduce el ángulo en grados: ");
                        double anguloGrados = sc.nextDouble();
                        double seno = Math.sin(gradosARadianes(anguloGrados));
                        System.out.printf("El seno de %.2f grados es: %.4f%n", anguloGrados, seno);
                    } else {
                        System.out.print("Introduce el ángulo en radianes: ");
                        double anguloRadianes = sc.nextDouble();
                        double seno = Math.sin(anguloRadianes);
                        System.out.printf("El seno de %.2f radianes es: %.4f%n", anguloRadianes, seno);
                    }
                    break;

                case 3:
                    System.out.print("Introduce el ángulo en grados: ");
                    double angulo = sc.nextDouble();
                    double tangente = Math.tan(gradosARadianes(angulo));
                    System.out.printf("La tangente de %.2f grados es: %.4f%n", angulo, tangente);
                    break;

                case 4:
                    System.out.println("\u001B[32m¡Gracias por usar el programa de cálculos trigonométricos!\u001B[0m");
                    break;

                default:
                    System.out.println("\u001B[31mError: Opción no válida. Por favor selecciona una opción del menú.\u001B[0m");
            }
        } while (opcion != 4);
    }
}
