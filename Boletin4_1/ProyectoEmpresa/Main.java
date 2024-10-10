package Boletin4_1.ProyectoEmpresa;

// import java.util.Scanner;
// @SuppressWarnings({ "resource" })

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Empleado y la IU correspondiente
        Empleado empleado = new Empleado();
        IUEmpleado interfaz = new IUEmpleado(empleado);

        // Pedir datos al usuario
        interfaz.pedir();

        // Mostrar todos los datos del empleado
        System.out.println("\nDatos completos del empleado:");
        interfaz.mostrar();

        // Mostrar solo lo que se lleva hacienda
        System.out.println("\nMostrando lo que se lleva Hacienda:");
        interfaz.mostrar(5);
    }
}
