package Boletin2.exercise13;

import java.util.Scanner;
@SuppressWarnings({ "resource" })
public class Bol2_Ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int N = sc.nextInt();
        
        // a) Suma de números pares entre 0 y N
        int sumaPares = 0;
        for (int i = 0; i <= N; i += 2) { // Solo números pares
            sumaPares += i;
        }
        
        
        // b) Suma de números impares entre 0 y N
        int sumaImpares = 0;
        for (int i = 1; i <= N; i += 2) { // Solo números impares
            sumaImpares += i;
        }
        
        // c) Suma de números pares e impares por separado entre 0 y N (en un único bucle)
        sumaPares = 0;
        sumaImpares = 0;
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) { // Número par
                sumaPares += i;
            } else { // Número impar
                sumaImpares += i;
            }
        }
        System.out.println("a) La suma de números pares entre 0 y " + N + " es: " + sumaPares);
        System.out.println("b) La suma de números impares entre 0 y " + N + " es: " + sumaImpares);
        System.out.println("c) La suma de números pares entre 0 y " + N + " es: " + sumaPares);
        System.out.println("   La suma de números impares entre 0 y " + N + " es: " + sumaImpares);
        
    }
}
