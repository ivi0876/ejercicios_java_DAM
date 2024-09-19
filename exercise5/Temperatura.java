package exercise5;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos el nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        // Edad
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        //Temperatatura
        System.out.print("Introduce la temperatura: ");
        double temperatura = sc.nextDouble();

        System.out.println("Tu nombre es: " + nombre + "\ntienes: " + edad + "\nHace: " + temperatura );
    }
}
