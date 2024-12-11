package POO.ProyectoEmpresa;
import java.util.Scanner;

public class IUDirectivo {
    public Directivo directivo;
    Scanner sc = new Scanner(System.in);

    public IUDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }

    public void mostrar() {
        System.out.println("Nombre: " + directivo.getNombre());
        System.out.println("Apellidos: " + directivo.getApellidos());
        System.out.println("Edad: " + directivo.getEdad());
        System.out.println("DNI: " + directivo.getDni());
        System.out.println("Departamento: " + directivo.getDepartamento());
        System.out.println("BEneficios %: " + directivo.getBeneficios());
        
    }

    public void mostrar(int opcion) {
        switch (opcion) {
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
            case 5:
            System.out.println("Beneficio: " + directivo.getBeneficios());
            default:
                System.out.println("Opcion no valida.");
        }
    }


    public void pedir(){
        System.out.print("Nombre directivo: ");
        String nombre = sc.nextLine();
        directivo.setNombre(nombre);

        System.out.print("Apellidos directivo: ");
        String apellidos = sc.nextLine();
        directivo.setApellidos(apellidos); 

        System.out.print("DNI directivo: ");
        String dni = sc.nextLine();
        directivo.setDni(dni);

        System.out.print("Departamento directivo: ");
        String departamento = sc.nextLine();
        directivo.setDepartamento(departamento);

        System.out.print("Beneficio directivo: ");
        double beneficio = sc.nextDouble();
        directivo.setBeneficios(beneficio);


    }
}
