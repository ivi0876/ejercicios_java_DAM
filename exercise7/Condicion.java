package exercise7;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Condicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribeme un numero entero");
        int numero1 = sc.nextInt();
        System.out.println("Escribeme otro numero entero");
        int numero2 = sc.nextInt();
        if(numero1 < numero2){
            System.out.printf("El %d es menor a %d", numero1, numero2);

        } else {
            System.out.printf("El %d es mayor a %d/n", numero1, numero2);
        }
        if(numero1 == numero2){
            System.out.println("Los numeros son iguales");
        }
    }
}
