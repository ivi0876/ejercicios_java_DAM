package POO.ProyectoEmpresa;

public class Directivo {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String departamento;
    private double beneficios;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public String getDni(){
        return dni;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento.toUpperCase();
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setBeneficios(double beneficios){
        this.beneficios = beneficios;
    }

    public double getBeneficios(){
        return beneficios;
    }
}
