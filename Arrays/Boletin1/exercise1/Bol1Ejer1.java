package Arrays.Boletin1.exercise1;


public class Bol1Ejer1 {

    public static void main(String[] args) {
        // a) Crear un vector con 10 números aleatorios entre 1000 y 5000
        int[] vector = crearVectorAleatorio(10);

        // b) Mostrar los elementos del vector
        System.out.println("Contenido del vector:");
        mostrarVector(vector);

        // c) Encontrar el valor máximo del vector
        int maximo = encontrarMaximo(vector);
        System.out.println("Valor máximo: " + maximo);

        // d) Encontrar el valor mínimo del vector
        int minimo = encontrarMinimo(vector);
        System.out.println("Valor mínimo: " + minimo);

        // e) Intercambiar dos posiciones del vector
        System.out.println("\nIntercambiar las posiciones 2 y 5");
        boolean exito = intercambiarPosiciones(vector, 2, 5);

        if (exito) {
            System.out.println("Vector tras el intercambio:");
            mostrarVector(vector);
        } else {
            System.out.println("Error: índices fuera de rango.");
        }
    }

    // a) Crear un vector con valores aleatorios entre 1000 y 5000
    public static int[] crearVectorAleatorio(int n) {
        // cambiar a math random
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = 1000 + (int)(Math.random() * 4001); 
        }
        return vector;
    }

    // b) Mostrar los elementos del vector
    public static void mostrarVector(int[] vector) {
        for (int numero : vector) { 
            System.out.println(numero);
        }
    }

    // c) Encontrar el valor máximo del vector
    public static int encontrarMaximo(int[] vector) {
        int maximo = vector[0];
        for (int i = 1; i < vector.length; i++) { 
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    // d) Encontrar el valor mínimo del vector
    public static int encontrarMinimo(int[] vector) {
        int minimo = vector[0];
        for (int numero : vector) { 
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }

    // e) Intercambiar dos posiciones en el vector
    public static boolean intercambiarPosiciones(int[] vector, int indice1, int indice2) {
        if (indice1 < 0 || indice1 >= vector.length || indice2 < 0 || indice2 >= vector.length) {
            return false; 
        }

        int temp = vector[indice1];
        vector[indice1] = vector[indice2];
        vector[indice2] = temp;

        return true; 
    }
}

