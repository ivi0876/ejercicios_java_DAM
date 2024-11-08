package Boletin3.EjerciciosNuevos.exercise16;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CalendarioPerpetuo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el año: ");
        int anio = scanner.nextInt();
        
        System.out.print("Introduce el mes (1-12): ");
        int mes = scanner.nextInt();

        // Generar el calendario
        String calendario = generarCalendario(mes, anio);
        
        // Mostrar el calendario por pantalla
        System.out.println(calendario);
        
        System.out.print("¿Deseas guardar el calendario en un archivo? (s/n): ");
        char opcion = scanner.next().toLowerCase().charAt(0);
        
        if (opcion == 's') {
            guardarCalendarioEnArchivo(calendario, mes, anio);
        }

        scanner.close();
    }

    // Método para generar el calendario
    public static String generarCalendario(int mes, int anio) {
        StringBuilder calendario = new StringBuilder();
        
        calendario.append("L  M  X  J  V  S  D\n");
        
        int primerDia = obtenerPrimerDiaDeLaSemana(mes, anio);
        int diasEnMes = obtenerDiasEnMes(mes, anio);

        // Alineación inicial del primer día
        for (int i = 0; i < primerDia; i++) {
            calendario.append("   ");
        }

        // Imprimir los días del mes
        for (int dia = 1; dia <= diasEnMes; dia++) {
            calendario.append(String.format("%2d ", dia));
            
            // Nueva línea después de cada domingo
            if ((dia + primerDia) % 7 == 0) {
                calendario.append("\n");
            }
        }
        
        return calendario.toString();
    }

    // Método para obtener el primer día de la semana del mes usando la fórmula de Zeller
    public static int obtenerPrimerDiaDeLaSemana(int mes, int anio) {
        if (mes == 1 || mes == 2) {
            mes += 12;
            anio -= 1;
        }
        
        int q = 1; // Primer día del mes
        int m = mes;
        int k = anio % 100;
        int j = anio / 100;

        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
        return (h + 5) % 7; // Ajuste para que empiece en lunes (0=Lunes, ..., 6=Domingo)
    }

    // Método para obtener la cantidad de días en un mes dado
    public static int obtenerDiasEnMes(int mes, int anio) {
        int dias;
        switch (mes) {
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = (esBisiesto(anio) ? 29 : 28);
                break;
            default:
                dias = 31;
        }
        return dias;
    }

    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    // Método para guardar el calendario en un archivo
    public static void guardarCalendarioEnArchivo(String calendario, int mes, int anio) {
        String nombreArchivo = "Calendario_" + mes + "_" + anio + ".txt";
        try (FileWriter fileWriter = new FileWriter(nombreArchivo)) {
            fileWriter.write("Calendario del " + mes + "/" + anio + "\n\n");
            fileWriter.write(calendario);
            System.out.println("Calendario guardado en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
