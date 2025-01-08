package Arrays.Boletin1.exercise2;

import java.io.File;

public class Ventas {
    // a) Un vector público de 12 posiciones de números enteros
    public int[] ventas = new int[12];

    // b) Un entero privado que representa el año
    private int año;

    // Constructor que inicializa el vector con números aleatorios entre 0 y 999 y el año con un parámetro
    public Ventas(int año) {
        for (int i = 0; i < 12; i++) {
            ventas[i] = (int) (Math.random() * 1000); // Genera números entre 0 y 999 usando Math.random()
        }
        setAño(año); // Llama al setter para asegurar que el año sea válido
    }

    // Constructor sobrecargado con dos parámetros: el año y el array de ventas
    public Ventas(int año, int[] ventas) {
        if (ventas.length != 12) {
            this.ventas = new int[12];
            for (int i = 0; i < 12; i++) {
                this.ventas[i] = (int) (Math.random() * 1000); // Si el array no tiene 12 posiciones, lo inicializa con aleatorios
            }
        } else {
            this.ventas = ventas;
        }
        setAño(año);
    }

    // Set para el año: verifica que el año no sea mayor o igual al actual
    public void setAño(int año) {
        int añoActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR); // Obtiene el año actual
        if (año >= añoActual) {
            this.año = añoActual - 1; // Si es mayor o igual, se guarda el año anterior
        } else {
            this.año = año;
        }
    }

    // Get para el año
    public int getAño() {
        return año;
    }

    // Método media que devuelve la media de las ventas
    public double media() {
        int suma = 0;
        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i];
        }
        return (double) suma / ventas.length;
    }

    // Método grafica que muestra un gráfico de barras
    public void grafica() {
        System.out.println("Año " + año + ":");
        for (int i = 0; i < ventas.length; i++) {
            int cantidad = ventas[i];
            String barras = "#".repeat(cantidad / 100); // Cada bloque de barra representa 100 unidades
            System.out.println("Mes " + (i + 1) + " (" + cantidad + "): " + barras);
        }
    }
}
