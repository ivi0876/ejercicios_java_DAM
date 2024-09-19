package exercise14;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int acu = 0;
        while(true) {
            System.out.println("Introduce un numero: ");
            numero = sc.nextInt();

            if(numero < 0) {
                break;
            }
            acu += numero;
        }
        System.out.println("La suma es: " + acu);

    }
}
