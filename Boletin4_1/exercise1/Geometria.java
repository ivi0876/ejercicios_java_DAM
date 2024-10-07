package Boletin4_1.exercise1;

/**
 * Clase Geometria que representa un rectángulo o un triángulo.
 */
public class Geometria {
    // Propiedades de la clase Geometria
    public boolean figura; // true para rectángulo, false para triángulo
    private double base;   // Base de la figura
    private double altura; // Altura de la figura

    /**
     * Constructor sin parámetros que inicializa la figura como triángulo y la base y altura a 2.
     */
    public Geometria() {
        this.figura = false;
        this.base = 2;
        this.altura = 2;
    }

    /**
     * Constructor que inicializa la figura como triángulo y establece la base y altura.
     * 
     * @param base La base del triángulo.
     * @param altura La altura del triángulo.
     */
    public Geometria(double base, double altura) {
        this.figura = false;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Constructor que inicializa la figura, base y altura.
     * 
     * @param figura True para rectángulo, false para triángulo.
     * @param base La base de la figura.
     * @param altura La altura de la figura.
     */
    public Geometria(boolean figura, double base, double altura) {
        this.figura = figura;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene la base de la figura.
     * 
     * @return La base de la figura.
     */
    public double getBase() {
        return base;
    }

    /**
     * Establece la base de la figura. La base debe ser mayor que cero.
     * 
     * @param base La nueva base de la figura.
     */
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("La base debe ser mayor que cero.");
        }
    }

    /**
     * Obtiene la altura de la figura.
     * 
     * @return La altura de la figura.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la altura de la figura. La altura debe ser mayor que cero.
     * 
     * @param altura La nueva altura de la figura.
     */
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura debe ser mayor que cero.");
        }
    }

    /**
     * Calcula y devuelve el área de la figura.
     * 
     * @return El área de la figura.
     */
    public double area() {
        if (figura) { // Rectángulo
            return base * altura;
        } else { // Triángulo
            return (base * altura) / 2;
        }
    }

    /**
     * Calcula y devuelve el perímetro de la figura.
     * 
     * @return El perímetro de la figura.
     */
    public double perimetro() {
        if (figura) { // Rectángulo
            return 2 * (base + altura);
        } else { // Triángulo (rectángulo)
            return base + altura + diagonal();
        }
    }

    /**
     * Calcula y devuelve la diagonal (hipotenusa en el caso del triángulo rectángulo).
     * 
     * @return La diagonal o hipotenusa de la figura.
     */
    public double diagonal() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    /**
     * Devuelve el tipo de figura como un string ("triángulo" o "rectángulo").
     * 
     * @return El tipo de figura.
     */
    public String tipo() {
        return figura ? "rectángulo" : "triángulo";
    }
}
