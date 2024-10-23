package Boletin3.EjerciciosNuevos.exercise5;

import java.util.Scanner;
import java.io.PrintWriter;

@SuppressWarnings({ "resource" })

public class Bol3_ejer5 {

    public static boolean bisiesto(int year) {

        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;

        // Bucle que solicita años hasta que se ingrese el año 0
        do {
            System.out.print("Introduce un año (0 para terminar): ");
            year = scanner.nextInt();

            if (year != 0) { // el año es diferente a cero
                if (bisiesto(year)) {
                    System.out.println("El año " + year + " es bisiesto."); // si devuelve true
                } else {
                    System.out.println("El año " + year + " no es bisiesto."); // si devuelve false
                }
            }
        } while (year != 0);

        System.out.println("Programa terminado.");
    }

}