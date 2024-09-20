package Boletin2.exercise3;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol2Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int numero = sc.nextInt();
        if (numero > 0) {
            int acu = 0;
            for (int contador = 1; contador <= numero; contador++) {
                acu += contador;  // Acumulamos la suma de los números
            }

            System.out.println("La suma de los números del 1 al " + numero + " es: " + acu);

        } else {
            System.out.println("Error: El numero es negativo");
        }

    }
}
