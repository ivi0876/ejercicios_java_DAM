package exercise3;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Operacion2 {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a mi programa v3");
        byte numero1;
        byte numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer numero: ");
        numero1 = sc.nextByte();
        System.out.println("Escriba el segundo numero: ");
        numero2 =  sc.nextByte();
        byte suma = numero1 + numero2;
        System.out.println("la suma es: " + suma);
    }
}
