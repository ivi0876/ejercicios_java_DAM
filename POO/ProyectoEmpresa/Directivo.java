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
        return "\"" + departamento + "\"";
    }

    public void setBeneficios(double beneficios){
        this.beneficios = beneficios;
        if(beneficios >= 0 && beneficios <=100){
            this.beneficios = beneficios;
        } else {
            this.beneficios = 0;
        }
    }

    public double getBeneficios(){
        return beneficios;
    }

    public Directivo(){
        this.nombre = "";
        this.apellidos="";
        this.edad = 0;
        this.dni = "";
        this.departamento="";
        this.beneficios=0;

    }

    public Directivo(String nombre,String apellidos, int edad, String dni, String departamento, double beneficios){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.departamento = departamento;
        this.beneficios = beneficios;
    }

    // Método para calcular la ganancia del directivo
    public double calcularGanancia(double beneficioEmpresa) {
        if (beneficioEmpresa > 0) {
            return beneficioEmpresa * (beneficios / 100);
        }
        return 0.0;
    }
}