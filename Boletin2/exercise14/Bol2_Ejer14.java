package Boletin2.exercise14;

import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol2_Ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int TotalNumeros = 0;
        int negativos = 0; 
        int numero;

        do {
            System.out.print("Introduce número: ");
            numero = sc.nextInt();
            
            if (numero != 0) { // No contamos el 0
                TotalNumeros++; // Incrementa el total de números introducidos
                
                if (numero < 0) {
                    negativos++; // Incrementa la cantidad de números negativos
                }
            }
        } while (numero != 0); // Sale del bucle cuando el usuario introduce 0
        
        // Muestra el resultado
        System.out.println("Se introdujeron " + negativos + " números negativos de un total de " + TotalNumeros);
        
    }
}
