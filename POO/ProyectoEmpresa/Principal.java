package POO.ProyectoEmpresa;

    import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();
        IUEmpleado iuempleado = new IUEmpleado(empleado);

        iuempleado.pedir();
        System.out.println("\nMostrando todos los datos del empleado:");
        iuempleado.mostrar();

        System.out.print("\nIntroduce un número para mostrar un campo específico (1-5): ");
        int opcion = sc.nextInt();
        System.out.println("\nMostrando campo seleccionado:");
        iuempleado.mostrar(opcion);
    }
}
