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
package figuras.geometria;

import java.util.Random;

public class Poligono extends Figura{
    public Punto[] puntos;

    public Poligono(String nombre, Punto origen, int cantidadPuntos){
        super(origen, nombre);
        puntos = new Punto[cantidadPuntos];
        Random rand = new Random();
        for (int i = 0; i < cantidadPuntos; i++) {
            puntos[i] = new Punto(rand.nextDouble() * 10, rand.nextDouble() * 10);
        }
    }

    public Poligono() {
        this("TRIANGULO", new Punto(), 3);
        puntos[0] = new Punto(0, 0);
        puntos[1] = new Punto(1, 1);
        puntos[2] = new Punto(1, 0);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        for (Punto p : puntos) {
            System.out.println("Punto: " + p);
        }
    }
    
}
