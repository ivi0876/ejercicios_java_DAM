package POO.Bol4_1.Ejer1;

public class Principal {
    public static void main(String[] args) {
        Geometria rectangulo = new Geometria(true, 10, 5);
        System.out.println("Área del rectángulo: " + rectangulo.area());
        System.out.println("Perímetro del rectángulo: " + rectangulo.perimetro());
        System.out.println("Diagonal del rectángulo: " + rectangulo.diagonal());
        System.out.println("Tipo de figura: " + rectangulo.tipo());

        Geometria triangulo = new Geometria();
        System.out.println("\nÁrea del triángulo: " + triangulo.area());
        System.out.println("Perímetro del triángulo: " + triangulo.perimetro());
        System.out.println("Diagonal del triángulo: " + triangulo.diagonal());
        System.out.println("Tipo de figura: " + triangulo.tipo());
        
    }
}
