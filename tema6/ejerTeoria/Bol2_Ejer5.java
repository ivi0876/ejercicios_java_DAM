package tema6.ejerTeoria;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol2_Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\u001b[2J\u001b[H");
        int opcion = 0;
        double celsius;
        
        do {
            try {
                System.out.print("\u001b[1m");
                System.out.println("Bienvenido al programa de conversión de temperatura\n");
                System.out.println("Escoja la opción: ");
                System.out.print("\u001b[0m");
                System.out.println("1.- Fahrenheit");
                System.out.println("2.- Kelvin");
                System.out.println("3.- Salir\n");
                System.out.print("Opción: ");
                
                opcion = sc.nextInt();
                
                switch (opcion) {
                    case 1:
                        while (true) {
                            try {
                                System.out.print("Introduzca la temperatura en Celsius: ");
                                celsius = sc.nextDouble();
                                double resultadoF = 1.8 * celsius + 32;
                                System.out.printf("La temperatura en Fahrenheit: %.2f%n", resultadoF);
                                System.out.println();
                                
                            } catch (Exception e) {
                                System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
                                sc.nextLine(); 
                            }
                            break;
                        }
                    case 2:
                        while (true) {
                            try {
                                System.out.print("Introduzca la temperatura en Celsius: ");
                                celsius = sc.nextDouble();
                                double resultadoK = celsius + 273.15;
                                System.out.printf("La temperatura en Kelvin: %.2f%n", resultadoK);
                                System.out.println();
                            
                            } catch (Exception e) {
                                System.out.println("Error: Entrada no valida. Por favor, ingrese un número.");
                                sc.nextLine(); 
                            }
                            break;
                        }
                    case 3:
                        System.out.println("Finalizado el programa\n");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.\n");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada no valida. Por favor, ingrese un numero.\n");
                sc.nextLine(); 
            }
        } while (opcion != 3);
    }
}
