package figuras.geometria;

import figuras.interfaz.InterfazUsuario;
import figuras.interfaz.Libreria;

public class Figura implements InterfazUsuario{
    protected Punto origen;
    protected String nombre;

    public Figura(Punto origen, String nombre) {
        this.origen = origen;
        setNombre(nombre);
    }

    public Figura(){
        this(new Punto(), "");

    }

    public void setNombre(String nombre){
        this.nombre=nombre.trim().toUpperCase();
    }

    public String getNombre(){
        return nombre;
    }

    public Punto getOrigen(){
        return origen;
    }

    public void setOrigen(Punto origen){
        this.origen=origen;
    }

    @Override
    public void pedirDatos(){
        System.out.println("Introduce el nombre de la bicicleta: ");
        this.setNombre(Libreria.scanner.nextLine());
        this.origen.pedirDatos();
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Origen: " + origen);
    }
    
}
