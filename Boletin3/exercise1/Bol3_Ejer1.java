package Boletin3.exercise1;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol3_Ejer1 {
    
    public static void lineasblanco(int cantidad) {
        for (int i = 0; i <cantidad; i++) {
            System.out.println("\n");
        }        
    }

    public static void par(int num){
        if(num%2 == 0) {
            System.out.printf("El numero es par");
        }else {
            System.out.println("El numero no es par");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int num=10;
        System.out.print("Cuantas lineas en blanco quieres: ");
        n = sc.nextInt();
        lineasblanco(n);
        par(num);
    }
}
