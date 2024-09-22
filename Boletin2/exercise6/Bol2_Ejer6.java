package Boletin2.exercise6;
import java.util.Scanner;
@SuppressWarnings({ "resource" })

public class Bol2_Ejer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            // Mostrar menú
            System.out.println("Menú:");
            System.out.println("a) Cuadrado de un número real");
            System.out.println("b) Inverso de un número");
            System.out.println("c) Raíz cuadrada de un número");
            System.out.println("d) Operación AND entre dos enteros");
            System.out.println("e) Operación OR entre dos enteros");
            System.out.println("f) Salir");
            System.out.print("Elige una opción: ");
            String opcionStr = scanner.nextLine(); // ! IMPORTANTE PONER NEXlINE EN VEZ SOLO DE NEXT
            opcion = opcionStr.charAt(0);  // Leer la opción como char

            switch (opcion) {
                case 'a':
                    // Cuadrado de un número real
                    System.out.print("Introduce un número real: ");
                    double numero1 = scanner.nextDouble();
                    double cuadrado = numero1 * numero1;
                    System.out.printf("El cuadrado es: %.2f%n", cuadrado);
                    break;
                case 'b':
                    // Inverso de un número
                    double numeroinverso;
                    do {
                        System.out.print("Introduce un número distinto de 0: ");
                        numeroinverso = scanner.nextDouble();
                        if (numeroinverso == 0) {
                            System.out.println("Error: El número no puede ser 0");
                        }
                    } while (numeroinverso == 0);
                    double inverso = 1 / numeroinverso;
                    System.out.printf("El inverso es: %.4f%n", inverso);
                    break;
                case 'c':
                    // Raíz cuadrada de un número
                    double numero3;
                    do {
                        System.out.print("Introduce un número positivo o 0: ");
                        numero3 = scanner.nextDouble();
                        if (numero3 < 0) {
                            System.out.println("Error: El número no puede ser negativo.");
                        }
                    } while (numero3 < 0);
                    double raiz = Math.sqrt(numero3);                                   //* esta funcion hace la raiz cuadrada
                    System.out.printf("La raíz cuadrada es: %.3f%n", raiz);
                    break;
                case 'd':
                    // Operación AND entre dos enteros
                    System.out.print("Introduce el primer número entero: ");
                    int numeroAnd1 = scanner.nextInt();
                    System.out.print("Introduce el segundo número entero: ");
                    int numeroAnd2 = scanner.nextInt();
                    int resultadoAnd = numeroAnd1 & numeroAnd2;
                    System.out.printf("Resultado de AND en hexadecimal: %x%n", resultadoAnd);
                    break;
                case 'e':
                    // Operación OR entre dos enteros
                    System.out.print("Introduce el primer número entero: ");
                    int numeroOr1 = scanner.nextInt();
                    System.out.print("Introduce el segundo número entero: ");
                    int numeroOr2 = scanner.nextInt();
                    int resultadoOr = numeroOr1 | numeroOr2;
                    System.out.printf("Resultado de OR en hexadecimal: %x%n", resultadoOr);
                    break;
                case 'f':
                    // Salir
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 'f');        
        
    }
}
