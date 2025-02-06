package figuras.geometria;

import java.util.Random;

public class Poligono extends Figura{
    public Punto[] puntos;

    public Poligono(String nombre, Punto origen, int cantidadPuntos){
        super(origen, nombre);
        puntos = new Punto[cantidadPuntos];
        Random rand = new Random();
        for (int i = 0; i < cantidadPuntos; i++) {
            puntos[i] = new Punto(rand.nextDouble() * 10, rand.nextDouble() * 10);
        }
    }

    public Poligono() {
        this("TRIANGULO", new Punto(), 3);
        puntos[0] = new Punto(0, 0);
        puntos[1] = new Punto(1, 1);
        puntos[2] = new Punto(1, 0);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        for (Punto p : puntos) {
            System.out.println("Punto: " + p);
        }
    }
    
}
