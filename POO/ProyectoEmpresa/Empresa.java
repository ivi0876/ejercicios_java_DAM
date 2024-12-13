package POO.ProyectoEmpresa;

public class Empresa {
    private double ganancias;
    Directivo directivo;
    Empleado empleado1;
    Empleado empleado2;
    IUEmpleado iuempleado;
    IUEmpleado iuempleado2;
    IUDirectivo iudirectivo;
    


    public void setGanacias(double ganancias){
        this.ganancias = ganancias;

    }

    public double getGanancias(){
        return ganancias;
    }

    public Empresa(Directivo directivo, Empleado empleado1, Empleado empleado2){
        this.directivo = directivo;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.iuempleado = new IUEmpleado(empleado1);
        this.iuempleado2 = new IUEmpleado(empleado2);
        this.iudirectivo = new IUDirectivo(directivo);
        


    }

    public Empresa(Directivo directivo, Empleado empleado1, Empleado empleado2, double ganancias){
        this.directivo = directivo;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.ganancias = ganancias;
        this.iuempleado = new IUEmpleado(empleado1);
        this.iuempleado2 = new IUEmpleado(empleado2);
        this.iudirectivo = new IUDirectivo(directivo);
       
    }

// * ESTO ESTA EN EL PRINCIPAL.JAVA


    // public void pagarEmpleados() {
    //     double totalSalarios = empleado1.getSalario() + empleado2.getSalario();
    //     System.out.println("Ganancias antes de pagar: " + ganancias);
    //     ganancias -= totalSalarios;
    //     System.out.println("Ganancias después de pagar: " + ganancias);
    // }

    // public void cobrar(double cantidad) {
    //     System.out.println("Ganancias antes de cobrar: " + ganancias);
    //     ganancias += cantidad;
    //     System.out.println("Ganancias después de cobrar: " + ganancias);
    // }

    // public void mostrarDatosEmpleados(boolean todos) {
    //     if (todos) {
    //         System.out.println("Empleado 1: " + empleado1);
    //         System.out.println("Empleado 2: " + empleado2);
    //     } else {
    //         System.out.println("Nombre empleado 1: " + empleado1.getNombre());
    //         System.out.println("Nombre empleado 2: " + empleado2.getNombre());
    //     }
    // }

    // public void mostrarDatosDirectivo() {
    //     System.out.println("Datos del directivo: " + directivo);
    // }
}
