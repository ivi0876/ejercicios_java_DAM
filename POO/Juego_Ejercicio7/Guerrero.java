package POO.Juego_Ejercicio7;

public class Guerrero {
    private int energia;
    private Posicion posicion;
    private boolean escudo;
    private char arma;

    public Guerrero(int energia, Posicion posicion, boolean escudo, char arma) {
        this.energia = energia;
        this.posicion = posicion;
        this.escudo = escudo;
        this.arma = arma;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public boolean tieneEscudo() {
        return escudo;
    }

    public void setEscudo(boolean escudo) {
        this.escudo = escudo;
    }

    public char getArma() {
        return arma;
    }

    public void setArma(char arma) {
        this.arma = arma;
    }

    public void atacar(Guerrero enemigo){
        int distancia = this.posicion.distancia(enemigo.getPosicion());
        int dano = 0;

        switch (arma) {
            case 'A':
                if (distancia >= 4 && distancia <= 5) {
                    dano = 50;
                }
                break;

            case 'E':
            
                if (distancia >=1 && distancia <= 2) {
                    dano = 100;
                }
                break;
            default:
                break;
        }

        if(dano > 0 ){
            if(enemigo.tieneEscudo()) {
                dano /= 2;
            }
            enemigo.setEnergia(enemigo.getEnergia()- dano);
        }
    }

    public void moverA(int nuevaX, int nuevaY) {
        this.posicion.moverA(nuevaX, nuevaY);
    }

    public void desplazar(int dx, int dy) {
        this.posicion.desplazar(dx, dy);
    }

    public boolean estaVivo() {
        return this.energia > 0;
    }
}
