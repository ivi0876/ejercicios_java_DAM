package POO.ProyectoEmpresa;

public class Empleado {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

        if(salario < 6000){
            this.irpf = 7.5;
        }
        else if(salario <=6000 || salario>= 30000){
            this.irpf = 15.0;
        } 
        else if(salario > 30000) {
            this.irpf = 20.0;
        }
    }

    public double getIrpf() {
        return irpf;
    }

    // Constructor vacío
    public Empleado() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.dni = "";
        setSalario(0);
    }

    // Constructor con parámetros
    public Empleado(String nombre, String apellidos, int edad, String dni, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        setSalario(salario);
    }
}
