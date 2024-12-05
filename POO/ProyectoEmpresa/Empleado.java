package POO.ProyectoEmpresa;

public class Empleado {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double salario_anual;
    private double irpf;


    public String getNombre() {
        return nombre;
    };
    public void setNombre(String nombre) {
        this.nombre = nombre;
    };

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario_anual() {
        return salario_anual;
    }

    public void setSalario_anual(double salario_anual) {
        this.salario_anual = salario_anual;
    }

    public double getIrpf() {
        return irpf;
    }
}
