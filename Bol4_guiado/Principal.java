package Bol4_guiado;

public class Principal {
    public static void main(String[] args) {
        Pelota pelota = new Pelota();
        pelota.tipo = "baloncesto";
        pelota.radio = 20;
        
        System.out.printf("tipo= %s, radio= %.0f\n", pelota.tipo, pelota.radio);

        Pelota pelota2 = new Pelota();
        System.out.printf("tipo= %s, radio= %.0f\n", pelota2.tipo, pelota2.radio);
        Pelota pelota3 = new Pelota("futbol", 22);
        System.out.printf("tipo= %s, radio= %.0f\n", pelota3.tipo, pelota3.radio);

    }
}
