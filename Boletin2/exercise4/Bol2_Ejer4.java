package Boletin2.exercise4;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Bol2_Ejer4 {
    public static void main(String[] args) {
        System.out.print("Dime un numero entero: ");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        System.out.print("Dime un numero real: ");
        //double numero2 = sc.nextDouble();
        System.out.printf("El numero entero en decimal es: %d", numero1);
        System.out.println();
        System.out.printf("El numero entero en octal es: " +"\t\t\t%o", numero1);
        System.out.println();

    }
}
