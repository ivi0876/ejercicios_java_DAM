package Boletin3.EjerciciosNuevos.exercise19;
import java.util.Random;
import java.util.Scanner;

public class JuegoCanonesConANSI {
    private static final int WIDTH = 50; // Ancho del campo de juego
    private static final int HEIGHT = 20; // Altura del campo de juego
    private static final int GRAVEDAD = 10;
    private static int posicionJugador1;
    private static int posicionJugador2;
    private static int alturaTerreno1;
    private static int alturaTerreno2;
    private static int viento;
    private static char[][] campo;

    public static void main(String[] args) {
        inicializarJuego();
        jugar();
    }

    private static void inicializarJuego() {
        Random rand = new Random();
        campo = new char[HEIGHT][WIDTH];
        
        // Posiciones iniciales de los jugadores
        posicionJugador1 = 5;
        posicionJugador2 = WIDTH - 5;
        
        // Altura de los terrenos aleatoria
        alturaTerreno1 = rand.nextInt(HEIGHT / 2) + 5;
        alturaTerreno2 = rand.nextInt(HEIGHT / 2) + 5;
        
        // Factor de viento (positivo o negativo)
        viento = rand.nextInt(11) - 5; // Viento entre -5 y 5

        // Inicializar el campo con espacio vacío
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                campo[i][j] = ' ';
            }
        }

        // Colocar los cañones
        campo[HEIGHT - alturaTerreno1][posicionJugador1] = '1';
        campo[HEIGHT - alturaTerreno2][posicionJugador2] = '2';
    }

    private static void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean juegoActivo = true;
        int turno = 1;

        System.out.println("¡Bienvenidos a Cañones con ANSI!");
        System.out.println("Jugador 1 está en la izquierda (posición " + posicionJugador1 + ")");
        System.out.println("Jugador 2 está en la derecha (posición " + posicionJugador2 + ")");
        System.out.println("El viento es de: " + viento);

        while (juegoActivo) {
            mostrarCampo();
            int angulo, fuerza;
            System.out.println("\nTurno del Jugador " + turno);
            System.out.print("Introduce el ángulo de disparo (0-90): ");
            angulo = scanner.nextInt();
            System.out.print("Introduce la fuerza de disparo: ");
            fuerza = scanner.nextInt();
            
            // Calcular disparo
            if (turno == 1) {
                if (realizarDisparo(posicionJugador1, alturaTerreno1, angulo, fuerza, true)) {
                    System.out.println("¡Jugador 1 gana!");
                    juegoActivo = false;
                }
            } else {
                if (realizarDisparo(posicionJugador2, alturaTerreno2, angulo, fuerza, false)) {
                    System.out.println("¡Jugador 2 gana!");
                    juegoActivo = false;
                }
            }
            turno = (turno == 1) ? 2 : 1;
        }
        scanner.close();
    }

    // Realiza el disparo y verifica si acierta al oponente
    private static boolean realizarDisparo(int posInicial, int alturaTerreno, int angulo, int fuerza, boolean disparoIzquierda) {
        double anguloRad = Math.toRadians(angulo);
        double velX = fuerza * Math.cos(anguloRad) + viento;
        double velY = fuerza * Math.sin(anguloRad);
        
        double x = posInicial;
        double y = HEIGHT - alturaTerreno;

        while (x >= 0 && x < WIDTH && y >= 0 && y < HEIGHT) {
            // Limpiar y dibujar campo en cada paso
            limpiarPantalla();
            mostrarCampo();

            // Actualizar coordenadas
            x += disparoIzquierda ? velX : -velX;
            y -= velY;
            velY -= GRAVEDAD * 0.1;

            // Comprobar si impacta al oponente
            int intX = (int)x;
            int intY = (int)y;
            if (intY >= 0 && intY < HEIGHT && intX >= 0 && intX < WIDTH) {
                campo[intY][intX] = '*'; // Dibujar el proyectil en la pantalla
                if ((disparoIzquierda && intX >= posicionJugador2 && intY <= HEIGHT - alturaTerreno2) ||
                    (!disparoIzquierda && intX <= posicionJugador1 && intY <= HEIGHT - alturaTerreno1)) {
                    return true;
                }
            }

            // Espera para ver el movimiento
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
        }
        return false;
    }

    // Muestra el campo con los cañones y el proyectil
    private static void mostrarCampo() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                char simbolo = campo[i][j];
                if (simbolo == '1' || simbolo == '2') {
                    System.out.print("\u001B[31m" + simbolo + "\u001B[0m"); // Rojo para cañones
                } else if (simbolo == '*') {
                    System.out.print("\u001B[33m" + simbolo + "\u001B[0m"); // Amarillo para disparos
                } else {
                    System.out.print(simbolo);
                }
            }
            System.out.println();
        }
    }

    // Limpia la pantalla usando códigos ANSI
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
