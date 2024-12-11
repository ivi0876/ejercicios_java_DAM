package POO.ProyectoEmpresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Directivo directivo = new Directivo();
        Empresa empresa = new Empresa(directivo, empleado1, empleado2);

        int opcion;
        do {
            System.out.println("1.- Ver datos personales");
            System.out.println("2.- Ver datos directivo");
            System.out.println("3.- MOdificar datos");
            System.out.println("4.- Pagar");
            System.out.println("5.- Cobrar");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.close();
            switch(opcion) {
                case 1:
                    // Código opción 1
                    break;
                case 2:
                    // Código opción 2
                    break;
                case 3:
                    // Código opción 3
                    break;
                case 4:
                    // Código opción 4
                    break;
                case 5:

                break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while(opcion != 6);
        
        
    }
}
