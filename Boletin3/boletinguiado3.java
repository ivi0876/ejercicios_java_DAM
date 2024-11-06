package Boletin3;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class boletinguiado3 {
    public static void main(String[] args) {
        // Llamamos a la función pideNumero con el mensaje y guardamos el valor retornado
        int numero = pideNumero("Dime un número y te diré el doble");
        // Mostramos el doble del número devuelto
        System.out.println("El doble del número es: " + (numero * 2));
    }

    // Definimos la función pideNumero
    public static int pideNumero(String msg) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Mostramos el mensaje proporcionado como parámetro
        System.out.println(msg);
        // Leemos un número entero ingresado por el usuario
        int numero = sc.nextInt();
        // Devolvemos el número leído
        return numero;
    }
}
