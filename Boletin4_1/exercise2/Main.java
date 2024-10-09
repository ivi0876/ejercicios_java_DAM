package Boletin4_1.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la primera fecha al usuario
        System.out.println("Introduce la primera fecha:");
        System.out.print("Día: ");
        int dia1 = scanner.nextInt();
        System.out.print("Mes: ");
        int mes1 = scanner.nextInt();
        System.out.print("Año: ");
        int año1 = scanner.nextInt();

        // Pedir la segunda fecha al usuario
        System.out.println("Introduce la segunda fecha:");
        System.out.print("Día: ");
        int dia2 = scanner.nextInt();
        System.out.print("Mes: ");
        int mes2 = scanner.nextInt();
        System.out.print("Año: ");
        int año2 = scanner.nextInt();

        // Crear objetos de tipo Fecha
        Fecha fecha1 = new Fecha(dia1, mes1, año1);
        Fecha fecha2 = new Fecha(dia2, mes2, año2);

        // Mostrar las fechas en formato corto y largo
        System.out.println("\nFecha 1 en formato corto: " + fecha1.fechaFormateada(true));
        System.out.println("Fecha 1 en formato largo: " + fecha1.fechaFormateada(false));
        System.out.println("\nFecha 2 en formato corto: " + fecha2.fechaFormateada(true));
        System.out.println("Fecha 2 en formato largo: " + fecha2.fechaFormateada(false));

        // Calcular y mostrar la diferencia de años
        int diferenciaAños = Fecha.diferenciaFechas(fecha1, fecha2);
        System.out.println("\nDiferencia en años entre las dos fechas: " + diferenciaAños);

        scanner.close();
    }
}
