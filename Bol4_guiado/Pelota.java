package Bol4_guiado;

public class Pelota {
    public  String tipo;
    public double radio;

    public Pelota() {
        this.tipo = "playa";
        this.radio = 40;
    }

    public Pelota(String tipo, double radio) {
        this.tipo = tipo;
        this.radio = radio;
    }


    public void setRadio(double radio) {
    }

    public double getRadio() {
        return radio;
    }
}


