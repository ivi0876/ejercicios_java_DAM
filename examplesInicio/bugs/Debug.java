package examplesInicio.bugs;
import java.util.Scanner;
public class Debug {
public static int sumaHasta(int numero) {
int suma = 0;
int contador = 0;
while (contador < numero) {
suma = suma + contador;
contador++;
}
return suma;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int limite;
System.out.println("¿Hasta que número (incluido) deseas sumar?");
limite = sc.nextInt();
System.out.printf("Resultado: %d\n", sumaHasta(limite));
}
}
