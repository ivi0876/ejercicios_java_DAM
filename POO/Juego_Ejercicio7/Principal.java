package POO.Juego_Ejercicio7;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Crear posiciones iniciales
        Posicion posicionGuerrero = new Posicion(1, 1);
        Posicion posicionOrco = new Posicion(3, 3);

        // Crear guerrero y orco
        Guerrero guerrero = new Guerrero(1000, posicionGuerrero, true, 'A'); // 'A' para Arco, configurable
        Orco orco = new Orco(1000, posicionOrco, 1); // Nivel del orco es 1

        // Crear escenario
        Escenario escenario = new Escenario(10, 10, guerrero, orco); // 10x10 con campo ('C')

        Scanner sc = new Scanner(System.in);
        boolean juegoTerminado = false;

        System.out.println("¡Empieza el juego de tablero: Guerrero vs Orco!\n");

        while (!juegoTerminado) {
            // Mostrar el tablero
            System.out.println("\nEstado del escenario:");
            escenario.mostrarTablero();

            // Turno del guerrero
            System.out.println("\nTurno del Guerrero:");
            System.out.println("1. Atacar\n2. Recuperarse\n3. Moverse");
            System.out.print("¿Qué quieres hacer? ");
            int opcionGuerrero = sc.nextInt();

            switch (opcionGuerrero) {
                case 1: // Atacar
                    guerrero.atacar(orco);
                    break;
                case 2: // Recuperarse
                    guerrero.recuperarse(escenario.recuperacionTerreno(guerrero.getPosicion().getX(), guerrero.getPosicion().getY()));
                    break;
                case 3: // Moverse
                    System.out.print("Introduce desplazamiento en X: ");
                    int dx = sc.nextInt();
                    System.out.print("Introduce desplazamiento en Y: ");
                    int dy = sc.nextInt();
                    guerrero.getPosicion().desplazar(dx, dy);
                    System.out.println("El guerrero se movió a (" + guerrero.getPosicion().getX() +
                                       ", " + guerrero.getPosicion().getY() + ").");
                    break;
                default:
                    System.out.println("Opción no válida. Pierdes el turno.\n");
            }

            // Comprobar si el Orco ha muerto
            if (orco.getEnergia() <= 0) {
                System.out.println("¡El guerrero ha derrotado al orco! ¡Has ganado!");
                juegoTerminado = true;
                break;
            }

            // Turno del orco
            System.out.println("\nTurno del Orco:");
            orco.atacar(guerrero);

            // Comprobar si el Guerrero ha muerto
            if (guerrero.getEnergia() <= 0) {
                System.out.println("El orco ha derrotado al guerrero. ¡Has perdido!");
                juegoTerminado = true;
                break;
            }

            // Cambiar terreno cada 4 turnos (opcional)
            if (escenario.cambiarTerreno()) {
                System.out.println("¡El terreno ha cambiado!");
                escenario.mostrarTablero();
            }
        }

        // Fin del juego
        System.out.println("\nEstado final:");
        System.out.println("Guerrero: " + guerrero.getEnergia() + " de energía.");
        System.out.println("Orco: " + orco.getEnergia() + " de energía.");
        sc.close();
    }
}
