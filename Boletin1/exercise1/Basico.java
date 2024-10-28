package Boletin1.exercise1;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Basico {
    public static void main(String args[]) {
        System.out.println("Bienvenidos a mi superprograma v1.0");
        System.out.println("Ahora unas preguntas");
        System.out.print("Dime tu nombre: ");
        String nombre;
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();
        System.out.print("Dime tu dirección: ");
        String direccion;
        direccion = sc.nextLine();
        int edad;
        System.out.print("Dime tu edad: ");
        edad = sc.nextInt();
        System.out.println("Te llamas " + nombre + " y vives en " + direccion + " y tienes " + edad + ".");
             
    }
}