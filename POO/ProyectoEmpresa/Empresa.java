package POO.ProyectoEmpresa;

public class Empresa {
    private double ganancias;
    Directivo directivo;
    Empleado empleado1;
    Empleado empleado2;
    IUEmpleado iuempleado;
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
        this.iuempleado = new IUEmpleado(empleado2);
        this.iudirectivo = new IUDirectivo(directivo);
        


    }

    public Empresa(Directivo directivo, Empleado empleado1, Empleado empleado2, double ganancias){
        this.directivo = directivo;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.ganancias = ganancias;
        this.iuempleado = new IUEmpleado(empleado1);
        this.iuempleado = new IUEmpleado(empleado2);
        this.iudirectivo = new IUDirectivo(directivo);
       


    }
}
