package POO.ProyectoEmpresa;

import java.util.Scanner;
@SuppressWarnings("resource")
public class Principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();
        IUEmpleado iuempleado = new IUEmpleado(empleado);

        Directivo directivo = new Directivo();
        IUDirectivo iudirectivo = new IUDirectivo(directivo);

        iuempleado.pedir();
        System.out.println("\nDatos del empleado:");
        iuempleado.mostrar();
        System.out.print("\nIntroduce un número para mostrar un dato (1-5): ");
        int opcion = sc.nextInt();
        System.out.println("\nMostrando dato seleccionado:");
        iuempleado.mostrar(opcion);

        iudirectivo.pedir();
        System.out.println("\nDatos del directivo: ");
        iudirectivo.mostrar();
        System.out.println("\nIntroduce un número para mostrar un dato (1-5): ");
        int opcionDirectivo = sc.nextInt();
        System.out.println("\nMostrando dato seleccionado: ");
        iudirectivo.mostrar(opcionDirectivo);
    }
}
