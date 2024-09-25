package Boletin2.exercise15;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Bol2_Ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tasaCambio = 0.84; // 1 EUR = 0.84 GBP
        int opcion;
        double cantidad;
        
        // Menú que se repite hasta que el usuario elija salir
        do {
            System.out.println("\nConversor de Moneda:");
            System.out.println("1. Convertir de Euros a Libras");
            System.out.println("2. Convertir de Libras a Euros");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    // Conversión de Euros a Libras
                    do {
                        System.out.print("Introduce la cantidad en Euros: ");
                        cantidad = sc.nextDouble();
                        
                        if (cantidad < 0) {
                            System.out.println("Error: la cantidad no puede ser negativa.");
                        }
                    } while (cantidad < 0); // Repite hasta que el usuario introduzca un valor positivo
                    
                    double libras = cantidad * tasaCambio;
                    System.out.printf("La cantidad en Libras es: %.2f GBP\n", libras);
                    break;
                    
                case 2:
                    // Conversión de Libras a Euros
                    do {
                        System.out.print("Introduce la cantidad en Libras: ");
                        cantidad = sc.nextDouble();
                        
                        if (cantidad < 0) {
                            System.out.println("Error: la cantidad no puede ser negativa.");
                        }
                    } while (cantidad < 0); // Repite hasta que el usuario introduzca un valor positivo
                    
                    double euros = cantidad / tasaCambio;
                    System.out.printf("La cantidad en Euros es: %.2f EUR\n", euros);
                    break;
                    
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida, elige de nuevo.");
            }
        } while (opcion != 3); // Repite el menú hasta que el usuario elija salir
        
    }
}
