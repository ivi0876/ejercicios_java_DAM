package POO.ProyectoEmpresa;

import java.util.Scanner;

public class IUEmpleado {
    public Empleado empleado;
    Scanner sc = new Scanner(System.in);


    public void mostrar(){
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellidos: " + empleado.getApellidos());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("DNI: " + empleado.getDni());
        System.out.println("Salario: " + empleado.getSalario());
        System.out.println("IRPF: " + empleado.getIrpf());
        System.out.println("Dinero lleva hacienda: " + empleado.hacienda());

    }

    public void pedir() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Salario: ");
        double salario = sc.nextDouble();

        empleado = new Empleado(nombre, apellidos, edad, dni, salario);
    }
}
