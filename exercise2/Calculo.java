package exercise2;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Calculo {
    public static void main(String[] args) {
        System.out.println("Bienvenido a mi programa v2");
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Dime Tu primer numero: ");
        numero1 = sc.nextInt();
        System.out.print("Dime tu segundo numero: ");
        numero2 = sc.nextInt();
        int resultado = (numero1 + numero2);
        System.out.println("Resultado: " + resultado);
        


    }
}
