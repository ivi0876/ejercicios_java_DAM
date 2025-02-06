package figuras.interfaz;


import java.util.Scanner;

public class Libreria {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static int pedirEntero() {
        while (true) {
            try {
                System.out.print("Introduce un número entero: ");
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intentalo de nuevo.");
            }
        }
    }
    
    public static double pedirReal() {
        while (true) {
            try {
                System.out.print("Introduce un numero real: ");
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Intentalo de nuevo");
            }
        }
    }
}
