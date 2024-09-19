package exercise8;

import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Dias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadenaMes;
        int numeroMes;

    
    
    numeroMes=sc.nextInt();
    switch (numeroMes) {
        case 1: cadenaMes = "Enero";
        break;
        case 2: cadenaMes = "Febrero";
        break;
        case 3: cadenaMes = "Marzo";
        break;
        case 4: cadenaMes = "Abril";
        break;
        case 5: cadenaMes = "Mayo";
        break;
        case 6: cadenaMes = "Junio";
        break;
        case 7: cadenaMes = "Julio";
        break;
        case 8: cadenaMes = "Agosto";
        break;
        case 9: cadenaMes = "Septiembre";
        break;
        case 10:cadenaMes = "Octubre";
        break;
        case 11:cadenaMes = "Noviembre";
        break;
        case 12:cadenaMes = "Diciembre";
        break;
        default:cadenaMes = "Mes inválido";
        break;
        
    }
    System.out.println("Estamos en: " + cadenaMes);
    }
}
