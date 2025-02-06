package figuras.geometria;

public class Linea {
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
}
