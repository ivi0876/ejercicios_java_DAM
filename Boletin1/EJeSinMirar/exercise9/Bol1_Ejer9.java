package Boletin1.EJeSinMirar.exercise9;

public class Bol1_Ejer9 {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <=9) {
            System.out.println("Contador: " + contador);
            contador ++;
        }
        System.out.println("vales: " + contador);
         
        for (contador = 10; contador >= 0; contador--) {
            System.out.println("Contador: " + contador);
        }

        for (contador = 2; contador <=20; contador+=2 ) {
            System.out.println("Numeros pares entre 1 y 20: " + contador);
        }

        for (contador = 1; contador <=20; contador++ ) {
            if(contador % 2 == 0) {
                System.out.println("Los numeros pares son: " + contador);
            }
        }
    }
}


/* 
 * 
 * 3. En el siguiente ejercicio vas realizar varios bucles con contador. Coge la
estructura de bucle que te resulte más cómoda (while, do-while o for). Haz uno
detrás de otro para que se vaya mostrando en la misma línea lo indicado (usa
print). Recuerda, al terminar cada bucle hacer un println() para pasar a la línea
siguiente. También recuerda inicializar el contador al principio de cada bucle, así
puedes usar el mismo en todos y no declarar demasiadas variables:
• Muestra números del 1 al 10 de forma creciente.
• Muestra números del 10 al 1 de forma descendente.
• Muestra números pares entre 1 y 20 usando un contador de 2 en 2.
• Muestra números pares entre 1 y 20 usando un contador de 1 en 1 y dentro
un if comprobando el resto de la división entre 2.
• Muestra números impares entre 1 y 20 (con el método que prefieras).
• Muestra números múltiplos de 5 del 10 al 50 con un contador que vaya de 5
en 5.
• Muestra del 100 al 0 de forma decreciente pero con contador de 10 en 10.
*/