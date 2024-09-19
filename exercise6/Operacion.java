package exercise6;
import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Operacion {
    public static void main(String[] args) {
        System.out.print("Dime un numero real");
        Scanner sc = new Scanner(System.in);

        double numero1;
        numero1 = sc.nextDouble();
        double numero2;
        System.out.print("Dime otro numero real");
        numero2 = sc.nextDouble();
        double suma;
        double resta;
        double multiplicacion;
        double division;
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        System.out.println("Multiplicacion:" + multiplicacion);
        System.out.println("Suma:" + suma);
        System.out.println("Resta:" + resta);
        System.out.println("Division:" + division);

        if (division != 0){
            System.out.println("Error en la operacion");       
        }
        if (numero1 % numero2 == 0) {
            System.out.printf("%d es múltiplo de %d", numero1, numero2);
        } else {
            System.out.println("No es múltiplo entre si");
        }

        if (numero1 < numero2) {
            System.out.println("El numero1 es menor a numero2");
    } else{
        System.out.println();
    }
}}
