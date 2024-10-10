package Boletin3.EjerciciosNuevos.exercise9;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Bol3_Ejer9_1 {

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar primos menores que uno dado");
            System.out.println("2. Primos en archivo");
            System.out.println("3. Archivo con primos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número: ");
                    int num = sc.nextInt();
                    System.out.println("Primos menores que " + num + ":");
                    for (int i = 2; i < num; i++) {
                        if (esPrimo(i)) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Introduce el nombre del archivo: ");
                    String archivoEntrada = sc.nextLine();
                    try {
                        List<String> lineas = Files.readAllLines(Paths.get(archivoEntrada));
                        for (String linea : lineas) {
                            int numero = Integer.parseInt(linea);
                            if (esPrimo(numero)) {
                                System.out.println(numero + " es primo.");
                            } else {
                                System.out.println(numero + " no es primo.");
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo: " + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("El archivo contiene un valor no numérico.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce un número mayor que 2: ");
                    int limite = sc.nextInt();
                    if (limite > 2) {
                        StringBuilder primos = new StringBuilder();
                        for (int i = 2; i <= limite; i++) {
                            if (esPrimo(i)) {
                                primos.append(i).append(";");
                            }
                        }

                        // Escribir los primos en el archivo 'ejercicio9datos.txt'
                        try (FileWriter writer = new FileWriter("Boletin3/EjerciciosNuevos/exercise9/ejercicio9datos.txt")) {
                            writer.write(primos.toString());
                            System.out.println("Primos guardados en el archivo 'ejercicio9datos.txt'.");
                        } catch (IOException e) {
                            System.out.println("Error al escribir en el archivo: " + e.getMessage());
                        }
                    } else {
                        System.out.println("El número debe ser mayor que 2.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
