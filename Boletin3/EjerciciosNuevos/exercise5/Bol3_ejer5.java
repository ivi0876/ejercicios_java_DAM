package Boletin3.EjerciciosNuevos.exercise5;

import java.util.Scanner;
import java.io.PrintWriter;

@SuppressWarnings({ "resource" })

public class Bol3_ejer5 {

    public static boolean bisiesto(int year) {

        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

    }

    public static void main(String[] args)  throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("Boletin3/EjerciciosNuevos/exercise5/bisiesto.txt");

        int year;

        // Bucle que solicita años hasta que se ingrese el año 0
        do {
            System.out.print("Introduce un año (0 para terminar): ");
            year = scanner.nextInt();

            if (year != 0) { // el año es diferente a cero
                if (bisiesto(year)) {
                    System.out.println("El año " + year + " es bisiesto."); // si devuelve true
                    writer.printf("%d Si es bisiesto \n", year);
                } else {
                    System.out.println("El año " + year + " no es bisiesto."); // si devuelve false
                    writer.printf("%d No es bisiesto \n", year);
                }

                //Escribir numeros bisiestos hasta año actual.
            for(int i = year; i <= 2024; i++){
                if (bisiesto(i)){
                    writer.print(i);
                    writer.println("es bisiesto \n");
                }
            }
        }
        writer.close();

        } while (year != 0);

        System.out.println("Programa terminado.");
    }

}