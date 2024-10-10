package Boletin3.EjerciciosNuevos.exercise7;

// las siguientes importaciones explicadas en el readme
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Bol3_Ejer7 {

    /**
     * Lee el contenido de un archivo y lo devuelve como una cadena.
     * @param nombreArchivo Nombre del archivo a leer.
     * @return El contenido del archivo como una cadena.
     */
    public static String saveFile(String nombreArchivo) {
        try {
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            return String.join("\n", lineas);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return "";
        }
    }

    /**
     * Añade texto al final de un archivo. Lee el archivo, concatena la cadena y lo guarda de nuevo.
     * @param nombreArchivo Nombre del archivo.
     * @param texto Texto a añadir al archivo.
     */
    public static void appendFile(String nombreArchivo, String texto) {
        // Leer el archivo usando saveFile
        String contenidoActual = saveFile(nombreArchivo);
        // Concatenar el nuevo texto
        String nuevoContenido = contenidoActual + "\n" + texto;
        
        // Guardar el contenido actualizado en el archivo
        try {
            Files.write(Paths.get(nombreArchivo), nuevoContenido.getBytes());
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    /**
     * Añade texto al final de un archivo usando el método Files.write con StandardOpenOption.APPEND.
     * @param nombreArchivo Nombre del archivo.
     * @param texto Texto a añadir al archivo.
     */
    public static void appendFile2(String nombreArchivo, String texto) {
        try {
            Files.write(Paths.get(nombreArchivo), (texto + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String nombreArchivo = "Boletin3/EjerciciosNuevos/exercise2/datos.txt";
        
        // Probar saveFile
        System.out.println("Contenido original del archivo:");
        System.out.println(saveFile(nombreArchivo));

        // Probar appendFile
        appendFile(nombreArchivo, "Nueva línea añadida con appendFile");
        System.out.println("\nContenido del archivo después de appendFile:");
        System.out.println(saveFile(nombreArchivo));

        // Probar appendFile2
        appendFile2(nombreArchivo, "Otra línea añadida con appendFile2");
        System.out.println("\nContenido del archivo después de appendFile2:");
        System.out.println(saveFile(nombreArchivo));
    }
}

