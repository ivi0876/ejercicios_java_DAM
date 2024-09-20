package Boletin2.exercise2;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Bol2_Ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else if (numero2 % numero1 == 0) { // ? PREGUNTAR SI SE HACE COMPARACION EN AMBOS O SOLO UNO
            System.out.println(numero2 + " es múltiplo de " + numero1);
        } else {
            System.out.println("Los números no son múltiplos entre sí.");
        }
    }
}
