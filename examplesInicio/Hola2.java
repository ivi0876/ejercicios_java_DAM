package examplesInicio;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Hola2 {
    //static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        // Declaración de variables
        String nombre; //Variable que guarda una cadena de caracteres
        int edad;
        // Comprobar si meter como variable global, porque si no hay que cerrar el scanner, con sc.closed()
        Scanner sc = new Scanner(System.in);
        // Código
        System.out.print("Dime tu nombre: ");
        nombre = sc.nextLine(); // lee cadena de caracteres
        System.out.println("Ahora tu edad");
        edad = sc.nextInt(); // lee numeros
        //sc.close();
        System.out.println(nombre + ", Welcome to the Java World");
        System.out.println("Nos vemos, ser humano de " + edad + " años");
    }
}