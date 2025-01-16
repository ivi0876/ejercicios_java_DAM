package Arrays.Boletin1.exercise3;



import java.util.ArrayList;


public class Bol1Ejer3 {

    public static void main(String[] args) {
        // a) Crear un ArrayList con 10 números aleatorios entre 1000 y 5000
        ArrayList<Integer> lista = crearArrayListAleatorio(10);

        // b) Mostrar los elementos del ArrayList
        System.out.println("Contenido de la lista:");
        mostrarArrayList(lista);

        // c) Encontrar el valor máximo del ArrayList
        int maximo = encontrarMaximo(lista);
        System.out.println("Valor máximo: " + maximo);

        // d) Encontrar el valor mínimo del ArrayList
        int minimo = encontrarMinimo(lista);
        System.out.println("Valor mínimo: " + minimo);

        // e) Intercambiar dos posiciones del ArrayList
        System.out.println("\nIntercambiar las posiciones 2 y 5");
        boolean exito = intercambiarPosiciones(lista, 2, 5);

        if (exito) {
            System.out.println("Lista tras el intercambio:");
            mostrarArrayList(lista);
        } else {
            System.out.println("Error: índices fuera de rango.");
        }

        // f) Eliminar los elementos mayores que un valor dado
        int valorLimite = 3000;
        eliminarElementosMayoresQue(lista, valorLimite);
        System.out.println("\nLista después de eliminar los elementos mayores que " + valorLimite + ":");
        mostrarArrayList(lista);
    }

    // a) Crear un ArrayList con valores aleatorios entre 1000 y 5000
    public static ArrayList<Integer> crearArrayListAleatorio(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            lista.add(1000 + (int)(Math.random() * 4001)); 
        }
        return lista;
    }

    // b) Mostrar los elementos del ArrayList
    public static void mostrarArrayList(ArrayList<Integer> lista) {
        for (int numero : lista) {
            System.out.println(numero);
        }
    }

    // c) Encontrar el valor máximo del ArrayList
    public static int encontrarMaximo(ArrayList<Integer> lista) {
        int maximo = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > maximo) {
                maximo = lista.get(i);
            }
        }
        return maximo;
    }

    // d) Encontrar el valor mínimo del ArrayList
    public static int encontrarMinimo(ArrayList<Integer> lista) {
        int minimo = lista.get(0);
        for (int numero : lista) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }

    // e) Intercambiar dos posiciones en el ArrayList
    public static boolean intercambiarPosiciones(ArrayList<Integer> lista, int indice1, int indice2) {
        if (indice1 < 0 || indice1 >= lista.size() || indice2 < 0 || indice2 >= lista.size()) {
            return false;
        }

        int temp = lista.get(indice1);
        lista.set(indice1, lista.get(indice2));
        lista.set(indice2, temp);

        return true;
    }

    // f) Eliminar los elementos mayores que un valor dado
    public static void eliminarElementosMayoresQue(ArrayList<Integer> lista, int valorLimite) {
        lista.removeIf(elemento -> elemento > valorLimite);
    }
}
