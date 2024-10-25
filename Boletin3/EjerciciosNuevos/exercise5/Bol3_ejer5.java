package Boletin3.EjerciciosNuevos.exercise5;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

@SuppressWarnings({ "resource" })
public class Bol3_ejer5 {

    public static boolean bisiesto(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("Boletin3/EjerciciosNuevos/exercise5/bisiesto.txt");

        System.out.print("Introduce un año: ");
        int year = scanner.nextInt();

        // Escribir si el año ingresado es bisiesto o no
        if (bisiesto(year)) {
            writer.printf("%d Si es bisiesto\n", year);
        } else {
            writer.printf("%d No es bisiesto\n", year);
        }

        // Escribir todos los años bisiestos desde el año ingresado hasta el año actual (2024)
        int currentYear = 2024;
        for (int i = year + 1; i <= currentYear; i++) {
            if (bisiesto(i)) {
                writer.println(i);
            }
        }
        writer.close();

        // Leer el archivo y mostrar los años bisiestos excepto el primero, cada uno en una nueva línea
        Scanner fileReader = new Scanner(new File("Boletin3/EjerciciosNuevos/exercise5/bisiesto.txt"));
        if (fileReader.hasNextLine()) fileReader.nextLine(); // Omitir la primera línea
        
        while (fileReader.hasNextLine()) {
            String bisiestoYear = fileReader.nextLine();
            System.out.println(bisiestoYear);
        }
        fileReader.close();

        System.out.println("Programa terminado.");
    }
}
