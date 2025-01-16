package Arrays.Boletin1.exercise6;

import java.util.Scanner;

class Matriz {
    int[][] matriz;
    
        // matriz con valores aleatorios entre 0 y 10 
        public Matriz(int N) {
            matriz = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matriz[i][j] = (int) (Math.random() * 11);  
                }
            }
        }
    
        public static void mostrarMatriz(int[][] matriz) {
            int n = matriz.length;
            // Mostrar  columnas
            System.out.print("    ");
            for (int i = 0; i < n; i++) {
                System.out.printf("%-4d", i);
            }
            System.out.println();
    
            // Mostrar filas con índices
            for (int i = 0; i < n; i++) {
                System.out.printf("%-4d", i);
                for (int j = 0; j < n; j++) {
                    System.out.printf("%-4d", matriz[i][j]);
                }
                System.out.println();
            }
        }
    
        // Función suma sin parámetros
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
    
            // verdadero = retorna la suma de la diagonal, 
            // falso = resto
            return diagonal ? sumaDiagonal : sumaRestante;
        }
    
        // Función suma con un parámetro entero
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
    
        // Función borraFila
        public int[][] borraFila(int fila) {
            if (fila < 0 || fila >= matriz.length) {
                return matriz;  
            }
    
            int n = matriz.length;
            int[][] nuevaMatriz = new int[n - 1][n];
            int nuevaFila = 0;
    
            // Copiar filas a la nueva matriz
            for (int i = 0; i < n;) {
                if (i != fila) { 
                    nuevaMatriz[nuevaFila] = matriz[i];
                    nuevaFila++;
                }
    
            return nuevaMatriz;
        }
                    return nuevaMatriz;
    }
    
    public static class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N;
                
                // Solicitar tamaño de la matriz
                System.out.print("Introduce el tamaño de la matriz (N): ");
                N = sc.nextInt();
        
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
                    int opcion = sc.nextInt();
        
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
                        int fila = sc.nextInt();
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
                        int filaEliminar = sc.nextInt();
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
}

