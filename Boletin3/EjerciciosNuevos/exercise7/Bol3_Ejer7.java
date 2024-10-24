package Boletin3.EjerciciosNuevos.exercise7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bol3_Ejer7 {

    // Función a) Lee el archivo completo y devuelve el contenido como String
    public static String saveFile(String fileName) {
        String content = "";
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                content += reader.nextLine() + "\n";
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + fileName);
        }
        return content;
    }

    // Función b) Lee el archivo, concatena el nuevo texto y lo guarda de nuevo
    public static void appendFile(String fileName, String newText) {
        // Leer el archivo usando saveFile
        String currentContent = saveFile(fileName);
        // Concatenar el nuevo texto al contenido actual
        currentContent += newText;
        // Escribir el archivo con el contenido actualizado
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(currentContent);
            writer.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
        }
    }

    // Función c) Añade el texto directamente al final del archivo usando append
    public static void appendFile2(String fileName, String newText) {
        try {
            // Usar FileWriter en modo append (segundo parámetro true)
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(newText);
            writer.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
        }
    }

    public static void main(String[] args) {
        // Probar saveFile
        String fileContent = saveFile("archivo_ejercicio2.txt");
        System.out.println("Contenido del archivo:\n" + fileContent);

        // Probar appendFile
        appendFile("archivo_ejercicio2.txt", "Texto añadido al final.");
        System.out.println("Contenido después de añadir con appendFile:\n" + saveFile("archivo_ejercicio2.txt"));

        // Probar appendFile2
        appendFile2("archivo_ejercicio2.txt", "Texto añadido al final con appendFile2.\n");
        System.out.println("Contenido después de añadir con appendFile2:\n" + saveFile("archivo_ejercicio2.txt"));
    }
}
