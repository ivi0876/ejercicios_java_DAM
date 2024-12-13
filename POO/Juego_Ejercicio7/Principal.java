package POO.Juego_Ejercicio7;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Posicion posicionGuerrero = new Posicion(1, 1);
        Posicion posicionOrco = new Posicion(3, 3);

        Guerrero guerrero = new Guerrero(1000, posicionGuerrero, true, 'A');
        Orco orco = new Orco(1000, posicionOrco, 1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Empieza el juego de tablero: Guerrero vs Orco");

        System.out.println("Turno del Guerrero:");
        System.out.println("1. Atacar\n2. Recuperarse");
        int opcionGuerrero = sc.nextInt();

        if (opcionGuerrero == 1) {
            guerrero.atacar(orco);
        } else if (opcionGuerrero == 2) {
            guerrero.recuperarse(50);
        }

        System.out.println("Turno del Orco:");
        orco.atacar(guerrero);

        System.out.println("Estado final:");
        System.out.println("Guerrero: " + guerrero.getEnergia() + " de energía.");
        System.out.println("Orco: " + orco.getEnergia() + " de energía.");

        sc.close();
    }
}
