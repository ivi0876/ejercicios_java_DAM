package Boletin1.EJeSinMirar.exercise8;
import java.util.Scanner;
public class Bol1_Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Dime un numero entre 1 y el 7: ");
        numero = sc.nextInt();
        sc.close();

        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        
            default:
            System.out.println("Hubo un error!! ");
                break;
        }
    }
}


/*  
 * Pide un número al usuario y, mediante un switch, escribe en pantalla el día de
la semana a que coresponda (1: lunes, 2:martes,… 7:domingo). Los case serán los
números de día y en cada uno haces un print con el nombre del día. Si hubiera un
número distinto muestra un mensaje de error (esto hazlo en el default).
 */