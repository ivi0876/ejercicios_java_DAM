package exercise8;

import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Dias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String diaSemana;
        int numeroDia;

    
    System.out.print("Dime un numero del 1 - 7: ");
    numeroDia=sc.nextInt();
    switch (numeroDia) {
        case 1: diaSemana = "Lunes";
        break;
        case 2: diaSemana = " Martes";
        break;
        case 3: diaSemana = "Miercoles";
        break;
        case 4: diaSemana = "Jueves";
        break;
        case 5: diaSemana = "Viernes";
        break;
        case 6: diaSemana = "Sabado";
        break;
        case 7: diaSemana = "Domingo";
        break;
        
        default:diaSemana = "Dia inválido";
        break;
        
    }
    System.out.println("Estamos en: " + diaSemana);
    }
}
