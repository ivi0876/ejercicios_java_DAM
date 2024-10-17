package Boletin1.EJeSinMirar.exercise3;

import java.util.Scanner;

public class Ejer3_Bol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos a mi programa v3");
        byte numero1;
        byte numero2;
        System.out.print("Escriba el primer numero: ");
        numero1 = sc.nextByte();
        System.out.print("Escriba el segundo numero: ");
        numero2 =  sc.nextByte();
        byte suma = (byte)(numero1 + numero2);
        System.out.println("la suma es: " + suma);
        byte division = (byte)(numero1 / numero2);
        byte modulo = (byte)(numero1 % numero2);
        System.out.println("Resultado del cociente de la division: " + division);
        System.out.println("Resultado del modulo: " + modulo);
        sc.close();
    }   
}
