package Boletin2.exercise11;

public class Bol2_Ejer11 {
    public static void main(String[] args) {
        int suma = 0; // Inicializamos la suma
        int N = 1;    // Inicializamos N

        // Bucle que se ejecuta hasta que la suma sea mayor que 10000
        while (suma <= 10000) {
            N++;       
            suma += N; 
        }

        System.out.println("El primer valor de N para el cual la suma supera 10000 es: " );
    }
}
