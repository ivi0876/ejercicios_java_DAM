package Arrays.arraylist;

import java.util.ArrayList;

public class TeoriaArraylist {
    public static void main(String[] args) {
        // coleccion
        ArrayList<String> nombres = new ArrayList<>();

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        // Añadimos elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(9);
        // Insertamos en posición 1
        numeros.add(1, 10);
        // Mostramos con for clásico
        for (int i = 0; i < numeros.size(); i++) {
            System.out.printf("%5d", numeros.get(i));
        }
        System.out.println();
        // Modificamos un elemento
        numeros.set(0, 22);

        System.out.println(nombres.get(1)); // vamos a la posicion 1 y mostramos lo que tenemos
    }
}
