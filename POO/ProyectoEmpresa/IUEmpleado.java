package POO.ProyectoEmpresa;

import java.util.Scanner;

public class IUEmpleado {
    public Empleado empleado;
    Scanner sc = new Scanner(System.in);

    public IUEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void mostrar() {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellidos: " + empleado.getApellidos());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("DNI: " + empleado.getDni());
        System.out.println("Salario: " + empleado.getSalario());
        System.out.println("IRPF: " + empleado.getIrpf());
        System.out.println("Dinero lleva hacienda: " + empleado.hacienda());
    }

    public void mostrar(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Nombre y Apellidos: " + empleado.getNombre() + " " + empleado.getApellidos());
                break;
            case 2:
                System.out.println("Edad: " + empleado.getEdad());
                break;
            case 3:
                System.out.println("DNI: " + empleado.getDni());
                break;
            case 4:
                System.out.println("Salario: " + empleado.getSalario() + ", IRPF: " + empleado.getIrpf() + "%");
                break;
            case 5:
                System.out.println("Dinero lleva hacienda: " + empleado.hacienda());
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public void pedir() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        empleado.setNombre(nombre); 

        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        empleado.setApellidos(apellidos); 

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        empleado.setEdad(edad);

        System.out.print("DNI: ");
        String dni = sc.nextLine();
        empleado.setDni(dni); 

        System.out.print("Salario: ");
        double salario = sc.nextDouble();
        empleado.setSalario(salario);
    }
}
