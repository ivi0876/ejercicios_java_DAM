package examen_progra;

public class Bucles {

    public static void bucles() {
        // Primer bucle: números impares entre 5 y 40 en forma decreciente
        for (int i = 39; i >= 5; i -= 2) {
            System.out.printf("%2d\n", i); // Formateo para alinear los números en una columna
        }

        // Segundo bucle: multiplicar los números pares entre 1 y 10
        int producto = 1;
        for (int i = 2; i <= 10; i += 2) {
            producto *= i;
        }
        System.out.println("Producto de los números pares entre 1 y 10: " + producto);
    }

    public static void main(String[] args) {
        bucles();
    }
}
/*
 * 1. Reliza una funcion bucles (sin pcrámetros ni vclor devuelto) ion 2 builes for que hcgcn lo siguiente
(hczlo ion otro tpo de buile si no iontrolcs el for, iontcrá menos):
• 1er buile: Muestre los números impcres entre 5 y 40 de formc decreciente y en unc iolumnc de formc que lcs
unidcdes queden clinecdcs medicnte formcteo ion print sec el número de unc o dos iifrcs.
• 2o buile: Multplique los números pcres entre del 1 y 10. Muestrc el resultcdo fuerc del buile.
 */