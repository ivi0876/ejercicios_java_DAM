package Boletin2.exercise18;
import java.util.Scanner;
@SuppressWarnings({ "resource" })


public class Bol2_Ejer18 {
    public static void main(String[] args) {
        long numero;
        double factorial = 1;
        Scanner sc = new Scanner(System.in);
		
        do {  //introducir por teclado un número mayor o igual a cero
            System.out.print("Introduce un numero entero: ");
            numero = sc.nextInt();
        } while (numero < 0);
        for (long i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("El número en factorial: " + factorial);
    }
}
