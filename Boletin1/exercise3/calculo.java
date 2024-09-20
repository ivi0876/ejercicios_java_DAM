package Boletin1.exercise3;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class calculo {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a mi programa v3");
        byte numero1;
        byte numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer numero: ");
        numero1 = sc.nextByte();
        System.out.println("Escriba el segundo numero: ");
        numero2 =  sc.nextByte();
        byte suma = (byte)(numero1 + numero2);
        System.out.println("la suma es: " + suma);
        byte division = (byte)(numero1 / numero2);
        byte modulo = (byte)(numero1 % numero2);
        System.out.println("Resultado del cociente de la division: " + division);
        System.out.println("Resultado del modulo: " + modulo);
    }
}
