package Boletin1.EJeSinMirar.exercise2;
import java.util.Scanner;
public class Ejer2_Bol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Dime el segundo numero: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;
        System.out.println("EL resultado de la suma entre "+ numero1 + " y " + numero2 +" es: " + suma);
        sc.close();
    }
    
}
