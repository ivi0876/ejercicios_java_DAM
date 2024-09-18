
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Basico {
    public static void main(String args[]) {
        System.out.println("Bienvenidos a mi superprograma v1.0");
        System.out.println("Ahora unas preguntas");
        System.out.println("Dime tu nombre");
        String nombre;
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();
        System.out.println("Dime tu dirección");
        String direccion;
        direccion = sc.nextLine();
        int edad;
        System.out.println("Dime tu edad");
        edad = sc.nextInt();
        //System.out.println("Nombre: " + nombre);
        //System.out.println("Direccion: " + direccion);
        //System.out.println("Edad: " + edad);
        System.out.print("Te llamas " + nombre);
        System.out.println(" y vives en " + direccion);
        System.out.println(" y tienes " + edad);
    }
}