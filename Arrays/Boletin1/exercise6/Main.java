package Arrays.Boletin1.exercise6;

import java.util.Scanner;

class Matriz {
    private int[][] matriz;

    // Constructor que inicializa la matriz NxN con valores aleatorios entre 0 y 10 usando Math.random()
    public Matriz(int N) {
        matriz = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = (int) (Math.random() * 11);  // Generar un número aleatorio entre 0 y 10
            }
        }
    }

    // Función estática para mostrar la matriz en formato tabla con índices
    public static void mostrarMatriz(int[][] matriz) {
        int n = matriz.length;
        // Mostrar encabezados de las columnas
        System.out.print("    ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        // Mostrar filas con índices
        for (int i = 0; i < n; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Función suma sin parámetros: suma todos los elementos de la matriz
    public int suma() {
        int sumaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        return sumaTotal;
    }

    // Función suma con un parámetro boolean
    public int suma(boolean diagonal) {
        int sumaDiagonal = 0;
        int sumaRestante = 0;
        int n = matriz.length;

        // Sumar diagonal principal o los elementos no diagonales
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                } else {
                    sumaRestante += matriz[i][j];
                }
            }
        }

        // Si es verdadero, retorna la suma de la diagonal, si es falso la del resto
        return diagonal ? sumaDiagonal : sumaRestante;
    }

    // Función suma con un parámetro entero: suma de los elementos de una fila
    public int suma(int fila) {
        if (fila < 0 || fila >= matriz.length) {
            return -1;  // Si la fila es inválida, retorna -1
        }
        int sumaFila = 0;
        for (int i = 0; i < matriz[fila].length; i++) {
            sumaFila += matriz[fila][i];
        }
        return sumaFila;
    }

    // Función borraFila: devuelve la matriz sin la fila indicada
    public int[][] borraFila(int fila) {
        if (fila < 0 || fila >= matriz.length) {
            return matriz;  // Si la fila no existe, devuelve la matriz completa
        }

        int n = matriz.length;
        int[][] nuevaMatriz = new int[n - 1][n];
        int nuevaFila = 0;

        // Copiar filas a la nueva matriz, omitiendo la fila eliminada
        for (int i = 0; i < n; i++) {
            if (i == fila) continue;
            nuevaMatriz[nuevaFila] = matriz[i];
            nuevaFila++;
        }

        return nuevaMatriz;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        
        // Solicitar tamaño de la matriz
        System.out.print("Introduce el tamaño de la matriz (N): ");
        N = scanner.nextInt();

        // Crear un objeto de la clase Matriz
        Matriz matrizObj = new Matriz(N);

        while (true) {
            // Menú de opciones
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar matriz");
            System.out.println("2. Mostrar suma de todos los elementos");
            System.out.println("3. Mostrar suma de la diagonal");
            System.out.println("4. Mostrar suma de los elementos salvo diagonal");
            System.out.println("5. Mostrar suma de elementos de una fila");
            System.out.println("6. Mostrar matriz sin una fila");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar matriz
                    Matriz.mostrarMatriz(matrizObj.matriz);
                    break;
                case 2:
                    // Mostrar suma de todos los elementos
                    System.out.println("Suma de todos los elementos: " + matrizObj.suma());
                    break;
                case 3:
                    // Mostrar suma de la diagonal
                    System.out.println("Suma de la diagonal: " + matrizObj.suma(true));
                    break;
                case 4:
                    // Mostrar suma de los elementos salvo la diagonal
                    System.out.println("Suma de los elementos salvo la diagonal: " + matrizObj.suma(false));
                    break;
                case 5:
                    // Mostrar suma de los elementos de una fila
                    System.out.print("Introduce el número de la fila: ");
                    int fila = scanner.nextInt();
                    int sumaFila = matrizObj.suma(fila);
                    if (sumaFila == -1) {
                        System.out.println("Fila no válida.");
                    } else {
                        System.out.println("Suma de los elementos de la fila " + fila + ": " + sumaFila);
                    }
                    break;
                case 6:
                    // Mostrar matriz sin una fila
                    System.out.print("Introduce el número de la fila a eliminar: ");
                    int filaEliminar = scanner.nextInt();
                    int[][] nuevaMatriz = matrizObj.borraFila(filaEliminar);
                    Matriz.mostrarMatriz(nuevaMatriz);
                    break;
                case 7:
                    // Salir
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
