package Boletin4_1.ProyectoEmpresa;


public class Directivo {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String departamento;
    private double porcentajeBeneficio;

    // Constructor vacío
    public Directivo() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.dni = "";
        this.departamento = "";
        this.porcentajeBeneficio = 0.0;
    }

    // Constructor con parámetros
    public Directivo(String nombre, String apellidos, int edad, String dni, String departamento, double porcentajeBeneficio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        setDepartamento(departamento);
        setPorcentajeBeneficio(porcentajeBeneficio);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public String getDepartamento() {
        return "\"" + departamento + "\"";
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento.toUpperCase();
    }

    public double getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(double porcentajeBeneficio) {
        if (porcentajeBeneficio >= 0 && porcentajeBeneficio <= 100) {
            this.porcentajeBeneficio = porcentajeBeneficio;
        } else {
            this.porcentajeBeneficio = 0.0;
        }
    }

    // Método para calcular la ganancia del directivo
    public double calcularGanancia(double beneficioEmpresa) {
        if (beneficioEmpresa > 0) {
            return beneficioEmpresa * (porcentajeBeneficio / 100);
        }
        return 0.0;
    }
}
