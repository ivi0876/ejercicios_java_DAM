package Boletin2.exercise8;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Bol2_Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // Solicitar los tres números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();
        // usar ternaria para optimizar comparaciones
        int mayor = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3);

       System.out.println("El mayor de los tres números es: " + mayor);

    }   
}

