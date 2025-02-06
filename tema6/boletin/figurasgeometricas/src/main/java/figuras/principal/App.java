/*-
 * =====LICENSE-START=====
 * Java 11 Application
 * ------
 * Copyright (C) 2020 - 2025 Organization Name
 * ------
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====LICENSE-END=====
 */
// Package principal
package figuras.principal;

import figuras.geometria.*;
import figuras.interfaz.Libreria;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final List<Figura> figuras = new ArrayList<>();

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Insertar una linea");
            System.out.println("2. Insertar un triangulo");
            System.out.println("3. Insertar un cuadrado");
            System.out.println("4. Insertar una circunferencia");
            System.out.println("5. Mostrar todos los elementos");
            System.out.println("6. Mostrar detalles de un elemento");
            System.out.println("7. Borrar elementos de un tipo");
            System.out.println("8. Salir");
            System.out.print("Elige una opcion: ");
            
            int opcion = Libreria.pedirEntero();
            switch (opcion) {
                case 1:
                    figuras.add(new Linea());
                    System.out.println("Linea añadida.");
                    break;
                case 2:
                    figuras.add(new Poligono());
                    System.out.println("Triangulo añadido.");
                    break;
                case 3:
                    figuras.add(new Poligono("CUADRADO", new Punto(), 4));
                    System.out.println("Cuadrado añadido.");
                    break;
                case 4:
                    figuras.add(new Circunferencia());
                    System.out.println("Circunferencia añadida.");
                    break;
                case 5:
                    mostrarFiguras();
                    break;
                case 6:
                    mostrarDetalles();
                    break;
                case 7:
                    borrarPorTipo();
                    break;
                case 8:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no válida. Intentalo de nuevo.");
            }
        }
    }

    private static void mostrarFiguras() {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras en la colección.");
            return;
        }
        for (int i = 0; i < figuras.size(); i++) {
            Figura figura = figuras.get(i);
            if (figura instanceof Circunferencia) {
                System.out.println(i + ". " + figura.getNombre() + " (Radio: " + ((Circunferencia) figura).getRadio() + ")");
            } else {
                System.out.println(i + ". " + figura.getNombre());
            }
        }
    }

    private static void mostrarDetalles() {
        System.out.print("Introduce el índice del elemento a mostrar: ");
        int indice = Libreria.pedirEntero();
        if (indice >= 0 && indice < figuras.size()) {
            figuras.get(indice).mostrarDatos();
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    private static void borrarPorTipo() {
        System.out.print("Introduce el nombre del tipo de figura a borrar (ejemplo: LINEA, CIRCUNFERENCIA): ");
        String tipo = Libreria.scanner.nextLine().trim().toUpperCase();
        figuras.removeIf(figura -> figura.getNombre().equals(tipo));
        System.out.println("Elementos de tipo " + tipo + " eliminados.");
    }
}
