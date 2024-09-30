package Boletin3.exercise1;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol3_Ejer1 {
    
    public static void lineasblanco(int cantidad) {
        for (int i = 0; i <cantidad; i++) {
            System.out.println("\n");
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Cuantas lineas en blanco quieres: ");
        n = sc.nextInt();
        lineasblanco(n);
    }
}
