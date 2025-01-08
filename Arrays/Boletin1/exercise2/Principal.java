package Arrays.Boletin1.exercise2;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        String nombreArchivo = "ventas.txt"; 
        if (args.length > 0) {
            nombreArchivo = args[0]; 
        }

        // b) Comprobamos si el archivo existe
        File archivo = new File(nombreArchivo);
        Ventas ventas;
        
        if (archivo.exists()) {
            // Si el archivo existe, lo leemos
            FileReader fr = null;
            try {
                fr = new FileReader(archivo);
                char[] buffer = new char[100]; 
                int length = fr.read(buffer);  
                String data = new String(buffer, 0, length);
                
                // Dividimos los datos en líneas y procesamos
                String[] lines = data.split("\n");
                int año = Integer.parseInt(lines[0].trim()); // Leemos el año
                String[] ventasStr = lines[1].split(";"); // Leemos las ventas y las dividimos por ";"
                int[] ventasArray = new int[12];
                for (int i = 0; i < 12; i++) {
                    ventasArray[i] = Integer.parseInt(ventasStr[i]);
                }
                ventas = new Ventas(año, ventasArray);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            } finally {
                try {
                    if (fr != null) {
                        fr.close(); 
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            // Si el archivo no existe, creamos un objeto con el año anterior
            int añoActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
            ventas = new Ventas(añoActual - 1);
        }

        // Mostrar el gráfico de barras
        ventas.grafica();

        // Mostrar la media
        System.out.printf("Media de ventas: %.2f%n", ventas.media());

        // c) Guardar los datos en un archivo nuevo usando FileWriter
        String archivoSalida = "ventas" + ventas.getAño() + ".txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(archivoSalida);
            fw.write(ventas.getAño() + "\n"); 
            for (int i = 0; i < 12; i++) {
                fw.write(ventas.ventas[i] + (i < 11 ? ";" : "")); // Escribe las ventas, separadas por ;
            }
            fw.write("\n"); // Nueva línea al final
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close(); 
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
