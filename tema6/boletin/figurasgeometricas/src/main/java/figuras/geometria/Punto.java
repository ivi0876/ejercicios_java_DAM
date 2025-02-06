package figuras.geometria;
import figuras.interfaz.Libreria;
import figuras.interfaz.InterfazUsuario;
public class Punto {
    public double x, y;
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Punto() {
        this(0, 0);
    }
    
    public void pedirDatos() {
        System.out.println("Introduce las coordenadas del punto:");
        this.x = Libreria.pedirReal();
        this.y = Libreria.pedirReal();
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
