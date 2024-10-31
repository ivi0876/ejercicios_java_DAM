package Boletin1.EJeSinMirar.exercise7;
import java.util.Scanner;
public class Bol1_Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Ponga su primer numero entero: ");  
        numero1 = sc.nextInt();
        System.out.print("Ponga su segundo numero: ");
        numero2 = sc.nextInt();
        sc.close();
        
        if (numero1 > numero2) {
            System.out.println("El numero1 es mayor al numero2");
        } else {
            System.out.println("El numero2 es mayor al numero1");
        }

        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");            
        } else {
            System.out.println("Los numeros no son iguales");
        }

        if (numero1 > 0 ) {
            System.out.println("El numero1 es positivo.");
        } else {
            System.out.println("El numero1 no es positivo");
        }

        if (numero1 >= 1 && numero1 <10) {
            System.out.println("El numero1 está entre el 1 y el 10.");
        } else {
            System.out.println("El numero1 no está entre el 1 y el 10.");
        }

        if (numero2 < 1 && numero2 > 10) {
            System.out.println("El numero2 no está entre el 1 y el 10.");
        }

    }
}


/* 
 * 
  1. En un único programa pide al principio dos números enteros al usuario y luego
ve haciendo mediante if las siguientes cosas (son independientes):
• Indica qué número es mayor.
• Indica si son o no iguales.
• Indica si el primero es positivo
• Di si el primero está entre 1 y 10 (Debes comprobar si es mayor que 1 Y
menor que 10).
• Di si el segundo NO está entre 1 y 10 (Debes comprobar si es menor que 1 O
mayor que 100).
*/