package POO.Juego_Ejercicio7;

public class Posicion {
    private int x;
    private int y;


    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moverA(int nuevax, int nuevay){
        this.x= nuevax;
        this.y = nuevay;
    }

    public void desplazar(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int distancia(Posicion otra) {
        return Math.abs(this.x - otra.x) + Math.abs(this.y - otra.y);
    }
}
