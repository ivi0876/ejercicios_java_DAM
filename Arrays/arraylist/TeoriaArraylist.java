package Arrays.arraylist;

import java.util.ArrayList;

public class TeoriaArraylist {
    public static void main(String[] args) {
        //coleccion
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Tamaño: " + nombres.size()); //me da el tamaño de la coleccion
        nombres.add("a"); // 0
        nombres.add("p"); // 1
        System.out.println(nombres.get(1));
        nombres.add(1, "T");
        nombres.add("D");
        System.out.println("Tamaño: " + nombres.size());
        nombres.remove(2);

        System.out.println(nombres.get(1)); // vamos a la posicion 1 y mostramos lo que tenemos
    }
}
