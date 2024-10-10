package Boletin4_1.ProyectoEmpresa;

import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Directivo y la interfaz de usuario
        Directivo directivo = new Directivo();
        IUDirectivo interfaz = new IUDirectivo(directivo);

        // Pedir datos al usuario
        interfaz.pedir();

        // Mostrar todos los datos
        System.out.println("\nDatos del directivo:");
        interfaz.mostrar();

        // Mostrar cuánto se lleva de beneficios
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el beneficio total de la empresa:");
        double beneficioEmpresa = scanner.nextDouble();
        System.out.println("El directivo se lleva de beneficios: " + directivo.calcularGanancia(beneficioEmpresa));
    }
}
