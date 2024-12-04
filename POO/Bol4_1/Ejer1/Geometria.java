package POO.Bol4_1.Ejer1;

public class Geometria {
    private boolean figura;
    private double base;
    private double altura;


    public boolean getFigura() {
        return figura;

    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public Geometria(){
        this.figura = false;
        this.base = 2;
        this.altura = 2;
    }

    public Geometria (double altura, double base){
        this.figura = false;
        this.base = base;
        this.altura = altura;
    }

    public Geometria(boolean figura, double base, double altura) {
        this.figura = figura;
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        if (figura) { // Rectángulo
            return base * altura;
        } else { // Triángulo
            return (base * altura) / 2;
        }
    }

    public double perimetro() {
        if (figura) { // Rectángulo entra si es true
            return 2 * (base + altura);
        } else { // Triángulo
            return diagonal() + base + altura;
        }
    }

    public double diagonal() { 
        return Math.sqrt((base * base) + (altura * altura));
    }

    public String tipo() {
        return figura ? "rectángulo" : "triángulo";
    }
    

}
