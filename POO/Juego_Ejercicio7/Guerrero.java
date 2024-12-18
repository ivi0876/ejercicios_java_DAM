package POO.Juego_Ejercicio7;

import java.util.Random;

public class Guerrero {
    private int energia;
    private Posicion posicion;
    private boolean escudo;
    private char arma; // 'A' para arco, 'E' para espada
    private Random random;

    public Guerrero(int energia, Posicion posicion, boolean escudo, char arma) {
        this.energia = energia;
        this.posicion = posicion;
        this.escudo = escudo;
        this.arma = arma;
        this.random = new Random();
    }

    public void realizarAccion(int opcion, Orco orco, int energiaRecuperada) {
        switch (opcion) {
            case 1: // Atacar
                atacar(orco);
                break;
            case 2: // Recuperarse
                recuperarse(energiaRecuperada);
                break;
            default:
                System.out.println("Opción no válida. El turno se pierde.\n");
                break;
        }
    }

    public void atacar(Orco orco) {
        int distancia = this.posicion.distancia(orco.getPosicion());
        int dano = 0;

        if (arma == 'A' && distancia >= 1 && distancia <= 5) {
            int baseDano = 50 - 10 * (distancia - 1);
            dano = baseDano + random.nextInt(11) - 5;
        } else if (arma == 'E' && distancia >= 1 && distancia <= 2) {
            int baseDano = distancia == 1 ? 100 : 50;
            dano = baseDano + random.nextInt(baseDano == 100 ? 41 : 21) - (baseDano == 100 ? 20 : 10);
        }

        orco.recibirDano(dano);
        System.out.println("\nEl guerrero atacó al orco infligiendo " + dano + " de daño.");
    }

    public void recuperarse(int energiaRecuperada) {
        this.energia += energiaRecuperada;
        if (this.energia > 1000)
            this.energia = 1000;
        System.out.println("El guerrero se recuperó y ahora tiene " + this.energia + " de energía.\n");
    }

    public int getEnergia() {
        return energia;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void recibirDano(int dano) {
        if (escudo) {
            dano /= 2;
        }
        energia -= dano;
        if (energia < 0)
            energia = 0;
        System.out.println("El guerrero recibió " + dano + " de daño y ahora tiene " + energia + " de energía.\n");
    }
}
