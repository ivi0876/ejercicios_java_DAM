package Boletin3.EjerciciosAntiguos.exercise3;
//!  RECORDAR COMENTAR todo el codigo, mejor practica para el futuro


import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol3_Ejer3 {

    /**
     * Verifica si un año es bisiesto.
     * Un año es bisiesto si es divisible por 4, pero no por 100, salvo que también sea divisible por 400.
     * @param year El año a verificar.
     * @return true si el año es bisiesto, false si no lo es.
     */
    public static boolean bisiesto(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;  // Solo es bisiesto si también es divisible por 400
            }
            return true;  // Es bisiesto si es divisible por 4 pero no por 100
        }
        return false;  // No es bisiesto si no es divisible por 4
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
                    System.out.println("El año " + year + " es bisiesto."); // si devuelve bisiesto
                } else {
                    System.out.println("El año " + year + " no es bisiesto."); //si devuelve false
                }
            }
        } while (year != 0);

        System.out.println("Programa terminado.");
    }
}
