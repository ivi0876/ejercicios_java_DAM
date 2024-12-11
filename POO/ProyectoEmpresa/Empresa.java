package POO.ProyectoEmpresa;

public class Empresa {
    private double ganancias;
    Directivo directivo;// = new Directivo();
    Empleado empleado1; //new Empleado();
    Empleado empleado2; //new Empleado();


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


    }

    public Empresa(Directivo directivo, Empleado empleado1, Empleado empleado2, double ganancias){
        this.directivo = directivo;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.ganancias = ganancias;


    }
}
