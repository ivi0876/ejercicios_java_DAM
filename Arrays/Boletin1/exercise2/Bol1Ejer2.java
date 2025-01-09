package Arrays.Boletin1.exercise2;



public class Bol1Ejer2 {

    public static void main(String[] args) {
         //matriz de 3x4
        System.out.println("Matriz de 3x4:");
        char[][] matriz1 = crearMatrizAleatoria(3, 4);
        mostrarMatriz(matriz1);

        // matriz de 4x3
        System.out.println("\nMatriz de 4x3:");
        char[][] matriz2 = crearMatrizAleatoria(4, 3);
        mostrarMatriz(matriz2);

        // Intercambiar dos posiciones
        System.out.println("\nIntercambir posiciones (0,0) con (2,3) en la primera matriz:");
        boolean exito = intercambiarPosiciones(matriz1, 0, 0, 2, 3);

        if (exito) {
            mostrarMatriz(matriz1);
        } else {
            System.out.println("Error: índices fuera de rango.");
        }
    }

    // Crear una matriz con caracteres aleatorios entre 'A' y 'Z'
    public static char[][] crearMatrizAleatoria(int filas, int columnas) {
        char[][] matriz = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (char) ('A' + Math.random() * 26); // se puede omitir el casting interno en java
            }
        }
        return matriz;
    }

    //  matriz con formato de tabla
    public static void mostrarMatriz(char[][] matriz) {
        // Mostrar la cabecera de las columnas
        System.out.print("  ");
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.printf("%2d ", j);
        }
        System.out.println();

        
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%d ", i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2c ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    // Intercambiar dos posiciones en la matriz
    public static boolean intercambiarPosiciones(char[][] matriz, int fila1, int col1, int fila2, int col2) {
        if (fila1 < 0 || fila1 >= matriz.length || fila2 < 0 || fila2 >= matriz.length ||
            col1 < 0 || col1 >= matriz[0].length || col2 < 0 || col2 >= matriz[0].length) {
            return false; 
        }

        char temp = matriz[fila1][col1];
        matriz[fila1][col1] = matriz[fila2][col2];
        matriz[fila2][col2] = temp;

        return true;
    }
}
