package Boletin3.EjerciciosNuevos.exercise20;
import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {
    private static final int SIZE = 10;
    private static final char AGUA = '~';
    private static final char ACERTO = 'X';
    private static final char FALLO = 'O';
    private static final char[][] tablero = new char[SIZE][SIZE];
    private static int[][] barco = new int[2][2]; // Guarda las coordenadas del barco

    public static void main(String[] args) {
        inicializarTablero();
        colocarBarco();
        jugar();
    }

    // Inicializa el tablero con agua
    private static void inicializarTablero() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tablero[i][j] = AGUA;
            }
        }
    }

    // Coloca el barco en una posición aleatoria y en una dirección aleatoria
    private static void colocarBarco() {
        Random rand = new Random();
        boolean colocado = false;
        
        while (!colocado) {
            int fila = rand.nextInt(SIZE);
            int col = rand.nextInt(SIZE);
            boolean horizontal = rand.nextBoolean();
            
            if (horizontal && col < SIZE - 1) {
                // Coloca el barco horizontalmente
                barco[0][0] = fila;
                barco[0][1] = col;
                barco[1][0] = fila;
                barco[1][1] = col + 1;
                colocado = true;
            } else if (!horizontal && fila < SIZE - 1) {
                // Coloca el barco verticalmente
                barco[0][0] = fila;
                barco[0][1] = col;
                barco[1][0] = fila + 1;
                barco[1][1] = col;
                colocado = true;
            }
        }
        
        System.out.println("El barco ha sido colocado en el tablero (oculto).");
    }

    // La lógica del juego principal
    private static void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean hundido = false;
        
        System.out.println("¡Bienvenido a Mini-Hundir la Flota!");
        System.out.println("Intenta encontrar el barco de 2 casillas en el tablero.");
        while (!hundido) {
            mostrarTablero();
            System.out.print("Introduce la columna (A-J): ");
            char columna = scanner.next().toUpperCase().charAt(0);
            System.out.print("Introduce la fila (1-10): ");
            int fila = scanner.nextInt();
            
            int col = columna - 'A';
            fila -= 1;
            
            if (fila < 0 || fila >= SIZE || col < 0 || col >= SIZE) {
                System.out.println("Coordenadas fuera del tablero. Intenta nuevamente.");
                continue;
            }
            
            if (tablero[fila][col] == AGUA) {
                if (esParteDelBarco(fila, col)) {
                    tablero[fila][col] = ACERTO;
                    System.out.println("¡Acertaste en (" + (fila + 1) + ", " + columna + ")!");
                    if (barcoHundido()) {
                        hundido = true;
                        System.out.println("¡Has hundido el barco!");
                    }
                } else {
                    tablero[fila][col] = FALLO;
                    System.out.println("Fallaste en (" + (fila + 1) + ", " + columna + ").");
                }
            } else {
                System.out.println("Ya disparaste en esta posición. Elige otra.");
            }
        }
        
        mostrarTablero();
        scanner.close();
    }

    // Comprueba si una coordenada es parte del barco
    private static boolean esParteDelBarco(int fila, int col) {
        return (barco[0][0] == fila && barco[0][1] == col) || (barco[1][0] == fila && barco[1][1] == col);
    }

    // Comprueba si todas las partes del barco han sido alcanzadas
    private static boolean barcoHundido() {
        return tablero[barco[0][0]][barco[0][1]] == ACERTO && tablero[barco[1][0]][barco[1][1]] == ACERTO;
    }

    // Muestra el tablero actual
    private static void mostrarTablero() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((char) ('A' + i) + " ");
        }
        System.out.println();
        
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}

