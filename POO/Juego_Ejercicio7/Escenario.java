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

    public boolean cambiarTerreno() {
        Random random = new Random();
        int chance = random.nextInt(10); // Cambiar terreno con una probabilidad del 10%
        if (chance < 1) {
            generarTerreno(); // Cambiar terreno completamente aleatorio
            return true;
        }
        return false;
    }

    public int recuperacionTerreno(int x, int y) {
        char tipoTerreno = getTerreno(x, y);
        switch (tipoTerreno) {
            case 'F': return 30; // Fango: Recupera 30 energía
            case 'C': return 50; // Campo: Recupera 50 energía
            case 'M': return 40; // Montaña: Recupera 40 energía
            default: return 0; // Si no hay terreno válido
        }
    }
}
