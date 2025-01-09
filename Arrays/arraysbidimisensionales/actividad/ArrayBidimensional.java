package Arrays.arraysbidimisensionales.actividad;

public class ArrayBidimensional {

    public static double[][] crearArrayBidimensional(int filas, int columnas) {
        double[][] array = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = 20 + Math.random() * 10; 
            }
        }
        return array;
    }

    // Función para mostrar un array bidimensional por pantalla
    public static void mostrarArrayBidimensional(double[][] array) {
        System.out.print("    "); 
        for (int j = 0; j < array[0].length; j++) {
            System.out.printf("%8s", "Col " + j);
        }
        System.out.println();
        System.out.println("------------------------------------------------------");
        
        int filaIndex = 0;
        for (double[] fila : array) { // For mejorado para iterar por las filas
            System.out.printf("Fila %d:", filaIndex++);
            for (double valor : fila) { 
                System.out.printf("%8.2f", valor); 
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        // Crear arrays mediante la función
        double[][] array1 = crearArrayBidimensional(4, 3);
        double[][] array2 = crearArrayBidimensional(3, 4);

        // Mostrar los arrays mediante la función
        System.out.println("Array de 4x3:");
        mostrarArrayBidimensional(array1);

        System.out.println("\nArray de 3x4:");
        mostrarArrayBidimensional(array2);
    }
}

