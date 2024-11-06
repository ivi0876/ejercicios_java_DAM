package examplesInicio.bugs;

import java.util.Scanner;

public class Depuracion {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int suma=0;
int contador = 0;
int limite;
System.out.println("¿Hasta que número (incluido) deseas sumar?");
limite = sc.nextInt();

while (contador <= limite) {
    // System.err.printf("contador: %d, limite: %d suma: %d\n", contador, limite, suma);
    suma = suma + contador;
    contador++;
}
System.out.printf("Resultado: %d\n", suma);
}
}
