package Boletin4_1.exercise1;

import java.util.Scanner;

/**
 * Clase principal para probar el funcionamiento de la clase Geometria.
 */
public class Principal {

    /**
     * Método principal para ejecutar el programa.
     * 
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto que representa un rectángulo usando el constructor con parámetros
        Geometria rectangulo = new Geometria(true, 5, 10);
        
        // Mostrar los datos del rectángulo
        System.out.println("Rectángulo:");
        System.out.println("Tipo: " + rectangulo.tipo());
        System.out.println("Base: " + rectangulo.getBase() + " cm");
        System.out.println("Altura: " + rectangulo.getAltura() + " cm");
        System.out.println("Área: " + rectangulo.area() + " cm²");
        System.out.println("Perímetro: " + rectangulo.perimetro() + " cm");
        System.out.println("Diagonal: " + rectangulo.diagonal() + " cm");
        System.out.println();

        // Crear un objeto que representa un triángulo usando el constructor vacío
        Geometria triangulo = new Geometria();
        
        // Solicitar al usuario que introduzca los valores de base y altura
        System.out.println("Introduce la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Introduce la altura del triángulo:");
        double altura = scanner.nextDouble();

        // Establecer los valores introducidos por el usuario
        triangulo.setBase(base);
        triangulo.setAltura(altura);

        // Mostrar los datos del triángulo
        System.out.println("Triángulo:");
        System.out.println("Tipo: " + triangulo.tipo());
        System.out.println("Base: " + triangulo.getBase() + " cm");
        System.out.println("Altura: " + triangulo.getAltura() + " cm");
        System.out.println("Área: " + triangulo.area() + " cm²");
        System.out.println("Perímetro: " + triangulo.perimetro() + " cm");
        System.out.println("Hipotenusa: " + triangulo.diagonal() + " cm");

        scanner.close();
    }
}
