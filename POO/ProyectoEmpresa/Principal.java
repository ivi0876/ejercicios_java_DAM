package POO.ProyectoEmpresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Directivo directivo = new Directivo("Ana", "Martínez", 40, "12345678A", "informatica", 1000);
        Empleado empleado1 = new Empleado("Luis", "Pérez", 30, "23456789B", 20000);
        Empleado empleado2 = new Empleado("Marta", "Gómez", 25, "34567890C", 18000);
        Empresa empresa = new Empresa(directivo, empleado1, empleado2, 10000);

        int opcion;
        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    verDatosEmpleados(empresa, sc);
                    break;
                case 2:
                    empresa.mostrarDatosDirectivo();
                    break;
                case 3:
                    modificarDatos(empresa, sc);
                    break;
                case 4:
                    empresa.pagarEmpleados();
                    break;
                case 5:
                    System.out.print("Ingresa cantidad a cobrar: ");
                    double cantidad = sc.nextDouble();
                    empresa.cobrar(cantidad);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1.- Ver datos empleados");
        System.out.println("2.- Ver datos directivo");
        System.out.println("3.- Modificar datos");
        System.out.println("4.- Pagar");
        System.out.println("5.- Cobrar");
        System.out.println("6.- Salir");
    }

    private static void verDatosEmpleados(Empresa empresa, Scanner sc) {
        int opcion;
        do {
            System.out.println("1.- Ver todos los datos");
            System.out.println("2.- Ver solo nombres");
            System.out.println("3.- Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    empresa.mostrarDatosEmpleados(true);
                    break;
                case 2:
                    empresa.mostrarDatosEmpleados(false);
                    break;
                case 3:
                    System.out.println("Saliendo del submenú...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    private static void modificarDatos(Empresa empresa, Scanner sc) {
        System.out.println("¿Qué deseas modificar?");
        System.out.println("1.- Datos del directivo");
        System.out.println("2.- Datos del empleado 1");
        System.out.println("3.- Datos del empleado 2");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                empresa.iudirectivo.pedir();
                break;
            case 2:
                empresa.iuempleado.pedir(); // Para el empleado 1
                break;
            case 3:
                empresa.iuempleado.pedir(); // Para el empleado 2
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
