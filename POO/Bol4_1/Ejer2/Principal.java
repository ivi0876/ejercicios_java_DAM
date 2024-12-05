package POO.Bol4_1.Ejer2;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // primera fecha
        System.out.println("Introduce la primera fecha:");
        System.out.print("Día: ");
        int dia1 = sc.nextInt();
        System.out.print("Mes: ");
        int mes1 = sc.nextInt();
        System.out.print("Año: ");
        int año1 = sc.nextInt();

        // segunda fecha 
        System.out.println("Introduce la segunda fecha:");
        System.out.print("Día: ");
        int dia2 = sc.nextInt();
        System.out.print("Mes: ");
        int mes2 = sc.nextInt();
        System.out.print("Año: ");
        int año2 = sc.nextInt();

        sc.close();
        Fecha fecha1 = new Fecha(dia1, mes1, año1);
        Fecha fecha2 = new Fecha(dia2, mes2, año2);

        System.out.println("\nFecha 1 en formato corto: " + fecha1.fechaFormateada(true));
        System.out.println("Fecha 1 en formato largo: " + fecha1.fechaFormateada(false));
        System.out.println("\nFecha 2 en formato corto: " + fecha2.fechaFormateada(true));
        System.out.println("Fecha 2 en formato largo: " + fecha2.fechaFormateada(false));

        int diferenciaYear = Fecha.diferenciaFechas(fecha1, fecha2);
        System.out.println("\nDiferencia en años entre las dos fechas: " + diferenciaYear);
    }
}
