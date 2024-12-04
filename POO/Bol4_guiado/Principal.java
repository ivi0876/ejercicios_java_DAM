package POO.Bol4_guiado;

public class Principal {
    public static void main(String[] args) {
        Pelota pelota = new Pelota();
        pelota.tipo = "baloncesto";
        // pelota.radio = 20;

        // System.out.printf("tipo= %s, radio= %.0f\n", pelota.tipo, pelota.radio);

        Pelota pelota2 = new Pelota();
        // System.out.printf("tipo= %s, radio= %.0f\n", pelota2.tipo, pelota2.radio);
        Pelota pelota3 = new Pelota("futbol", 22);
        // System.out.printf("tipo= %s, radio= %.0f\n", pelota3.tipo, pelota3.radio);

        System.out.println("Pelota 2: Tipo: " + pelota2.tipo + ", Radio: " + pelota2.getRadio() + " cm");
        System.out.println("Pelota 3: Tipo: " + pelota3.tipo + ", Radio: " + pelota3.getRadio() + " cm\n");

        pelota2.inflar(); // Incrementa en 1 cm
        pelota3.inflar(10);
        System.out.println("Funcion inflar:");
        System.out.println("Pelota 2: Tipo: " + pelota2.tipo + ", Radio: " + pelota2.getRadio() + " cm");
        System.out.println("Pelota 3: Tipo: " + pelota3.tipo + ", Radio: " + pelota3.getRadio() + " cm\n");


        // INTERCAMBIAR RADIOS
        intercambiaRadios(pelota2, pelota3);
        System.out.println("Funcion intercambiaRadios:");
        System.out.println("Pelota 2: Tipo: " + pelota2.tipo + ", Radio: " + pelota2.getRadio() + " cm");
        System.out.println("Pelota 3: Tipo: " + pelota3.tipo + ", Radio: " + pelota3.getRadio() + " cm\n");
    }

    public static void intercambiaRadios(Pelota p1, Pelota p2) {
        double temporal = p1.getRadio();
        p1.setRadio(p2.getRadio());
        p2.setRadio(temporal);

    }

}
