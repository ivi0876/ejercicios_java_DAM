package ejerciciotres;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Crear objetos Cadena
        Cadena c1 = new Cadena();
        c1.setCadena("hola mundo");

        Cadena c2 = new Cadena();
        c2.setCadena("adios");

        Cadena c3 = new Cadena();
        c3.setCadena("bienvenido");

        // Lista de cadenas
        ArrayList<Cadena> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        // Mostrar antes de ordenar
        System.out.println("Antes de ordenar:");
        for (Cadena c : lista) {
            System.out.println(c);
        }

        // Ordenar lista
        Collections.sort(lista);

        // Mostrar después de ordenar
        System.out.println("\nDespués de ordenar:");
        for (Cadena c : lista) {
            System.out.println(c);
        }
    }
}
