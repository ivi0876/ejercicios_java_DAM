package POO.Juego_Ejercicio7;

import java.util.Random;

public class Orco {
    private int energia;
    private Posicion posicion;
    private int nivel;
    private Random random;

    public Orco(int energia, Posicion posicion, int nivel) {
        this.energia = energia;
        this.posicion = posicion;
        this.nivel = nivel;
        this.random = new Random();
    }

    public void atacar(Guerrero guerrero) {
        int distancia = this.posicion.distancia(guerrero.getPosicion());
        int dano = 0;

        if (distancia >= 1 && distancia <= 2 + (nivel / 5)) {
            int baseDano = distancia == 1 ? 100 + 10 * nivel : 50 + 10 * nivel;
            dano = baseDano + random.nextInt(baseDano == 100 + 10 * nivel ? 41 : 21)
                    - (baseDano == 100 + 10 * nivel ? 20 : 10);
        }

        guerrero.recibirDano(dano);
        System.out.println("El orco atacó al guerrero infligiendo " + dano + " de daño.\n");
    }

    public void recuperarse(int energiaRecuperada) {
        this.energia += energiaRecuperada + 10 * nivel;
        if (this.energia > 1000)
            this.energia = 1000;
        System.out.println("El orco se recuperó y ahora tiene " + this.energia + " de energía.");
    }

    public int getEnergia() {
        return energia;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void recibirDano(int dano) {
        energia -= dano;
        if (energia < 0)
            energia = 0;
        System.out.println("El orco recibió " + dano + " de daño y ahora tiene " + energia + " de energía.");
    }
}
