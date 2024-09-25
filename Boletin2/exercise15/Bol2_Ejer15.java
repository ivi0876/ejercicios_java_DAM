package Boletin2.exercise15;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Bol2_Ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Bienvenido\n");
            System.out.println("1.- Conversión de Euro a libras");
            System.out.println("2.- Conversión de Libras a Euros");
            System.out.println("3.- Salir\n\n");
            System.out.print("Escoja una opción:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el número de Euros: ");
                    double Euro = sc.nextDouble();
                    double conversionEuro = Euro * 0.84;
                    System.out.printf("El precio en libras es: %.2f% \n\n", conversionEuro);
                break;
                case 2:
                    System.out.print("Introduzca el número de libras: ");
                    double Libra = sc.nextDouble();
                    double conversionLibras = Libra * 1.20;
                    System.out.printf("El precio en Euros es: %.2f%\n\n", conversionLibras);
                default:
                System.out.println("Opción no valida.\n\n");
            }

        }while (opcion != 3);
    }
}
