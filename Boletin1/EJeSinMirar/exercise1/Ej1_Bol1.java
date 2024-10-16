package Boletin1.EJeSinMirar.exercise1;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Ej1_Bol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos a mi programa de java");
        System.out.println("Ahora unas preguntas");
        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("tu nombre es: " + nombre);
        System.out.print("Dime tu direccion: ");
        String direccion = sc.nextLine();
        System.out.println("Tu direccion es: " + direccion);
        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu edad es: " + edad);
        System.out.println("Te llamas " + nombre + " y vives en " + direccion + " y tienes " + edad + "años");
         
    }
}
