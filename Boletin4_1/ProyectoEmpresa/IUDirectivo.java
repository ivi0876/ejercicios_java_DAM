package Boletin4_1.ProyectoEmpresa;

import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class IUDirectivo {
    public Directivo directivo;

    // Constructor con parámetro
    public IUDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }

    // Método para mostrar los campos del objeto directivo
    public void mostrar() {
        System.out.println("Nombre: " + directivo.getNombre());
        System.out.println("Apellidos: " + directivo.getApellidos());
        System.out.println("Edad: " + directivo.getEdad());
        System.out.println("DNI: " + directivo.getDni());
        System.out.println("Departamento: " + directivo.getDepartamento());
        System.out.println("Porcentaje de Beneficio: " + directivo.getPorcentajeBeneficio());
    }

    // Sobrecarga de mostrar para mostrar un campo específico
    public void mostrar(int campo) {
        switch (campo) {
            case 1:
                System.out.println("Nombre y Apellidos: " + directivo.getNombre() + " " + directivo.getApellidos());
                break;
            case 2:
                System.out.println("Edad: " + directivo.getEdad());
                break;
            case 3:
                System.out.println("DNI: " + directivo.getDni());
                break;
            case 4:
                System.out.println("Departamento: " + directivo.getDepartamento());
                System.out.println("Porcentaje de Beneficio: " + directivo.getPorcentajeBeneficio());
                break;
            case 5:
                System.out.println("Ganancia de Beneficios: " + directivo.calcularGanancia(100000)); // Ejemplo de uso
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    // Método para pedir datos del directivo
    public void pedir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre:");
        directivo.setNombre(scanner.nextLine());
        System.out.println("Introduce los apellidos:");
        directivo.setApellidos(scanner.nextLine());
        System.out.println("Introduce la edad:");
        directivo.setEdad(scanner.nextInt());
        scanner.nextLine(); // Limpiar buffer
        System.out.println("Introduce el DNI:");
        directivo.setDni(scanner.nextLine());
        System.out.println("Introduce el departamento:");
        directivo.setDepartamento(scanner.nextLine());
        System.out.println("Introduce el porcentaje de beneficio:");
        directivo.setPorcentajeBeneficio(scanner.nextDouble());
    }
}
