package Boletin4_1.ProyectoEmpresa;

import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class IUEmpleado {
    public Empleado empleado;

    // Constructor que inicializa la propiedad empleado
    public IUEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    // Método para mostrar los datos completos del empleado
    public void mostrar() {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellidos: " + empleado.getApellidos());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("DNI: " + empleado.getDni());
        System.out.println("Salario: " + empleado.getSalario() + " euros");
        System.out.println("IRPF: " + empleado.getIrpf() + "%");
        System.out.println("Retención a Hacienda: " + empleado.calcularRetencion() + " euros");
    }

    // Método para pedir datos al usuario
    public void pedir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        empleado.setNombre(scanner.nextLine());

        System.out.print("Introduce los apellidos: ");
        empleado.setApellidos(scanner.nextLine());

        System.out.print("Introduce la edad: ");
        empleado.setEdad(scanner.nextInt());
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Introduce el DNI: ");
        empleado.setDni(scanner.nextLine());

        System.out.print("Introduce el salario anual: ");
        empleado.setSalario(scanner.nextDouble());
    }

    // Método sobrecargado para mostrar campos específicos
    public void mostrar(int campo) {
        switch (campo) {
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
                System.out.println("Salario: " + empleado.getSalario() + " euros");
                System.out.println("IRPF: " + empleado.getIrpf() + "%");
                break;
            case 5:
                System.out.println("Retención a Hacienda: " + empleado.calcularRetencion() + " euros");
                break;
            default:
                System.out.println("Campo no válido.");
                break;
        }
    }
}

