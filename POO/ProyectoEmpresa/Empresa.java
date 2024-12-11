package POO.ProyectoEmpresa;

public class Empresa {
    private double ganancias;
    Directivo directivo = new Directivo();
    Empleado empleado1 = new Empleado();
    Empleado empleado2 = new Empleado();


    public void setGanacias(double ganancias){
        this.ganancias = ganancias;

    }

    public double getGanancias(){
        return ganancias;
    }
}
