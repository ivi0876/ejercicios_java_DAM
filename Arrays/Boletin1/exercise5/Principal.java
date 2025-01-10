package Arrays.Boletin1.exercise5;

import java.io.*;
import java.util.*;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        String archivoEntrada = "Arrays/Boletin1/exercise5/ventas.txt";
        if (args.length > 0) {
            archivoEntrada = args[0];
        }

        Ventas ventas;

        File file = new File(archivoEntrada);
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            int year = Integer.parseInt(scanner.nextLine());
            String[] datos = scanner.nextLine().split(";");
            int[] ventasArray = new int[12];
            for (int i = 0; i < 12; i++) {
                ventasArray[i] = Integer.parseInt(datos[i]);
            }
            ventas = new Ventas(year, ventasArray);
            scanner.close();
        } else {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            ventas = new Ventas(currentYear - 1);
        }

        // Mostrar gráfico de barras
        ventas.grafica();

        // Mostrar la media
        System.out.printf("Media: %.2f%n", ventas.media());

        // Guardar datos en un archivo
        String archivoSalida = "ventas" + ventas.getYear() + ".txt";
        PrintWriter writer = new PrintWriter(archivoSalida);
        writer.println(ventas.getYear());
        for (int i = 0; i < ventas.ventas.length; i++) {
            writer.print(ventas.ventas[i]);
            if (i < ventas.ventas.length - 1) {
                writer.print(";");
            }
        }
        writer.close();

        System.out.println("Datos guardados en " + archivoSalida);
    }
}
