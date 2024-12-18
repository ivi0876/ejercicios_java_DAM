package POO.Juego_Ejercicio7;

import java.util.Random;

public class Escenario {
    private int ancho;
    private int alto;
    private char[][] terreno; // 'F' = Fango, 'C' = Campo, 'M' = Montaña
    private Guerrero guerrero;
    private Orco orco;

    public Escenario(int ancho, int alto, Guerrero guerrero, Orco orco) {
        this.ancho = ancho;
        this.alto = alto;
        this.terreno = new char[ancho][alto];
        this.guerrero = guerrero;
        this.orco = orco;
        generarTerreno();
    }

    private void generarTerreno() {
        char[] tiposTerreno = {'F', 'C', 'M'};
        Random random = new Random();
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                terreno[i][j] = tiposTerreno[random.nextInt(tiposTerreno.length)];
            }
        }
    }

    public char getTerreno(int x, int y) {
        if (x >= 0 && x < ancho && y >= 0 && y < alto) {
            return terreno[x][y];
        }
        return ' ';
    }

    public void mostrarTablero() {
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                System.out.print(terreno[i][j] + " ");
            }
            System.out.println();
        }
    }
}
