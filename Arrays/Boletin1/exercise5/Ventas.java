package Arrays.Boletin1.exercise5;

import java.util.*;

public class Ventas {
    public int[] ventas = new int[12];
    private int year;

    // Constructor que inicializa con números aleatorios
    public Ventas(int year) {
        setYear(year);
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.random() * 1000);
        }
    }

    // Constructor sobrecargado con validación de tamaño del vector
    public Ventas(int year, int[] ventasArray) {
        setYear(year);
        if (ventasArray.length == 12) {
            this.ventas = ventasArray;
        } else {
            for (int i = 0; i < ventas.length; i++) {
                ventas[i] = (int) (Math.random() * 1000);
            }
        }
    }

    // Gget y set
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year >= currentYear) {
            this.year = currentYear - 1;
        } else {
            this.year = year;
        }
    }

    // media
    public double media() {
        int suma = 0;
        for (int venta : ventas) {
            suma += venta;
        }
        return suma / 12.0;
    }

    //  mostrar grafico de barras
    public void grafica() {
        System.out.println("Año " + year + ":");
        for (int i = 0; i < ventas.length; i++) {
            int bloques = ventas[i] / 100;
            System.out.printf("Mes %d (%d): %s%n", i + 1, ventas[i], repetirCaracter('#', bloques));
        }
    }

    // repetir un caracter
    private String repetirCaracter(char caracter, int veces) {
        String resultado = "";
        for (int i = 0; i < veces; i++) {
            resultado += caracter;
        }
        return resultado;
    }
}
