package Boletin4_0Guiado.exerciseguiado;

/**
 * Clase Pelota que representa una pelota con un tipo y un radio.
 */
public class Pelota {
    // Propiedades de la clase Pelota
    public String tipo;  // Tipo de la pelota (fútbol, baloncesto, etc.)
    private double radio;  // Radio de la pelota en cm

    /**
     * Constructor sin parámetros que inicializa el tipo a "playa" y el radio a 40 cm.
     */
    public Pelota() {
        this.tipo = "playa";
        this.radio = 40;
    }

    /**
     * Constructor con parámetros que inicializa el tipo y el radio de la pelota.
     * 
     * @param tipo El tipo de la pelota.
     * @param radio El radio de la pelota en cm.
     */
    public Pelota(String tipo, double radio) {
        this.tipo = tipo;
        this.radio = radio;
    }

    /**
     * Obtiene el valor del radio de la pelota.
     * 
     * @return El radio de la pelota en cm.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el valor del radio de la pelota.
     * 
     * @param radio El nuevo valor del radio de la pelota en cm.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Incrementa en 1 cm el radio de la pelota.
     */
    public void inflar() {
        this.radio += 1;
    }

    /**
     * Incrementa el radio de la pelota en una cantidad específica.
     * 
     * @param incremento La cantidad en cm a incrementar.
     */
    public void inflar(int incremento) {
        this.radio += incremento;
    }
}
