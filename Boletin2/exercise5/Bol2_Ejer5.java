package Boletin2.exercise5;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol2_Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\u001b[2J\u001b[H");
        int opcion;
        double celsius;
        do{
            // ANSI: Negrita (o cambio de color)
            System.out.print("\u001b[1m");
            System.out.println("Bienvenido al programa de conversion de temperatura\n");
            System.out.println("Escoja la opcion: ");
            System.out.print("\u001b[0m");
            System.out.println("1.- Farenheit");
            System.out.println("2.- Kelvin");
            System.out.println("3.- Salir\n");
            System.out.print("Opcion: ");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                System.out.print("Introduzca la temperatura en celsius: ");
                celsius=sc.nextDouble();
                double resultadoF = 1.8*celsius + 32;
                System.out.printf("La temperatura en Farenheit: %.3f%n", resultadoF);
                System.out.println();
                break;
                case 2:
                System.out.print("Introduzca la temperatura en celsius: ");
                celsius=sc.nextDouble();
                double resultadoK = celsius + 273.15;
                System.out.printf("La temperatura en Kelvin: %.3f%n", resultadoK);
                System.out.println();
                break;
                case 3:
                System.out.println("Finalizado el programa!\n");
                break;
            }
        } while (opcion != 3);
        
    }
}
