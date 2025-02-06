package figuras.geometria;

public class Linea extends Figura{
    private Punto puntoFinal;

    public Linea(Punto origen, Punto puntoFinal){
        super();
        this.puntoFinal=puntoFinal;
    }

    public Linea(){
        this(new Punto(0,0), new Punto(1,1));
    }

    public Punto getPuntoFinal(){
        return puntoFinal;
    }

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        System.out.println("Introduce el punto final:");
        this.puntoFinal.pedirDatos();
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Punto Final: " + puntoFinal);
    }
}
