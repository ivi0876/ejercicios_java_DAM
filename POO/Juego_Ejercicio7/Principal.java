package POO.Juego_Ejercicio7;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Crear posiciones iniciales
        Posicion posicionGuerrero = new Posicion(1, 1); // Guerrero empieza en (1, 1)
        Posicion posicionOrco = new Posicion(3, 3); // Orco empieza en (3, 3)

        // Crear guerrero y orco
        Guerrero guerrero = new Guerrero(1000, posicionGuerrero, true, 'A'); // Guerrero con 1000 energía y arma 'A' (Arco)
        Orco orco = new Orco(1000, posicionOrco, 1); // Orco con 1000 energía y nivel 1

        // Crear escenario cargando el mapa desde un archivo
        Escenario escenario = new Escenario("POO/Juego_Ejercicio7/mapa.txt", guerrero, orco);

        // Mostrar el mapa inicial
        System.out.println("Mapa inicial:");
        escenario.mostrarTablero();

        Scanner sc = new Scanner(System.in);
        boolean juegoTerminado = false;

        System.out.println("\n¡Empieza el juego de tablero: Guerrero vs Orco!\n");

        while (!juegoTerminado) {
            // Mostrar el estado actual del tablero
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
                    int energiaRecuperada = escenario.recuperacionTerreno(
                        guerrero.getPosicion().getX(), 
                        guerrero.getPosicion().getY()
                    );
                    guerrero.recuperarse(energiaRecuperada);
                    System.out.println("El guerrero ha recuperado " + energiaRecuperada + " de energía.");
                    break;
                case 3: // Moverse
                    System.out.print("Introduce desplazamiento en X: ");
                    int dx = sc.nextInt();
                    System.out.print("Introduce desplazamiento en Y: ");
                    int dy = sc.nextInt();
                    guerrero.getPosicion().desplazar(dx, dy);
                    System.out.println("El guerrero se movió a (" + guerrero.getPosicion().getX() +
                                       ", " + guerrero.getPosicion().getY() + ").");
                    escenario.mostrarTablero(); 
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

        // Fin del juego: mostrar estado final
        System.out.println("\nEstado final:");
        System.out.println("Guerrero: " + guerrero.getEnergia() + " de energía.");
        System.out.println("Orco: " + orco.getEnergia() + " de energía.");
        sc.close();
    }
}
