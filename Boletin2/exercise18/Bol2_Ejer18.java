
package Boletin2.exercise18;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
// *= multiplico y igualo, es una forma de resumir la operacion

public class Bol2_Ejer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long numero;
        long factorial;

        // Solicitar un número entero no negativo
        do {
            System.out.print("Introduce un número entero (mayor o igual a 0): ");
            numero = sc.nextLong();
        } while (numero < 0);

        // bucle for
        factorial = 1;
        for (long i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " usando bucle for es: " + factorial);
        
        // bucle while
        factorial = 1; 
        long i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial de " + numero + " usando bucle while es: " + factorial);
        
        // bucle do-while
        factorial = 1; 
        i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= numero);

        System.out.println("El factorial de " + numero + " usando bucle do-while es: " + factorial);
        
    }
}

