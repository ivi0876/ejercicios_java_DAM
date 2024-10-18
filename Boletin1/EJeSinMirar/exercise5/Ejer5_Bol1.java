package Boletin1.EJeSinMirar.exercise5;
import java.util.Scanner;
public class Ejer5_Bol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        double temperatura;
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();
        System.out.print("Introduce tu temperatura: ");
        temperatura = sc.nextDouble();
        sc.close();
        System.out.println("Tu nombre es: " + nombre + "\n tienes " + edad + " años " + "\nhace " + temperatura + " grados");
    }
}
