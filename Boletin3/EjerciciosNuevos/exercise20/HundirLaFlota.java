package Boletin3.EjerciciosNuevos.exercise20;
import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {
    private static final int SIZE = 10;
    private static final char AGUA = '~';
    private static final char ACERTO = 'X';
    private static final char FALLO = 'O';
    private static final int BARCO_TAMANO = 2;

    public static void main(String[] args) {
        Tablero tablero = new Tablero(SIZE, AGUA, ACERTO, FALLO);
        Barco barco = new Barco(BARCO_TAMANO, SIZE);
        Juego juego = new Juego(tablero, barco);
        juego.iniciar();
    }
}

class Tablero {
    private final int size;
    private final char agua;
    private final char acerto;
    private final char fallo;
    private final char[][] tablero;

    public Tablero(int size, char agua, char acerto, char fallo) {
        this.size = size;
        this.agua = agua;
        this.acerto = acerto;
        this.fallo = fallo;
        this.tablero = new char[size][size];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tablero[i][j] = agua;
            }
        }
    }

    public void mostrarTablero() {
        System.out.println("\n  -----------------------------");
        System.out.print("  ");
        for (int i = 0; i < size; i++) {
            System.out.print((char) ('A' + i) + " ");
        }
        System.out.println();
        System.out.println("  -----------------------------");

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < size; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println("  -----------------------------");
    }

    public boolean disparar(int fila, int col) {
        if (tablero[fila][col] == agua) {
            tablero[fila][col] = fallo;
            return false;
        }
        tablero[fila][col] = acerto;
        return true;
    }

    public boolean esPosicionYaDisparada(int fila, int col) {
        return tablero[fila][col] == acerto || tablero[fila][col] == fallo;
    }

    public void marcarAcerto(int fila, int col) {
        tablero[fila][col] = acerto;
    }

    public char[][] getTablero() {
        return tablero;
    }
}

class Barco {
    private final int[][] coordenadas;

    public Barco(int tamano, int size) {
        coordenadas = new int[tamano][2];
        colocarBarco(size);
    }

    private void colocarBarco(int size) {
        Random rand = new Random();
        boolean colocado = false;

        while (!colocado) {
            int fila = rand.nextInt(size);
            int col = rand.nextInt(size);
            boolean horizontal = rand.nextBoolean();

            if (horizontal && col < size - 1) {
                // Coloca el barco horizontalmente
                coordenadas[0][0] = fila;
                coordenadas[0][1] = col;
                coordenadas[1][0] = fila;
                coordenadas[1][1] = col + 1;
                colocado = true;
            } else if (!horizontal && fila < size - 1) {
                // Coloca el barco verticalmente
                coordenadas[0][0] = fila;
                coordenadas[0][1] = col;
                coordenadas[1][0] = fila + 1;
                coordenadas[1][1] = col;
                colocado = true;
            }
        }
    }

    public boolean esParteDelBarco(int fila, int col) {
        for (int[] parte : coordenadas) {
            if (parte[0] == fila && parte[1] == col) {
                return true;
            }
        }
        return false;
    }

    public boolean barcoHundido(char[][] tablero, char acerto) {
        for (int[] parte : coordenadas) {
            if (tablero[parte[0]][parte[1]] != acerto) {
                return false;
            }
        }
        return true;
    }
}

class Juego {
    private final Tablero tablero;
    private final Barco barco;
    private final Scanner scanner = new Scanner(System.in);
    private int intentos = 0;

    public Juego(Tablero tablero, Barco barco) {
        this.tablero = tablero;
        this.barco = barco;
    }

    public void iniciar() {
        System.out.println("\n¡Bienvenido a Mini-Hundir la Flota!");
        System.out.println("Intenta encontrar el barco de 2 casillas en el tablero.");
        boolean hundido = false;

        while (!hundido) {
            tablero.mostrarTablero();
            int[] coordenadas = solicitarCoordenadas();
            int fila = coordenadas[0];
            int col = coordenadas[1];
            intentos++;

            if (tablero.esPosicionYaDisparada(fila, col)) {
                System.out.println("Ya disparaste en esta posición. Elige otra.");
                continue;
            }

            if (barco.esParteDelBarco(fila, col)) {
                tablero.marcarAcerto(fila, col);
                System.out.println("¡Acertaste!");
                if (barco.barcoHundido(tablero.getTablero(), 'X')) {
                    hundido = true;
                    System.out.println("¡Has hundido el barco!");
                    System.out.println("Número de intentos: " + intentos);
                    System.out.println("¡Felicidades, has ganado!");
                    continuarJuego();
                }
            } else {
                tablero.disparar(fila, col);
                System.out.println("Fallaste.");
            }
        }
    }

    private void continuarJuego() {
        System.out.print("\n¿Quieres jugar otra vez? (S/N): ");
        String respuesta = scanner.next().toUpperCase();
        if (respuesta.equals("S")) {
            Tablero nuevoTablero = new Tablero(10, '~', 'X', 'O');
            Barco nuevoBarco = new Barco(2, 10);
            Juego nuevoJuego = new Juego(nuevoTablero, nuevoBarco);
            nuevoJuego.iniciar();
        } else {
            System.out.println("¡Gracias por jugar!");
            System.exit(0);
        }
    }

    private int[] solicitarCoordenadas() {
        int fila = -1, col = -1;
        boolean inputValido = false;

        while (!inputValido) {
            try {
                System.out.print("Introduce la columna (A-J): ");
                char columna = scanner.next().toUpperCase().charAt(0);
                System.out.print("Introduce la fila (1-10): ");
                fila = scanner.nextInt() - 1;
                col = columna - 'A';

                if (fila >= 0 && fila < tablero.getTablero().length && col >= 0 && col < tablero.getTablero().length) {
                    inputValido = true;
                } else {
                    System.out.println("Coordenadas fuera del tablero. Intenta nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                scanner.nextLine(); // Limpiar la entrada
            }
        }
        return new int[] { fila, col };
    }
}
