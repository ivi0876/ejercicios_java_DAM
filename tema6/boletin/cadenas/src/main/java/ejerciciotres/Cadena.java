package ejerciciotres;

import java.util.ArrayList;

public class Cadena implements Comparable<Cadena> {
    private ArrayList<Character> cadena;

    // Constructor vacío
    public Cadena() {
        this.cadena = new ArrayList<>();
    }

    // Método para establecer la cadena a partir de un String
    public void setCadena(String str) {
        if (str == null) {
            throw new IllegalArgumentException("El objeto no puede ser null");
        } else {
            str = str.trim();
            cadena.clear();
        }
        for (int i = 0; i < str.length(); i++) {
            cadena.add(str.charAt(i));
        }
    }

    // Convertir lista en String
    @Override
    public String toString() {
        String resultado = "";
        for (char c : cadena) {
            resultado += c;
        }
        return resultado;
    }

    // Implementación de compareTo para ordenar en orden alfabético
    @Override
    public int compareTo(Cadena otra) {
        if (otra == null) {
            throw new IllegalArgumentException("No se puede comparar con un objeto null");
        }
        return this.toString().compareTo(otra.toString());
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto == null) {
            throw new IllegalArgumentException("El objeto no puede ser null");
        }
        if (objeto instanceof Cadena) {
            Cadena otra = (Cadena) objeto;
            return this.cadena.equals(otra.cadena);
        }
        if (objeto instanceof String) {
            return this.toString().equals(objeto);
        }
        if (objeto instanceof char[]) {
            char[] otra = (char[]) objeto;
            if (otra.length != cadena.size()) {
                return false;
            }
            for (int i = 0; i < otra.length; i++) {
                if (otra[i] != cadena.get(i)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Tipo no válido");
    }

    public int eliminar(char c) {
        int eliminados = 0;
        for (int i = 0; i < cadena.size(); i++) {
            if (cadena.get(i) == c) {
                cadena.remove(i);
                i--;
                eliminados++;
            }
        }
        return eliminados;
    }
}
