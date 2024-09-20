package Boletin2.exercise4;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Bol2_Ejer4 {
    public static void main(String[] args) {
        System.out.print("Dime un numero entero: ");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        System.out.print("Dime un numero real: ");
        double numero2 = sc.nextDouble();
        System.out.printf("El numero entero en decimal es: %d%n", numero1);
        System.out.println();
        System.out.printf("El numero entero en octal es: " +"%05o%n", numero1);
        System.out.println();
        System.out.printf("Hexadecimal en mayusculas: " + "%X%n" , numero2);
        System.out.printf("Numero real con 3 decimales: " + "%7.3f%n" + numero2);

    }
}

// Hexadecimal Mayusculas: %X%n
// Real: %7.3f%n
